package com.project.actors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project.common.util.RxNovaCommonUtil;
import com.project.pages.ConditionsHeaderPage;
import com.project.pages.ConditionsHomePage;
import com.psqframework.core.util.Verify;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionsHeaderPage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ConditionsHeaderPage conditionsHeaderPage;
	@Steps 
	ConditionsHomePage conditionsHomePage;
	@Steps
	ActorConditionsHomePage actorOnConditionsHomePage;
	
	@Step
	public void objectIsCurrentlyEnabled(String ObjKey) {
		boolean isEnabled = conditionsHeaderPage.objectIsCurrentlyEnabled(ObjKey);
		Verify.actualExpected(isEnabled, true, "'" + ObjKey + "'" + " is not currently enabled");
		if(isEnabled == true) {
			System.out.println(ObjKey + " is currently enabled");
		}
	}
	
	@Step
	public boolean isFieldClickable(String ObjKey) throws InterruptedException {
		boolean isClickable = conditionsHeaderPage.isFieldClickable(ObjKey);
		Verify.actualExpected(isClickable, true, "'" + ObjKey + "'" + " is not currently clickable");
		return(isClickable);
	}
	
	@Step
	public void clickIfClickable(String ObjKey) throws InterruptedException, Throwable {
		boolean isClickable = isFieldClickable(ObjKey);
		if(isClickable == true) {
			conditionsHeaderPage.performClick(ObjKey);
		}
		else {
			String ObjPath = ConditionsHeaderPage.ConditionsHeaderMap.get(ObjKey);
			WebElement currObj = conditionsHeaderPage.find(By.xpath(ObjPath));
			rxNovaCommonUtil.waitFor(currObj);
		}
	}
	
	@Step
	public void switchToMostRecentWindow() throws InterruptedException {
		conditionsHeaderPage.switchToMostRecentWindow();
	}
	
	@Step
	public void sendKeysToField(String input, String ObjKey) {
		conditionsHeaderPage.sendKeysToField(input, ObjKey);
	}
	
	@Step
	public void selectFromDropdown(String input, String ObjKey) throws InterruptedException {
		conditionsHeaderPage.mySelectFromDropdown(input, ObjKey);
	}

	@Step
	public void objectIsDisplayed(String ObjKey) throws InterruptedException {
		boolean isDisplayed = conditionsHeaderPage.objectIsDisplayed(ObjKey);
		Verify.actualExpected(isDisplayed, true, "'" + ObjKey + "'" + " is not Displayed");
	}
	
	@Step
	public void isTabDisplayed(String ObjKey, String ChildObjKey) throws InterruptedException {
		boolean isTabDisplayed = conditionsHeaderPage.isTabProperlyDisplayed(ChildObjKey);
		String styleLoad = "";
		while(isTabDisplayed == false && !styleLoad.contains("none;")) {
			styleLoad = rxNovaCommonUtil.checkBusyState();
			isTabDisplayed = conditionsHeaderPage.isTabProperlyDisplayed(ChildObjKey);
		}
		rxNovaCommonUtil.checkBusyState();
		Verify.actualExpected(isTabDisplayed, true, "'" + ObjKey + "'" + " is not Displayed");
	}
	
	@Step
	public void objectIsDisabled(String ObjKey) {
		boolean isDisabled = conditionsHeaderPage.objectIsDisabled(ObjKey);
		Verify.actualExpected(isDisabled, true, "'" + ObjKey + "'" + " is disabled");
	}
	
	@Step
	public void enterIDs(int stringTargetLength, String ObjKey) {
		String toEnter = rxNovaCommonUtil.fieldIDGenerator(stringTargetLength);
		conditionsHeaderPage.enterIDs(toEnter, ObjKey);
	}
	
	@Step
	public void enterRandomWord(String ObjKey) {
		String toEnter = rxNovaCommonUtil.wordGenerator();
		conditionsHeaderPage.enterIDs(toEnter, ObjKey);
	}
	
	@Step
	public void selectRandomlyFromDropdown(String ObjKey) {
		conditionsHeaderPage.selectRandomlyFromDropdown(ObjKey);
	}
	
	@Step
	public void enterRelevantHeaderData(String ObjKey, DataTable enterData) throws InterruptedException, Throwable {
		//include hashmap vars here.
		List<List<String>> data = enterData.raw();
		String toEnter = "";
		//enters tracking ID
		if(data.get(1).get(0).equals("")) {
			toEnter = rxNovaCommonUtil.fieldIDGenerator(15);
		}
		else {
			toEnter = data.get(1).get(0);
		}
		conditionsHeaderPage.sendKeysToField(toEnter, "Tracking ID:");
		//Master customer set value is chosen
		selectFromDropdown(data.get(1).get(1), "Master customer set:");
		//Condition ID is entered
		toEnter = data.get(1).get(2);
		conditionsHeaderPage.sendKeysToField(toEnter, "Condition ID:");
		//Name is entered 
		toEnter = data.get(1).get(3);
		conditionsHeaderPage.sendKeysToField(toEnter, "Name:");
		//Status value is chosen
		selectFromDropdown(data.get(1).get(4), "Status:");
		//Type value is chosen
		selectFromDropdown(data.get(1).get(5), "Type:");
		clickIfClickable(ObjKey);
	}
	
	@Step
	public void enterRelevantDetailsData (String ObjKey, DataTable enterData) throws Throwable {
		List<List<String>> data = enterData.raw();
		String toEnter = "";
		//enter source information
		selectFromDropdown(data.get(1).get(0), "Source:");
		rxNovaCommonUtil.checkBusyState();
		//enter field name
		toEnter = data.get(1).get(1);
		System.out.println(toEnter);
		String objpath = ConditionsHeaderPage.ConditionsHeaderMap.get("Field Name:");
		rxNovaCommonUtil.selectValueFromFieldIntellisence(By.xpath(objpath), toEnter);
		//enter operator information
		toEnter = data.get(1).get(2);
		selectFromDropdown(toEnter, "Operator for Field");
		//enter value information
		toEnter = data.get(1).get(3);
		conditionsHeaderPage.sendKeysToField(toEnter, "Value for Field");
		clickIfClickable(ObjKey);

	}
	
	@Step
	public void enteringTrackingIDforConditionDeletion(String ID, String ObjKey) throws InterruptedException, Throwable {
		String ObjPath = ConditionsHeaderPage.ConditionsHeaderMap.get("Conditions Header Delete Tracking ID");
		rxNovaCommonUtil.sendKeysToObject(ObjPath, ID);
		clickIfClickable(ObjKey);
	}
	
	@Step
	public void checkPanelsForCorrectLabels(String label) throws InterruptedException {
	boolean stringsExist = conditionsHeaderPage.checkPanelsForCorrectLabels(label);
	Verify.actualExpected(stringsExist, true, label + " does not exist");
	}
	
	@Step
	public void isNotesDisplayed(String label) throws InterruptedException {
		boolean stringsExist = conditionsHeaderPage.isNotesDisplayed(label);
		Verify.actualExpected(stringsExist, true, label + " does not exist");
	}
	
	@Step
	public void verifyingOperatorField(String toEnter, String expected) throws Throwable {
		String objpath = ConditionsHeaderPage.ConditionsHeaderMap.get("Field Name:");
		rxNovaCommonUtil.selectValueFromFieldIntellisence(By.xpath(objpath), toEnter);
		objpath = ConditionsHeaderPage.ConditionsHeaderMap.get("Operator for Field");
		boolean exist = rxNovaCommonUtil.dropdownCheckContents(expected, objpath);
		Verify.actualExpected(exist, true, "Operator dropdown does not contain the correct contents");
	}
	
	@Step
	public void benefitCustomerDrpDown(String ObjKey) {
		boolean exist = conditionsHeaderPage.MCScheckContents(ObjKey);
		Verify.actualExpected(exist, true, "Benefit Customer set does not display any contents");
	}
	
	@Step
	public void verifyingOperatorFieldwithoutEntry(String ObjKey, String expected) {
		boolean exist = conditionsHeaderPage.dropdownCheckContents(ObjKey, expected);
		Verify.actualExpected(exist, true, ObjKey + "does not display any contents");
	}
	
	@Step
	public void userDeletesCondition() throws Throwable {
		clickIfClickable("Conditions Header after Condition Creation");
		String ObjPath = ConditionsHeaderPage.ConditionsHeaderMap.get("Conditions Header Delete");
		WebElement DeleteObj = conditionsHeaderPage.find(By.xpath(ObjPath));
		rxNovaCommonUtil.waitFor(DeleteObj);
		clickIfClickable("Conditions Header Delete");
		enteringTrackingIDforConditionDeletion("123456789954621", "Conditions Header 2nd Delete");
		ObjPath = ConditionsHomePage.ConditionsHomeMap.get("Condition Deleted Message");
		DeleteObj = conditionsHomePage.find(By.xpath(ObjPath));
		rxNovaCommonUtil.checkBusyState();
	}
	
	@Step
	public void isAssociationsEnabled() throws Throwable {
		boolean isEnabled = conditionsHeaderPage.objectIsCurrentlyEnabled("Associations after Condition Creation");
		if(isEnabled == false) {
			userDeletesCondition();
			Verify.actualExpected(isEnabled, true, "Associations is not currently enabled");
		}
		else {
			userDeletesCondition();
		}
	}
	
	@Step
	public void verifyAssociationsDisplay(String ObjKey, String ChildObjKey) throws Throwable {
		String ChildObjPath = ConditionsHeaderPage.ConditionsHeaderMap.get(ChildObjKey);
		WebElement ChildObj = conditionsHeaderPage.find(By.xpath(ChildObjPath));
		rxNovaCommonUtil.waitFor(ChildObj);
		boolean isTabDisplayed = rxNovaCommonUtil.isTabProperlyDisplayed(ChildObjPath);
		if(isTabDisplayed == false) {
			userDeletesCondition();
			Verify.actualExpected(isTabDisplayed, true, "'" + ObjKey + "'" + " is not properly displayed");
		}
		else {
			userDeletesCondition();
		}
	}
	
	@Step
	public void checkNextandCancel() throws Throwable {
		String ObjPath = ConditionsHeaderPage.ConditionsHeaderMap.get("Next Button");
		boolean isPresent = rxNovaCommonUtil.checkElementPresenceByLocator(By.xpath(ObjPath));
		String ObjPath2 = ConditionsHeaderPage.ConditionsHeaderMap.get("Cancel Button");
		boolean isPresent2 = rxNovaCommonUtil.checkElementPresenceByLocator(By.xpath(ObjPath2));
		if(isPresent == false && isPresent2 == true) {
			Verify.actualExpected(isPresent, true, "Next Button is not properly displayed");
		}
		if(isPresent == true && isPresent2 == false) {
			Verify.actualExpected(isPresent2, true, "Cancel Button is not properly displayed");
		}
		if(isPresent == false && isPresent2 == false) {
			Verify.actualExpected(isPresent && isPresent2, true, "Next and Cancel Buttons are not properly displayed");
		}
	}
	
	@Step
	public void MCSDropdowncheckContents(String ObjKey) {
		boolean hasContents = conditionsHeaderPage.MCScheckContents(ObjKey);
		if(hasContents == false) {
			Verify.actualExpected(hasContents, true, "Master customer set dropdown does not have any contents available");
		}
		else {
			System.out.println("Master customer set dropdown contains contents");
		}
	}

	@Step
	public void checkPrefix(String prefix, String ObjKey) {
		boolean hasPrefix = conditionsHeaderPage.checkPrefix(prefix, ObjKey);
		Verify.actualExpected(hasPrefix, true, ObjKey + "does not display correct CD prefix");
	}
	
	@Step
	public void dropdownCheckContents(String expected, String ObjKey) {
		boolean hasCorrectContents = conditionsHeaderPage.dropdownCheckContents(ObjKey, expected);
		Verify.actualExpected(hasCorrectContents, true, ObjKey + "Drop-down list does not have expected contents");
	}
}
