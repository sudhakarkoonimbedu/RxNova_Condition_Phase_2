package com.project.actors;

import java.util.List;

import com.project.pages.ConditionDeletePage;
import com.project.pages.ConditionHomePage;
import com.project.pages.ConditionUpdateHeaderPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorConditionHomePage {
	
	@Steps
	ConditionHomePage conditionHomePage;
	ConditionUpdateHeaderPage conditionUpdateHeaderPage;
	ConditionDeletePage conditionDeletePage;
	
	@Step
	public void verifyConditionHomeIsDisplayed() throws InterruptedException {
		conditionHomePage.verifyConditionHomeTextIsDisplayed();
	}
	
	@Step
	public void searchCondition(DataTable conditionSearchData) throws Throwable {
		
		List<List<String>> searchData = conditionSearchData.raw();
		
		String strMCS = searchData.get(1).get(0);
		String strType = searchData.get(1).get(1);
		String strConditionID = searchData.get(1).get(2);
		String strName = searchData.get(1).get(3);
		String strStatus = searchData.get(1).get(4);
		String strSource = searchData.get(1).get(5);
		String strField = null;
	    String strBCS = null;
	    String strList = null;
		
	    conditionHomePage.verifyConditionHomeTextIsDisplayed();
	    conditionHomePage.selectMasterCustomerSet(strMCS);
	    conditionHomePage.selectType(strType);
	    conditionHomePage.enterConditionID(strConditionID);
	    conditionHomePage.enterConditionName(strName);
	    conditionHomePage.selectStatus(strStatus);
	    conditionHomePage.selectSource(strSource);
	    
		switch(strSource.toUpperCase())
		{
		case "FIELD":
			  strField = searchData.get(1).get(6);
			  
			  conditionHomePage.enterField(strField);
			  break;
		case "DRUG LIST":
		case "PRESCRIBER LIST":
			  strBCS = searchData.get(1).get(7);
			  strList = searchData.get(1).get(8);
			  
			  conditionHomePage.selectBCS(strBCS);
			  conditionHomePage.enterList(strList);
			  break;
		case "PHARMACY LIST":
			  strList = searchData.get(1).get(8);
			  
			  conditionHomePage.enterList(strList);
			  break;
		}
	    
		conditionHomePage.clickOnSearchButton();		
	}	
	
	public void searchConditionfromResultsTable(DataTable conditionSearchData) throws Throwable {
		
		List<List<String>> searchData = conditionSearchData.raw();
		
		String strMCS = searchData.get(1).get(0);
		String strType = searchData.get(1).get(1);
		String strStatus = searchData.get(1).get(2);
		String strOperation = searchData.get(1).get(3);
		String strConditionID = searchData.get(1).get(4);
		
	    conditionHomePage.verifyConditionHomeTextIsDisplayed();
	    conditionHomePage.selectMasterCustomerSet(strMCS);
	    conditionHomePage.selectType(strType);
	    conditionHomePage.selectStatus(strStatus);
		conditionHomePage.clickOnSearchButton();		
	    conditionHomePage.operationSearch(strOperation,strConditionID);
	}
	
	@Step
	public void advancedSearchCondition(DataTable conditionSearchData) throws Throwable {
		
	    List<List<String>> searchData = conditionSearchData.raw();
		
		String strMCS = searchData.get(1).get(0);
		String strType = searchData.get(1).get(1);
		String strConditionID = searchData.get(1).get(2);
		String strName = searchData.get(1).get(3);
		String strStatus = searchData.get(1).get(4);
		String strSource = searchData.get(1).get(5);
		String strField = null;
	    String strBCS = null;
	    String strList = null;
	    String strSubStatus = searchData.get(1).get(9);
	    String strTags = searchData.get(1).get(10);
		String strTagsAddMessage = searchData.get(1).get(11);
		String strTagsRemoveMessage = searchData.get(1).get(12);
		String strOperation = searchData.get(1).get(13);
		String strViewConditionID = searchData.get(1).get(14);
		
	    conditionHomePage.verifyConditionHomeTextIsDisplayed();
	    conditionHomePage.selectMasterCustomerSet(strMCS);
	    conditionHomePage.selectType(strType);
	    conditionHomePage.enterConditionID(strConditionID);
	    conditionHomePage.enterConditionName(strName);
	    conditionHomePage.selectStatus(strStatus);
	    conditionHomePage.selectSource(strSource);
	    
		switch(strSource.toUpperCase())
		{
		case "FIELD":
			  strField = searchData.get(1).get(6);
			  
			  conditionHomePage.enterField(strField);
			  break;
		case "DRUG LIST":
		case "PRESCRIBER LIST":
			  strBCS = searchData.get(1).get(7);
			  strList = searchData.get(1).get(8);
			  
			  conditionHomePage.selectBCS(strBCS);
			  conditionHomePage.enterList(strList);
			  break;
		case "PHARMACY LIST":
			  strList = searchData.get(1).get(8);
			  
			  conditionHomePage.enterList(strList);
			  break;
		}
	    
		conditionHomePage.clickOnAdvancedSearchLink();
		conditionHomePage.selectSubStatus(strSubStatus);
		conditionHomePage.enterTags(strTags,strTagsAddMessage,strTagsRemoveMessage);
		conditionHomePage.clickOnSearchButton();
		conditionHomePage.operationSearch(strOperation,strViewConditionID);
	}
	
	@Step
	public void deleteCondition(DataTable deleteDetails) throws Throwable {
		
		List<List<String>> deleteData = deleteDetails.raw();
		Boolean errorMessage = false;
		
		String strMCS = deleteData.get(1).get(0);
		String strType = deleteData.get(1).get(1);
		String strConditionID = deleteData.get(1).get(2);
		String strName = deleteData.get(1).get(3);
		String strStatus = deleteData.get(1).get(4);
		String strUpdateTrackingID = deleteData.get(1).get(5);
		String strUpdateStatus = deleteData.get(1).get(6);
		String strDeleteTrackingID = deleteData.get(1).get(7);
		
	    conditionHomePage.selectMasterCustomerSet(strMCS);
	    conditionHomePage.selectType(strType);
	    conditionHomePage.enterConditionID(strConditionID);
	    conditionHomePage.enterConditionName(strName);
	    conditionHomePage.selectEmptyStatus(strStatus);
	    conditionHomePage.clickOnSearchButton();
	    errorMessage = conditionHomePage.verifyErrorMessage();
	    if(errorMessage==false)
	      {	    	
	    	conditionUpdateHeaderPage.verifyConditionHeaderTabIsDisplayed();
	    	conditionUpdateHeaderPage.clickOnMakeUpdatesButton();
	    	conditionUpdateHeaderPage.enterTrackingID(strUpdateTrackingID);
	    	conditionUpdateHeaderPage.selectStatus(strUpdateStatus);
	    	conditionUpdateHeaderPage.clickOnSaveButton();
	    	conditionUpdateHeaderPage.verifyConditionUpdateMessageIsDisplayed();
		    conditionUpdateHeaderPage.clickOnDeleteButton();
		    conditionDeletePage.verifyDeleteConditionWindowIsDisplayed();
		    conditionDeletePage.enterTrackingID(strDeleteTrackingID);	    
		    conditionDeletePage.clickOnDeleteButton();
	     }	    
	}
}
	
