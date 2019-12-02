package com.project.teststeps;

import com.project.actors.ActorConditionViewDetailsCompoundPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionViewDetailsCompoundSteps {

	@Steps
	ActorConditionViewDetailsCompoundPage actorOnConditionViewCompoundDetailsPage;
	
	@And("^verify the Compound Condition Definition details$")
	public void verifyCompoundConditionDetails(DataTable conditionDetailsData) throws Throwable {
		actorOnConditionViewCompoundDetailsPage.verifyCompoundConditionDetails(conditionDetailsData);
	}
}
