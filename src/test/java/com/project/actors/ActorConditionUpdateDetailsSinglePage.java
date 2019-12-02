package com.project.actors;

import java.util.List;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.project.pages.ConditionUpdateDetailsSinglePage;

import cucumber.api.DataTable;

public class ActorConditionUpdateDetailsSinglePage {
	@Steps
	ConditionUpdateDetailsSinglePage conditionUpdateDetailsSinglePage;
	
	@Step
	public void updateConditionDetailsData(DataTable conditionDetailsData) throws Throwable {
		
		List<List<String>> detailsData = conditionDetailsData.raw();
		
		String strTrackingID = detailsData.get(1).get(0);
		String strReason = detailsData.get(1).get(1);
		String strNotes = detailsData.get(1).get(2);
		String strSource = detailsData.get(1).get(3);
		String strFieldName = null;
		String strFieldOperator = null;
		String strFieldValue = null;
		String strOperator = null;
		String strDrugList = null;
		String strPrescriberList = null;
		String strPharmacyList = null;
		
		conditionUpdateDetailsSinglePage.clickOnDetailsTab();
		conditionUpdateDetailsSinglePage.verifyConditionDetailsTabIsDisplayed();
		conditionUpdateDetailsSinglePage.clickOnMakeUpdatesButton();
		conditionUpdateDetailsSinglePage.enterTrackingID(strTrackingID);
		conditionUpdateDetailsSinglePage.enterReason(strReason);
		conditionUpdateDetailsSinglePage.enterNotes(strNotes);
		
		switch(strSource.toUpperCase())
		{
		case "FIELD":
			  strFieldName = detailsData.get(1).get(4);
			  strFieldOperator = detailsData.get(1).get(5);
			  strFieldValue = detailsData.get(1).get(6);
			  
			  conditionUpdateDetailsSinglePage.enterFieldName(strFieldName);
			  conditionUpdateDetailsSinglePage.selectFieldOperator(strFieldOperator);
			  conditionUpdateDetailsSinglePage.enterFieldValue(strFieldValue);
			  break;
		case "DRUG LIST":
			  strOperator = detailsData.get(1).get(7);
			  strDrugList = detailsData.get(1).get(8);
			  
			  conditionUpdateDetailsSinglePage.selectOperator(strOperator);
			  conditionUpdateDetailsSinglePage.enterValue(strDrugList);
			  break;
		case "PRESCRIBER LIST":
			  strOperator = detailsData.get(1).get(7);
			  strPrescriberList = detailsData.get(1).get(8);
			  
			  conditionUpdateDetailsSinglePage.selectOperator(strOperator);
			  conditionUpdateDetailsSinglePage.enterValue(strPrescriberList);
			  break;
		case "PHARMACY LIST":
			  strOperator = detailsData.get(1).get(7);
			  strPharmacyList = detailsData.get(1).get(8);
			  
			  conditionUpdateDetailsSinglePage.selectOperator(strOperator);
			  conditionUpdateDetailsSinglePage.enterValue(strPharmacyList);
			  break;
		}
	    
		conditionUpdateDetailsSinglePage.clickOnTopSaveButton();    
	}
}
