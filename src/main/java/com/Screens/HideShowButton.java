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

public class HideShowButton extends BaseClass{
	
	//define logger information
	
	static Logger logger= LogManager.getLogger(HideShowButton.class);	
	
	public HideShowButton(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
     
	//locators and screens for hide show button
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	 public MobileElement HomePageTitle;
	
	public void HomeTitle() { 
		String title = HomePageTitle.getText();
		Assert.assertEquals(title, "API Demos");
	}

	

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
	 public MobileElement clickAnimation;
	
	public void Animation() {               
		clickAnimation.click();
		logger.info("user is in homepage and click in the Animation");
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")
	public MobileElement clickHideShowButton;
	
	public void HideShow() {
		clickHideShowButton.click();
		logger.info("user click in the hide-show button");
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/hideGoneCB")
	public MobileElement checkHide;
	
	public void HideCheckBox() {
		checkHide.click();
		logger.info("user click in the hide checkbox");
		
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement AnimationPageTitle;
	
	public void AnimationTitle() {
		String title = AnimationPageTitle.getText();
		Assert.assertEquals(title, "Animation/Hide-Show Animations");
	}
	
	
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
	public MobileElement clickButton2;
	
	public void Button2() {
		clickButton2.click();
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
	public MobileElement clickButton3;
	
	public void Button3() {
		clickButton3.click();
	}
	
	@AndroidFindBy(id="io.appium.android.apis:id/addNewButton")
	public MobileElement clickShowButton;
	
	public void ShowButton() {
		clickShowButton.click();
	}

	
	
	
	
	
	
	
	

}
