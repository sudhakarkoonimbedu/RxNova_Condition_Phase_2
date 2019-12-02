package com.project.actors;


import java.util.List;
import com.project.pages.ConditionTagsNotesPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionTagsNotesPage {
	@Steps
	ConditionTagsNotesPage conditionTagsNotesPage;
	
	@Step
	public void enterTagsNotesData(DataTable conditionTagsNotesData) throws Throwable {
		
		List<List<String>> tagsNotesData = conditionTagsNotesData.raw();
		
		String strNotes = tagsNotesData.get(1).get(0);
		String strTags = tagsNotesData.get(1).get(1);
		String strTagsAddMessage = tagsNotesData.get(1).get(2);
		String strTagsRemoveMessage = tagsNotesData.get(1).get(2);
		
		conditionTagsNotesPage.verifyConditionTagsNotesTabIsDisplayed();
		conditionTagsNotesPage.enterNotes(strNotes);
		conditionTagsNotesPage.enterTagsAndClickonAddButton(strTags,strTagsAddMessage,strTagsRemoveMessage);
	}
	
	@Step
	public void clickOnSaveAndVerifyConditionAddSuccessMessage(DataTable conditionAddMessage) throws Throwable {
		
		List<List<String>> conditionAddSuccessMessage = conditionAddMessage.raw();
		
		String conditionAddMsg = conditionAddSuccessMessage.get(1).get(0);
		
		conditionTagsNotesPage.clickOnSaveButton();
		conditionTagsNotesPage.verifyConditionAddSuccessMessage(conditionAddMsg);
	}
}
