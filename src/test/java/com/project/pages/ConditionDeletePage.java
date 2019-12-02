package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsDeletePage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionDeletePage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(xpath = ConditionsDeletePage.CONDITION_DELETE_WINDOW)
	private BaseElement CONDITION_DELETE_WINDOW;
	
	@FindBy(id = ConditionsDeletePage.DELETE_TRACKING_ID_EDIT)
	private BaseElement DELETE_TRACKING_ID_EDIT;

	@FindBy(id = ConditionsDeletePage.DELETE_REASON_EDIT)
	private BaseElement DELETE_REASON_EDIT;

	@FindBy(id = ConditionsDeletePage.DELETE_NOTES_EDIT)
	private BaseElement DELETE_NOTES_EDIT;
	
	@FindBy(xpath = ConditionsDeletePage.DELETE_BUTTON)
	private BaseElement DELETE_BUTTON;

	@FindBy(id = ConditionsDeletePage.DELETE_CANCEL_BUTTON)
	private BaseElement DELETE_CANCEL_BUTTON;

	@FindBy(xpath = ConditionsDeletePage.DELETE_SUCCESS_MESSAGE)
	private BaseElement DELETE_SUCCESS_MESSAGE;

	public boolean verifyDeleteConditionWindowIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(CONDITION_DELETE_WINDOW)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean enterTrackingID(String strTrackingID) throws Throwable{
		if (!strTrackingID.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(DELETE_TRACKING_ID_EDIT)) {
			rxNovaCommonUtil.sendKeysToObject(DELETE_TRACKING_ID_EDIT,strTrackingID);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterReason(String strReason) {
		if (!strReason.isEmpty() && DELETE_REASON_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(DELETE_REASON_EDIT,strReason);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterNotes(String strNotes) {
		if (!strNotes.isEmpty() && DELETE_NOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(DELETE_NOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOnDeleteButton() throws Throwable{
		if (DELETE_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(DELETE_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionDeleteSuccessMessage(String conditionDeleteMessage) {
		boolean match = rxNovaCommonUtil.objectContainsExpectedText(DELETE_SUCCESS_MESSAGE,conditionDeleteMessage);
		return(match);
	}
}
