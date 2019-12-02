package com.project.teststeps;

import com.project.actors.ActorConditionViewDetailsSinglePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionViewDetailsSingleSteps {

	@Steps
	ActorConditionViewDetailsSinglePage actorOnConditionViewSingleDetailsPage;
	
	@And("^verify the Condition Definition details$")
	public void verifyConditionDetails(DataTable conditionDetailsData) throws Throwable {
		actorOnConditionViewSingleDetailsPage.verifyConditionDetails(conditionDetailsData);
	}
}
