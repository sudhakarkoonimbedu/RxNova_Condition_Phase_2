@Funtional @All @Regression 
Feature: Advanced Search Single Drug List Condition with Do Not Use Anymore status and Copy the Condition 

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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status | Update_Tracking_ID | Update_Status | Delete_Tracking_ID |
		| QTP_Master_1        | Single | DRGCON15     |      |        | Update Tracking ID | Not Ready     | Delete Tracking ID |
		| QTP_Master_1        | Single | DRGCPY9      |      |        | Update Tracking ID | Not Ready     | Delete Tracking ID |
		
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
		| Header_Tracking_ID | Header_Reason | Header_Notes | Master_Customer_Set | Condition_ID | Name                  | Status             | Type   | Source    | Field_Name | Field_Operator | Field_Value | Benefit_Customer_Set | Operator           | Value    | Notes                      | Tags     | Tags_Add_Success_Message                 | Tags_Remove_Success_Message                           | Condition_Add_Success_Message         |
		| Test TrackingID    | Test Reason   | Test Notes   | QTP_Master_1        | DRGCON15     | Drug List Condition15 | Do Not Use Anymore | Single | Drug List |            |                |             | QTP_Benefits         | Is Not Included In | FLTPDLI9 | Single Drug List Condition | Add^Tag1 | Tag successfully added to the condition. | Tag(s) successfully removed from the search criteria. | The condition was successfully added. |
		
Scenario Outline: Search and View DrugList Condition from Search Results table using Master Customer Set 
	Given User search for the existing condition from Search Results table 
		| Master_Customer_Set   | Type   | Status   | Operation   | Condition_ID   |
		| <Master_Customer_Set> | <Type> | <Status> | <Operation> | <Condition_ID> |
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
		| Master_Customer_Set | Type | Status             | Operation | Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        |      | Do Not Use Anymore | View      | CDDRGCON15   | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Search and View DrugList Condition from Search Results table using Master Customer Set and Type 
	Given User search for the existing condition from Search Results table 
		| Master_Customer_Set   | Type   | Status   | Operation   | Condition_ID   |
		| <Master_Customer_Set> | <Type> | <Status> | <Operation> | <Condition_ID> |
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
		| Master_Customer_Set | Type   | Status             | Operation | Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single | Do Not Use Anymore | View      | CDDRGCON15   | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Search and View DrugList Condition using Condition ID 
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single | DRGCON15     |      | Do Not Use Anymore |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Search and View DrugList Condition using Condition Name 
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
		| Master_Customer_Set | Type   | Condition_ID | Name                  | Status             | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single |              | Drug List Condition15 | Do Not Use Anymore |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Search and View DrugList Condition using Condition ID and Source details 
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source    | Field | Benefit_Customer_Set | List     | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single | DRGCON15     |      | Do Not Use Anymore | Drug List |       | QTP_Benefits         | FLTPDLI9 | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Advanced Search and View DrugList Condition from Search Results table using Master Customer Set and Sub-status 
	Given User perform Advanced Search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
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
		| Master_Customer_Set | Type | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Sub_Status     | Tags | Tags_Add_Success_Message | Tags_Remove_Success_Message | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        |      |              |      | Do Not Use Anymore |        |       |                      |      | Not Associated |      |                          |                             | View      | CDDRGCON15        | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Advanced Search and View DrugList Condition from Search Results table using Master Customer Set, Type and Sub-status 
	Given User perform Advanced Search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Sub_Status     | Tags | Tags_Add_Success_Message | Tags_Remove_Success_Message | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single |              |      | Do Not Use Anymore |        |       |                      |      | Not Associated |      |                          |                             | View      | CDDRGCON15        | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Advanced Search and View DrugList Condition using Condition ID and Sub-status 
	Given User perform Advanced Search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Sub_Status     | Tags | Tags_Add_Success_Message | Tags_Remove_Success_Message | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single | DRGCON15     |      | Do Not Use Anymore |        |       |                      |      | Not Associated |      |                          |                             |           |                   | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Advanced Search and View DrugList Condition using Condition Name and Sub-status 
	Given User perform Advanced Search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
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
		| Master_Customer_Set | Type   | Condition_ID | Name                  | Status             | Source | Field | Benefit_Customer_Set | List | Sub_Status     | Tags | Tags_Add_Success_Message | Tags_Remove_Success_Message | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID  | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single |              | Drug List Condition15 | Do Not Use Anymore |        |       |                      |      | Not Associated |      |                          |                             |           |                   | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15     | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Advanced Search and View DrugList Condition using Condition ID, Sub-status and Source details 
	Given User perform Advanced Search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source    | Field | Benefit_Customer_Set | List     | Sub_Status     | Tags | Tags_Add_Success_Message | Tags_Remove_Success_Message | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single | DRGCON15     |      | Do Not Use Anymore | Drug List |       | QTP_Benefits         | FLTPDLI9 | Not Associated |      |                          |                             |           |                   | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
		#Scenario Outline: Search and View DrugList Condition using Condition ID, Sub status and Tags       ***** This Search condition is commented due to application issue with Tags *****
		#Given User perform Advanced Search for the existing condition with the following details
		#| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		#| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
		#And verify the Condition Header Summary details
		#| Header_Summary_Master_Customer_Set   | Header_Summary_Condition_ID     | Header_Summary_Name     | Header_Summary_Status   |
		#| <Header_Summary_Master_Customer_Set> | <Header_Summary_Condition_ID>   | <Header_Summary_Name>   | <Header_Summary_Status> |
		#And verify the Condition Header details
		#| Header_Master_Customer_Set   | Header_Condition_ID     | Header_Name     | Header_Status   | Header_Type   |
		#| <Header_Master_Customer_Set> | <Header_Condition_ID>   | <Header_Name>   | <Header_Status> | <Header_Type> |
		#And verify the Condition Definition details
		#| View_Source   | View_Benefit_Customer_Set   | View_Condition_Description   |
		#| <View_Source> | <View_Benefit_Customer_Set> | <View_Condition_Description> |
		#And verify the Tags/Notes details
		#| Notes   | Tags   |
		#| <Notes> | <Tags> |        
		
		#Examples: 
		#| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Sub_Status     | Tags     | Tags_Add_Success_Message                 | Tags_Remove_Success_Message                           | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		#| QTP_Master_1        | Single | DRGCON15     |      | Do Not Use Anymore |        |       |                      |      | Not Associated | Add^Tag1 | Tag successfully added to the condition. | Tag(s) successfully removed from the search criteria. |           |                   | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Wildcard search using Condition ID and View DrugList Condition 
	Given User perform Advanced Search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Sub_Status | Tags | Tags_Add_Success_Message | Tags_Remove_Success_Message | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single | *CON*        |      | Do Not Use Anymore |        |       |                      |      |            |      |                          |                             | View      | CDDRGCON15        | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
