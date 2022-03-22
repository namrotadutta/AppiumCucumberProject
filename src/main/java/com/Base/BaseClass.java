package com.Base;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	
public static AppiumDriver<MobileElement>driver;




	//initialize driver
	public BaseClass( AppiumDriver<MobileElement>driver) {
		BaseClass.driver=driver;
	}
	

	
	 }

