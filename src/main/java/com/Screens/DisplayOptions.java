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

public class DisplayOptions extends BaseClass {
	
	static Logger logger= LogManager.getLogger(DisplayOptions.class);
	
	public DisplayOptions(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	 public MobileElement HomePageTitle;
	
	public void HomeTitle() { 
		String title = HomePageTitle.getText();
		Assert.assertEquals(title, "API Demos");
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
	 public MobileElement clickApp;
	
	public void App() {               
		clickApp.click(); 
		logger.info("user click in the app of the homepage");
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Action Bar\"]")
	 public MobileElement clickActionBar;
	
	public void ActionBar() {               
		clickActionBar.click(); 
		logger.info("user click in the action bar");
		takeScreenShot();
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Display Options\"]")
	 public MobileElement clickDisplayOption;
	
	public void DisplayOption() {               
		clickDisplayOption.click(); 
		logger.info("user click in the display option");
		
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	 public MobileElement displayOptionPageTitle;
	
	public void DisplayOptionTitle() {               
		String title = displayOptionPageTitle.getText();
		Assert.assertEquals(title, "App/Action Bar/Display Options");
		takeScreenShot();
	}
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"DISPLAY_SHOW_TITLE\"]")
	 public MobileElement clickShowTitle;
	
	public void ShowTitle() {               
		clickShowTitle.click(); 
		logger.info("user is in the show title page");
	}
	
	
	
	
	
	

}
