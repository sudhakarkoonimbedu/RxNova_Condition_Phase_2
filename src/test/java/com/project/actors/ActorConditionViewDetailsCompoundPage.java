package com.project.actors;

import java.util.List;

import com.project.pages.ConditionUpdateDetailsSinglePage;
import com.project.pages.ConditionViewDetailsCompoundPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionViewDetailsCompoundPage {
	@Steps
	ConditionUpdateDetailsSinglePage conditionUpdateDetailsSinglePage;
	ConditionViewDetailsCompoundPage conditionViewDetailsCompoundPage;
	
	@Step
	public void verifyCompoundConditionDetails(DataTable conditionDetailsData) throws Throwable {
		
		List<List<String>> detailsData = conditionDetailsData.raw();
		
		String strCompoundOperator = detailsData.get(1).get(0);
		String strConditionID1 = detailsData.get(1).get(1);
		String strConditionName1 = detailsData.get(1).get(2);
		String strConditionID2 = detailsData.get(1).get(3);
		String strConditionName2 = detailsData.get(1).get(4);
		String strConditionDescription = detailsData.get(1).get(5);
		String strConditionDetailsDescription = detailsData.get(1).get(6);
		String strConditionDetails = detailsData.get(1).get(7);
		
		conditionUpdateDetailsSinglePage.clickOnDetailsTab();
		conditionUpdateDetailsSinglePage.verifyConditionDetailsTabIsDisplayed();
		conditionViewDetailsCompoundPage.verifyCompoundOperator(strCompoundOperator);
		conditionViewDetailsCompoundPage.verifyConditionID(strConditionID1);		
		conditionViewDetailsCompoundPage.verifyConditionName(strConditionName1);
		conditionViewDetailsCompoundPage.verifyConditionID(strConditionID2);
		conditionViewDetailsCompoundPage.verifyConditionName(strConditionName2);
		conditionViewDetailsCompoundPage.verifyConditionDescription1(strConditionDescription);
		conditionViewDetailsCompoundPage.verifyConditionDescription2(strConditionDetailsDescription);
		conditionViewDetailsCompoundPage.clickOnExpandIcon();
		conditionViewDetailsCompoundPage.verifyConditionDetails(strConditionDetails);
	}
}
