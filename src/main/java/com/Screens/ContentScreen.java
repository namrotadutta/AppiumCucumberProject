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

public class ContentScreen extends BaseClass{
	
	//define logger information
	static Logger logger= LogManager.getLogger(ContentScreen.class);
	
	public ContentScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//locators and screen page for content button
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Content\"]")
	 public MobileElement clickContent;
	
	public void Content() {               
		clickContent.click(); 
		logger.info("user click in the content in the homepage");
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Assets\"]")
	 public MobileElement clickAssets;
	
	public void Assets() {               
		clickAssets.click(); 
		logger.info("user want to check assets");
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Read Asset\"]")
	 public MobileElement clickReadAssets;
	
	public void ReadAssets() {               
		clickReadAssets.click(); 
		logger.info("user click read assets to read asset");
		
	}

	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	 public MobileElement ReadAssetPageTitle;
	
	
	public void ReadAssetTitle() {               
		String title = ReadAssetPageTitle.getText();
		Assert.assertEquals(title, "Content/Assets/Read Asset"); 
		
		
		
		
	}


}
