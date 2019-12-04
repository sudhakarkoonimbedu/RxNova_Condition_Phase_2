package com.project.pages;

import com.project.common.util.ConditionsCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.CondtionsCompoundDetailPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionDetailsCompoundPage extends BasePage {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ConditionsCommonUtil conditionsCommonUtil;
	
	
	@FindBy(id = CondtionsCompoundDetailPage.ADD_DETAILS_COMPOUND_OPERATOR_LIST)
	private BaseElement ADD_DETAILS_COMPOUND_OPERATOR_LIST;

	@FindBy(id = CondtionsCompoundDetailPage.ADD_DETAILS_CONDITION_ID_EDIT)
	private BaseElement ADD_DETAILS_CONDITION_ID_EDIT;
	
	@FindBy(id = CondtionsCompoundDetailPage.ADD_DETAILS_COMPOUND_TABLE)
	private BaseElement ADD_DETAILS_COMPOUND_TABLE;

	@FindBy(xpath = CondtionsCompoundDetailPage.ADD_DETAILS_TOP_PREVIOUS_BUTTON)
	private BaseElement ADD_DETAILS_TOP_PREVIOUS_BUTTON;

	@FindBy(id = CondtionsCompoundDetailPage.ADD_DETAILS_TOP_NEXT_BUTTON)
	private BaseElement ADD_DETAILS_TOP_NEXT_BUTTON;
	
	@FindBy(id = CondtionsCompoundDetailPage.ADD_DETAILS_TOP_CANCEL_BUTTON)
	private BaseElement ADD_DETAILS_TOP_CANCEL_BUTTON;
	
	@FindBy(xpath = CondtionsCompoundDetailPage.ADD_DETAILS_BOTTOM_PREVIOUS_BUTTON)
	private BaseElement ADD_DETAILS_BOTTOM_PREVIOUS_BUTTON;
	
	@FindBy(id = CondtionsCompoundDetailPage.ADD_DETAILS_BOTTOM_NEXT_BUTTON)
	private BaseElement ADD_DETAILS_BOTTOM_NEXT_BUTTON;
	
	@FindBy(id = CondtionsCompoundDetailPage.ADD_DETAILS_BOTTOM_CANCEL_BUTTON)
	private BaseElement ADD_DETAILS_BOTTOM_CANCEL_BUTTON;
	
	
	public boolean verifyConditionDetailsTabIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(ADD_DETAILS_COMPOUND_OPERATOR_LIST)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean selectCompoundOperator(String strCompoundOperator) throws Throwable{
		if (!strCompoundOperator.isEmpty() && ADD_DETAILS_COMPOUND_OPERATOR_LIST.isDisplayed()) {
			rxNovaCommonUtil.selectFromDropdownUsingText(ADD_DETAILS_COMPOUND_OPERATOR_LIST,strCompoundOperator);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addOrRemoveCondition(String strConditionData) throws Throwable {
		if (!strConditionData.isEmpty() && ADD_DETAILS_CONDITION_ID_EDIT.isDisplayed()) {
			return conditionsCommonUtil.addOrRemoveCondition(ADD_DETAILS_CONDITION_ID_EDIT,ADD_DETAILS_COMPOUND_TABLE,strConditionData);
		} else {
			return false;
		}
	}		
	
	public boolean clickOnTopNextButton() throws Throwable {
		if (ADD_DETAILS_TOP_NEXT_BUTTON.isClickable()) {
			rxNovaCommonUtil.performClick(ADD_DETAILS_TOP_NEXT_BUTTON);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
}
