package com.project.actors;

import java.util.List;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.project.pages.ConditionUpdateDetailsCompoundPage;
import cucumber.api.DataTable;

public class ActorConditionUpdateDetailsCompoundPage {
	@Steps
	ConditionUpdateDetailsCompoundPage conditionUpdateDetailsCompoundPage;
	
	@Step
	public void updateCompoundConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		
		List<List<String>> detailsData = conditionDetailsData.raw();
		
		String strTrackingID = detailsData.get(1).get(0);
		String strReason = detailsData.get(1).get(1);
		String strNotes = detailsData.get(1).get(2);
		String strCompoundOperator = detailsData.get(1).get(3);
		String strConditionData = detailsData.get(1).get(4);;
	
		conditionUpdateDetailsCompoundPage.clickOnDetailsTab();
		conditionUpdateDetailsCompoundPage.verifyConditionDetailsTabIsDisplayed();
		conditionUpdateDetailsCompoundPage.clickOnMakeUpdatesButton();
		conditionUpdateDetailsCompoundPage.enterTrackingID(strTrackingID);
		conditionUpdateDetailsCompoundPage.enterReason(strReason);
		conditionUpdateDetailsCompoundPage.enterNotes(strNotes);
		conditionUpdateDetailsCompoundPage.selectCompoundOperator(strCompoundOperator);
		conditionUpdateDetailsCompoundPage.addOrRemoveCondition(strConditionData);
		conditionUpdateDetailsCompoundPage.clickOnTopSaveButton();		    
	}
}
