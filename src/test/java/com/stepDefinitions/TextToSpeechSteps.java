package com.stepDefinitions;

import com.Base.CommonBase;
import com.Screens.TextToSpeechScreen;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TextToSpeechSteps extends CommonBase{
	
	TextToSpeechScreen textspeech = new TextToSpeechScreen(driver);
	
	@When("^user click the app$")
	public void user_click_the_app() {
		textspeech.App();
	}

	@When("^after that user click on text-to-speech$")
	public void after_that_user_click_on_text_to_speech() {
		textspeech.TextToSpeech();
	}

	@Then("^user can click on again to listen speech$")
	public void user_can_click_on_again_to_listen_speech() {
		textspeech.Again();
		textspeech.TextToSpeechPage();
	}



}
