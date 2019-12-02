package com.project.actors;

import java.util.List;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.project.pages.ConditionDetailsCompoundPage;
import cucumber.api.DataTable;

public class ActorConditionDetailsCompoundPage {
	@Steps
	ConditionDetailsCompoundPage conditionDetailsCompoundPage;
	
	@Step
	public void enterCompoundConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		
		List<List<String>> detailsData = conditionDetailsData.raw();
		
		String strCompoundOperator = detailsData.get(1).get(0);
		String strConditionData = detailsData.get(1).get(1);
		
		conditionDetailsCompoundPage.verifyConditionDetailsTabIsDisplayed(); 
		conditionDetailsCompoundPage.selectCompoundOperator(strCompoundOperator);
  	    conditionDetailsCompoundPage.addOrRemoveCondition(strConditionData);
  	    conditionDetailsCompoundPage.clickOnTopNextButton();    
	}
}
