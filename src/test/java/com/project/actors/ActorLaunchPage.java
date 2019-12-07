package com.project.actors;

import com.project.common.util.RxNovaCommonUtil;
import com.project.pages.LaunchPage;
import com.psqframework.core.util.BaseStepListener;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorLaunchPage {
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtils;
	
	LaunchPage launchPage;
		
	@Step	
	public void launch_application() {
	    if(BaseStepListener.isLaunched==true) {
		    return;	
	    }
	    rxNovaCommonUtils.navigateToRxNovaApplication();
	}
	
	@Step
	public void perform_login() throws InterruptedException {
	    if(BaseStepListener.isLoggedIn==true) {
	    	    return;
	    }
	    launchPage.performLogin();
	}	

}
