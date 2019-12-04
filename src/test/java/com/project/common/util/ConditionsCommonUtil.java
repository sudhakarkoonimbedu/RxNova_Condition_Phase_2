package com.project.common.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.StringUtil;

import com.psqframework.core.element.BaseElement;

public class ConditionsCommonUtil extends RxNovaCommonUtil {
    
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: addOrRemoveTags
  	// Return Type: boolean
  	// Description: Add or Remove required Tags. 
  	// Parameters: BaseElement ObjPath1,BaseElement ObjPath2,String Text,String Message1,String Message2
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  		
  	 public boolean addOrRemoveTags(BaseElement ObjPath1,BaseElement ObjPath2, BaseElement ObjPath3,String strValue, String strMessage1,String strMessage2) throws Throwable {
  			
  			Boolean booleanAddOrRemoveTags = false;
  			
  			String[] arrRecordCount,arrTags = null;
  			
  			if(StringUtil.isNotBlank(strValue))
  			 {
  				arrRecordCount = strValue.split("#",-1);
  				
  				for(int i=0;i<arrRecordCount.length;i++)
  				 {
  				
  					arrTags = strValue.split("\\^",-1);
  						
  					String strOperation = arrTags[0];
  						
  					switch(strOperation.toUpperCase())
  					 {
  						case "ADD":
  							if(ObjPath1.exists(1000))
  							 {
  								for(int j=1;j<arrTags.length;j++)
  								 {
  									String toEnter = arrTags[j].toUpperCase();
  									selectValueFromFieldIntellisence(ObjPath1, toEnter);
  									//performClick(ObjPath2);
  									clickOnButton(By.xpath("//span[text()='Add']"));
  									checkBusyState();
  									boolean match = objectContainsExpectedText(ObjPath3,strMessage1);
  									if(match)
  									 {
  										Log.info("Tag "+arrTags[j]+" is added");
  										booleanAddOrRemoveTags = true;
  									 }
  									else
  									 {
  										Log.info("Tag "+arrTags[j]+" is not added and verify the tag provided");
  										booleanAddOrRemoveTags = false;			
  							         }
  							      }
  								}
  							else
  							 {
  								Log.info("Webelement with name  : '" + ObjPath1 + "' was not found");
  								booleanAddOrRemoveTags=false;
  							 }
  							break;
  						case "REMOVE":
  							if(ObjPath2.exists(1000))
  							 {
  								for(int j=1;j<arrTags.length;j++)
  								 {
  									String toRemove = arrTags[j].toUpperCase();
  									if (webtable_ClickOnCheckBox(ObjPath2, toRemove))
  									 {
  										waitUntilWebButtonIsEnabled(By.xpath("//span[text()='Remove Selected']/parent::button"));
  										clickOnButton(By.xpath("//span[text()='Remove Selected']"));
  										checkBusyState();
  										boolean match = objectContainsExpectedText(ObjPath3,strMessage2);
  										if(match)
  										 {
  											Log.info("Tag "+arrTags[j]+" is removed");
  											booleanAddOrRemoveTags = true;
  										 }
  										else
  										 {
  											Log.info("Tag "+arrTags[j]+" is not removed and verify the tag provided");
  											booleanAddOrRemoveTags = false;
  										 }					
  									 }
  					
  								   }
  							 }
  							else
  								 {
  									Log.info("Webelement with name  : '" + ObjPath2 + "' was not found");
  									booleanAddOrRemoveTags=false;
  								 }
  								break;
  							}
  				 }
  				
  		     }
  			
  			return booleanAddOrRemoveTags;		
  		}

  	 
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 	// Method: addOrRemoveCondition
 	// Return Type: boolean
 	// Description: Add or Remove required Conditions. 
 	// Parameters: BaseElement ObjPath1,BaseElement ObjPath2,String Text
 	// Example:
 	// Author:
 	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 		
 	 public boolean addOrRemoveCondition(BaseElement ObjPath1,BaseElement ObjPath2,String strValue) throws Throwable 
 	  {
 			
 		Boolean booleanAddOrRemoveCondition = false;
 		
 		String[] arrRecordCount,arrCondition = null;
 		
 		if(StringUtil.isNotBlank(strValue))
 		 {
 			arrRecordCount = strValue.split("#",-1);
 			
 			for(int i=0;i<arrRecordCount.length;i++)
 			{
 				arrCondition = arrRecordCount[i].split("\\^",-1);
 				
 				String strOperation = arrCondition[0];
 					
 				switch(strOperation.toUpperCase())
 				 {
 					case "ADD":
 						if(ObjPath1.exists(1000))
 						 {
 							for(int j=1;j<arrCondition.length;j++)
 							 {
 								String toEnter = arrCondition[j].toUpperCase();
 								selectValueFromFieldIntellisence(ObjPath1, toEnter);
 								//performClick(ObjPath2);
 								clickOnButton(By.xpath("//span[text()='Add']"));
 								checkBusyState();
 								boolean match = webTable_VerifyCellData(ObjPath2,"Condition ID^CD"+toEnter);
 								if(match)
 								 {
 									Log.info("Condition ID "+arrCondition[j]+" is added");
 									booleanAddOrRemoveCondition = true;
 								 }
 								else
 								 {
 									Log.info("Condition ID "+arrCondition[j]+" is not added and verify the Condition ID provided");
 									booleanAddOrRemoveCondition = false;			
 						         }
 						      }
 							}
 						else
 						 {
 							Log.info("Webelement with name  : '" + ObjPath1 + "' was not found");
 							booleanAddOrRemoveCondition=false;
 						 }
 						break;
 					case "REMOVE":
 						if(ObjPath2.exists(1000))
 						 {
 							for(int j=1;j<arrCondition.length;j++)
 							 {
 								String toRemove = arrCondition[j].toUpperCase();
 								if (webtable_ClickOnCheckBox(ObjPath2, toRemove))
 								 {
 									waitUntilWebButtonIsEnabled(By.xpath("//span[text()='Remove Selected']/parent::button"));
 									clickOnButton(By.xpath("//span[text()='Remove Selected']"));
 									checkBusyState();
 									boolean match = webTable_VerifyCellData(ObjPath2,"Condition ID^"+toRemove);
 									if(match==false)
 									 {
 										Log.info("Condition ID "+arrCondition[j]+" is removed");
 										booleanAddOrRemoveCondition = true;
 									 }
 									else
 									 {
 										Log.info("Condition ID "+arrCondition[j]+" is not removed and verify the Condition ID provided");
 										booleanAddOrRemoveCondition = false;
 									 }					
 								 }
 				
 							   }
 						   }
 						 else
 						  {
 							Log.info("Webelement with name  : '" + ObjPath2 + "' was not found");
 							booleanAddOrRemoveCondition=false;
 						  }
 						 break;
 					 }
 			   }
 	       }
 		
 		return booleanAddOrRemoveCondition;		
 	  }
 	 
 	 

 	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 	// Method: condition_SelectFromDropdownUsingText 
 	// Return Type: void
 	// Description: Selects the item from drop-down list multiple times using text attribute as the item clears after selection.
 	// Parameters: BaseElement ObjPath, String text 
 	// Example:
 	// Author:
 	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 	 public void condition_SelectFromDropdownUsingText(BaseElement ObjPath, String toSelect) throws Throwable {
 	  
 	  Boolean boolcondition_SelectFromDropdownUsingText=false;
 		
 		int attempts=0;
 		while(attempts<3)
 		{
 			try{
 		
 			String ItemFound = "";
 			String strListItem="";
 			WebElement objElement = ObjPath;
 			if(ObjPath.exists(2000))
 			{
 				List<WebElement> strItems=	ObjPath.findElements(By.tagName("option"));	
 				for(int i2=1;i2<strItems.size();i2++)
 				{
 					strListItem=strItems.get(i2).getText();
 					if(strListItem.trim().equalsIgnoreCase(toSelect.trim()))
 					   {
 						  ItemFound = "Found";
 						  Select itemstoSelect =new Select(objElement);
 						  String strName = objElement.getAttribute("name");
 						  itemstoSelect.selectByVisibleText(strListItem);
 						  Thread.sleep(1000);
 						  boolcondition_SelectFromDropdownUsingText = true;
 						  Log.info("Selected item in webelement : " + strName + " Value :" + toSelect );
 						  break;
 					   }
 				 }
 				if(!ItemFound.equals("Found"))
 				  {
 					for(int i3=1;i3<strItems.size();i3++)
 					 {
 						strListItem=strItems.get(i3).getText();	
 					    String[] arrItemSplited=strListItem.split("-");
 					    if(arrItemSplited[0].trim().equalsIgnoreCase(toSelect.trim()))
 						   {
 							  Select itemstoSelect =new Select(objElement);
 							  String strName = objElement.getAttribute("name");
 							  itemstoSelect.selectByVisibleText(strListItem);
 							  Thread.sleep(1000);
 							  boolcondition_SelectFromDropdownUsingText = true;
 							  Log.info("Selected item in webelement : " + strName + " Value :" + toSelect );
 							  break;
 						   }
 					  }
 				  }
 				
 			 	}
 			
 		}catch(StaleElementReferenceException e){				
 		}
 		attempts++;
 		}
 			
 		if(boolcondition_SelectFromDropdownUsingText==false)
 		 {
 			Log.info("Webelement with name  : '" + ObjPath.getAttribute("name") + "' was not found");
 		 }
 	  }
 	  
