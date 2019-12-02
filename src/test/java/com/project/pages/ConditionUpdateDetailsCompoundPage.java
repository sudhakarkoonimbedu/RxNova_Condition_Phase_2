package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsUpdateHeaderPage;
import com.project.locators.Conditions.CondtionsUpdateCompoundDetailPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateDetailsCompoundPage extends BasePage {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@FindBy(linkText = CondtionsUpdateCompoundDetailPage.CONDITION_DETAILS_LINK)
	private BaseElement CONDITION_DETAILS_LINK;

	@FindBy(xpath = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_MAKEUPDATES_BUTTON)
	private BaseElement UPDATE_DETAILS_MAKEUPDATES_BUTTON;

	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_TRACKING_ID_EDIT)
	private BaseElement UPDATE_DETAILS_TRACKING_ID_EDIT;
	
	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_REASON_EDIT)
	private BaseElement UPDATE_DETAILS_REASON_EDIT;

	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_NOTES_EDIT)
	private BaseElement UPDATE_DETAILS_NOTES_EDIT;

	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_COMPOUND_OPERATOR_LIST)
	private BaseElement UPDATE_DETAILS_COMPOUND_OPERATOR_LIST;

	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_CONDITION_ID_EDIT)
	private BaseElement UPDATE_DETAILS_CONDITION_ID_EDIT;
	
	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_COMPOUND_TABLE)
	private BaseElement UPDATE_DETAILS_COMPOUND_TABLE;
	
	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_TOP_SAVE_BUTTON)
	private BaseElement UPDATE_DETAILS_TOP_SAVE_BUTTON;
	
	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_TOP_CANCEL_BUTTON)
	private BaseElement UPDATE_DETAILS_TOP_CANCEL_BUTTON;
	
	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_BOTTOM_SAVE_BUTTON)
	private BaseElement UPDATE_DETAILS_BOTTOM_SAVE_BUTTON;
	
	@FindBy(id = CondtionsUpdateCompoundDetailPage.UPDATE_DETAILS_BOTTOM_CANCEL_BUTTON)
	private BaseElement UPDATE_DETAILS_BOTTOM_CANCEL_BUTTON;
	
	@FindBy(id = ConditionsUpdateHeaderPage.UPDATE_SUCCESS_MESSAGE)
	private BaseElement UPDATE_SUCCESS_MESSAGE;
	
	
	public boolean clickOnDetailsTab() {
		if (CONDITION_DETAILS_LINK.isDisplayed() && CONDITION_DETAILS_LINK.isEnabled()) {
			rxNovaCommonUtil.performClick(CONDITION_DETAILS_LINK);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionDetailsTabIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(UPDATE_DETAILS_MAKEUPDATES_BUTTON)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean clickOnMakeUpdatesButton() {
		if (UPDATE_DETAILS_MAKEUPDATES_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_DETAILS_MAKEUPDATES_BUTTON);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterTrackingID(String strTrackingID) {
		if (!strTrackingID.isEmpty() && UPDATE_DETAILS_TRACKING_ID_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_DETAILS_TRACKING_ID_EDIT,strTrackingID);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterReason(String strReason) {
		if (!strReason.isEmpty() && UPDATE_DETAILS_REASON_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_DETAILS_REASON_EDIT,strReason);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterNotes(String strNotes) {
		if (!strNotes.isEmpty() && UPDATE_DETAILS_NOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_DETAILS_NOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}	

	public boolean selectCompoundOperator(String strCompoundOperator) throws Throwable{
		if (!strCompoundOperator.isEmpty() && UPDATE_DETAILS_COMPOUND_OPERATOR_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(UPDATE_DETAILS_COMPOUND_OPERATOR_LIST,strCompoundOperator);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addOrRemoveCondition(String strConditionData) throws Throwable {
		if (!strConditionData.isEmpty() && UPDATE_DETAILS_CONDITION_ID_EDIT.isDisplayed()) {
			return rxNovaCommonUtil.addOrRemoveCondition(UPDATE_DETAILS_CONDITION_ID_EDIT,UPDATE_DETAILS_COMPOUND_TABLE,strConditionData);
		} else {
			return false;
		}
	}		
	
	public boolean clickOnTopSaveButton() throws Throwable {
		if (UPDATE_DETAILS_TOP_SAVE_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_DETAILS_TOP_SAVE_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
}
