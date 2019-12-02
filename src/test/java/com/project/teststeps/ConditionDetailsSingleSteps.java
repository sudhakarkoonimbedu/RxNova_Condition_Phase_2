package com.project.teststeps;

import com.project.actors.ActorConditionDetailsSinglePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionDetailsSingleSteps {

	@Steps
	ActorConditionDetailsSinglePage actorOnConditionSingleDetailsPage;
	
	@And("^he submits the following details in the Details tab$")
	public void enterConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		actorOnConditionSingleDetailsPage.enterConditionDetailsData(conditionDetailsData);
	}
}
