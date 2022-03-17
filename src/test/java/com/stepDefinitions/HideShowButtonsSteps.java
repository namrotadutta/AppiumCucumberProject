package com.stepDefinitions;

import com.Base.CommonBase;
import com.Screens.HideShowButton;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HideShowButtonsSteps extends CommonBase {
	
	
	HideShowButton hide = new HideShowButton(driver);
	
	
	@Given("^user is in the homepage$")
	public void user_is_in_the_homepage()  {
		//assertion for page title  
		hide.HomeTitle();
	}
	
	//Steps for hidebuttons
	
	@When("^user click on the animation button$")
	public void user_click_on_the_animation_button() {
		
	    hide.Animation();
	}

	@And("^after that user click on the hide-show animation$")
	public void after_that_user_click_on_the_hide_show_animation() {
	    hide.HideShow();
	    
	    //assertion for page title
	    hide.AnimationTitle();
	}

	@And("^user click on the hide check box$")
	public void user_click_on_the_hide_check_box()  {
	    hide.HideCheckBox();
	}

	@Then("^click on the numbers to hide them$")
	public void click_on_the_numbers_to_hide_them() {
		 
		hide.Button2();
		hide.Button3();
		 
	    
	}
	
	
	//Steps for showbuttons
	
	@When("^user click the animation$")
	public void user_click_the_animation(){
	   hide.Animation();
	}

	@When("^after that click hideshow$")
	public void after_that_click_hideshow()  {
	    hide.HideShow();
	}

	
	@And("^user click on the numbers to hide them$")
	public void user_click_on_the_numbers_to_hide_them()  {
		hide.Button2();
		hide.Button3();
	}

	@And("^user then click on showbuttons$")
	public void user_then_click_on_showbuttons()  {
	    hide.ShowButton();
	 
	}

	@Then("^it will display all the buttons again$")
	public void it_will_display_all_the_buttons_again() {
	   
		
	}


}
