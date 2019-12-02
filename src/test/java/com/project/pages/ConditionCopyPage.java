package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsCopyPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionCopyPage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(xpath = ConditionsCopyPage.CONDITION_COPY_WINDOW)
	private BaseElement CONDITION_COPY_WINDOW;
	
	@FindBy(id = ConditionsCopyPage.COPY_CONDITION_ID_EDIT)
	private BaseElement COPY_CONDITION_ID_EDIT;

	@FindBy(id = ConditionsCopyPage.COPY_NAME_EDIT)
	private BaseElement COPY_NAME_EDIT;

	@FindBy(id = ConditionsCopyPage.COPY_STATUS_LIST)
	private BaseElement COPY_STATUS_LIST;
	
	@FindBy(id = ConditionsCopyPage.COPY_TRACKING_ID_EDIT)
	private BaseElement COPY_TRACKING_ID_EDIT;
	
	@FindBy(id = ConditionsCopyPage.COPY_REASON_EDIT)
	private BaseElement COPY_REASON_EDIT;
	
	@FindBy(id = ConditionsCopyPage.COPY_NOTES_EDIT)
	private BaseElement COPY_NOTES_EDIT;
	
	@FindBy(id = ConditionsCopyPage.COPY_BUTTON)
	private BaseElement COPY_BUTTON;

	@FindBy(id = ConditionsCopyPage.COPY_CANCEL_BUTTON)
	private BaseElement COPY_CANCEL_BUTTON;

	@FindBy(xpath = ConditionsCopyPage.COPY_SUCCESS_MESSAGE)
	private BaseElement COPY_SUCCESS_MESSAGE;

	public boolean verifyCopyConditionWindowIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(CONDITION_COPY_WINDOW)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean enterConditionID(String strConditionID) throws Throwable{
		if (!strConditionID.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(COPY_CONDITION_ID_EDIT)) {
			rxNovaCommonUtil.sendKeysToObject(COPY_CONDITION_ID_EDIT,strConditionID);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterConditionName(String strName) {
		if (!strName.isEmpty() && COPY_NAME_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(COPY_NAME_EDIT,strName);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectStatus(String strStatus) throws Throwable {
		if (!strStatus.isEmpty() && COPY_STATUS_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(COPY_STATUS_LIST,strStatus);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterTrackingID(String strTrackingID) throws Throwable{
		if (!strTrackingID.isEmpty() && COPY_TRACKING_ID_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(COPY_TRACKING_ID_EDIT,strTrackingID);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterReason(String strReason) {
		if (!strReason.isEmpty() && COPY_REASON_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(COPY_REASON_EDIT,strReason);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterNotes(String strNotes) {
		if (!strNotes.isEmpty() && COPY_NOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(COPY_NOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOnCopyButton() throws Throwable{
		if (COPY_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(COPY_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionCopySuccessMessage(String conditionCopyMessage) {
		boolean match = rxNovaCommonUtil.objectContainsExpectedText(COPY_SUCCESS_MESSAGE,conditionCopyMessage);
		return(match);
	}
}
