package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsViewSingleDetailsPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionViewDetailsSinglePage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(xpath = ConditionsViewSingleDetailsPage.VIEW_DETAILS_SOURCE)
	private BaseElement VIEW_DETAILS_SOURCE;
	
	@FindBy(xpath = ConditionsViewSingleDetailsPage.VIEW_DETAILS_BCS)
	private BaseElement VIEW_DETAILS_BCS;
	
	@FindBy(id = ConditionsViewSingleDetailsPage.VIEW_DETAILS_DESCRIPTION)
	private BaseElement VIEW_DETAILS_DESCRIPTION;
	

	public boolean verifySource(String strSource) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyRowData(VIEW_DETAILS_SOURCE,strSource);
	}
	
	public boolean verifyBCS(String strBCS) throws Throwable{		
		Boolean verifyBCS = false;
		if(!strBCS.isEmpty())
		{
			verifyBCS = rxNovaCommonUtil.webTable_VerifyRowData(VIEW_DETAILS_BCS,strBCS);
		}
		else {
			verifyBCS = true;
		}
		return verifyBCS;
	}
	
	public boolean verifyConditionDescription(String strDescription) {
		boolean match = rxNovaCommonUtil.objectContainsExpectedText(VIEW_DETAILS_DESCRIPTION,strDescription);
		return(match);
	}
	
		
}
