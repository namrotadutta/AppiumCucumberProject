package com.Utils;



import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	
	
static AppiumDriverLocalService service;

	//appium server for start and close appium
	public static void startAppium() {
		try {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	  service=AppiumDriverLocalService.buildDefaultService();
      service.start();
	}
	

	public static void closeAppium() {
    	service.stop();
    }

}
