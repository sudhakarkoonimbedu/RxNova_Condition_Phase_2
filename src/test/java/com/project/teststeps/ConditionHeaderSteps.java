package com.project.teststeps;

import com.project.actors.ActorConditionHeaderPage;
import com.project.common.util.RxNovaCommonUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class ConditionHeaderSteps {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionHeaderPage actorOnConditionHeaderPage;
	
	
	@Given("^User navigates to the Condition Header tab and submits the following details$")
	public void enterConditionHeaderData(DataTable conditionHeaderData) throws Throwable {
		actorOnConditionHeaderPage.enterConditionHeaderData(conditionHeaderData);
	}
}
