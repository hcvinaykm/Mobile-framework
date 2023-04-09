package BaseClass;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.Scenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<?> driver;

	public static void getDriver() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			// Device data to run locally
			// capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			// capabilities.setCapability(MobileCapabilityType.UDID, "R9ZT601B81D");
			// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			// Run in iOS
			capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
			// capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);

			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.hhaexchange.uma");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					"crc64b783fcfd1529e85a.SplashActivity");

		//	URL url = new URL("http://0.0.0.0:4723/wd/hub");
			URL url = new URL("http://127.0.1.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
