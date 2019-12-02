package com.project.pages;

import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Conditions.ConditionsViewTagsNotesPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ConditionViewTagsNotesPage extends BasePage {

	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;

	@FindBy(xpath = ConditionsViewTagsNotesPage.VIEW_TAGSNOTES_NOTES )
	private BaseElement VIEW_TAGSNOTES_NOTES ;
	
	@FindBy(xpath = ConditionsViewTagsNotesPage.VIEW_TAGSNOTES_TAGS)
	private BaseElement VIEW_TAGSNOTES_TAGS;
	

	public boolean verifyNotes(String strNotes) throws Throwable{		
		Boolean match = false;
		if(!strNotes.isEmpty()) {
			if (VIEW_TAGSNOTES_NOTES.isDisplayed())
			{
				match = rxNovaCommonUtil.objectContainsExpectedText(VIEW_TAGSNOTES_NOTES,strNotes);
			}		
	    }
		else {
			match = true;
		}
	
	return match;
}
	
	public boolean verifyTags(String strTags) throws Throwable{
		Boolean match = false;
		if(!strTags.isEmpty()) {
			match = rxNovaCommonUtil.webTable_VerifyCellData(VIEW_TAGSNOTES_TAGS,strTags);
		}
		else {
			match = true;
		}
		return match;
	}		
}
