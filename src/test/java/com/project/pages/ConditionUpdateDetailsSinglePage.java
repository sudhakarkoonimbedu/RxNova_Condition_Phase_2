package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsUpdateHeaderPage;
import com.project.locators.Conditions.CondtionsUpdateSingleDetailPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionUpdateDetailsSinglePage extends BasePage {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@FindBy(linkText = CondtionsUpdateSingleDetailPage.CONDITION_DETAILS_LINK)
	private BaseElement CONDITION_DETAILS_LINK;

	@FindBy(xpath = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_MAKEUPDATES_BUTTON)
	private BaseElement UPDATE_DETAILS_MAKEUPDATES_BUTTON;

	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_TRACKING_ID_EDIT)
	private BaseElement UPDATE_DETAILS_TRACKING_ID_EDIT;
	
	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_REASON_EDIT)
	private BaseElement UPDATE_DETAILS_REASON_EDIT;

	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_NOTES_EDIT)
	private BaseElement UPDATE_DETAILS_NOTES_EDIT;

	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_FIELD_NAME_EDIT)
	private BaseElement UPDATE_DETAILS_FIELD_NAME_EDIT;

	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_FIELD_OPERATOR_LIST)
	private BaseElement UPDATE_DETAILS_FIELD_OPERATOR_LIST;
	
	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_FIELD_VALUE_EDIT)
	private BaseElement UPDATE_DETAILS_FIELD_VALUE_EDIT;
	
	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_OPERATOR_LIST)
	private BaseElement UPDATE_DETAILS_OPERATOR_LIST;

	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_VALUE_EDIT)
	private BaseElement UPDATE_DETAILS_VALUE_EDIT;
	
	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_TOP_SAVE_BUTTON)
	private BaseElement UPDATE_DETAILS_TOP_SAVE_BUTTON;
	
	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_TOP_CANCEL_BUTTON)
	private BaseElement UPDATE_DETAILS_TOP_CANCEL_BUTTON;
	
	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_BOTTOM_SAVE_BUTTON)
	private BaseElement UPDATE_DETAILS_BOTTOM_SAVE_BUTTON;
	
	@FindBy(id = CondtionsUpdateSingleDetailPage.UPDATE_DETAILS_BOTTOM_CANCEL_BUTTON)
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

	public boolean enterFieldName(String strFieldName) throws Throwable {
		if (!strFieldName.isEmpty() && UPDATE_DETAILS_FIELD_NAME_EDIT.isDisplayed()) {
			return rxNovaCommonUtil.selectValueFromFieldIntellisence(UPDATE_DETAILS_FIELD_NAME_EDIT,strFieldName);
		} else {
			return false;
		}
	}
	
	public boolean selectFieldOperator(String strFieldOperator) throws Throwable {
		if (!strFieldOperator.isEmpty() && UPDATE_DETAILS_FIELD_OPERATOR_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(UPDATE_DETAILS_FIELD_OPERATOR_LIST,strFieldOperator);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterFieldValue(String strFieldValue) {
		if (!strFieldValue.isEmpty() && UPDATE_DETAILS_FIELD_VALUE_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(UPDATE_DETAILS_FIELD_VALUE_EDIT,strFieldValue);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectOperator(String strOperator) throws Throwable {
		if (!strOperator.isEmpty() && UPDATE_DETAILS_OPERATOR_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(UPDATE_DETAILS_OPERATOR_LIST,strOperator);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterValue(String strValue) throws Throwable {
		if (!strValue.isEmpty() && UPDATE_DETAILS_VALUE_EDIT.isDisplayed()) {
			return rxNovaCommonUtil.selectValueFromFieldIntellisence(UPDATE_DETAILS_VALUE_EDIT,strValue);
		} else {
			return false;
		}
	}
	
	public boolean clickOnTopSaveButton() throws Throwable {
		if (UPDATE_DETAILS_TOP_SAVE_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(UPDATE_DETAILS_TOP_SAVE_BUTTON);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
}
