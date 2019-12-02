package com.project.teststeps;

import com.project.actors.ActorConditionsFieldAdminNew;
import com.project.common.util.RxNovaCommonUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ConditionFieldAdminDetailsNewUIVerificationSteps {

	@Steps
	ActorConditionsFieldAdminNew actorOnFieldAdminDetails;
	

	
	
	@Then("^They check if \"(.*)\" is showing by checking for \"(.*)\"$")
	public void isTabDisplayed(String ObjKey, String ChildObjKey) throws InterruptedException {
		actorOnFieldAdminDetails.isTabDisplayed(ObjKey, ChildObjKey);
	}
	
	@Then("^They press on \"(.*)\"$")
	public void clickIfClickable(String ObjKey) throws InterruptedException, Throwable {
		actorOnFieldAdminDetails.clickIfClickable(ObjKey);
	}
	
	@Then("^They enter the following data for Header and press \"(.*)\"$")
	public void enterRelevantHeaderDetails(String ObjKey, DataTable enterData) throws Throwable, InterruptedException {
		actorOnFieldAdminDetails.enterRelevantHeaderData(ObjKey, enterData);
	}
	
	@Then("^They check whether \"(.*)\" is currently enabled$")
	public void objectIsCurrentlyEnabled(String ObjKey) {
		actorOnFieldAdminDetails.objectIsCurrentlyEnabled(ObjKey);
	}
	
	@Then("^They determine whether the \"(.*)\" contains \"(.*)\"$")
	public void checkDetailsPanelForCorrectLabels(String ObjKey, String label) throws InterruptedException {
		actorOnFieldAdminDetails.checkDetailsPanelForCorrectLabels(ObjKey, label);
	}
	
	@Then("^They check if \"(.*)\" is displayed$")
	public void objectIsDisplayed(String ObjKey) throws InterruptedException {
		actorOnFieldAdminDetails.objectIsDisplayed(ObjKey);
	}
	
	@Then("^They check if \"(.*)\" dropdown list contains \"(.*)\"$")
	public void dropdownCheckContents(String ObjKey, String expected) {
		actorOnFieldAdminDetails.dropdownCheckContents(expected, ObjKey);
	}
	
	@Then("^They check if \"(.*)\" dropdown list contains list of available contents$")
	public void MCScheckContents(String ObjKey) {
		actorOnFieldAdminDetails.MCSDropdowncheckContents(ObjKey);
	}
	
}
