package com.project.locators;

public class Conditions {

	public class CondtionsHomePage {
		public final static String CONDITION_HOME = ".//a/em[text()='Condition Home']";
		public final static String CONDITION_NEW_BUTTON = ".//span[text()='New']";
		public final static String CONDITION_HOME_MASTER_CUISTOMER_SET_LIST = "condition_form:condition_masterCustormerSet";
		public final static String CONDITION_HOME_TYPE_LIST = ".//*[@id='condition_form:condition_search_criteria']//td[contains(text(),'Type')]/following-sibling::td/select";
		public final static String CONDITION_HOME_CONDITION_ID_EDIT = "condition_form:condition_id";
		public final static String CONDITION_HOME_NAME_EDIT = "condition_form:condition_name";
		public final static String CONDITION_HOME_STATUS_LIST = ".//*[@id='condition_form:condition_search_criteria']//td[contains(text(),'Status')]/following-sibling::td/select";
		public final static String CONDITION_HOME_SOURCE_LIST = "condition_form:condition_source";
		public final static String CONDITION_HOME_FIELD_EDIT = "condition_form:condition_field_input";
		public final static String CONDITION_HOME_BENEFIT_CUSTOMER_SET_LIST = "condition_form:benefitCustomerSet";
		public final static String CONDITION_HOME_LIST_EDIT = "condition_form:search_condition_list_input";
		public final static String CONDITION_HOME_ADVANCEDSEARCH_LINK = "Advanced Search";
		public final static String CONDITION_HOME_SUBSTATUS_LIST = "condition_form:subStatus";
		public final static String CONDITION_HOME_TAGS_EDIT = "condition_form:condition_tag_input";
		public final static String CONDITION_HOME_TAGS_TABLE = "condition_form:tags_table";
		public final static String CONDITION_HOME_TAGS_SUCCESS_MESSAGE = ".//form[@id='success_message_form']//img/parent::div";
		public final static String CONDITION_HOME_SEARCH_BUTTON = "condition_form:search_button";
		public final static String CONDITION_HOME_RESET_BUTTON = "condition_form:search_button";
		public final static String CONDITION_HOME_ERROR_MESSAGE = "//*[@class='ui-message-error-detail' and contains(text(),'One or more errors were encountered')]";		
		public final static String CONDITION_HOME_RESULTS_TABLE = "//*[@id='condition_result_form:result_data_table']/table/tbody";
	}

	public class ConditionsHeaderPage {
		public final static String ADD_HEADER_TRACKING_ID_EDIT = "condition_form:header_tracking_id";
		public final static String ADD_HEADER_REASON_EDIT = "condition_form:tracking_reason";
		public final static String ADD_HEADER_NOTES_EDIT = "condition_form:tracking_notes";
		public final static String ADD_HEADER_MASTER_CUISTOMER_SET_LIST = "condition_form:condition_master_customer_set";
		public final static String ADD_HEADER_CONDITION_ID_EDIT = "condition_form:condition_id";
		public final static String ADD_HEADER_NAME_EDIT = "condition_form:condition_name";
		public final static String ADD_HEADER_STATUS_LIST = "condition_form:condition_status";
		public final static String ADD_HEADER_TYPE_LIST = "condition_form:condition_type";		
		public final static String ADD_HEADER_NEXT_BUTTON = "condition_form:header_next_button";
		public final static String ADD_HEADER_CANCEL_BUTTON = "condition_form:condition_cancel_button";
	}
	
	public class CondtionsSingleDetailPage {
		public final static String ADD_DETAILS_SOURCE_LIST = "condition_form:source";
		public final static String ADD_DETAILS_FIELD_NAME_EDIT = "condition_form:field_name_input";
		public final static String ADD_DETAILS_FIELD_OPERATOR_LIST = "condition_form:operator";
		public final static String ADD_DETAILS_FIELD_VALUE_EDIT = "condition_form:field_value";
		public final static String ADD_DETAILS_BENEFIT_CUSTOMER_SET_LIST = "condition_form:benefitCustomerSet";
		public final static String ADD_DETAILS_OPERATOR_LIST = "condition_form:operator_for_list";
		public final static String ADD_DETAILS_VALUE_EDIT = "condition_form:list_name_input";
		public final static String ADD_DETAILS_TOP_PREVIOUS_BUTTON = ".(//span[text()='Previous'])[1]";
		public final static String ADD_DETAILS_TOP_NEXT_BUTTON = "condition_form:single_detail_next_button_top";
		public final static String ADD_DETAILS_TOP_CANCEL_BUTTON = "condition_form:single_condition_cancel_top_button";
		public final static String ADD_DETAILS_BOTTOM_PREVIOUS_BUTTON = ".(//span[text()='Previous'])[2]";
		public final static String ADD_DETAILS_BOTTOM_NEXT_BUTTON = "condition_form:single_detail_next_button_bottom";
		public final static String ADD_DETAILS_BOTTOM_CANCEL_BUTTON = "condition_form:single_condition_cancel_bottom_button";
 
	}
	
