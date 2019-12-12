@Funtional @All @Regression 
Feature: Compound Condition with AND operator and Ready for Use status

  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Condition" application
    And check whether the Condition Home is displayed

  Scenario Outline: Delete the created condition
    Given User searches condition with the following data and deletes them
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Update_Tracking_ID   | Update_Status   | Delete_Tracking_ID   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Update_Tracking_ID> | <Update_Status> | <Delete_Tracking_ID> |
    
    Examples: 
      | Master_Customer_Set | Type     | Condition_ID | Name | Status | Update_Tracking_ID | Update_Status | Delete_Tracking_ID |
      | QTP_Master_1        | Compound | CMPCON1      |      |        | Update Tracking ID | Not Ready     | Delete Tracking ID |
  
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
      | Header_Tracking_ID | Header_Reason | Header_Notes | Master_Customer_Set | Condition_ID | Name                | Status        | Type     | Compound_Operator | Compound_Condition_ID | Notes              | Tags     | Tags_Add_Success_Message                 | Tags_Remove_Success_Message                           | Condition_Add_Success_Message         |
      | Test TrackingID    | Test Reason   | Test Notes   | QTP_Master_1        | CMPCON1      | Compound Condition1 | Ready for Use | Compound | AND               | Add^TPCOND1^TPCOND2   | Compound Condition | Add^Tag1 | Tag successfully added to the condition. | Tag(s) successfully removed from the search criteria. | The condition was successfully added. |

  Scenario Outline: View the Compound Condition
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
      | Master_Customer_Set | Type     | Condition_ID | Name | Status        | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name       | Header_Summary_Status | Header_Master_Customer_Set        | Header_Condition_ID     | Header_Name               | Header_Status         | Header_Type    | View_Source   | View_Compound_Operator | View_Condition_ID1     | View_Condition_Name1 | View_Condition_ID2     | View_Condition_Name2 | View_Condition_Description                                                              | View_Condition_Details_Description | View_Condition_Details                                                                           | Notes              | Tags          |
      | QTP_Master_1        | Compound | CMPCON1      |      | Ready for Use |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDCMPCON1     | Name:^Compound Condition1 | Status:^Ready for Use | Master customer set:^QTP_Master_1 | Condition ID:^CDCMPCON1 | Name:^Compound Condition1 | Status:^Ready for Use | Type:^Compound | Source:^Field | Compound operator:^AND | Condition ID^CDTPCOND1 | Name^TPCOND1         | Condition ID^CDTPCOND2 | Name^TPCOND2         | CDCMPCON1: (COMPOUND CODE is the same as 1 AND NDC Name is not the same as 18860067870) | CDCMPCON1: Compound Condition1     | CDTPCOND1: COMPOUND CODE is the same as 1^AND^CDTPCOND2: NDC Name is not the same as 18860067870 | Compound Condition | Tag Name^tag1 |
  
  Scenario Outline: Update the Compound Condition
    Given User search for the existing condition with the following details
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> |
    And verify the Condition Header tab and updates the Condition Header tab with the following details
      | Update_Tracking_ID   | Update_Reason   | Update_Notes   | Update_Name   | Update_Status   |
      | <Update_Tracking_ID> | <Update_Reason> | <Update_Notes> | <Update_Name> | <Update_Status> |
    And verify the Condition Update Success message at the top of the page
      | Condition_Update_Success_Message   |
      | <Condition_Update_Success_Message> |  
    And he updates the Compound Condition Details tab with the folowing details
      | Update_Tracking_ID   | Update_Reason   | Update_Notes   | Update_Compound_Operator   | Update_Compound_Condition_ID   |
      | <Update_Tracking_ID> | <Update_Reason> | <Update_Notes> | <Update_Compound_Operator> | <Update_Compound_Condition_ID> |
    And verify the Condition Update Success message at the top of the page
      | Condition_Update_Success_Message   |
      | <Condition_Update_Success_Message> |
    When he updates the following details in Tags/Notes tab and verify the Condition Tags Success message at the top of the page
      | Update_Tracking_ID   | Update_Reason   | Update_Notes   | Update_TagsNotes   | Update_Tags   | Tags_Add_Success_Message   | Tags_Add_Remove_Message   |
      | <Update_Tracking_ID> | <Update_Reason> | <Update_Notes> | <Update_TagsNotes> | <Update_Tags> | <Tags_Add_Success_Message> | <Tags_Add_Remove_Message> |
    And verify the Condition Update Success message at the top of the page
      | Condition_Update_Success_Message   |
      | <Condition_Update_Success_Message> |    
    
    Examples: 
      | Master_Customer_Set | Type     | Condition_ID | Name | Status        | Source    | Field | Benefit_Customer_Set | List | Update_Tracking_ID | Update_Reason      | Update_Notes      | Update_Name                | Update_Status | Update_Compound_Operator | Update_Compound_Condition_ID                   | Update_TagsNotes          | Update_Tags | Tags_Add_Success_Message                 | Tags_Remove_Success_Message                           | Condition_Update_Success_Message      |
      | QTP_Master_1        | Compound | CMPCON1      |      | Ready for Use |           |       |                      |      | Update Tracking ID | Update Test Reason | Update Test Notes | Update Compound Condition1 | Ready for Use | AND                      | Remove^CDTPCOND1^CDTPCOND2#Add^TPCOND3^TPCOND4 | Update Compound Condition | Remove^Tag1 | Tag successfully added to the condition. | Tag(s) successfully removed from the search criteria. | The condition was successfully saved. | 

  Scenario Outline: View the Compound Condition
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
      | Master_Customer_Set | Type     | Condition_ID | Name | Status        | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name              | Header_Summary_Status | Header_Master_Customer_Set        | Header_Condition_ID     | Header_Name                      | Header_Status         | Header_Type    | View_Source   | View_Compound_Operator | View_Condition_ID1     | View_Condition_Name1 | View_Condition_ID2     | View_Condition_Name2 | View_Condition_Description                                                               | View_Condition_Details_Description    | View_Condition_Details                                                                            | Notes                     | Tags |
      | QTP_Master_1        | Compound | CMPCON1      |      | Ready for Use |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDCMPCON1     | Name:^Update Compound Condition1 | Status:^Ready for Use | Master customer set:^QTP_Master_1 | Condition ID:^CDCMPCON1 | Name:^Update Compound Condition1 | Status:^Ready for Use | Type:^Compound | Source:^Field | Compound operator:^AND | Condition ID^CDTPCOND3 | Name^TPCOND3         | Condition ID^CDTPCOND4 | Name^TPCOND4         | CDCMPCON1: (NDC Name is the same as 18860067870 AND NDC Name is the same as 18860067870) | CDCMPCON1: Update Compound Condition1 | CDTPCOND3: NDC Name is the same as 18860067870^AND^CDTPCOND4: NDC Name is the same as 18860067870 | Update Compound Condition |      |
  
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
      | Master_Customer_Set | Type     | Condition_ID | Name | Status        | Source | Field | Benefit_Customer_Set | List | Update_Tracking_ID | Update_Reason | Update_Notes | Update_Name | Update_Status | Condition_Update_Success_Message      | Delete_Tracking_ID | Delete_Reason | Delete_Notes | Condition_Delete_Success_Message        |
      | QTP_Master_1        | Compound | CMPCON1      |      | Ready for Use |        |       |                      |      | Update Tracking ID |               |              |             | Not Ready     | The condition was successfully saved. | Delete Tracking ID | Delete Reason | Delete Notes | The condition was successfully deleted. |