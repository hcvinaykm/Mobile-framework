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

public class Commonsteps extends Base {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws MalformedURLException, InterruptedException {
		System.out.println("Application Launched");
		Thread.sleep(5000);
	}

	@When("user verifies the apply button")
	public void user_verifies_the_apply_button() throws InterruptedException {
		try {
			if (driver.findElement(By.xpath("//android.widget.Button[@text ='Apply']")).isDisplayed()) {
				System.out.println("True");
				driver.findElement(By.xpath("//android.widget.Button[@text ='Apply']")).click();
			}
		} catch (Exception e) {
			System.out.println("False");
		}
	}

	@When("user enters credentials")
	public void user_enters_credentials() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText"))
				.sendKeys("stone17@yopmail.com");
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText")).click();

		driver.findElement(By.xpath("//android.view.ViewGroup[4]//android.widget.EditText")).sendKeys("Test@456");

	}
	
	@When("user enters credentials for consecutive user")
	public void user_enters_credentials_for_consecutive_user() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText"))
				.sendKeys("stone18@yopmail.com");
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText")).click();

		driver.findElement(By.xpath("//android.view.ViewGroup[4]//android.widget.EditText")).sendKeys("Test@456");

	}
	
	@When("user enters credentials for commingled user")
	public void user_enters_credentials_for_commingled_user() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText"))
				.sendKeys("stone19@yopmail.com");
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText")).click();

		driver.findElement(By.xpath("//android.view.ViewGroup[4]//android.widget.EditText")).sendKeys("Test@456");

	}

	@When("user clicks on Login")
	public void user_clicks_on_login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Log In']")).click();
		Thread.sleep(5000);
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException {
		Thread.sleep(25000);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]")));
		System.out.println("element located");
	}

}