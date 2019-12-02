package com.project.teststeps;

import com.project.actors.ActorConditionHomePage;
import com.project.common.util.RxNovaCommonUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class ConditionHomeSteps {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionHomePage actorOnConditionsHomePage;

	
	@Given("^User searches condition with the following data and deletes them$")
	public void deleteCondition(DataTable deleteDetails) throws Throwable {
		actorOnConditionsHomePage.deleteCondition(deleteDetails);
	}
	
	@And("^check whether the Condition Home is displayed$")
	public void verifyConditionHome() throws InterruptedException {
		actorOnConditionsHomePage.verifyConditionHomeIsDisplayed();
	}
	
	@Given("^User search for the existing condition with the following details$")
	public void searchCondition(DataTable searchConditionData) throws Throwable {
		actorOnConditionsHomePage.searchCondition(searchConditionData);		
	}
	
	@Given("^User search for the existing condition from Search Results table$")
	public void searchConditionfromResultsTable(DataTable searchConditionData) throws Throwable {
		actorOnConditionsHomePage.searchConditionfromResultsTable(searchConditionData);		
	}
	
	@Given("^User perform Advanced Search for the existing condition with the following details$")
	public void advancedSearchCondition(DataTable searchConditionData) throws Throwable {
		actorOnConditionsHomePage.advancedSearchCondition(searchConditionData);		
	}
}