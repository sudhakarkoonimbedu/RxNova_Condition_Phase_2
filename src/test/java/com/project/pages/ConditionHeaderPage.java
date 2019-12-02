package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsHeaderPage;
import com.project.locators.Conditions.CondtionsHomePage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionHeaderPage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(xpath = CondtionsHomePage.CONDITION_NEW_BUTTON)
	private BaseElement CONDITION_NEW_BUTTON;

	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_TRACKING_ID_EDIT)
	private BaseElement ADD_HEADER_TRACKING_ID_EDIT;

	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_REASON_EDIT)
	private BaseElement ADD_HEADER_REASON_EDIT;
	
	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_NOTES_EDIT)
	private BaseElement ADD_HEADER_NOTES_EDIT;

	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_MASTER_CUISTOMER_SET_LIST)
	private BaseElement ADD_HEADER_MASTER_CUISTOMER_SET_LIST;

	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_CONDITION_ID_EDIT)
	private BaseElement ADD_HEADER_CONDITION_ID_EDIT;

	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_NAME_EDIT)
	private BaseElement ADD_HEADER_NAME_EDIT;
	
	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_STATUS_LIST)
	private BaseElement ADD_HEADER_STATUS_LIST;
	
	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_TYPE_LIST)
	private BaseElement ADD_HEADER_TYPE_LIST;

	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_NEXT_BUTTON)
	private BaseElement ADD_HEADER_NEXT_BUTTON;
	
	@FindBy(id = ConditionsHeaderPage.ADD_HEADER_CANCEL_BUTTON)
	private BaseElement ADD_HEADER_CANCEL_BUTTON;
	
	

	public boolean clickOnNewButton() {
		if (CONDITION_NEW_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(CONDITION_NEW_BUTTON);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionHeaderTabIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(ADD_HEADER_TRACKING_ID_EDIT)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean enterTrackingID(String strTrackingID) {
		if (!strTrackingID.isEmpty() && ADD_HEADER_TRACKING_ID_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(ADD_HEADER_TRACKING_ID_EDIT,strTrackingID);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterReason(String strReason) {
		if (!strReason.isEmpty() && ADD_HEADER_REASON_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(ADD_HEADER_REASON_EDIT,strReason);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterNotes(String strNotes) {
		if (!strNotes.isEmpty() && ADD_HEADER_NOTES_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(ADD_HEADER_NOTES_EDIT,strNotes);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectMasterCustomerSet(String strMCS) throws Throwable {
		if (!strMCS.isEmpty() && ADD_HEADER_MASTER_CUISTOMER_SET_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(ADD_HEADER_MASTER_CUISTOMER_SET_LIST,strMCS);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterConditionID(String strConditionID) {
		if (!strConditionID.isEmpty() && ADD_HEADER_CONDITION_ID_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(ADD_HEADER_CONDITION_ID_EDIT,strConditionID);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterConditionName(String strName) {
		if (!strName.isEmpty() && ADD_HEADER_NAME_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(ADD_HEADER_NAME_EDIT,strName);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectStatus(String strStatus) throws Throwable{
		if (!strStatus.isEmpty() && ADD_HEADER_STATUS_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(ADD_HEADER_STATUS_LIST,strStatus);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectType(String strType) throws Throwable {
		if (!strType.isEmpty() && ADD_HEADER_TYPE_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(ADD_HEADER_TYPE_LIST,strType);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOnNextButton() throws Throwable{
		if (ADD_HEADER_NEXT_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(ADD_HEADER_NEXT_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
}
