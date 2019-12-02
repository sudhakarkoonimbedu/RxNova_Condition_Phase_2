package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.CondtionsHomePage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionHomePage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(xpath = CondtionsHomePage.CONDITION_HOME)
	private BaseElement CONDITION_HOME_TEXT;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_MASTER_CUISTOMER_SET_LIST)
	private BaseElement CONDITION_HOME_MASTER_CUISTOMER_SET_LIST;
	
	@FindBy(xpath = CondtionsHomePage.CONDITION_HOME_TYPE_LIST)
	private BaseElement CONDITION_HOME_TYPE_LIST;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_CONDITION_ID_EDIT)
	private BaseElement CONDITION_HOME_CONDITION_ID_EDIT;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_NAME_EDIT)
	private BaseElement CONDITION_HOME_NAME_EDIT;
	
	@FindBy(xpath = CondtionsHomePage.CONDITION_HOME_STATUS_LIST)
	private BaseElement CONDITION_HOME_STATUS_LIST;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_SOURCE_LIST)
	private BaseElement CONDITION_HOME_SOURCE_LIST;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_FIELD_EDIT)
	private BaseElement CONDITION_HOME_FIELD_EDIT;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_BENEFIT_CUSTOMER_SET_LIST)
	private BaseElement CONDITION_HOME_BENEFIT_CUSTOMER_SET_LIST;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_LIST_EDIT)
	private BaseElement CONDITION_HOME_LIST_EDIT;
	
	@FindBy(linkText = CondtionsHomePage.CONDITION_HOME_ADVANCEDSEARCH_LINK)
	private BaseElement CONDITION_HOME_ADVANCEDSEARCH_LINK;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_SUBSTATUS_LIST)
	private BaseElement CONDITION_HOME_SUBSTATUS_LIST;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_TAGS_EDIT)
	private BaseElement CONDITION_HOME_TAGS_EDIT;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_TAGS_TABLE)
	private BaseElement CONDITION_HOME_TAGS_TABLE;
	
	@FindBy(xpath = CondtionsHomePage.CONDITION_HOME_TAGS_SUCCESS_MESSAGE)
	private BaseElement CONDITION_HOME_TAGS_SUCCESS_MESSAGE;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_SEARCH_BUTTON)
	private BaseElement CONDITION_HOME_SEARCH_BUTTON;
	
	@FindBy(id = CondtionsHomePage.CONDITION_HOME_RESET_BUTTON)
	private BaseElement CONDITION_HOME_RESET_BUTTON;
	
	@FindBy(xpath = CondtionsHomePage.CONDITION_HOME_ERROR_MESSAGE)
	private BaseElement CONDITION_HOME_ERROR_MESSAGE;
	
	
	@FindBy(xpath = CondtionsHomePage.CONDITION_HOME_RESULTS_TABLE)
	private BaseElement CONDITION_HOME_RESULTS_TABLE;
	

	public boolean verifyConditionHomeTextIsDisplayed() {
		//boolean isDisplayed = CONDITION_HOME_TEXT.isDisplayed();
		return (rxNovaCommonUtil.objectIsDisplayed(CONDITION_HOME_TEXT));
	}
	
	public boolean selectMasterCustomerSet(String strMCS) throws Throwable {
		if (!strMCS.isEmpty() && CONDITION_HOME_MASTER_CUISTOMER_SET_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(CONDITION_HOME_MASTER_CUISTOMER_SET_LIST,strMCS);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectType(String strType) throws Throwable {
		if (!strType.isEmpty() && CONDITION_HOME_TYPE_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(CONDITION_HOME_TYPE_LIST,strType);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterConditionID(String strConditionID) {
		if (!strConditionID.isEmpty() && CONDITION_HOME_CONDITION_ID_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(CONDITION_HOME_CONDITION_ID_EDIT,strConditionID);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterConditionName(String strName) {
		if (!strName.isEmpty() && CONDITION_HOME_NAME_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(CONDITION_HOME_NAME_EDIT,strName);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectStatus(String strStatus) throws Throwable {
		if (!strStatus.isEmpty() && CONDITION_HOME_STATUS_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(CONDITION_HOME_STATUS_LIST,strStatus);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectEmptyStatus(String strEmptyStatus) throws Throwable {
		if (CONDITION_HOME_STATUS_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(CONDITION_HOME_STATUS_LIST,strEmptyStatus);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectSource(String strSource) throws Throwable {
		if (!strSource.isEmpty() && CONDITION_HOME_SOURCE_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(CONDITION_HOME_SOURCE_LIST,strSource);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterField(String strField) throws Throwable {
		if (!strField.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(CONDITION_HOME_FIELD_EDIT)) {
			rxNovaCommonUtil.selectValueFromFieldIntellisence(CONDITION_HOME_FIELD_EDIT,strField);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectBCS(String strBCS) throws Throwable {
		if (!strBCS.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(CONDITION_HOME_BENEFIT_CUSTOMER_SET_LIST)) {
			rxNovaCommonUtil.selectFromDropdownUsingText(CONDITION_HOME_BENEFIT_CUSTOMER_SET_LIST,strBCS);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterList(String strList) throws Throwable {
		if (!strList.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(CONDITION_HOME_LIST_EDIT)) {
			return rxNovaCommonUtil.selectValueFromFieldIntellisence(CONDITION_HOME_LIST_EDIT,strList);
		} else {
			return false;
		}
	}
	
	public boolean selectSubStatus(String strSubStatus) throws Throwable {
		if (!strSubStatus.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(CONDITION_HOME_SUBSTATUS_LIST)) {
			rxNovaCommonUtil.selectFromDropdownUsingText(CONDITION_HOME_SUBSTATUS_LIST,strSubStatus);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterTags(String strTags,String strTagsAddMessage,String strTagsRemoveMessage) throws Throwable {
		if (!strTags.isEmpty() && CONDITION_HOME_TAGS_EDIT.isDisplayed()) {
			return rxNovaCommonUtil.addOrRemoveTags(CONDITION_HOME_TAGS_EDIT,CONDITION_HOME_TAGS_TABLE,CONDITION_HOME_TAGS_SUCCESS_MESSAGE,strTags,strTagsAddMessage,strTagsRemoveMessage);
		} else {
			return false;
		}
	}
	
	public boolean clickOnSearchButton() throws Throwable {
		if (CONDITION_HOME_SEARCH_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(CONDITION_HOME_SEARCH_BUTTON);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean clickOnAdvancedSearchLink() throws Throwable {
		if (CONDITION_HOME_ADVANCEDSEARCH_LINK.isClickable()) {
			rxNovaCommonUtil.performClick(CONDITION_HOME_ADVANCEDSEARCH_LINK);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean operationSearch(String strOperation,String strConditionID) throws Throwable {
			return rxNovaCommonUtil.operationSearch(CONDITION_HOME_RESULTS_TABLE,strOperation,strConditionID);
	}
	
	public boolean verifyErrorMessage() {
		return rxNovaCommonUtil.objectIsDisplayed(CONDITION_HOME_ERROR_MESSAGE);
	}
}
