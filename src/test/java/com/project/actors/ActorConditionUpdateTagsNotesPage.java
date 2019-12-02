package com.project.actors;

import java.util.List;
import com.project.pages.ConditionUpdateTagsNotesPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionUpdateTagsNotesPage {
	@Steps
	ConditionUpdateTagsNotesPage conditionUpdateTagsNotesPage;
	
	@Step
	public void updateTagsNotesData(DataTable conditionTagsNotesData) throws Throwable {
		
		List<List<String>> tagsNotesData = conditionTagsNotesData.raw();
		
		String strTrackingID = tagsNotesData.get(1).get(0);
		String strReason = tagsNotesData.get(1).get(1);
		String strNotes = tagsNotesData.get(1).get(2);
		String strTagsNotes = tagsNotesData.get(1).get(3);
		String strTags = tagsNotesData.get(1).get(4);
		String strTagsAddMessage = tagsNotesData.get(1).get(5);
		String strTagsRemoveMessage = tagsNotesData.get(1).get(6);
		
		conditionUpdateTagsNotesPage.clickOnTagsNotesTab();
		conditionUpdateTagsNotesPage.verifyConditionTagsNotesTabIsDisplayed();
		conditionUpdateTagsNotesPage.clickOnMakeUpdatesButton();
		conditionUpdateTagsNotesPage.enterTrackingID(strTrackingID);
		conditionUpdateTagsNotesPage.enterReason(strReason);
		conditionUpdateTagsNotesPage.enterNotes(strNotes);
		conditionUpdateTagsNotesPage.enterNotesData(strTagsNotes);
		conditionUpdateTagsNotesPage.removeTags(strTags, strTagsAddMessage, strTagsRemoveMessage);
		conditionUpdateTagsNotesPage.clickOnSaveButton();
	}

}
