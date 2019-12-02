package com.project.actors;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.project.common.util.RxNovaCommonUtil;
import com.project.pages.ConditionsMassChangePage;
import com.psqframework.core.page.BasePage;
import com.psqframework.core.util.Verify;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionsMassChangePage extends BasePage {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ConditionsMassChangePage conditionsMassChangePage;
	
	
	@Step
	public void isTabDisplayed(String ObjKey, String ChildObjKey) throws InterruptedException {
		boolean isTabDisplayed = conditionsMassChangePage.IsTabProperlyDisplayed(ChildObjKey);
		String styleLoad = "";
		while(isTabDisplayed == false && !styleLoad.contains("none;")) {
			styleLoad = rxNovaCommonUtil.checkBusyState();
			isTabDisplayed = conditionsMassChangePage.IsTabProperlyDisplayed(ChildObjKey);
		}
		rxNovaCommonUtil.checkBusyState();
		Verify.actualExpected(isTabDisplayed, true, "'" + ObjKey + "'" + " is not Displayed");
	}
	
	@Step
	public void isFieldClickable(String ObjKey) throws InterruptedException {
		boolean isClickable = conditionsMassChangePage.isFieldClickable(ObjKey);
		Verify.actualExpected(isClickable, true, ObjKey + "is not clickable");
	}
	
	@Step
	public void clickIfClickable(String ObjKey) throws InterruptedException {
		isFieldClickable(ObjKey);
		conditionsMassChangePage.performClick(ObjKey);
	}
	
	@Step
	public void checkDetailsPanelForCorrectLabels(String ObjKey, String label) throws InterruptedException {
		String labels = label;
		StringTokenizer tokenizer = new StringTokenizer(labels, ",");
		while(tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			boolean exists = conditionsMassChangePage.checkDetailsPanelForCorrectLabels(currToken);
			Verify.actualExpected(exists, true, currToken + " does not exist for " + ObjKey);
		}
	}
	
	@Step
	public void objectIsDisplayed(String ObjKey) throws InterruptedException {
		boolean isDisplayed = conditionsMassChangePage.ObjectIsDisplayed(ObjKey);
		Verify.actualExpected(isDisplayed, true, "'" + ObjKey + "'" + " object is not displayed ");
	}
	
	@Step
	public void checkingItemsInMassChangeSearch() throws InterruptedException {
		String labels = "Master customer set:,Request name:,Request type:,Request status:,Run status,Last name:,First name:,From date:,To date:";
		StringTokenizer tokenizer = new StringTokenizer(labels, ",");
		while(tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			boolean exists = conditionsMassChangePage.checkingItemsInSearch(currToken);
			Verify.actualExpected(exists, true, currToken + " does not exist");
		}
	}
	
	@Step
	public void MCSDropdowncheckContents(String ObjKey) {
		boolean hasContents = conditionsMassChangePage.MCScheckContents(ObjKey);
		if(hasContents == false) {
			Verify.actualExpected(hasContents, true, "Master customer set dropdown does not have any contents available");
		}
		else {
			System.out.println("Master customer set dropdown contains contents");
		}
	}
	
	@Step
	public void dropdownCheckContents(String expected, String ObjKey) {
		boolean hasCorrectContents = conditionsMassChangePage.DropdownCheckContents(expected, ObjKey);
		Verify.actualExpected(hasCorrectContents, true, ObjKey + " Drop-down list does not have expected contents");
	}
	
	@Step 
	public void createNewMassChange(String ObjKey, DataTable NewMassChangeData) throws InterruptedException {
		List<List<String>> enterData = NewMassChangeData.raw();
		sendKeysToField(enterData.get(1).get(0), "Tracking ID:");
		sendKeysToField(enterData.get(1).get(1), "Reason:");
		sendKeysToField(enterData.get(1).get(2), "Notes:");
		selectFromDropdown(enterData.get(1).get(3), "New Mass Change Master customer set:");
		rxNovaCommonUtil.checkBusyState();
		sendKeysToField(enterData.get(1).get(4), "Name:");
		sendKeysToField(enterData.get(1).get(7), "Description:");
	}
	
	@Step
	public void sendKeysToField(String input, String ObjKey) {
		conditionsMassChangePage.SendKeysToField(input, ObjKey);
	}
	
	@Step
	public void selectFromDropdown(String input, String ObjKey) throws InterruptedException {
		conditionsMassChangePage.mySelectFromDropdown(input, ObjKey);
	}
	
	@Step
	public void checkRequestEditPanel() throws InterruptedException {
		String labels = "Tracking ID:,Reason:,Notes:,Description:,Created by:,Created date:,Created time:,Last maintenance user:,Last maintenance date:,Last maintenance time:";
		StringTokenizer tokenizer = new StringTokenizer(labels, ",");
		while(tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			boolean exists = conditionsMassChangePage.checkRequestEditPanel(currToken);
			Verify.actualExpected(exists, true, currToken + " does not exist");
		}
	}
	
	@Step
	public void searchRequest(DataTable enterData) throws InterruptedException {
		//write a Search Mass Change Function to search for the created mass change requests
		clickIfClickable("Cancel");
		rxNovaCommonUtil.checkBusyState();
		List<List<String>> data = enterData.raw();
		selectFromDropdown(data.get(1).get(3), "Mass Change Master customer set:");
		sendKeysToField(data.get(1).get(4), "Request name:");
		selectFromDropdown(data.get(1).get(5), "Request type:");
		selectFromDropdown(data.get(1).get(6), "Request status:");
		clickIfClickable("Search");
	}
	
	@Step public void deleteRequest() throws InterruptedException {
		rxNovaCommonUtil.checkBusyState();
		WebElement RequestAction = getDriver().findElement(By.xpath(ConditionsMassChangePage.NewMassChangeMap.get("Request Action Tab")));
		rxNovaCommonUtil.waitFor(RequestAction);
		clickIfClickable("Request Action Tab");
		clickIfClickable("Delete Request");
		rxNovaCommonUtil.checkBusyState();
		clickIfClickable("Yes Delete Request");
		rxNovaCommonUtil.checkBusyState();
		boolean MassChangeHomeExists = conditionsMassChangePage.ObjectIsDisplayed("Mass Change Search Panel");
		Verify.actualExpected(MassChangeHomeExists, true, "Deletion of Mass Change Request did not occur properly");
	}
	
	@Step public void searchRequestLastFirst(DataTable enterData) throws InterruptedException {
		clickIfClickable("Cancel");
		rxNovaCommonUtil.checkBusyState();
		List<List<String>> data = enterData.raw();
		selectFromDropdown(data.get(1).get(0), "Mass Change Master customer set:");
		sendKeysToField(data.get(1).get(1), "Last name:");
		sendKeysToField(data.get(1).get(2), "First name:");
		clickIfClickable("Search");
		rxNovaCommonUtil.checkBusyState();
	}
	
	@Step 
	public void searchRequestFromTo(DataTable enterData) throws InterruptedException {
		clickIfClickable("Cancel");
		rxNovaCommonUtil.checkBusyState();
		List<List<String>> data = enterData.raw();
		DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		selectFromDropdown(data.get(1).get(0), "Mass Change Master customer set:");
		sendKeysToField(dateformat.format(new Date()), "From date:");
		sendKeysToField(dateformat.format(new Date()), "To date:");
		clickIfClickable("Search");
		rxNovaCommonUtil.checkBusyState();
	}
	
	@Step
	public void gainInfoFromClickTabs(String ObjKey, String list) throws InterruptedException {
		clickIfClickable(ObjKey);
		StringTokenizer tokenizer = new StringTokenizer(list, ",");
		while(tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			boolean exists = conditionsMassChangePage.gainInfoFromClickTabs(ObjKey, currToken);
			Verify.actualExpected(exists, true, currToken + " does not exist for " + ObjKey);
		}
		conditionsMassChangePage.gainInfoFromClickTabs(ObjKey, list);
	}
	
	@Step
	public void objectIsDisabled(String ObjKey) {
		boolean isDisabled = conditionsMassChangePage.ObjectIsDisabled(ObjKey);
		Verify.actualExpected(isDisabled, false, "'" + ObjKey + "'" + " is not disabled");
	}
	
	@Step
	public void checkingRequestTabPanel(String ObjKey) throws InterruptedException { 
		String firstTitleRow = "Master customer set:,Request name:,Request type:,Request status:";
		String firstCommonColumn = "Tracking ID:,Reason:,Notes:,Description:";
		String masschangeInformationfirstColumn = "Created by:,Created date:,Created time:,Last maintenance user:,Last maintenance date:,Last maintenance time:";
		StringTokenizer tokenizer1 = new StringTokenizer(firstTitleRow, ",");
		StringTokenizer tokenizer2 = new StringTokenizer(firstCommonColumn, ",");
		StringTokenizer tokenizer3 = new StringTokenizer(masschangeInformationfirstColumn, ",");
		while(tokenizer1.hasMoreTokens()) {
			String currToken = tokenizer1.nextToken();
			String currClass = "firstTitleRow";
			boolean exists = conditionsMassChangePage.checkPanelLabelsKnowingClass(currClass, currToken);
			Verify.actualExpected(exists, true, currToken + " does not exist for " + ObjKey);
		}
		while(tokenizer2.hasMoreTokens()) {
			String currToken = tokenizer2.nextToken();
			String currClass = "firstCommonColumn";
			boolean exists =  conditionsMassChangePage.checkPanelLabelsKnowingClass(currClass, currToken);
			Verify.actualExpected(exists, true, currToken + " does not exist for " + ObjKey);
		}
		while(tokenizer3.hasMoreTokens()) {
			String currToken = tokenizer3.nextToken();
			String currClass = "masschangeInformationfirstColumn";
			boolean exists =  conditionsMassChangePage.checkPanelLabelsKnowingClass(currClass, currToken);
			Verify.actualExpected(exists, true, currToken + " does not exist for " + ObjKey);
		}
	}
	
	@Step
	public void checkingResultsPanelAfterSearch() throws NoSuchElementException, InterruptedException {
		boolean resultsDisplayed = conditionsMassChangePage.ObjectIsDisplayed("Request Action Tab");
		if(resultsDisplayed == false) {
			resultsDisplayed = conditionsMassChangePage.checkingResultsPanelAfterSearch();
		}
		Verify.actualExpected(resultsDisplayed, true, "Results are not properly displayed after performing search");
	}
}
