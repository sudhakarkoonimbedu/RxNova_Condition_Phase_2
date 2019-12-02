package com.project.teststeps;

import com.project.actors.ActorConditionViewTagsNotesPage;
import com.project.common.util.RxNovaCommonUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ConditionViewTagsNotesSteps {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionViewTagsNotesPage actorOnConditionViewTagsNotesPage;
	
	
	@And("^verify the Tags/Notes details$")
	public void verifyNotesData(DataTable conditionTagsNotesData) throws Throwable {
		actorOnConditionViewTagsNotesPage.verifyNotesAndTags(conditionTagsNotesData);
	}
}
