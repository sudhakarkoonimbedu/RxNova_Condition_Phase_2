package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.CondtionsUpdateTagsNotesPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateTagsNotesPage extends BasePage{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@FindBy(linkText = CondtionsUpdateTagsNotesPage.CONDITION_TAGSNOTES_LINK)
	private BaseElement CONDITION_TAGSNOTES_LINK;
	
	@FindBy(xpath = CondtionsUpdateTagsNotesPage.CONDITION_TAGSNOTES_NOTES_TEXT)
	private BaseElement CONDITION_TAGSNOTES_NOTES_TEXT;

	@FindBy(xpath = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_MAKEUPDATES_BUTTON)
	private BaseElement UPDATE_TAGSNOTES_MAKEUPDATES_BUTTON;

	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_TRACKING_ID_EDIT)
	private BaseElement UPDATE_TAGSNOTES_TRACKING_ID_EDIT;
	
	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_REASON_EDIT)
	private BaseElement UPDATE_TAGSNOTES_REASON_EDIT;

	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_NOTES_EDIT)
	private BaseElement UPDATE_TAGSNOTES_NOTES_EDIT;

	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_EDIT)
	private BaseElement UPDATE_TAGSNOTES_EDIT;
	
	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_TAGS_EDIT)
	private BaseElement UPDATE_TAGSNOTES_TAGS_EDIT;
	
	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_TAGS_TABLE)
	private BaseElement UPDATE_TAGSNOTES_TAGS_TABLE;
	
	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_TAGS_ADD_BUTTON)
	private BaseElement UPDATE_TAGSNOTES_TAGS_ADD_BUTTON;

	@FindBy(xpath = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_TAGS_SUCCESS_MESSAGE)
	private BaseElement UPDATE_TAGSNOTES_TAGS_SUCCESS_MESSAGE;
	
	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_TAGS_REMOVESELECTED_BUTTON)
	private BaseElement UPDATE_TAGSNOTES_TAGS_REMOVESELECTED_BUTTON;
	
	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_SAVE_BUTTON)
	private BaseElement UPDATE_TAGSNOTES_SAVE_BUTTON;
	
	@FindBy(id = CondtionsUpdateTagsNotesPage.UPDATE_TAGSNOTES_CANCEL_BUTTON)
	private BaseElement UPDATE_TAGSNOTES_CANCEL_BUTTON;
	
	
	public boolean clickOnTagsNotesTab() {
		if (CONDITION_TAGSNOTES_LINK.isDisplayed()) {
			rxNovaCommonUtil.performClick(CONDITION_TAGSNOTES_LINK);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionTagsNotesTabIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(CONDITION_TAGSNOTES_NOTES_TEXT)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean clickOnMakeUpdatesButton() {
		if (UPDATE_TAGSNOTES_MAKEUPDATES_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_TAGSNOTES_MAKEUPDATES_BUTTON);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterTrackingID(String strTrackingID) {
		if (!strTrackingID.isEmpty() && UPDATE_TAGSNOTES_TRACKING_ID_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_TAGSNOTES_TRACKING_ID_EDIT,strTrackingID);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterReason(String strReason) {
		if (!strReason.isEmpty() && UPDATE_TAGSNOTES_REASON_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_TAGSNOTES_REASON_EDIT,strReason);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterNotes(String strNotes) {
		if (!strNotes.isEmpty() && UPDATE_TAGSNOTES_NOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_TAGSNOTES_NOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterNotesData(String strNotes) {
		if (!strNotes.isEmpty() && UPDATE_TAGSNOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_TAGSNOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}	
	
	public boolean removeTags(String strTags,String strTagsAddMessage,String strTagsRemoveMessage) throws Throwable {
		if (!strTags.isEmpty() && UPDATE_TAGSNOTES_TAGS_TABLE.isDisplayed()) {
			return rxNovaCommonUtil.addOrRemoveTags(UPDATE_TAGSNOTES_TAGS_EDIT,UPDATE_TAGSNOTES_TAGS_TABLE,UPDATE_TAGSNOTES_TAGS_SUCCESS_MESSAGE,strTags,strTagsAddMessage,strTagsRemoveMessage);
		} else {
			return false;
		}
	}
	
	public boolean clickOnSaveButton() throws Throwable {
		if (UPDATE_TAGSNOTES_SAVE_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_TAGSNOTES_SAVE_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
}
