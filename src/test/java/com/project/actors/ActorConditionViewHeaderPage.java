package com.project.actors;

import java.util.List;

import com.project.pages.ConditionViewHeaderPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionViewHeaderPage {

	@Steps
	ConditionViewHeaderPage conditionViewHeaderPage;
	
	@Step
	public void verifyConditionHeaderSummaryDetails(DataTable conditionHeaderSummaryData) throws Throwable {
		
		List<List<String>> headerSummaryData = conditionHeaderSummaryData.raw();
		
		String strMCS = headerSummaryData.get(1).get(0);
		String strConditionID = headerSummaryData.get(1).get(1);
		String strName = headerSummaryData.get(1).get(2);
		String strStatus = headerSummaryData.get(1).get(3);
		
		conditionViewHeaderPage.verifyConditionHeaderSummaryIsDisplayed();
		conditionViewHeaderPage.verifyMCSHeaderSummary(strMCS);
		conditionViewHeaderPage.verifyConditionIDHeaderSummary(strConditionID);
		conditionViewHeaderPage.verifyConditionNameHeaderSummary(strName);
		conditionViewHeaderPage.verifyStatusHeaderSummary(strStatus);
	}
	
	@Step
	public void verifyConditionHeaderDetails(DataTable conditionHeaderData) throws Throwable{
		
		List<List<String>> headerData = conditionHeaderData.raw();
		
		String strMCS = headerData.get(1).get(0);
		String strConditionID = headerData.get(1).get(1);
		String strName = headerData.get(1).get(2);
		String strStatus = headerData.get(1).get(3);
		String strType = headerData.get(1).get(4);
		
		conditionViewHeaderPage.verifyMCS(strMCS);
		conditionViewHeaderPage.verifyConditionID(strConditionID);
		conditionViewHeaderPage.verifyConditionName(strName);
		conditionViewHeaderPage.verifyStatus(strStatus);
		conditionViewHeaderPage.verifyType(strType);
	}
}
