package com.project.actors;

import static org.junit.Assert.*;

import com.project.pages.ConditionsHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import cucumber.api.DataTable;
import java.util.List;
import com.project.common.util.RxNovaCommonUtil;

public class ActorConditionsHomePage {
	
	@Steps
	ConditionsHomePage conditionsHomePage;
	@Steps 
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Step
	public void objectIsDisplayed(String ObjKey) throws InterruptedException {
		boolean isDisplayed = conditionsHomePage.ObjectIsDisplayed(ObjKey);
		assertTrue("'" + ObjKey + "'" + " object is not displayed ", isDisplayed);
	}
	
	@Step
	public void selectFromDropdown(String input, String ObjKey) throws InterruptedException {
		conditionsHomePage.mySelectFromDropdown(input, ObjKey);
	}
	
	@Step
	public void sendKeysToField(String input, String ObjKey) {
		conditionsHomePage.SendKeysToField(input, ObjKey);
	}
	
	@Step
	public void objectContainsExpectedText(String ObjKey, String expectedDisplay) throws InterruptedException {
		objectIsDisplayed(ObjKey);
		boolean containsExpected = conditionsHomePage.ObjectContainsExpectedText(ObjKey, expectedDisplay);
		assertTrue("'" + ObjKey + "'" + " does not contain " + expectedDisplay, containsExpected);
		
	}
	
	@Step
	public void checkCurrentDropdownDisplay(String ObjKey, String expectedDisplay) {
		boolean matchesExpected = conditionsHomePage.checkCurrentDropdownDisplay(ObjKey, expectedDisplay);
		assertTrue("'" + ObjKey + "'" + "is not blank by default", matchesExpected);
	}
	
	@Step
	public void checkCurrentFieldDisplay(String ObjKey, String expectedDisplay) {
		boolean matchesExpected = conditionsHomePage.checkCurrentFieldDisplay(ObjKey, expectedDisplay);
		assertTrue("'" + ObjKey + "'" + "is not blank by default", matchesExpected);
	}
	
	@Step 
	public void viewLabels(String label) {
		boolean labelExists = conditionsHomePage.viewLabels(label);
		assertTrue(label + "does not exist.", labelExists);
	}
	
	@Step
	public void MCScheckContents(String ObjKey){
		boolean hasContents = conditionsHomePage.MCScheckContents(ObjKey);
		assertTrue("MCS Drop-down list does not have contents", hasContents);
	}
	
	@Step
	public void dropdownCheckContents(String expected, String ObjKey) {
		boolean hasCorrectContents = conditionsHomePage.DropdownCheckContents(expected, ObjKey);
		assertTrue(ObjKey + "Drop-down list does not have expected contents", hasCorrectContents);
	}
	
	@Step
	public void checkPrefix(String prefix, String ObjKey) {
		boolean hasPrefix = conditionsHomePage.checkPrefix(prefix, ObjKey);
		assertTrue(ObjKey + "does not display correct CD prefix", hasPrefix);
	}
	
	@Step
	public void isFieldClickable(String ObjKey) throws InterruptedException {
		boolean isClickable = conditionsHomePage.isFieldClickable(ObjKey);
		assertTrue(ObjKey + "is not clickable", isClickable);
	}
	
	@Step
	public void clickIfClickable(String ObjKey) throws InterruptedException {
		isFieldClickable(ObjKey);
		conditionsHomePage.performClick(ObjKey);
	}
	
	@Step
	public void objectIsDisabled(String ObjKey) {
		boolean isDisabled = conditionsHomePage.ObjectIsDisabled(ObjKey);
		assertTrue("'" + ObjKey + "'" + " is disabled", isDisabled);
	}
	
	@Step
	public void isTabDisplayed(String ObjKey, String ChildObjKey) throws InterruptedException {
		boolean isTabDisplayed = conditionsHomePage.IsTabProperlyDisplayed(ChildObjKey);
		String styleLoad = "";
		while(isTabDisplayed == false && !styleLoad.contains("none;")) {
			styleLoad = rxNovaCommonUtil.checkBusyState();
			isTabDisplayed = conditionsHomePage.IsTabProperlyDisplayed(ChildObjKey);
		}
		rxNovaCommonUtil.checkBusyState();
		assertTrue("'" + ObjKey + "'" + " is not displayed", isTabDisplayed);
	}
	
	@Step
	public void searchingForConditiontoDelete(String ObjKey, DataTable data) throws InterruptedException {
		List<List<String>> enterData = data.raw();
		selectFromDropdown(enterData.get(1).get(0), "Master customer set:");
		rxNovaCommonUtil.checkBusyState();
		selectFromDropdown(enterData.get(1).get(1), "Type:");
		rxNovaCommonUtil.checkBusyState();
		sendKeysToField(enterData.get(1).get(2), "Condition ID:");
		rxNovaCommonUtil.checkBusyState();
		sendKeysToField(enterData.get(1).get(3), "Name:");
		rxNovaCommonUtil.checkBusyState();
		clickIfClickable(ObjKey);
	}

}
	