	public class CondtionsCompoundDetailPage {
		public final static String ADD_DETAILS_COMPOUND_OPERATOR_LIST = "condition_form:compoundOperator";
		public final static String ADD_DETAILS_CONDITION_ID_EDIT = "condition_form:add_id_input";
		public final static String ADD_DETAILS_COMPOUND_TABLE = "condition_form:child_condition_table";
		public final static String ADD_DETAILS_TOP_PREVIOUS_BUTTON = ".(//span[text()='Previous'])[1]";
		public final static String ADD_DETAILS_TOP_NEXT_BUTTON = "condition_form:compound_detail_next_button_top";
		public final static String ADD_DETAILS_TOP_CANCEL_BUTTON = "condition_form:compound_condition_cancel_top_button";
		public final static String ADD_DETAILS_BOTTOM_PREVIOUS_BUTTON = ".(//span[text()='Previous'])[2]";
		public final static String ADD_DETAILS_BOTTOM_NEXT_BUTTON = "condition_form:compound_detail_next_button_bottom";
		public final static String ADD_DETAILS_BOTTOM_CANCEL_BUTTON = "condition_form:compound_condition_cancel_bottom_button";
 
	}
	
	public class CondtionsTagsNotesPage {
		public final static String ADD_TAGSNOTES_NOTES_EDIT = "condition_form:condition_notes";
		public final static String ADD_TAGSNOTES_TAGS_EDIT = "condition_form:add_tag_input";
		public final static String ADD_TAGSNOTES_TAGS_TABLE = "condition_form:tags_table";
		public final static String ADD_TAGSNOTES_TAGS_ADD_BUTTON = "condition_form:add_tag_button";
		public final static String ADD_TAGSNOTES_TAGS_SUCCESS_MESSAGE = ".//form[@id='success_message_form']//img/parent::div";  //".//form[@id='success_message_form']//div[text()='Tag successfully added to the condition.']";
		public final static String ADD_TAGSNOTES_TAGS_REMOVESELECTED_BUTTON = "condition_form:remove_select_tag_button";
		public final static String ADD_TAGSNOTES_PREVIOUS_BUTTON = ".//span[text()='Previous']";
		public final static String ADD_TAGSNOTES_SAVE_BUTTON = ".//span[text()='Save']";
		public final static String ADD_TAGSNOTES_CANCEL_BUTTON = "condition_form:condition_tag_cancel_button";
		public final static String ADD_SUCCESS_MESSAGE = ".//form[@id='success_message_form']//img/parent::div";    //"//form[@id='success_message_form']//div[text()='The condition was successfully added.']";
	}
	
	public class ConditionsUpdateHeaderPage {
		public final static String CONDITION_HEADER_LINK = "Header";
		public final static String UPDATE_HEADER_MAKEUPDATES_BUTTON = ".//span[text()='Make Updates']";
		public final static String UPDATE_HEADER_REPORT_BUTTON = ".//span[text()='Report']";
		public final static String UPDATE_HEADER_COPY_BUTTON = "(.//span[text()='Copy'])[1]";
		public final static String UPDATE_HEADER_DELETE_BUTTON = "(.//span[text()='Delete'])[1]";		
		public final static String UPDATE_HEADER_TRACKING_ID_EDIT = "condition_form:header_tracking_id";
		public final static String UPDATE_HEADER_REASON_EDIT = "condition_form:tracking_reason";
		public final static String UPDATE_HEADER_NOTES_EDIT = "condition_form:tracking_notes";
		public final static String UPDATE_HEADER_NAME_EDIT = "condition_form:condition_name";
		public final static String UPDATE_HEADER_STATUS_LIST = "condition_form:condition_status";
		public final static String UPDATE_HEADER_SAVE_BUTTON = "condition_form:header_save_button";
		public final static String UPDATE_HEADER_CANCEL_BUTTON = "condition_form:headerCancelButton";
		public final static String UPDATE_SUCCESS_MESSAGE = ".//form[@id='success_message_form']//img/parent::div";    //"//form[@id='success_message_form']//div[text()='The condition was successfully saved.']";
	}
	
