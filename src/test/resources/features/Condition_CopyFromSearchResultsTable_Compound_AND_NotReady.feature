@Funtional @All @Regression 
Feature: Copy Compound Condition with AND operator and Not Ready status from Search Results table
 
  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Condition" application
    And check whether the Condition Home is displayed

  Scenario Outline: Delete the created conditions
    Given User searches condition with the following data and deletes them
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Update_Tracking_ID   | Update_Status   | Delete_Tracking_ID   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Update_Tracking_ID> | <Update_Status> | <Delete_Tracking_ID> |
    
    Examples: 
      | Master_Customer_Set | Type     | Condition_ID | Name | Status | Update_Tracking_ID | Update_Status | Delete_Tracking_ID |
      | QTP_Master_1        | Compound | CMPCPY17     |      |        | Update Tracking ID | Not Ready     | Delete Tracking ID |
      | QTP_Master_1        | Compound | CMPCON17     |      |        | Update Tracking ID | Not Ready     | Delete Tracking ID |
  
  Scenario Outline: Add the Compound Condition
    Given User navigates to the Condition Header tab and submits the following details
      | Header_Tracking_ID   | Header_Reason   | Header_Notes   | Master_Customer_Set   | Condition_ID   | Name   | Status   | Type   |
      | <Header_Tracking_ID> | <Header_Reason> | <Header_Notes> | <Master_Customer_Set> | <Condition_ID> | <Name> | <Status> | <Type> |
    And he submits the following compound details in the Details tab
      | Compound_Operator   | Compound_Condition_ID   |
      | <Compound_Operator> | <Compound_Condition_ID> |
    When he submits the following details in Tags/Notes tab and verify the Condition Tags Success message at the top of the page
      | Notes   | Tags   | Tags_Add_Success_Message   | Tags_Add_Remove_Message   |
      | <Notes> | <Tags> | <Tags_Add_Success_Message> | <Tags_Add_Remove_Message> |
    Then verify the Condition Add Success message at top of the page after saving the condition
      | Condition_Add_Success_Message   |
      | <Condition_Add_Success_Message> |
    
    Examples: 
      | Header_Tracking_ID | Header_Reason | Header_Notes | Master_Customer_Set | Condition_ID | Name                 | Status    | Type     | Compound_Operator | Compound_Condition_ID | Notes              | Tags     | Tags_Add_Success_Message                 | Tags_Remove_Success_Message                           | Condition_Add_Success_Message         |
      | Test TrackingID    | Test Reason   | Test Notes   | QTP_Master_1        | CMPCON17     | Compound Condition17 | Not Ready | Compound | AND               | Add^TPCOND21^TPCOND22 | Compound Condition | Add^Tag1 | Tag successfully added to the condition. | Tag(s) successfully removed from the search criteria. | The condition was successfully added. |
  
  Scenario Outline: Copy Single DrugList Condition from Search Results table
    Given User search for the existing condition from Search Results table
      | Master_Customer_Set   | Type   | Status   | Operation   | Condition_ID   |
      | <Master_Customer_Set> | <Type> | <Status> | <Operation> | <Condition_ID> |
    When he submits the following details in Copy a Condition window
      | Copy_Condition_ID   | Copy_Name   | Copy_Status   | Copy_TrackingID   | Copy_Reason   | Copy_Notes   |
      | <Copy_Condition_ID> | <Copy_Name> | <Copy_Status> | <Copy_TrackingID> | <Copy_Reason> | <Copy_Notes> |
    Then verify the Condition Copy Success message at the top of the page
      | Condition_Copy_Success_Message   |
      | <Condition_Copy_Success_Message> |

    Examples: 
      | Master_Customer_Set | Type     | Status    | Operation | Condition_ID | Copy_Condition_ID | Copy_Name                 | Copy_Status | Copy_TrackingID | Copy_Reason | Copy_Notes | Condition_Copy_Success_Message         |
      | QTP_Master_1        | Compound | Not Ready | Copy      | CDCMPCON17   | CMPCPY17          | Compound Condition Copy17 | Not Ready   | Test TrackingID |             |            | The condition was successfully copied. |
     
  Scenario Outline: View the Copied Compound AND Condition
    Given User search for the existing condition with the following details
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> |
    And verify the Condition Header Summary details
      | Header_Summary_Master_Customer_Set   | Header_Summary_Condition_ID     | Header_Summary_Name     | Header_Summary_Status   |
      | <Header_Summary_Master_Customer_Set> | <Header_Summary_Condition_ID>   | <Header_Summary_Name>   | <Header_Summary_Status> |
    And verify the Condition Header details
      | Header_Master_Customer_Set   | Header_Condition_ID     | Header_Name     | Header_Status   | Header_Type   |
      | <Header_Master_Customer_Set> | <Header_Condition_ID>   | <Header_Name>   | <Header_Status> | <Header_Type> |
    And verify the Compound Condition Definition details
      | View_Compound_Operator   | View_Condition_ID1   | View_Condition_Name1   | View_Condition_ID2   | View_Condition_Name2   | View_Condition_Description  | View_Condition_Details_Description   | View_Condition_Details   |
      | <View_Compound_Operator> | <View_Condition_ID1> | <View_Condition_Name1> | <View_Condition_ID2> | <View_Condition_Name2> |<View_Condition_Description> | <View_Condition_Details_Description> | <View_Condition_Details> |
    And verify the Tags/Notes details
      | Notes   | Tags   |
      | <Notes> | <Tags> |       
    
    Examples: 
      | Master_Customer_Set | Type     | Condition_ID | Name | Status    | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name             | Header_Summary_Status | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                     | Header_Status     | Header_Type    | View_Compound_Operator | View_Condition_ID1      | View_Condition_Name1 | View_Condition_ID2      | View_Condition_Name2 | View_Condition_Description                                                               | View_Condition_Details_Description    | View_Condition_Details                                                                             | Notes              | Tags          |
      | QTP_Master_1        | Compound | CMPCPY17     |      | Not Ready |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDCMPCPY17    | Name:^Compound Condition Copy17 | Status:^Not Ready     | Master customer set:^QTP_Master_1 | Condition ID:^CDCMPCPY17 | Name:^Compound Condition Copy17 | Status:^Not Ready | Type:^Compound | Compound operator:^AND | Condition ID^CDTPCOND21 | Name^TPCOND21        | Condition ID^CDTPCOND22 | Name^TPCOND22        | CDCMPCPY17: (COMPOUND CODE is the same as 1 AND NDC Name is not the same as 18860067870) | CDCMPCPY17: Compound Condition Copy17 | CDTPCOND21: COMPOUND CODE is the same as 1^AND^CDTPCOND22: NDC Name is not the same as 18860067870 | Compound Condition | Tag Name^tag1 |
  
  Scenario Outline: Delete the Compound Condition
    Given User search for the existing condition with the following details
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> |
    And verify the Condition Header tab and updates the Condition Header tab with the following details
      | Update_Tracking_ID   | Update_Reason   | Update_Notes   | Update_Name   | Update_Status   |
      | <Update_Tracking_ID> | <Update_Reason> | <Update_Notes> | <Update_Name> | <Update_Status> |
    And verify the Condition Update Success message at the top of the page
      | Condition_Update_Success_Message   |
      | <Condition_Update_Success_Message> | 
    And deletes the condition with the following details
      | Delete_Tracking_ID   | Delete_Reason   | Delete_Notes   |
      | <Delete_Tracking_ID> | <Delete_Reason> | <Delete_Notes> |
    Then verify the Condition Delete Success message at the top of the page
      | Condition_Delete_Success_Message   |
      | <Condition_Delete_Success_Message> |
    
    Examples: 
      | Master_Customer_Set | Type     | Condition_ID | Name | Status    | Source | Field | Benefit_Customer_Set | List | Update_Tracking_ID | Update_Reason | Update_Notes | Update_Name | Update_Status | Condition_Update_Success_Message      | Delete_Tracking_ID | Delete_Reason | Delete_Notes | Condition_Delete_Success_Message        |
      | QTP_Master_1        | Compound | CMPCPY17     |      | Not Ready |        |       |                      |      | Update Tracking ID |               |              |             | Not Ready     | The condition was successfully saved. | Delete Tracking ID | Delete Reason | Delete Notes | The condition was successfully deleted. |
      | QTP_Master_1        | Compound | CMPCON17     |      | Not Ready |        |       |                      |      | Update Tracking ID |               |              |             | Not Ready     | The condition was successfully saved. | Delete Tracking ID | Delete Reason | Delete Notes | The condition was successfully deleted. |