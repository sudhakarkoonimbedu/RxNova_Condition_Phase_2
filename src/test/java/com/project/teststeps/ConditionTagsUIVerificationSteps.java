package com.project.teststeps;

import com.project.actors.ActorConditionTagsNotesPage;

import com.project.common.util.RxNovaCommonUtil;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ConditionTagsUIVerificationSteps {
	@Steps
	ActorConditionTagsNotesPage actorOnConditionsTagsNotesPage;
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Then("^They verify that \"(.*)\" is displayed$")
	public void objectIsDisplayed(String ObjKey) throws InterruptedException {
	    rxNovaCommonUtil.objectIsDisplayed(ObjKey);
	}
	
	@Then("^They verify whether \"(.*)\" displays \"(.*)\"$")
	public void checkCurrentFieldDisplay(String ObjKey, String expectedDisplay) {
	    rxNovaCommonUtil.objectContainsExpectedText(ObjKey, expectedDisplay);
	}
	
	@Then("^They determine whether \"(.*)\" is disabled$")
	public void objectIsDisabled(String ObjKey) {
	    rxNovaCommonUtil.objectIsDisabled(ObjKey);
	}
}
