@Funtional @All @Regression 
Feature: Single Drug List Condition with Is Included In operator and Not Ready status

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
      | Master_Customer_Set | Type   | Condition_ID | Name | Status | Update_Tracking_ID | Update_Status | Delete_Tracking_ID |
      | QTP_Master_1        | Single | DRGCOND5     |      |        | Update Tracking ID | Not Ready     | Delete Tracking ID |
  
  Scenario Outline: Add the Single DrugList Condition
    Given User navigates to the Condition Header tab and submits the following details
      | Header_Tracking_ID   | Header_Reason   | Header_Notes   | Master_Customer_Set   | Condition_ID   | Name   | Status   | Type   |
      | <Header_Tracking_ID> | <Header_Reason> | <Header_Notes> | <Master_Customer_Set> | <Condition_ID> | <Name> | <Status> | <Type> |
    And he submits the following details in the Details tab
      | Source   | Field_Name   | Field_Operator   | Field_Value   | Benefit_Customer_Set   | Operator   | Value   |
      | <Source> | <Field_Name> | <Field_Operator> | <Field_Value> | <Benefit_Customer_Set> | <Operator> | <Value> |
    When he submits the following details in Tags/Notes tab and verify the Condition Tags Success message at the top of the page
      | Notes   | Tags   | Tags_Add_Success_Message   | Tags_Add_Remove_Message   |
      | <Notes> | <Tags> | <Tags_Add_Success_Message> | <Tags_Add_Remove_Message> |
    Then verify the Condition Add Success message at top of the page after saving the condition
      | Condition_Add_Success_Message   |
      | <Condition_Add_Success_Message> |

    Examples: 
      | Header_Tracking_ID | Header_Reason | Header_Notes | Master_Customer_Set | Condition_ID | Name                 | Status    | Type   | Source    | Field_Name | Field_Operator | Field_Value | Benefit_Customer_Set | Operator       | Value    | Notes                       | Tags     | Tags_Add_Success_Message                 | Tags_Remove_Success_Message                           | Condition_Add_Success_Message         |
      | Test TrackingID    | Test Reason   | Test Notes   | QTP_Master_1        | DRGCOND5     | Drug List Condition5 | Not Ready | Single | Drug List |            |                |             | QTP_Benefits         | Is Included In | FLTPDLI2 | Single Drug List Condition5 | Add^Tag1 | Tag successfully added to the condition. | Tag(s) successfully removed from the search criteria. | The condition was successfully added. |

  Scenario Outline: View the Single DrugList Condition
    Given User search for the existing condition with the following details
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> |
    And verify the Condition Header Summary details
      | Header_Summary_Master_Customer_Set   | Header_Summary_Condition_ID     | Header_Summary_Name     | Header_Summary_Status   |
      | <Header_Summary_Master_Customer_Set> | <Header_Summary_Condition_ID>   | <Header_Summary_Name>   | <Header_Summary_Status> |
    And verify the Condition Header details
      | Header_Master_Customer_Set   | Header_Condition_ID     | Header_Name     | Header_Status   | Header_Type   |
      | <Header_Master_Customer_Set> | <Header_Condition_ID>   | <Header_Name>   | <Header_Status> | <Header_Type> |
    And verify the Condition Definition details
      | View_Source   | View_Benefit_Customer_Set   | View_Condition_Description   |
      | <View_Source> | <View_Benefit_Customer_Set> | <View_Condition_Description> |
    And verify the Tags/Notes details
      | Notes   | Tags   |
      | <Notes> | <Tags> |       
    Examples: 
      | Master_Customer_Set | Type   | Condition_ID | Name | Status    | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name        | Header_Summary_Status | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                | Header_Status     | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                       | Tags          |
      | QTP_Master_1        | Single | DRGCOND5     |      | Not Ready |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCOND5    | Name:^Drug List Condition5 | Status:^Not Ready     | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCOND5 | Name:^Drug List Condition5 | Status:^Not Ready | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI2 | Single Drug List Condition5 | Tag Name^tag1 |
  
  Scenario Outline: Update the Single DrugList Condition
    Given User search for the existing condition with the following details
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> |
    And verify the Condition Header tab and updates the Condition Header tab with the following details
      | Update_Tracking_ID   | Update_Reason   | Update_Notes   | Update_Name   | Update_Status   |
      | <Update_Tracking_ID> | <Update_Reason> | <Update_Notes> | <Update_Name> | <Update_Status> |
    And verify the Condition Update Success message at the top of the page
      | Condition_Update_Success_Message   |
      | <Condition_Update_Success_Message> |  
    And he updates the Condition Details tab with the folowing details
      | Update_Tracking_ID   | Update_Reason   | Update_Notes   | Update_Source   | Update_Field_Name   | Update_Field_Operator   | Update_Field_Value   | Update_Operator   | Update_Value   |
      | <Update_Tracking_ID> | <Update_Reason> | <Update_Notes> | <Update_Source> | <Update_Field_Name> | <Update_Field_Operator> | <Update_Field_Value> | <Update_Operator> | <Update_Value> |
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
      | Master_Customer_Set | Type   | Condition_ID | Name  | Status    | Source    | Field | Benefit_Customer_Set | List | Update_Tracking_ID | Update_Reason      | Update_Notes      | Update_Name                 | Update_Status | Update_Source | Update_Field_Name | Update_Field_Operator | Update_Field_Value | Update_Operator | Update_Value | Update_TagsNotes                   | Update_Tags | Tags_Add_Success_Message                 | Tags_Remove_Success_Message                           | Condition_Update_Success_Message      |
      | QTP_Master_1        | Single | DRGCOND5     |       | Not Ready |           |       |                      |      | Update Tracking ID | Update Test Reason | Update Test Notes | Update Drug List Condition5 | Not Ready     | Drug List     |                   |                       |                    | Is Included In  | FLTPDLI2     | Update Single Drug List Condition5 | Remove^Tag1 | Tag successfully added to the condition. | Tag(s) successfully removed from the search criteria. | The condition was successfully saved. | 

  Scenario Outline: View the Single DrugList Condition
    Given User search for the existing condition with the following details
      | Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   |  
      | <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> |
    And verify the Condition Header Summary details
      | Header_Summary_Master_Customer_Set   | Header_Summary_Condition_ID     | Header_Summary_Name     | Header_Summary_Status   |
      | <Header_Summary_Master_Customer_Set> | <Header_Summary_Condition_ID>   | <Header_Summary_Name>   | <Header_Summary_Status> |
    And verify the Condition Header details
      | Header_Master_Customer_Set   | Header_Condition_ID     | Header_Name     | Header_Status   | Header_Type   |
      | <Header_Master_Customer_Set> | <Header_Condition_ID>   | <Header_Name>   | <Header_Status> | <Header_Type> |
    And verify the Condition Definition details
      | View_Source   | View_Benefit_Customer_Set   | View_Condition_Description   |
      | <View_Source> | <View_Benefit_Customer_Set> | <View_Condition_Description> |
    And verify the Tags/Notes details
      | Notes   | Tags   |
      | <Notes> | <Tags> |       
    Examples: 
      | Master_Customer_Set | Type   | Condition_ID | Name | Status    | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name               | Header_Summary_Status | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                       | Header_Status     | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                              | Tags |
      | QTP_Master_1        | Single | DRGCOND5     |      | Not Ready |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCOND5    | Name:^Update Drug List Condition5 | Status:^Not Ready     | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCOND5 | Name:^Update Drug List Condition5 | Status:^Not Ready | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI2 | Update Single Drug List Condition5 |      |

  Scenario Outline: Delete the Single DrugList Condition
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
      | Master_Customer_Set | Type   | Condition_ID | Name | Status    | Source | Field | Benefit_Customer_Set | List | Update_Tracking_ID | Update_Reason | Update_Notes | Update_Name | Update_Status | Condition_Update_Success_Message      | Delete_Tracking_ID | Delete_Reason | Delete_Notes | Condition_Delete_Success_Message        |
      | QTP_Master_1        | Single | DRGCOND5     |      | Not Ready |        |       |                      |      | Update Tracking ID |               |              |             | Not Ready     | The condition was successfully saved. | Delete Tracking ID | Delete Reason | Delete Notes | The condition was successfully deleted. |