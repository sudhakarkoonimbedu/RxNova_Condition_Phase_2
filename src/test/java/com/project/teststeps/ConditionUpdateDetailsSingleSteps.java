package com.project.teststeps;

import com.project.actors.ActorConditionUpdateDetailsSinglePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateDetailsSingleSteps {

	@Steps
	ActorConditionUpdateDetailsSinglePage actorOnConditionUpdateSingleDetailsPage;
	
	@And("^he updates the Condition Details tab with the folowing details$")
	public void updateConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		actorOnConditionUpdateSingleDetailsPage.updateConditionDetailsData(conditionDetailsData);
	}
}
