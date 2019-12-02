package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsViewHeaderPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionViewHeaderPage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(id = ConditionsViewHeaderPage.VIEW_HEADER_SUMMARY_TABLE)
	private BaseElement VIEW_HEADER_SUMMARY_TABLE;
	
	@FindBy(xpath = ConditionsViewHeaderPage.VIEW_HEADER_TABLE)
	private BaseElement VIEW_HEADER_TABLE;
	

	public boolean verifyConditionHeaderSummaryIsDisplayed() throws Throwable{		
		if(rxNovaCommonUtil.objectIsDisplayed(VIEW_HEADER_SUMMARY_TABLE)) {
			return true; 	
		}
		else {
			return false;
		}
	}
	
	public boolean verifyMCSHeaderSummary(String strMCS) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyColumnData(VIEW_HEADER_SUMMARY_TABLE,strMCS);
	}
	
	public boolean verifyConditionIDHeaderSummary(String strConditionID) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyColumnData(VIEW_HEADER_SUMMARY_TABLE,strConditionID);
	}
	
	public boolean verifyConditionNameHeaderSummary(String strName) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyColumnData(VIEW_HEADER_SUMMARY_TABLE,strName);
	}
	
	public boolean verifyStatusHeaderSummary(String strStatus) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyColumnData(VIEW_HEADER_SUMMARY_TABLE,strStatus);
	}
	
	public boolean verifyMCS(String strMCS) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyRowData(VIEW_HEADER_TABLE,strMCS);
	}
	
	public boolean verifyConditionID(String strConditionID) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyRowData(VIEW_HEADER_TABLE,strConditionID);
	}
	
	public boolean verifyConditionName(String strName) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyRowData(VIEW_HEADER_TABLE,strName);
	}
	
	public boolean verifyStatus(String strStatus) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyRowData(VIEW_HEADER_TABLE,strStatus);
	}
	
	public boolean verifyType(String strType) throws Throwable{		
		return rxNovaCommonUtil.webTable_VerifyRowData(VIEW_HEADER_TABLE,strType);
	}	
}
