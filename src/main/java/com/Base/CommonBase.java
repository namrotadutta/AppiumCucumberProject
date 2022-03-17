package com.Base;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CommonBase {
	
	public static AppiumDriver<MobileElement>driver;
	
	public static String screenshotdir = System.getProperty("user.dir") + "/test-output/screenshots"; 
	
}
