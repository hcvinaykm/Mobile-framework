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

public class patientspage extends Base {

	@When("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
	}

	@When("user enters Patient Name")
	public void user_enters_Patient_Name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Peters");
	}

	@When("user clicks on Patients")
	public void user_clicks_on_Patients() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Patients']")).click();
	}

	@When("user enters valid patient name")
	public void user_enters_valid_patient_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'Search by Name or Address']"))
				.sendKeys("kate perry");
	}

	@Then("result should match with search criteria")
	public void result_should_match_with_search_criteria() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Peters Hobbs']")).getText()
				.contains("Peters Hobbs"));
	}

	@When("user clicks on Search")
	public void user_clicks_on_Search() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Search']")).click();
	}

	@When("user enters invalid patient name")
	public void user_enters_invalid_patient_name() throws InterruptedException {
		Thread.sleep(5000);
		boolean textbox = driver.findElement(By.xpath("//android.widget.EditText[@text = 'Search by Name or Address']"))
				.isDisplayed();
		System.out.println(textbox);
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'Search by Name or Address']"))
				.sendKeys("abcyy");
	}

	@Then("Error message should be displayed accordingly")
	public void Error_message_should_be_displayed_accordingly() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'No patients found for this search.']"))
						.getText().contains("No patients found for this search."));
	}

	@Then("Result should match with patient name")
	public void Result_should_match_with_patient_name() {
		MobileElement Patientname = (MobileElement) driver
				.findElement(By.xpath("//android.widget.TextView[@text = 'kate perry']"));
		Assert.assertTrue(Patientname.getText().contains("kate perry"));
		System.out.println("Patient Result");
	}

}