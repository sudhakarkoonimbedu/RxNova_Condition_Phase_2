package com.project.actors;

import java.util.List;
import com.project.pages.ConditionHeaderPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionHeaderPage {

	@Steps
	ConditionHeaderPage conditionHeaderPage;
	
	@Step
	public void enterConditionHeaderData(DataTable conditionHeaderData) throws Throwable {
		
		List<List<String>> headerData = conditionHeaderData.raw();
		
		String strTrackingID = headerData.get(1).get(0);
		String strReason = headerData.get(1).get(1);
		String strNotes = headerData.get(1).get(2);
		String strMCS = headerData.get(1).get(3);
		String strConditionID = headerData.get(1).get(4);
		String strName = headerData.get(1).get(5);
		String strStatus = headerData.get(1).get(6);
		String strType = headerData.get(1).get(7);
		
		conditionHeaderPage.clickOnNewButton();
		conditionHeaderPage.verifyConditionHeaderTabIsDisplayed();
		conditionHeaderPage.enterTrackingID(strTrackingID);
		conditionHeaderPage.enterReason(strReason);
		conditionHeaderPage.enterNotes(strNotes);
		conditionHeaderPage.selectMasterCustomerSet(strMCS);
		conditionHeaderPage.enterConditionID(strConditionID);
		conditionHeaderPage.enterConditionName(strName);
		conditionHeaderPage.selectStatus(strStatus);
		conditionHeaderPage.selectType(strType);
		conditionHeaderPage.clickOnNextButton();    
	}
}
