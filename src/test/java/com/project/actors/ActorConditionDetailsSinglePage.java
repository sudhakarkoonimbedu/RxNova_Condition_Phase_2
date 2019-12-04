package com.project.actors;

import java.util.List;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.project.pages.ConditionDetailsSinglePage;
import cucumber.api.DataTable;

public class ActorConditionDetailsSinglePage {
	@Steps
	ConditionDetailsSinglePage conditionDetailsSinglePage;
	
	@Step
	public void enterConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		
		String strSource = null;
		String strFieldName = null;
		String strFieldOperator = null;
		String strFieldValue = null;
		String strBCS = null;
		String strOperator = null;
		String strValue=null;
		
		List<List<String>> detailsData = conditionDetailsData.raw();
		
		strSource = detailsData.get(1).get(0);
		
		conditionDetailsSinglePage.verifyConditionDetailsTabIsDisplayed();
		conditionDetailsSinglePage.selectSource(strSource);
		
		switch(strSource.toUpperCase())
		{
		case "FIELD":
			  strFieldName = detailsData.get(1).get(1);
			  strFieldOperator = detailsData.get(1).get(2);
			  strFieldValue = detailsData.get(1).get(3);
			  
			  conditionDetailsSinglePage.enterFieldName(strFieldName);
			  conditionDetailsSinglePage.selectFieldOperator(strFieldOperator);
			  conditionDetailsSinglePage.enterFieldValue(strFieldValue);
			  break;
		//@Sreenu - DRUG LIST & PRESCRIBER LIST have same data inputs hence common implementation for both
		case "DRUG LIST":
		case "PRESCRIBER LIST":
			  strBCS = detailsData.get(1).get(4);
			  strOperator = detailsData.get(1).get(5);
			  strValue = detailsData.get(1).get(6);
			  
			  conditionDetailsSinglePage.selectBCS(strBCS);
			  conditionDetailsSinglePage.selectOperator(strOperator);
			  conditionDetailsSinglePage.enterValue(strValue);			  
			  break;
		case "PHARMACY LIST":
			  strOperator = detailsData.get(1).get(5);
			  strValue = detailsData.get(1).get(6);
			  
			  conditionDetailsSinglePage.selectOperator(strOperator);
			  conditionDetailsSinglePage.enterValue(strValue);
			  break;
		}

//		conditionDetailsSinglePage.verifyConditionDetailsTabIsDisplayed();
//		conditionDetailsSinglePage.selectSource(strSource);
//		if(strFieldName!=null)
//		{
//		    conditionDetailsSinglePage.enterFieldName(strFieldName);	
//		}
//		if(strFieldOperator!=null)
//		{
//		    conditionDetailsSinglePage.selectFieldOperator(strFieldOperator);	
//		}
//		if(strFieldValue!=null)
//		{
//		    conditionDetailsSinglePage.enterFieldValue(strFieldValue);	
//		}
//		if(strBCS!=null)
//		{
//			conditionDetailsSinglePage.selectBCS(strBCS);
//		}
//		if(strOperator!=null)
//		{
//		    conditionDetailsSinglePage.selectOperator(strOperator);	
//		}
//		if(strValue!=null)
//		{
//		    conditionDetailsSinglePage.enterValue(strValue);	
//		}

		conditionDetailsSinglePage.clickOnTopNextButton();    
	}
}
