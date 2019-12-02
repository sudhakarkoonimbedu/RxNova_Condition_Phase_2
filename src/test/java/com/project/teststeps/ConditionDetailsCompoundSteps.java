package com.project.teststeps;

import com.project.actors.ActorConditionDetailsCompoundPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionDetailsCompoundSteps {

	@Steps
	ActorConditionDetailsCompoundPage actorOnConditionCompoundDetailsPage;
	
	@And("^he submits the following compound details in the Details tab$")
	public void enterCompoundConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		actorOnConditionCompoundDetailsPage.enterCompoundConditionDetailsData(conditionDetailsData);
	}
}
