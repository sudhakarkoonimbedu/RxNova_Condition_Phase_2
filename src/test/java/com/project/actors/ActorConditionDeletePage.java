package com.project.actors;

import java.util.List;
import com.project.pages.ConditionDeletePage;
import com.project.pages.ConditionUpdateHeaderPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionDeletePage {
	
	@Steps
	ConditionUpdateHeaderPage conditionUpdateHeaderPage;	
	ConditionDeletePage conditionDeletePage;
	
	@Step
	public void deleteCondition(DataTable conditionDeleteData) throws Throwable {
		
		List<List<String>> deleteData = conditionDeleteData.raw();
		
		String strTrackingID = deleteData.get(1).get(0);
		String strReason = deleteData.get(1).get(1);
		String strNotes = deleteData.get(1).get(2);
		
		conditionUpdateHeaderPage.verifyConditionHeaderTabIsDisplayed();
		conditionUpdateHeaderPage.clickOnDeleteButton();
		conditionDeletePage.verifyDeleteConditionWindowIsDisplayed();
		conditionDeletePage.enterTrackingID(strTrackingID);
		conditionDeletePage.enterReason(strReason);
		conditionDeletePage.enterNotes(strNotes);   
		conditionDeletePage.clickOnDeleteButton();
	}
	
	@Step
	public void verifyConditionDeleteSuccessMessage(DataTable conditionDeleteMessageData) {
	
		List<List<String>> deleteMessageData = conditionDeleteMessageData.raw();
		
	    String deleteMsgData = deleteMessageData.get(1).get(0);
		
	    conditionDeletePage.verifyConditionDeleteSuccessMessage(deleteMsgData);
	}
}
	
