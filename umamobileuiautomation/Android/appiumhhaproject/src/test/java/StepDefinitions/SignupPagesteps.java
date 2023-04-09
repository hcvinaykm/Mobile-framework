package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Base;
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
import Apphooks.Applicationhooks;
import org.testng.Assert;

public class SignupPagesteps extends Base {

	@When("user clicks on Sign_Up_Here button")
	public void user_clicks_on_Sign_Up_Here_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Sign Up Here']")).click();
	}

	@When("user fills Email Address Password Confirm Password Fields")
	public void user_fills_Email_Address_Password_Confirm_Password_Fields() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("a@a.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("Test@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("Test@1234");
	}

	@When("user enters Email Address")
	public void user_enters_Email_Address() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("a@a.com");
	}

	@When("user enters different Password on Confirm Password field")
	public void user_enters_different_Password_on_Confirm_Password_field() throws InterruptedException {
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("Test@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("test@1234");
	}

	@Then("appropriate error message should appear")
	public void appropriate_error_message_should_appear() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver
				.findElement(By.xpath("//android.widget.TextView[@text = 'Confirm Password must match Password']"))
				.getText().contains("Confirm Password must match Password"));
	}

	@Then("User should land on Sign_Up form")
	public void User_should_land_on_Sign_Up_form() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Sign Up']")).getText()
				.contains("Sign Up"));
	}

	@Then("user should land on Registration form")
	public void User_should_land_on_Registration_form() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Complete Registration']"))
				.getText().contains("Complete Registration"));
	}

	@When("user clicks on Signup button")
	public void user_clicks_on_Sign_Up__button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Sign Up']")).click();
	}

	@When("user clicks on Email button for verification")
	public void user_clicks_on_Email_button_for_verification() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
	}

	@When("user selects Perfom EVV option")
	public void user_selects_Perfom_EVV_option() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Perform Electronic Visit Verification (EVV)']"))
				.click();
	}

	@When("user enters verification code and click submit code")
	public void user_enters_verification_code_and_click_submit_code() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("1000S1");
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Submit Code']")).click();
	}

	@When("user enters two mandatory fields only")
	public void user_enters_two_mandatory_fields() throws InterruptedException {
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("Vinay");
		driver.findElement(By.xpath("//android.view.ViewGroup[2]//android.widget.EditText")).sendKeys("Kumar");

	}

	@Then("User should receive an error message")
	public void User_should_receive_an_error_message() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'This field is required']"))
				.getText().contains("This field is required"));
	}

	@When("user enter mandatory fields")
	public void user_enters_mandatory_fields() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("Vinay");
		driver.findElement(By.xpath("//android.view.ViewGroup[2]//android.widget.EditText")).sendKeys("Kumar");
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("1234");
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc = '01 January 2022']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
	}

	@When("user clicks on enable biometric ID")
	public void user_clicks_on_enable_biometric_ID() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Enable Biometric ID']")).click();
	}

}