Scenario Outline: Wildcard search using Condition Name and View DrugList Condition 
	Given User perform Advanced Search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   | Sub_Status   | Tags   | Tags_Add_Success_Message   | Tags_Remove_Success_Message   | Operation   | View_Condition_ID   | 
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> | <Sub_Status> | <Tags> | <Tags_Add_Success_Message> | <Tags_Remove_Success_Message> | <Operation> | <View_Condition_ID> |
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
		| Master_Customer_Set | Type   | Condition_ID | Name        | Status             | Source | Field | Benefit_Customer_Set | List | Sub_Status | Tags | Tags_Add_Success_Message | Tags_Remove_Success_Message | Operation | View_Condition_ID | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name         | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID      | Header_Name                 | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description                 | Notes                      | Tags          |
		| QTP_Master_1        | Single |              | *Condition* | Do Not Use Anymore |        |       |                      |      |            |      |                          |                             | View      | CDDRGCON15        | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCON15    | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCON15 | Name:^Drug List Condition15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is not included in drug list FLTPDLI9 | Single Drug List Condition | Tag Name^tag1 |
		
		
Scenario Outline: Copy Single DrugList Condition 
	Given User search for the existing condition with the following details 
		| Master_Customer_Set   | Type   | Condition_ID   | Name   | Status   | Source   | Field   | Benefit_Customer_Set   | List   |  
		| <Master_Customer_Set> | <Type> | <Condition_ID> | <Name> | <Status> | <Source> | <Field> | <Benefit_Customer_Set> | <List> |
	And verify the Condition Header tab and click on Copy button 
	When he submits the following details in Copy a Condition window 
		| Copy_Condition_ID   | Copy_Name   | Copy_Status   | Copy_TrackingID   | Copy_Reason   | Copy_Notes   |
		| <Copy_Condition_ID> | <Copy_Name> | <Copy_Status> | <Copy_TrackingID> | <Copy_Reason> | <Copy_Notes> |
	Then verify the Condition Copy Success message at the top of the page 
		| Condition_Copy_Success_Message   |
		| <Condition_Copy_Success_Message> |
		
	Examples: 
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Copy_Condition_ID | Copy_Name                 | Copy_Status        | Copy_TrackingID | Copy_Reason | Copy_Notes | Condition_Copy_Success_Message         |
		| QTP_Master_1        | Single | DRGCON15      |      | Do Not Use Anymore |        |       |                      |      | DRGCPY15           | Drug List Condition Copy15 | Do Not Use Anymore | Test TrackingID |             |            | The condition was successfully copied. |
		
Scenario Outline: View the Copied Single DrugList Condition 
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Header_Summary_Master_Customer_Set | Header_Summary_Condition_ID | Header_Summary_Name             | Header_Summary_Status      | Header_Master_Customer_Set        | Header_Condition_ID     | Header_Name                     | Header_Status              | Header_Type  | View_Source       | View_Benefit_Customer_Set          | View_Condition_Description             | Notes                      | Tags          |
		| QTP_Master_1        | Single | DRGCPY15      |      | Do Not Use Anymore |        |       |                      |      | Master customer set:^QTP_Master_1  | Condition ID:^CDDRGCPY15     | Name:^Drug List Condition Copy15 | Status:^Do Not Use Anymore | Master customer set:^QTP_Master_1 | Condition ID:^CDDRGCPY15 | Name:^Drug List Condition Copy15 | Status:^Do Not Use Anymore | Type:^Single | Source:^Drug List | Benefit customer set:^QTP_Benefits | Drug is included in drug list FLTPDLI6 | Single Drug List Condition | Tag Name^tag1 |
		
		
		
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
		| Master_Customer_Set | Type   | Condition_ID | Name | Status             | Source | Field | Benefit_Customer_Set | List | Update_Tracking_ID | Update_Reason | Update_Notes | Update_Name | Update_Status | Condition_Update_Success_Message      | Delete_Tracking_ID | Delete_Reason | Delete_Notes | Condition_Delete_Success_Message        |
		| QTP_Master_1        | Single | DRGCON15     |      | Do Not Use Anymore |        |       |                      |      | Update Tracking ID |               |              |             | Not Ready     | The condition was successfully saved. | Delete Tracking ID | Delete Reason | Delete Notes | The condition was successfully deleted. |
		| QTP_Master_1        | Single | DRGCPY15      |      | Do Not Use Anymore |        |       |                      |      | Update Tracking ID |               |              |             | Not Ready     | The condition was successfully saved. | Delete Tracking ID | Delete Reason | Delete Notes | The condition was successfully deleted. |
		
