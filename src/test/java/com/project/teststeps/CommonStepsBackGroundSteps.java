package com.project.teststeps;

import com.project.actors.ActorLaunchPage;
import com.project.actors.ActorRegionSelectionPage;
import com.project.actors.ActorConditionsHomePage;
import com.project.actors.ActorConditionsDetailsPage;
import com.project.common.util.RxNovaCommonUtil;

import cucumber.api.DataTable;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import net.thucydides.core.annotations.Steps;


public class CommonStepsBackGroundSteps {

	@Steps
	ActorLaunchPage actorOnLaunchPage;
	@Steps
	ActorRegionSelectionPage actorOnRegionSelectionPage;
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	@Steps
	ActorConditionsHomePage actorOnConditionsPage;
	@Steps
	ActorConditionsDetailsPage actorOnConditionsDetailsPage;
	
	
	@Given("^User opens the browser and goes to RxNova URL$")	
	public void navigateToRxNovaApplication() throws InterruptedException {
		actorOnLaunchPage.launch_application();
	}
	
	@When("^They enter valid username, valid password and click on Login$")	
	public void login() throws InterruptedException	{
		actorOnLaunchPage.perform_login();
	}
		
	@Then("^They check whether the application displays the Environment selection screen$")
	public void verifyUserLogin() throws Throwable {
		actorOnRegionSelectionPage.verify_landing_page_details();	 	
	}
	
	@And("^They select Region and check whether the Landing Page is displayed$")
	public void regionSelection() throws Throwable {		
		actorOnRegionSelectionPage.select_application_region();	
	}
	
	@Then("^User navigates from Landing page to \"(.*)\" application$")
	public void navigateToApplication(String strApplication) throws Throwable{
		rxNovaCommonUtil.navigateApplication(strApplication);
	}
	
	@Then("^User enters the following data into Condition Home Search Panel and presses \"(.*)\"$")
	public void searchingForConditiontoDelete(String ObjKey, DataTable data) throws InterruptedException {
		actorOnConditionsPage.searchingForConditiontoDelete(ObjKey, data);
	}
	
	@Then("They enter the following tracking id \"(.*)\" and press \"(.*)\"")
	public void enteringTrackingIDforConditionDeletion(String ID, String ObjKey) throws InterruptedException, Throwable {
		actorOnConditionsDetailsPage.enteringTrackingIDforConditionDeletion(ID, ObjKey);
	}
	
//	@Then("^User deletes Condition$") 
//	public void userDeletesCondition() throws Throwable {
//		actorOnConditionsDetailsPage.userDeletesCondition();
//	}
}
