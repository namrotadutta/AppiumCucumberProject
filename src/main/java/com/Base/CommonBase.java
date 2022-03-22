package com.Base;


//import org.openqa.selenium.Dimension;


//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;



import org.openqa.selenium.Dimension;


public class CommonBase {
	
	public static AppiumDriver<MobileElement>driver;
	
	//public static String screenshotdir = System.getProperty("user.dir") + "/test-output/screenshots"; 
	
	
	public void verticalswipebypercentage( double startpercentage,
			double endpercentage, double anchorpercentage) throws Throwable { 
		    Dimension size = driver.manage().window().getSize();
			int anchor = (int) (size.width * anchorpercentage);
			int startpoint = (int) (size.height * startpercentage);
			int endpoint = (int) (size.height * endpercentage);
			new TouchAction(driver).press(point(anchor, startpoint)).waitAction(waitOptions(ofMillis(1000)))
			.moveTo(point(anchor, endpoint)).release().perform();
	}
	
	
	

	
	
}
