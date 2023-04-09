package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
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

public class Patientstepdefinitions extends Baseclass {

	@Then("user should land on patient screen")
	public void user_should_land_on_patient_screen() throws InterruptedException {
		Thread.sleep(3000);
		Boolean patient = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Patients\"]")).isEnabled();
		System.out.println("Patient Available");
	}

	@When("user clicks on visit search")
	public void user_clicks_on_visit_search() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//XCUIElementTypeOther[@name=\"Schedule_NewVisit_Button\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther"))
				.click();
	}

	@When("user clicks on Patients")
	public void user_clicks_on_Patients() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Patients\"]")).click();
	}

	@When("user enters valid patient name")
	public void user_enters_valid_patient_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//XCUIElementTypeOther[@name=\"PatientTemplate_Search\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"))
				.sendKeys("kate perry");
	}

	@Then("result should match with search criteria")
	public void result_should_match_with_search_criteria() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"kate perry\"]")).getText()
				.contains("kate perry"));
	}

	@When("user enters invalid patient name")
	public void user_enters_invalid_patient_name() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//XCUIElementTypeOther[@name=\"PatientTemplate_Search\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"))
				.sendKeys("abcd");

	}

	@Then("Error message should be displayed accordingly")
	public void Error_message_should_be_displayed_accordingly() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver
				.findElement(By.xpath("//XCUIElementTypeStaticText[@name = 'No patients found for this search.']"))
				.getText().contains("No patients found for this search."));
	}

	@Then("user should land on visit search page")
	public void user_should_land_on_visit_search_page() throws InterruptedException {
		Thread.sleep(8000);
		Assert.assertTrue(driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Title\"]")).getText()
				.contains("Visit Search"));
	}

	@When("user enters patient name")
	public void user_enters_patient_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeTextField[@name=\"PasswordField\"])[3]")).sendKeys("kate perry");
		Thread.sleep(2000);
	}

	@When("user enters date range to search")
	public void user_enters_date_range_to_search() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"mm/dd/yyyy\"])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@content-desc = '1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"mm/dd/yyyy\"])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@content-desc = '26 October 2022']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Search\"])[2]")).click();
	}

	@Then("user should see the data")
	public void user_should_see_the_data() throws InterruptedException {
		Thread.sleep(5000);
		MobileElement Patientname = (MobileElement) driver
				.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"kate perry\"])[2]"));
		Assert.assertTrue(Patientname.getText().contains("kate perry"));
		System.out.println("Patient Available");
	}

}