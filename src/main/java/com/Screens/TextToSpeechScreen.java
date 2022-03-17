package com.Screens;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

public class TextToSpeechScreen extends BaseClass{
	
	static Logger logger= LogManager.getLogger(TextToSpeechScreen.class);
	
	public TextToSpeechScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
	 public MobileElement clickApp;
	
	public void App() {               
		clickApp.click(); 
		logger.info("user is in homepage and click in the app");
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Text-To-Speech\"]")
	 public MobileElement clickTextToSpeech;
	
	public void TextToSpeech() {               
		clickTextToSpeech.click(); 
		logger.info("user click in the text to speech ");
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/again_button")
	 public MobileElement clickAgain;
	
	public void Again() {               
		clickAgain.click();
		logger.info("user click again to hear speech again");
		takeScreenShot();
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	 public MobileElement TextTospeechPageTitle;
	
	public void TextToSpeechPage() {               
		String title = TextTospeechPageTitle.getText();
		Assert.assertEquals(title, "App/Text-To-Speech");  
		takeScreenShot();
	}
	
	
	
	
	
	

}
