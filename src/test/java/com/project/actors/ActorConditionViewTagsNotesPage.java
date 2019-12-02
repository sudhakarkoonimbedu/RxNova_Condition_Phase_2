package com.project.actors;

import java.util.List;
import com.project.pages.ConditionUpdateTagsNotesPage;
import com.project.pages.ConditionViewTagsNotesPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionViewTagsNotesPage {

	@Steps
	ConditionUpdateTagsNotesPage conditionUpdateTagsNotesPage;
	ConditionViewTagsNotesPage conditionViewTagsNotesPage;
	
	@Step
	public void verifyNotesAndTags(DataTable conditionTagsNotesData) throws Throwable {
		
		List<List<String>> tagsNotesData = conditionTagsNotesData.raw();
		
		String strNotes = tagsNotesData.get(1).get(0);
		String strTags = tagsNotesData.get(1).get(1);
		
		conditionUpdateTagsNotesPage.clickOnTagsNotesTab();
		conditionUpdateTagsNotesPage.verifyConditionTagsNotesTabIsDisplayed();
		conditionViewTagsNotesPage.verifyNotes(strNotes);
		conditionViewTagsNotesPage.verifyTags(strTags);
	}
}
