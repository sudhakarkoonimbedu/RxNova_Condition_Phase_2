package com.project.teststeps;

import com.project.actors.ActorConditionUpdateTagsNotesPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateTagsSteps {
	
	@Steps
	ActorConditionUpdateTagsNotesPage actorOnConditionUpdateTagsNotesPage;
	
	@When("^he updates the following details in Tags/Notes tab and verify the Condition Tags Success message at the top of the page$")
	public void updateConditionTagsNotesData(DataTable conditionTagsNotesData) throws Throwable {
		actorOnConditionUpdateTagsNotesPage.updateTagsNotesData(conditionTagsNotesData);
	}
}
