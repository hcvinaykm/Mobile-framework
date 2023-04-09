package BaseClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass {

	public static IOSDriver<?> driver;

	public static void getDriver() {
		try {

			DesiredCapabilities capabilities = new DesiredCapabilities();

		//	 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		//	 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.4");
		//	 capabilities.setCapability(MobileCapabilityType.UDID, "4e024c2d083effcb3750802705605268f53c41ad");
		//	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME , "Admin's iPhone");
		//	 URL url = new URL("http://0.0.0.0:4724/wd/hub");
			// running on AWS
			// capabilities.setCapability("autoAcceptAlerts", "true");
			// capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
			capabilities.setCapability("app", "Users/apple/Downloads/UMA.ipa");
			capabilities.setCapability(MobileCapabilityType.APP, "com.hhaexchange.uma");
			capabilities.setCapability("xcodeOrgId", "4ZB6Q4TFSV");
			capabilities.setCapability("xcodeSigningId", "iPhone Developer");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					"crc64b783fcfd1529e85a.SplashActivity");
//			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new IOSDriver<>(url, capabilities);
			driver.setSetting("appium:autoAcceptAlerts", true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean takeScreenshot(final String name) {
		String screenshotDirectory = System.getProperty("appium.screenshots.dir",
				System.getProperty("java.io.tmpdir", ""));
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	}

	// public boolean takeScreenshot(final String name)
	// {
	// String screenshotDirectory = System.getenv("WORKING_DIRECTORY");
	// File screenshot = ((TakesScreenshot)
	// driver).getScreenshotAs(OutputType.FILE);
	// return screenshot.renameTo(new File(screenshotDirectory,
	// String.format("%s.png", name)));
	// }

}
