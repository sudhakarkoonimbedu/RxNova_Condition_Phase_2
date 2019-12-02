package com.project.actors;

import java.util.List;
import com.project.pages.ConditionUpdateHeaderPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionUpdateHeaderPage {

	@Steps
	ConditionUpdateHeaderPage conditionUpdateHeaderPage;
	
	@Step
	public void updateConditionHeaderData(DataTable conditionHeaderData) throws Throwable {
		
		List<List<String>> headerData = conditionHeaderData.raw();
		
		String strTrackingID = headerData.get(1).get(0);
		String strReason = headerData.get(1).get(1);
		String strNotes = headerData.get(1).get(2);
		String strName = headerData.get(1).get(3);
		String strStatus = headerData.get(1).get(4);
		
		conditionUpdateHeaderPage.verifyConditionHeaderTabIsDisplayed();
		conditionUpdateHeaderPage.clickOnMakeUpdatesButton();
		conditionUpdateHeaderPage.enterTrackingID(strTrackingID);
		conditionUpdateHeaderPage.enterReason(strReason);
		conditionUpdateHeaderPage.enterNotes(strNotes);
		conditionUpdateHeaderPage.enterConditionName(strName);
		conditionUpdateHeaderPage.selectStatus(strStatus);
		conditionUpdateHeaderPage.clickOnSaveButton();    
	}
	
	@Step
	public void verifyConditionUpdateSuccessMessage(DataTable conditionUpdateMessageData) {
		
		List<List<String>> updateMessageData = conditionUpdateMessageData.raw();
		
		String updateMsgData = updateMessageData.get(1).get(0);
		
		conditionUpdateHeaderPage.verifyConditionUpdateSuccessMessage(updateMsgData);
	}
}
