package com.project.actors;

import java.util.List;

import com.project.pages.ConditionUpdateDetailsSinglePage;
import com.project.pages.ConditionViewDetailsSinglePage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionViewDetailsSinglePage {
	@Steps
	ConditionUpdateDetailsSinglePage conditionUpdateDetailsSinglePage;
	ConditionViewDetailsSinglePage conditionViewDetailsSinglePage;
	
	@Step
	public void verifyConditionDetails(DataTable conditionDetailsData) throws Throwable {
		
		List<List<String>> detailsData = conditionDetailsData.raw();
		
		String strSource = detailsData.get(1).get(0);
		String strBCS = detailsData.get(1).get(1);
		String strDescription = detailsData.get(1).get(2);
		
		conditionUpdateDetailsSinglePage.clickOnDetailsTab();
		conditionUpdateDetailsSinglePage.verifyConditionDetailsTabIsDisplayed();
		conditionViewDetailsSinglePage.verifySource(strSource);
		conditionViewDetailsSinglePage.verifyBCS(strBCS);
		conditionViewDetailsSinglePage.verifyConditionDescription(strDescription);   
	}
}
