package com.Utils;


import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class commonUtilities {
	
	public static AppiumDriver<MobileElement>driver;
	public static propertiesFile prop = new propertiesFile();
	public static URL ServerURL;
	
	
	
	
	public void setCapabilities() {
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
	
		capabilities.setCapability("platformVersion",prop.getProperty("platform.version"));
		capabilities.setCapability("deviceName",prop.getProperty("device.name"));
		capabilities.setCapability("platformName",prop.getProperty("platform.name"));
		capabilities.setCapability("appActivity",prop.getProperty("application.activity"));
		capabilities.setCapability("app",prop.getProperty("appliction.path"));
		capabilities.setCapability("appPackage", prop.getProperty("package.name"));
		capabilities.setCapability("isHeadless", true);
		capabilities.setCapability("avdArgs", "-no-window");
		
		
		try {
			ServerURL = new URL("http://0.0.0.0:4723/wd/hub");
			driver=new AndroidDriver<MobileElement>(ServerURL,capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//System.out.println("it's working");
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	
	
	

	public AppiumDriver<MobileElement> getAndroidDriver(){
		
		return driver;		
	}
	
	public static void stopAppium() {
		driver.quit();
	}

}
