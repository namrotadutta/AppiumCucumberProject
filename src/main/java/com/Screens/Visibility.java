package com.Screens;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Visibility extends BaseClass {

	//define logger information
	
		static Logger logger= LogManager.getLogger(Visibility.class);
		
		public Visibility(AppiumDriver<MobileElement> driver) {
			super(driver);
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
		 public MobileElement clickApp;
		
		public void App() {               
			clickApp.click(); 
			logger.info("user is in homepage and click in the app");
		}
	
}
