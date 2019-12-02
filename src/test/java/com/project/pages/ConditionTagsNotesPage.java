package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.CondtionsTagsNotesPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionTagsNotesPage extends BasePage{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@FindBy(id = CondtionsTagsNotesPage.ADD_TAGSNOTES_NOTES_EDIT)
	private BaseElement ADD_TAGSNOTES_NOTES_EDIT;

	@FindBy(id = CondtionsTagsNotesPage.ADD_TAGSNOTES_TAGS_EDIT)
	private BaseElement ADD_TAGSNOTES_TAGS_EDIT;
	
	@FindBy(id = CondtionsTagsNotesPage.ADD_TAGSNOTES_TAGS_TABLE)
	private BaseElement ADD_TAGSNOTES_TAGS_TABLE;	
	
	@FindBy(id = CondtionsTagsNotesPage.ADD_TAGSNOTES_TAGS_ADD_BUTTON)
	private BaseElement ADD_TAGSNOTES_TAGS_ADD_BUTTON;

	@FindBy(xpath = CondtionsTagsNotesPage.ADD_TAGSNOTES_TAGS_SUCCESS_MESSAGE)
	private BaseElement ADD_TAGSNOTES_TAGS_SUCCESS_MESSAGE;

	@FindBy(id = CondtionsTagsNotesPage.ADD_TAGSNOTES_TAGS_REMOVESELECTED_BUTTON)
	private BaseElement ADD_TAGSNOTES_TAGS_REMOVESELECTED_BUTTON;

	@FindBy(xpath = CondtionsTagsNotesPage.ADD_TAGSNOTES_PREVIOUS_BUTTON)
	private BaseElement ADD_TAGSNOTES_PREVIOUS_BUTTON;
	
	@FindBy(xpath = CondtionsTagsNotesPage.ADD_TAGSNOTES_SAVE_BUTTON)
	private BaseElement ADD_TAGSNOTES_SAVE_BUTTON;

	@FindBy(id = CondtionsTagsNotesPage.ADD_TAGSNOTES_CANCEL_BUTTON)
	private BaseElement ADD_TAGSNOTES_CANCEL_BUTTON;
	
	@FindBy(xpath = CondtionsTagsNotesPage.ADD_SUCCESS_MESSAGE)
	private BaseElement ADD_SUCCESS_MESSAGE;
	
	
	public boolean verifyConditionTagsNotesTabIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(ADD_TAGSNOTES_NOTES_EDIT)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean enterNotes(String strNotes) {
		if (!strNotes.isEmpty() && ADD_TAGSNOTES_NOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(ADD_TAGSNOTES_NOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}	
	
	public boolean enterTagsAndClickonAddButton(String strTags,String strTagsAddMessage,String strTagsRemoveMessage) throws Throwable {
		if (!strTags.isEmpty() && ADD_TAGSNOTES_TAGS_EDIT.isDisplayed()) {
			return rxNovaCommonUtil.addOrRemoveTags(ADD_TAGSNOTES_TAGS_EDIT,ADD_TAGSNOTES_TAGS_TABLE,ADD_TAGSNOTES_TAGS_SUCCESS_MESSAGE,strTags,strTagsAddMessage,strTagsRemoveMessage);
		} else {
			return false;
		}
	}

	
	public boolean clickOnSaveButton() throws Throwable {
		if (ADD_TAGSNOTES_SAVE_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(ADD_TAGSNOTES_SAVE_BUTTON);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionAddSuccessMessage(String conditionAddMessage) {
		boolean match = rxNovaCommonUtil.objectContainsExpectedText(ADD_SUCCESS_MESSAGE,conditionAddMessage);
		return(match);
	}
}
