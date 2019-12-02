package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.CondtionsSingleDetailPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionDetailsSinglePage extends BasePage {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_SOURCE_LIST)
	private BaseElement ADD_DETAILS_SOURCE_LIST;

	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_FIELD_NAME_EDIT)
	private BaseElement ADD_DETAILS_FIELD_NAME_EDIT;
	
	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_FIELD_OPERATOR_LIST)
	private BaseElement ADD_DETAILS_FIELD_OPERATOR_LIST;

	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_FIELD_VALUE_EDIT)
	private BaseElement ADD_DETAILS_FIELD_VALUE_EDIT;

	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_BENEFIT_CUSTOMER_SET_LIST)
	private BaseElement ADD_DETAILS_BENEFIT_CUSTOMER_SET_LIST;

	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_OPERATOR_LIST)
	private BaseElement ADD_DETAILS_OPERATOR_LIST;
	
	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_VALUE_EDIT)
	private BaseElement ADD_DETAILS_VALUE_EDIT;
	
	@FindBy(xpath = CondtionsSingleDetailPage.ADD_DETAILS_TOP_PREVIOUS_BUTTON)
	private BaseElement ADD_DETAILS_TOP_PREVIOUS_BUTTON;

	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_TOP_NEXT_BUTTON)
	private BaseElement ADD_DETAILS_TOP_NEXT_BUTTON;
	
	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_TOP_CANCEL_BUTTON)
	private BaseElement ADD_DETAILS_TOP_CANCEL_BUTTON;
	
	@FindBy(xpath = CondtionsSingleDetailPage.ADD_DETAILS_BOTTOM_PREVIOUS_BUTTON)
	private BaseElement ADD_DETAILS_BOTTOM_PREVIOUS_BUTTON;
	
	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_BOTTOM_NEXT_BUTTON)
	private BaseElement ADD_DETAILS_BOTTOM_NEXT_BUTTON;
	
	@FindBy(id = CondtionsSingleDetailPage.ADD_DETAILS_BOTTOM_CANCEL_BUTTON)
	private BaseElement ADD_DETAILS_BOTTOM_CANCEL_BUTTON;
	
	
	public boolean verifyConditionDetailsTabIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(ADD_DETAILS_SOURCE_LIST)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean selectSource(String strSource) throws Throwable{
		if (!strSource.isEmpty() && ADD_DETAILS_SOURCE_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(ADD_DETAILS_SOURCE_LIST,strSource);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterFieldName(String strFieldName) throws Throwable {
		Boolean enterFieldName = false;
		if (!strFieldName.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(ADD_DETAILS_FIELD_NAME_EDIT)) {
			enterFieldName = rxNovaCommonUtil.selectValueFromFieldIntellisence(ADD_DETAILS_FIELD_NAME_EDIT,strFieldName);
			enterFieldName = true; 
		} else {
			enterFieldName = false;
		}
		return enterFieldName;
	}
	
	public boolean selectFieldOperator(String strFieldOperator) throws Throwable {
		if (!strFieldOperator.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(ADD_DETAILS_FIELD_OPERATOR_LIST)) {
			rxNovaCommonUtil.condition_SelectFromDropdownUsingText(ADD_DETAILS_FIELD_OPERATOR_LIST,strFieldOperator);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean enterFieldValue(String strFieldValue) throws Throwable {
		if (!strFieldValue.isEmpty() && ADD_DETAILS_FIELD_VALUE_EDIT.isDisplayed()) {
			rxNovaCommonUtil.sendKeysToObject(ADD_DETAILS_FIELD_VALUE_EDIT,strFieldValue);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectBCS(String strBCS) throws Throwable {
		if (!strBCS.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(ADD_DETAILS_BENEFIT_CUSTOMER_SET_LIST)) {
			rxNovaCommonUtil.selectFromDropdownUsingText(ADD_DETAILS_BENEFIT_CUSTOMER_SET_LIST,strBCS);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean selectOperator(String strOperator) throws Throwable {
		if (!strOperator.isEmpty() && rxNovaCommonUtil.objectIsDisplayed(ADD_DETAILS_OPERATOR_LIST)) {
			rxNovaCommonUtil.selectFromDropdownUsingText(ADD_DETAILS_OPERATOR_LIST,strOperator);
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean enterValue(String strValue) throws Throwable {
		if (!strValue.isEmpty() && ADD_DETAILS_VALUE_EDIT.isDisplayed()) {
			return rxNovaCommonUtil.selectValueFromFieldIntellisence(ADD_DETAILS_VALUE_EDIT,strValue);
		} else {
			return false;
		}
	}
	
	public boolean clickOnTopNextButton() throws Throwable {
		if (ADD_DETAILS_TOP_NEXT_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(ADD_DETAILS_TOP_NEXT_BUTTON);
			rxNovaCommonUtil.CheckBusyState();
			return true;
		} else {
			return false;
		}
	}
}
