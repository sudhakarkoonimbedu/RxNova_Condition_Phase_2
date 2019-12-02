package com.project.teststeps;

import com.project.actors.ActorConditionViewHeaderPage;
import com.project.common.util.RxNovaCommonUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionViewHeaderSteps {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionViewHeaderPage actorOnConditionViewHeaderPage;
	
	
	@And("^verify the Condition Header Summary details$")
	public void verifyConditionHeaderSummaryDetails(DataTable conditionHeaderSummaryData) throws Throwable {
		actorOnConditionViewHeaderPage.verifyConditionHeaderSummaryDetails(conditionHeaderSummaryData);
	}
	
	@And("^verify the Condition Header details$")
	public void verifyConditionHeaderDetails(DataTable conditionHeaderData) throws Throwable {
		actorOnConditionViewHeaderPage.verifyConditionHeaderDetails(conditionHeaderData);
	}
}
