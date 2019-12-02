package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsUpdateHeaderPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateHeaderPage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(linkText = ConditionsUpdateHeaderPage.CONDITION_HEADER_LINK)
	private BaseElement CONDITION_HEADER_LINK;
	
	@FindBy(xpath = ConditionsUpdateHeaderPage.UPDATE_HEADER_MAKEUPDATES_BUTTON)
	private BaseElement UPDATE_HEADER_MAKEUPDATES_BUTTON;

	@FindBy(xpath = ConditionsUpdateHeaderPage.UPDATE_HEADER_REPORT_BUTTON)
	private BaseElement UPDATE_HEADER_REPORT_BUTTON;

	@FindBy(xpath = ConditionsUpdateHeaderPage.UPDATE_HEADER_COPY_BUTTON)
	private BaseElement UPDATE_HEADER_COPY_BUTTON;
	
	@FindBy(xpath = ConditionsUpdateHeaderPage.UPDATE_HEADER_DELETE_BUTTON)
	private BaseElement UPDATE_HEADER_DELETE_BUTTON;

	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_HEADER_TRACKING_ID_EDIT)
	private BaseElement UPDATE_HEADER_TRACKING_ID_EDIT;

	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_HEADER_REASON_EDIT)
	private BaseElement UPDATE_HEADER_REASON_EDIT;

	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_HEADER_NOTES_EDIT)
	private BaseElement UPDATE_HEADER_NOTES_EDIT;
	
	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_HEADER_NAME_EDIT)
	private BaseElement UPDATE_HEADER_NAME_EDIT;
	
	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_HEADER_STATUS_LIST)
	private BaseElement UPDATE_HEADER_STATUS_LIST;

	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_HEADER_SAVE_BUTTON)
	private BaseElement UPDATE_HEADER_SAVE_BUTTON;
	
	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_HEADER_CANCEL_BUTTON)
	private BaseElement UPDATE_HEADER_CANCEL_BUTTON;
	
	@FindBy(xpath = ConditionsUpdateHeaderPage.UPDATE_SUCCESS_MESSAGE)
	private BaseElement UPDATE_SUCCESS_MESSAGE;

	public boolean verifyConditionHeaderTabIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(UPDATE_HEADER_MAKEUPDATES_BUTTON)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean clickOnMakeUpdatesButton() {
		if (UPDATE_HEADER_MAKEUPDATES_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_HEADER_MAKEUPDATES_BUTTON);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterTrackingID(String strTrackingID) {
		if (!strTrackingID.isEmpty() && UPDATE_HEADER_TRACKING_ID_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_HEADER_TRACKING_ID_EDIT,strTrackingID);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterReason(String strReason) {
		if (!strReason.isEmpty() && UPDATE_HEADER_REASON_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_HEADER_REASON_EDIT,strReason);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterNotes(String strNotes) {
		if (!strNotes.isEmpty() && UPDATE_HEADER_NOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_HEADER_NOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterConditionName(String strName) {
		if (!strName.isEmpty() && UPDATE_HEADER_NAME_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_HEADER_NAME_EDIT,strName);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectStatus(String strStatus) throws Throwable {
		if (!strStatus.isEmpty() && UPDATE_HEADER_STATUS_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(UPDATE_HEADER_STATUS_LIST,strStatus);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOnSaveButton() throws Throwable {
		if (UPDATE_HEADER_SAVE_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_HEADER_SAVE_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOnCopyButton() throws Throwable{
		if (UPDATE_HEADER_COPY_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_HEADER_COPY_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOnDeleteButton() throws Throwable{
		if (UPDATE_HEADER_DELETE_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_HEADER_DELETE_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionUpdateSuccessMessage(String conditionUpdateMessage) {
		boolean match = false;
		if(rxNovaCommonUtil.objectIsDisplayed(UPDATE_SUCCESS_MESSAGE)) {
			match = rxNovaCommonUtil.objectContainsExpectedText(UPDATE_SUCCESS_MESSAGE,conditionUpdateMessage);
		}
		return(match);
	}
	
	public boolean verifyConditionUpdateMessageIsDisplayed() {
		return rxNovaCommonUtil.objectIsDisplayed(UPDATE_SUCCESS_MESSAGE);
	}
}