	public class CondtionsUpdateSingleDetailPage {
		public final static String CONDITION_DETAILS_LINK = "Details";
		public final static String UPDATE_DETAILS_MAKEUPDATES_BUTTON = "(.//span[text()='Make Updates'])[2]";
		public final static String UPDATE_DETAILS_TRACKING_ID_EDIT = "condition_form:detail_tracking_id";
		public final static String UPDATE_DETAILS_REASON_EDIT = "condition_form:detail_tracking_reason";
		public final static String UPDATE_DETAILS_NOTES_EDIT = "condition_form:detail_tracking_notes";
		public final static String UPDATE_DETAILS_FIELD_NAME_EDIT = "condition_form:field_name_input";
		public final static String UPDATE_DETAILS_FIELD_OPERATOR_LIST = "condition_form:operator";
		public final static String UPDATE_DETAILS_FIELD_VALUE_EDIT = "condition_form:field_value";
		public final static String UPDATE_DETAILS_OPERATOR_LIST = "condition_form:operator_for_list";
		public final static String UPDATE_DETAILS_VALUE_EDIT = "condition_form:list_name_input";
		public final static String UPDATE_DETAILS_TOP_SAVE_BUTTON = "condition_form:detail_single_save_button_top";
		public final static String UPDATE_DETAILS_TOP_CANCEL_BUTTON = "condition_form:detail_single_cancel_button_top";
		public final static String UPDATE_DETAILS_BOTTOM_SAVE_BUTTON = "condition_form:detail_single_save_button_bottom'";
		public final static String UPDATE_DETAILS_BOTTOM_CANCEL_BUTTON = "condition_form:detail_single_cancel_button_bottom"; 
	}
	
	public class CondtionsUpdateCompoundDetailPage {
		public final static String CONDITION_DETAILS_LINK = "Details";
		public final static String UPDATE_DETAILS_MAKEUPDATES_BUTTON = "(.//span[text()='Make Updates'])[2]";
		public final static String UPDATE_DETAILS_TRACKING_ID_EDIT = "condition_form:detail_compound_tracking_id";
		public final static String UPDATE_DETAILS_REASON_EDIT = "condition_form:tracking_reason_compound";
		public final static String UPDATE_DETAILS_NOTES_EDIT = "condition_form:tracking_notes_compund";
		public final static String UPDATE_DETAILS_COMPOUND_OPERATOR_LIST = "condition_form:compoundOperator";
		public final static String UPDATE_DETAILS_CONDITION_ID_EDIT = "condition_form:add_id_input";
		public final static String UPDATE_DETAILS_COMPOUND_TABLE = "condition_form:child_condition_table";
		public final static String UPDATE_DETAILS_TOP_SAVE_BUTTON = "condition_form:detail_compound_save_button_top";
		public final static String UPDATE_DETAILS_TOP_CANCEL_BUTTON = "condition_form:detail_compound_cancel_button_top";
		public final static String UPDATE_DETAILS_BOTTOM_SAVE_BUTTON = "condition_form:detail_compound_save_button_bottom'";
		public final static String UPDATE_DETAILS_BOTTOM_CANCEL_BUTTON = "condition_form:detail_compound_cancel_button_bottom"; 
	}
	
	public class CondtionsUpdateTagsNotesPage {
		public final static String CONDITION_TAGSNOTES_LINK = "Tags/Notes";
		public final static String CONDITION_TAGSNOTES_NOTES_TEXT = ".//*[@class='ui-fieldset-legend ui-corner-all ui-state-default' and text()='Notes']";
		public final static String UPDATE_TAGSNOTES_MAKEUPDATES_BUTTON = "(.//span[text()='Make Updates'])[2]";
		public final static String UPDATE_TAGSNOTES_TRACKING_ID_EDIT = "condition_form:tag_notes_tracking_id";
		public final static String UPDATE_TAGSNOTES_REASON_EDIT = "condition_form:tag_notes_reason";
		public final static String UPDATE_TAGSNOTES_NOTES_EDIT = "condition_form:tag_notes_notes";
		public final static String UPDATE_TAGSNOTES_EDIT = "condition_form:condition_notes";
		public final static String UPDATE_TAGSNOTES_TAGS_EDIT = "condition_form:add_tag_input";
		public final static String UPDATE_TAGSNOTES_TAGS_TABLE = "condition_form:tags_table";
		public final static String UPDATE_TAGSNOTES_TAGS_ADD_BUTTON = "condition_form:add_tag_button";
		public final static String UPDATE_TAGSNOTES_TAGS_SUCCESS_MESSAGE = ".//form[@id='success_message_form']//img/parent::div";  //".//form[@id='success_message_form']//div[text()='Tag successfully added to the condition.']";
		public final static String UPDATE_TAGSNOTES_TAGS_REMOVESELECTED_BUTTON = "condition_form:remove_select_tag_button";
		public final static String UPDATE_TAGSNOTES_SAVE_BUTTON = "condition_form:tags_notes_save_button";
		public final static String UPDATE_TAGSNOTES_CANCEL_BUTTON = "condition_form:tags_notes_cancel_button"; 
	}
	