 	 //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 	 // Method: condition_MultipleTable_VerifyCellData
 	 // Return Type: boolean
 	 // Description: verify cell data in multiple web table1. 
 	 // Parameters: BaseElement ObjPath, String strCellValue
 	 // Example:
 	 // Author:
 	 //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 	
 	 public boolean condition_MultipleTable_VerifyCellData(BaseElement ObjPath,String strCellValue) throws InterruptedException
 	  {
 		Boolean boolcondition_MultipleTable_VerifyCellData = false;
 		
 		String strActCellValue="";
 		String strActRefCellValue="";
 		
 		String[] arrCellValue = strCellValue.split("\\^",-1);
 		
 		WebElement objElement = ObjPath;
 		
 		List<WebElement> strTbls = objElement.findElements(By.tagName("table"));
 		
 		for(int i=0;i<arrCellValue.length;i++)
 		{
 			List<WebElement> strRows = strTbls.get(i).findElements(By.tagName("tr"));
 			
 			for(int j=0;j<strRows.size();j++)
 			{
 				List<WebElement> strCols = strRows.get(0).findElements(By.tagName("td"));
 				
 				for(int k=0;k<strCols.size();k++)
 				{
 					strActCellValue = strCols.get(k).getText();
 					if(strActCellValue.equalsIgnoreCase(arrCellValue[i]))
 					{
 						Log.info("The Cell has the value "+strActCellValue);
 					}				
 				}
 			}		
 	
 			if(i==0)
 			{
 				strActRefCellValue = strActCellValue;
 			}
 			
 			else if(!strActCellValue.isEmpty() && i!=arrCellValue.length)
 			{
 	
 				strActRefCellValue = strActRefCellValue+"^"+strActCellValue;
 			}
 		}
 		
 		if(strActRefCellValue.equalsIgnoreCase(strCellValue))
 		 {
 			Log.info("The Cell has the value "+strActRefCellValue);
 			boolcondition_MultipleTable_VerifyCellData = true;
 		 }
 		else
 		 {
 			Log.info("The Cell does not match with the provided value "+strActRefCellValue);
 			boolcondition_MultipleTable_VerifyCellData = false;
 		 }
 		
 	    return boolcondition_MultipleTable_VerifyCellData;
 	  
 	  }
 	 
 	 
 	    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 			// Method: searchOperation
 			// Return Type: boolean
 			// Description: Add or Remove required Conditions. 
 			// Parameters: BaseElement ObjPath1,BaseElement ObjPath2,String Text
 			// Example:
 			// Author:
 			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 					
 			 public boolean operationSearch(BaseElement ObjPath,String strOperation,String strValue) throws Throwable 
 				  {
 						
 					Boolean booleanOperationSearch = false;
 					
 					if(ObjPath.exists(5000))
 					  {
 								
 						WebElement objElement = ObjPath;
 					
 						A:
 						do {
 						List<WebElement> strTblRows = objElement.findElements(By.tagName("tr"));
 						
 						for(int strRow=0;strRow<strTblRows.size();strRow++)
 						 {
 						 	List<WebElement> strTblCols = strTblRows.get(strRow).findElements(By.tagName("td"));
 						 	
 						 	for(int strCol=0;strCol<strTblCols.size();strCol++)
 						 	{
 						 		String strActValue = strTblCols.get(strCol).getText();
 						 		if(strActValue.equalsIgnoreCase(strValue))
 						 		{
 						 			switch(strOperation.toUpperCase())
 						 			 {
 						 			    case "VIEW":
 						 			          strTblCols.get(strCol).click();
 						 			          checkBusyState();
 						 			          Log.info("Click on the Condition ID: "+strValue);
 						 			         booleanOperationSearch = true;
 						 			          break;
 						 			 	case "COPY":
 						 			 		  List<WebElement> strBtn1 = strTblRows.get(strRow).findElements(By.tagName("button"));
 						 			          for(WebElement btn:strBtn1)
 						 			          {
 						 			        	  if(btn.findElements(By.xpath("//*[text()='Copy']")).size()>0)
 						 			        	  {
 						 			        		 btn.click();
 						 			        		 Log.info("Click on the Copy button for Condition ID: "+strValue);
 						 			        		 break;
 						 			        	  }
 						 			          }
 						 			          checkBusyState();
 						 			         booleanOperationSearch = true;
 						 			          break;
 						 			 	case "REPORT":
 						 			 		  List<WebElement> strBtn2 = strTblRows.get(strRow).findElements(By.tagName("button"));
 						 			          for(WebElement btn:strBtn2)
 						 			          {
 						 			        	  if(btn.findElements(By.xpath("//*[text()='Report']")).size()>0)
 						 			        	  {
 						 			        		 btn.click();
 						 			        		 Log.info("Click on the Report button for Condition ID: "+strValue);
 						 			        		 break;
 						 			        	  }
 						 			          }
 						 			          checkBusyState();
 						 			         booleanOperationSearch = true;
 						 			          break;
 						 			 }
 						 		}
 						 		
 						 		if(booleanOperationSearch==true)
 						 		{
 						 			break A;
 						 		}
 						 	}
 						 }
 						 if(booleanOperationSearch==false && getDriver().findElement(By.xpath("(//span[text()='Next'])[1]")).isEnabled())
 						   {
 							  clickOnButton(By.xpath("(//span[text()='Next'])[1]"));
 							  checkBusyState();
 						   }
 						} while(booleanOperationSearch==false);
 					 }	
 					 if(booleanOperationSearch==false)
 					  {
 						Log.info("Webelement with name  : '" + ObjPath + "' was not found");
 					  }
 					
 					return booleanOperationSearch;		
 				 }

 	 
}
