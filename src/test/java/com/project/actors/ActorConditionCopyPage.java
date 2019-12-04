package com.project.actors;

import java.util.List;

import com.project.pages.ConditionCopyPage;
import com.project.pages.ConditionUpdateHeaderPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionCopyPage {
	
	@Steps
	ConditionUpdateHeaderPage conditionUpdateHeaderPage;
	ConditionCopyPage conditionCopyPage;
	

	@Step
	public void verifyConditionHeaderAndClickOnCopyButton() throws Throwable {
		conditionUpdateHeaderPage.verifyConditionHeaderTabIsDisplayed();
		conditionUpdateHeaderPage.clickOnCopyButton();
	}
	
	@Step
	public void copyCondition(DataTable copyConditionData) throws Throwable {
		
		List<List<String>> copyData = copyConditionData.raw();
		
		String strConditionID = copyData.get(1).get(0);
		String strName = copyData.get(1).get(1);
		String strStatus = copyData.get(1).get(2);
		String strTrackingID = copyData.get(1).get(3);
		String strReason = copyData.get(1).get(4);
		String strNotes = copyData.get(1).get(5);
		
	    conditionCopyPage.verifyCopyConditionWindowIsDisplayed();
	    conditionCopyPage.enterConditionID(strConditionID);
	    conditionCopyPage.enterConditionName(strName);
	    conditionCopyPage.selectStatus(strStatus);
	    conditionCopyPage.enterTrackingID(strTrackingID);
	    conditionCopyPage.enterReason(strReason);
	    conditionCopyPage.enterNotes(strNotes);
	    conditionCopyPage.clickOnCopyButton();		
	}
	
	@Step
	public void verifyConditionCopySuccessMessage(DataTable conditionCopyMessageData) {
		
		List<List<String>> copyMessageData = conditionCopyMessageData.raw();
		
		String copyMsgData = copyMessageData.get(1).get(0);
		
		conditionCopyPage.verifyConditionCopySuccessMessage(copyMsgData);
	}
}
	
