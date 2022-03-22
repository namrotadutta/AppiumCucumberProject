package com.Runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Utils.AppiumServer;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= "src/test/java/com/Feature",
		glue= {"com.stepDefinitions","HooksFile"},
		tags= {"@test1,@test2,@test3,@test4,@test5"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/html/ExtentReport.html"},
		monochrome=true,
		dryRun = false 
		)

@Test
public class Runner extends AbstractTestNGCucumberTests {
	
	//executed before all the other test methods.
	@BeforeSuite
	public void setup() {
		AppiumServer.startAppium();
	}
	
	//used to stop the Appium drivers.
	@AfterSuite
	public void tearDown() {
		AppiumServer.closeAppium();
	}

	//executed after all the test methods of a current class have been invoked.
	@AfterClass
	public static void SETUP()
	{
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	}
}
