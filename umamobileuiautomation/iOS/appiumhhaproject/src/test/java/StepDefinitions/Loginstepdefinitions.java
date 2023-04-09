package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Apphooks.Applicationhooks;
import BaseClass.Baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.ConfigReader;
import Apphooks.Applicationhooks;
import org.testng.Assert;

public class Loginstepdefinitions extends Baseclass {

	@When("user verifies the notyou button")
	public void user_verifies_the_notyou_button() throws InterruptedException {
		try {
			if (driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"NotYouLabel\"])[2]")).isDisplayed()) {
				System.out.println("True");
				driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"NotYouLabel\"])[2]")).click();
			}
		} catch (Exception e) {
			System.out.println("Notyou button is not present");
		}
	}

	@When("user enters credentials")
	public void user_enters_credentials() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"EmailField\"])[2]"))
				.sendKeys("stone17@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeSecureTextField[@name=\"PasswordField\"])[2]"))
				.sendKeys("Test@456");

	}
	@When("user enters credentials for mutual")
	public void user_enters_credentials_for_mutual() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"EmailField\"])[2]"))
				.sendKeys("stone21@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeSecureTextField[@name=\"PasswordField\"])[2]"))
				.sendKeys("Test@456");

	}
	
	@When("user enters credentials for linked user")
	public void user_enters_credentials_for_linked_user() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"EmailField\"])[2]"))
				.sendKeys("stone20@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeSecureTextField[@name=\"PasswordField\"])[2]"))
				.sendKeys("Test@456");

	}
	
	@When("user enters credentials for consecutive user")
	public void user_enters_credentials_for_consecutive_user() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"EmailField\"])[2]"))
				.sendKeys("stone18@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeSecureTextField[@name=\"PasswordField\"])[2]"))
				.sendKeys("Test@456");

	}
	
	@When("user enters credentials for comingled user")
	public void user_enters_credentials_for_comingled_user() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"EmailField\"])[2]"))
				.sendKeys("stone19@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeSecureTextField[@name=\"PasswordField\"])[2]"))
				.sendKeys("Test@456");

	}

	@When("user clicks on Login")
	public void user_clicks_on_login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Login_Login_Button\"]")).click();
		Thread.sleep(3000);
	}
	
	@When("user clicks on forgot password button")
	public void user_clicks_on_forgot_password_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Login_ForgotPass\"]")).click();
		Thread.sleep(3000);
	}
	
	@Then("user should land on forgot password page")
	public void user_should_land_on_forgot_password_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean reset=driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Title\"]")).isDisplayed();
		System.out.println(reset);
	}

	@When("user clicks on LanguagePicker button")
	public void user_clicks_on_LanguagePicker_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Login_LanguagePicker_Button1\"]")).click();
		Thread.sleep(2000);
	}

	@Then("user should see select language page")
	public void user_should_see_select_language_page() throws InterruptedException {
		Thread.sleep(5000);
		Boolean Select = driver.findElement(By.xpath("/XCUIElementTypeStaticText[`label == \"Language\"`]"))
				.isEnabled();
		System.out.println(Select);
	}

	@When("user selects Hindi language")
	public void user_selects_Hindi_language() throws InterruptedException {
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "हिन्दी");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//XCUIElementTypeOther[@label=\"हिन्दी\"]")).isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//XCUIElementTypeOther[@label=\"हिन्दी\"]")).click();
		} else {
			System.out.println("Notthere");
		}

	}

	@When("user clicks on Login for hindi")
	public void user_clicks_on_Login_for_hindi() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"लॉग इन करें\"]")).click();
	}

	@Then("user should see all content in hindi")
	public void user_should_see_all_content_in_hindi() throws InterruptedException {
		Thread.sleep(3000);
		Boolean Schedule = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"शेड्यूल\"]")).isEnabled();
		System.out.println("Schedule is available in Hindi Language" + Schedule);
	}

	@When("user selects Gujarathi language")
	public void user_selects_Gujarathi_language() throws InterruptedException {
		Thread.sleep(8000);
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "ગુજરાતી"); // Only for ‘scroll in element’
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@label=\"ગુજરાતી\"]")).click();
		Thread.sleep(5000);
	}

	@When("user clicks on Login for Gujarathi")
	public void user_clicks_on_Login_for_Gujarathi() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"લૉગ ઇન\"]")).click();
	}

	@Then("user should see all content in Gujarathi")
	public void user_should_see_all_content_in_Gujarathi() throws InterruptedException {
		Thread.sleep(3000);
		Boolean Schedule = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"શેડ્યૂલ કરો\"]"))
				.isEnabled();
		System.out.println("Schedule is available in Gujarathi Language" + Schedule);
	}

	@Then("user should land on Device time issue popup")
	public void user_should_land_on_Device_time_issue_popup() throws InterruptedException {
		Thread.sleep(2000);
		Boolean popup = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Device Time Issue Detected']"))
				.isDisplayed();
		System.out.println("popup is available on login page" + popup);
	}

	@When("user clicks on Close")
	public void user_clicks_on_Close() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Close\"]")).click();
	}

	@Then("user should land on third party terms page")
	public void user_should_land_on_third_party_terms_page() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("user clicks on accept terms button")
	public void user_clicks_on_accept_terms_button() throws InterruptedException {
		Thread.sleep(5000);
		Map args = new HashMap<>();
		args.put("direction", "down");
		driver.executeScript("mobile: scroll", args);
		//driver.executeScript("mobile: swipe", args);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"FooterButton\"]")).click();
	}
}