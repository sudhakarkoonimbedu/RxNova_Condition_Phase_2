package com.project.teststeps;

import com.project.actors.ActorConditionTagsNotesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConditionTagsSteps {
	
	@Steps
	ActorConditionTagsNotesPage actorOnConditionTagsNotesPage;
	
	@When("^he submits the following details in Tags/Notes tab and verify the Condition Tags Success message at the top of the page$")
	public void enterConditionTagsNotesData(DataTable conditionTagsNotesData) throws Throwable {
		actorOnConditionTagsNotesPage.enterTagsNotesData(conditionTagsNotesData);
	}
	
	@Then("^verify the Condition Add Success message at top of the page after saving the condition$")
	public void clickOnSaveAndVerifyConditionAddSuccessMessage(DataTable conditionAddMessage) throws Throwable {
		actorOnConditionTagsNotesPage.clickOnSaveAndVerifyConditionAddSuccessMessage(conditionAddMessage);
	}
}
