package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsViewCompoundDetailsPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionViewDetailsCompoundPage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(xpath = ConditionsViewCompoundDetailsPage.VIEW_DETAILS_COMPOUND_OPERATOR_TABLE)
	private BaseElement VIEW_DETAILS_COMPOUND_OPERATOR_TABLE;
	
	@FindBy(xpath = ConditionsViewCompoundDetailsPage.VIEW_DETAILS_COMPOUND_TABLE)
	private BaseElement VIEW_DETAILS_COMPOUND_TABLE;
	
	@FindBy(xpath = ConditionsViewCompoundDetailsPage.VIEW_DETAILS_DESCRIPTION1)
	private BaseElement VIEW_DETAILS_DESCRIPTION1;
	
	@FindBy(xpath = ConditionsViewCompoundDetailsPage.VIEW_DETAILS_DESCRIPTION2)
	private BaseElement VIEW_DETAILS_DESCRIPTION2;
	
	@FindBy(xpath = ConditionsViewCompoundDetailsPage.VIEW_DETAILS_EXPAND_ICON)
	private BaseElement VIEW_DETAILS_EXPAND_ICON;
	
	@FindBy(xpath = ConditionsViewCompoundDetailsPage.VIEW_DETAILS_CONDITION_DETAILS)
	private BaseElement VIEW_DETAILS_CONDITION_DETAILS;
	

	public boolean verifyCompoundOperator(String strCompoundOperator) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyRowData(VIEW_DETAILS_COMPOUND_OPERATOR_TABLE,strCompoundOperator);
	}
	
	public boolean verifyConditionID(String strConditionID) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyCellData(VIEW_DETAILS_COMPOUND_TABLE,strConditionID);
	}
	
	public boolean verifyConditionName(String strConditionName) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyCellData(VIEW_DETAILS_COMPOUND_TABLE,strConditionName);
	}
	
	public boolean verifyConditionDescription1(String strConditionDescription1) {
		boolean match = rxNovaCommonUtil.objectContainsExpectedText(VIEW_DETAILS_DESCRIPTION1,strConditionDescription1);
		return(match);
	}
	
	public boolean verifyConditionDescription2(String strConditionDescription2) {
		boolean match = rxNovaCommonUtil.objectContainsExpectedText(VIEW_DETAILS_DESCRIPTION2,strConditionDescription2);
		return(match);
	}
	
	public boolean clickOnExpandIcon() throws Throwable {
		if (VIEW_DETAILS_EXPAND_ICON.isClickable()) {
			rxNovaCommonUtil.performClick(VIEW_DETAILS_EXPAND_ICON);
			rxNovaCommonUtil.checkBusyState();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyConditionDetails(String strConditionDetails) throws Throwable{		
		return rxNovaCommonUtil.condition_MultipleTable_VerifyCellData(VIEW_DETAILS_CONDITION_DETAILS,strConditionDetails);
	}		
}
