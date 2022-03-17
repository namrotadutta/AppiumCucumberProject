package com.stepDefinitions;

import com.Base.CommonBase;
import com.Screens.DisplayOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DisplayOptionsSteps extends CommonBase{
	
	DisplayOptions display = new DisplayOptions(driver);
	
   
	
	@When("^user click on the app$")
	public void user_click_on_the_app() {
		display.HomeTitle();
		display.App();
	}

	@And("^user click on the action bar$")
	public void user_click_on_the_action_bar() {
		display.ActionBar();
	}

	@And("^after that user click in the display options$")
	public void after_that_user_click_in_the_display_options() {
		display.DisplayOption();
		display.DisplayOptionTitle();
	}

	@Then("^user is in new page and click in the display show title$")
	public void user_is_in_new_page_and_click_in_the_display_show_title() {
	    display.ShowTitle();	
	}
}
