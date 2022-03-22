package com.stepDefinitions;

import com.Base.CommonBase;
import com.Screens.ContentScreen;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContentSteps extends CommonBase{
	
	ContentScreen con = new ContentScreen(driver);
	


@When("^user click in the content$")
public void user_click_in_the_content() {
	con.Content();
	
}

@And("^after that user click in the assets$")
public void after_that_user_click_in_the_assets() {
	con.Assets();
}

@And("^after that user click in the read asset$")
public void after_that_user_click_in_the_read_asset() {
	con.ReadAssets();
}

@Then("^user see the text of that page$")
public void user_see_the_text_of_that_page() {
	con. ReadAssetTitle();
}

}
