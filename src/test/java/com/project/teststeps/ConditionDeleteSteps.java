package com.project.teststeps;

import com.project.actors.ActorConditionDeletePage;
import com.project.common.util.RxNovaCommonUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ConditionDeleteSteps {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionDeletePage actorOnConditionDeletePage;

	
	@And("^deletes the condition with the following details$")
	public void deleteCondition(DataTable conditionDeleteData) throws Throwable {
		actorOnConditionDeletePage.deleteCondition(conditionDeleteData);
	}
	
	@Then("^verify the Condition Delete Success message at the top of the page$")
	public void verifyConditionDeleteSuccessMessage(DataTable conditionDeleteMessageData) throws Throwable {
		actorOnConditionDeletePage.verifyConditionDeleteSuccessMessage(conditionDeleteMessageData);
	}
}