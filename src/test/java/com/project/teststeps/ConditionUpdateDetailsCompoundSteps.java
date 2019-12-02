package com.project.teststeps;

import com.project.actors.ActorConditionUpdateDetailsCompoundPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateDetailsCompoundSteps {

	@Steps
	ActorConditionUpdateDetailsCompoundPage actorOnConditionUpdateCompoundDetailsPage;
	
	@And("^he updates the Compound Condition Details tab with the folowing details$")
	public void updateCompoundConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		actorOnConditionUpdateCompoundDetailsPage.updateCompoundConditionDetailsData(conditionDetailsData);
	}
}
