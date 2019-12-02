package com.project.teststeps;

import com.project.actors.ActorConditionUpdateHeaderPage;
import com.project.common.util.RxNovaCommonUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateHeaderSteps {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionUpdateHeaderPage actorOnConditionUpdateHeaderPage;
	
	
	@And("^verify the Condition Header tab and updates the Condition Header tab with the following details$")
	public void updateConditionHeaderData(DataTable enterConditionHeaderData) throws Throwable {
		actorOnConditionUpdateHeaderPage.updateConditionHeaderData(enterConditionHeaderData);
	}
	
	@And("^verify the Condition Update Success message at the top of the page$")
	public void verifyConditionUpdateSuccessMessage(DataTable conditionUpdateMessageData) throws Throwable {
		actorOnConditionUpdateHeaderPage.verifyConditionUpdateSuccessMessage(conditionUpdateMessageData);
	}
}