	public class ConditionsViewHeaderPage {
		public final static String VIEW_HEADER_SUMMARY_TABLE = "condition_form:condition_summary";
		public final static String VIEW_HEADER_TABLE = ".//*[@class='left']";
	}
	
	public class ConditionsViewSingleDetailsPage {
		public final static String VIEW_DETAILS_SOURCE = ".//*[text()='Condition Definition']/following-sibling::div//table[1]";
		public final static String VIEW_DETAILS_BCS = ".//*[text()='Condition Definition']/following-sibling::div//table[2]";
		public final static String VIEW_DETAILS_DESCRIPTION = "condition_form:single_condition_description";
	}
	
	public class ConditionsViewCompoundDetailsPage {
		public final static String VIEW_DETAILS_COMPOUND_OPERATOR_TABLE = ".//*[contains(text(),'Condition Definition')]//following::table[1]";
		public final static String VIEW_DETAILS_COMPOUND_TABLE = ".//*[contains(text(),'Conditions Included In Compound')]//following::table[1]";		
		public final static String VIEW_DETAILS_DESCRIPTION1 = ".//*[@class='cdDescriptionContent']";
		public final static String VIEW_DETAILS_DESCRIPTION2 = "(//*[contains(@id,'ygtvcontent')])[1]";
		public final static String VIEW_DETAILS_EXPAND_ICON = ".//*[@class='ygtvcell ygtvlp']";
		public final static String VIEW_DETAILS_CONDITION_DETAILS = "//*[contains(@id,'ygtvtableel')]/following::*[@class='ygtvchildren']";
	}
	
	public class ConditionsViewTagsNotesPage {
		public final static String VIEW_TAGSNOTES_NOTES = ".//*[text()='Notes']//following-sibling::div/textarea[2]";
		public final static String VIEW_TAGSNOTES_TAGS = ".//*[@id='condition_form:tag_browse_table']";
	}
	
	public class ConditionsCopyPage {
		public final static String CONDITION_COPY_WINDOW = ".//*[@class='ui-dialog-title' and text()='Copy a Condition']";
		public final static String COPY_CONDITION_ID_EDIT = "condition_copy_form:condition_id";
		public final static String COPY_NAME_EDIT = "condition_copy_form:condition_name";
		public final static String COPY_STATUS_LIST = "condition_copy_form:copy_status";
		public final static String COPY_TRACKING_ID_EDIT = "condition_copy_form:tracking_id";
		public final static String COPY_REASON_EDIT = "condition_copy_form:copy_reason";
		public final static String COPY_NOTES_EDIT = "condition_copy_form:copy_notes";
		public final static String COPY_BUTTON = "condition_copy_form:condition_copy_save_button";
		public final static String COPY_CANCEL_BUTTON = "condition_copy_form:condition_copy_cancel_button";
		public final static String COPY_SUCCESS_MESSAGE = ".//form[@id='success_message_form']//img/parent::div";
	}
	
	public class ConditionsDeletePage {
		public final static String CONDITION_DELETE_WINDOW = ".//*[@class='ui-dialog-title' and text()='Delete a Condition']";
		public final static String DELETE_TRACKING_ID_EDIT = "condition_delete_form:delete_tracking_id";
		public final static String DELETE_REASON_EDIT = "condition_delete_form:tracking_reason_delete";
		public final static String DELETE_NOTES_EDIT = "condition_delete_form:tracking_notes_delete";
		public final static String DELETE_BUTTON = "(.//span[text()='Delete'])[2]";
		public final static String DELETE_CANCEL_BUTTON = "condition_delete_form:condition_delete_cancel_button";
		public final static String DELETE_SUCCESS_MESSAGE = ".//form[@id='success_message_form']//img/parent::div";    //".//form[@id='success_message_form']//div[text()='The condition was successfully deleted.']";
	}
}
