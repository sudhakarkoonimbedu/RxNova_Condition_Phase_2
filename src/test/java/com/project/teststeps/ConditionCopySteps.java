package com.project.teststeps;

import com.project.actors.ActorConditionCopyPage;
import com.project.common.util.RxNovaCommonUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConditionCopySteps {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionCopyPage actorOnConditionCopyPage;

	
	@And("^verify the Condition Header tab and click on Copy button$")
	public void verifyConditionHeaderAndClickOnCopyButton() throws Throwable {
		actorOnConditionCopyPage.verifyConditionHeaderAndClickOnCopyButton();
	}
	
	@When("^he submits the following details in Copy a Condition window$")
	public void copyCondition(DataTable conditionCopyData) throws Throwable {
		actorOnConditionCopyPage.copyCondition(conditionCopyData);
	}
	
	@Then("^verify the Condition Copy Success message at the top of the page$")
	public void verifyConditionCopySuccessMessage(DataTable conditionCopyMessageData) throws Throwable {
		actorOnConditionCopyPage.verifyConditionCopySuccessMessage(conditionCopyMessageData);		
	}	
}