package com.Base;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	
public static AppiumDriver<MobileElement>driver;

String destDir;
DateFormat dateFormat;


	
	public BaseClass( AppiumDriver<MobileElement>driver) {
		BaseClass.driver=driver;
	}
	

	 public void takeScreenShot() {
	  // Set folder name to store screenshots.
	  destDir = "Screenshots";
	  // Capture screenshot.
	  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  // Set date format to set It as screenshot file name.
	  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
	  // Create folder under project with name "screenshots" provided to destDir.
	  new File(destDir).mkdirs();
	  // Set file name using current date time.
	  String destFile = dateFormat.format(new Date()) + ".png";

	  try {
	   // Copy paste file at destination folder location
	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	 }
}
