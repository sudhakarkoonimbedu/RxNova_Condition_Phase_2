package com.project.teststeps;

import com.project.actors.ActorLaunchPage;
import com.project.common.util.RxNovaCommonUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CommonBackGroundSteps {

	@Steps
	ActorLaunchPage actorOnLaunchPage;
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Given("^User opens the browser and goes to RxNova URL$")	
	public void NavigateToRxNovaApplication() throws InterruptedException {
		actorOnLaunchPage.launch_application();
	}
	
	@When("^enter valid username, valid password and click on Login button$")	
	public void Login() throws InterruptedException	{
		actorOnLaunchPage.perform_login();
	}		
	
	@Then("^navigates from Landing page to \\\"(.*)\\\" application$")
	public void NavigateToApplication(String strApplication) throws Throwable{
		rxNovaCommonUtil.NavigateApplication(strApplication);
	}
}
