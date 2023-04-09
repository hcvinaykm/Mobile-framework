package Apphooks;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.Baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Utilities.takeScreenshot;

public class Applicationhooks extends Baseclass {
	
	private static takeScreenshot takescreenshot = new takeScreenshot();

	@SuppressWarnings("deprecation")
	@Before
	public void setUp(Scenario scenario) {
		scenario.write("Platform name :iOS");
		scenario.write("Device name : iPhone");
		System.out.println("Started");
		getDriver();		
	}

	@After(order = 0)
	public void teardown() {
		System.out.println("TestDone");
		driver.closeApp();
		//driver.quit();
		//driver.resetApp();	   
	}

	@After(order = 1)
	public void failedScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {	
		 	String screenshotName = scenario.getName().replaceAll(" ", "_");
			final byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);			
			scenario.attach(sourcePath, "image/png", screenshotName);
	         
		} 
	else {
			System.out.println("PASSED");
		}
   }
}
