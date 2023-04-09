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

public class loginpagesteps extends Base {

	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText")).sendKeys("vinay@a.com");
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[4]//android.widget.EditText")).sendKeys("vinay");
	}

	@Then("Appropriate Error message should come for the required fields")
	public void Appropriate_Error_message_should_come_for_the_required_fields() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver
				.findElement(By.xpath(
						"//android.view.ViewGroup[3]//android.widget.TextView[@text = 'This field is required']"))
				.getText().contains("This field is required"));
		Assert.assertTrue(driver
				.findElement(By.xpath(
						"//android.view.ViewGroup[4]//android.widget.TextView[@text = 'This field is required']"))
				.getText().contains("This field is required"));
	}

	@Then("appropriate error must appear")
	public void appropriate_error_must_appear() throws InterruptedException {
		Thread.sleep(2000);
		MobileElement Invalid = (MobileElement) driver.findElement(
				By.xpath("//android.view.ViewGroup[3]//android.widget.TextView[@text = 'Invalid credentials']"));
		Assert.assertTrue(Invalid.getText().contains("Invalid credentials"));

	}

	@When("user login with multiple credentials")
	public void user_login_with_multiple_credentials() throws InterruptedException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		try {
			String username;
			String password;
			FileReader reader = new FileReader("JSON\\credentials.json");
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONObject usersobj = (JSONObject) obj;
			// JSONArray usersList = (JSONArray) obj;
			JSONArray usersList = (JSONArray) usersobj.get("users");

			System.out.println("Users List-> " + usersList); // This prints the entire json file
			for (int i = 0; i < usersList.size(); i++) {
				JSONObject users = (JSONObject) usersList.get(i);
				System.out.println("Users -> " + users);// This prints every block - one json object
				JSONObject user = (JSONObject) users.get("users");
				username = (String) users.get("username");
				password = (String) users.get("password");
				System.out.println(username);
				System.out.println(password);
				driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText"))
						.sendKeys("a@a.com");
				driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText")).click();
				driver.findElement(By.xpath("//android.view.ViewGroup[4]//android.widget.EditText")).sendKeys("vinay");
				driver.findElement(By.xpath("//android.widget.Button[@text = 'Log In']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'Menu']")).click();
				driver.findElement(By.xpath("//android.widget.Button[@text = 'Logout']")).click();
				Thread.sleep(3000);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Then("user Logout from account")
	public void user_Logout_from_account() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Menu']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Logout']")).click();
		Thread.sleep(1000);
	}

	@Then("user should land on Device time issue popup")
	public void user_should_land_on_Device_time_issue_popup() throws InterruptedException {
		Thread.sleep(2000);
		Boolean popup = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Device Time Issue Detected']"))
				.isDisplayed();
		System.out.println("popup is available on login page" + popup);
//      Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Device Time Issue Detected']")).getText().contains("Device Time Issue Detected"));        
	}

	@When("user clicks on Close")
	public void user_clicks_on_Close() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Close']")).click();
	}
	
	@When("user clicks on forgot password button")
	public void user_clicks_on_forgot_password_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Forgot password?']")).click();
	}
	
	@Then("user should land on forward password page")
	public void user_should_land_on_forward_password_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Reset Password']"))
				.getText().contains("Reset Password"));
	}
	
	@When("User enters email ID or Phone number")
	public void User_enters_email_ID_or_Phone_number() throws InterruptedException
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Email or Phone Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Email or Phone Number']")).sendKeys("stone17@yopmail.com");
	}
	
	@When("User clicks on send message")
	public void user_clicks_on_send_message() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Send Message']")).click();
	}
	
	@Then("user should get message sent banner")
	public void user_should_get_message_sent_banner() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Message Sent']"))
				.getText().contains("Message Sent"));
	}

	@Then("user should land on third party terms page")
	public void user_should_land_on_third_party_terms_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Third Party Terms']"))
				.getText().contains("Third Party Terms"));
	}

	@When("user clicks on accept terms button")
	public void user_clicks_on_accept_terms_button() throws InterruptedException {
		Thread.sleep(3000);
		(new TouchAction(driver)).press(PointOption.point(448, 403))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(608, 273))
				.release().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Accept Terms']")).click();
	}

	@When("user clicks on Apply button for francais language")
	public void user_clicks_on_Apply_button_for_francais_language() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.Button[@text = 'Appliquer']")).click();
	}

	@When("user clicks on Apply button for espanol language")
	public void user_clicks_on_Apply_button_for_espanol_language() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.Button[@text = 'Aplicar']")).click();
	}

	@When("user clicks on Apply button for hindi language")
	public void user_clicks_on_Apply_button_for_hindi_language() throws InterruptedException 
	{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.Button[@text = 'लागू करें']")).click();
	}

	@When("user clicks on Apply button for gujarathi language")
	public void user_clicks_on_Apply_button_for_gujarthi_language() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.Button[@text = 'લાગુ કરો']")).click();
	}
	
	@When("user clicks on hindi accept terms button")
	public void user_clicks_on_hindi_accept_terms_button() throws InterruptedException {
	Thread.sleep(5000);
	(new TouchAction(driver)).press(PointOption.point(448,403))
	.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
	.moveTo(PointOption.point(608,273)).release().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.Button[@text = 'शर्तें स्वीकार करें']")).click();
	}

	@When("user clicks on gujarathi accept terms button")
	public void user_clicks_on_gujarathi_accept_terms_button() throws InterruptedException {
	Thread.sleep(5000);
	(new TouchAction(driver)).press(PointOption.point(448,403))
	.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
	.moveTo(PointOption.point(608,273)).release().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.Button[@text = 'શરતો સ્વીકારો']")).click();
	}
	
	@Then("user should land on hindi third party terms page")
	public void user_should_land_on_hindi_third_party_terms_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'तृतीय पक्ष की शर्तें']"))
				.getText().contains("तृतीय पक्ष की शर्तें"));
	}
	
	@Then("user should land on gujarathi third party terms page")
	public void user_should_land_on_gujarathi_third_party_terms_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'ત્રીજા પક્ષની શરતો']"))
				.getText().contains("ત્રીજા પક્ષની શરતો"));
	}	
}