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

public class Chatpagesteps extends Base {

	@Then("Verify Chat is Present in the Bottom navbar")
	public void Verify_Chat_is_Present_in_the_Bottom_navbar() throws InterruptedException {
		Thread.sleep(1000);
		boolean chat = driver
				.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.TextView[@text = 'Chat']"))
				.isDisplayed();
		System.out.println(chat);
	}

	@When("user click on the Chat command in the bottom navbar")
	public void user_click_on_the_Chat_command_in_the_bottom_navbar() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.TextView[@text = 'Chat']")).click();
	}

	@Then("Chat page should be presented with an active MyChats tab")
	public void Chat_page_should_be_presented_with_an_active_MyChats_tab() throws InterruptedException {
		Thread.sleep(1000);
		boolean chat = driver.findElement(By.xpath("//android.widget.TextView[@text = 'MyChats']")).isDisplayed();
		System.out.println(chat);
	}

	@When("user click on the Topics tab")
	public void user_click_on_the_Topics_tab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Topics']")).click();
	}

	@Then("the topics configured by my agency should be presented")
	public void the_topics_configured_by_my_agency_should_be_presented() throws InterruptedException {
		Thread.sleep(1000);
		boolean chat = driver.findElement(By.xpath(
				"//android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup"))
				.isDisplayed();
		System.out.println(chat);
	}

	@When("user click on a General tab")
	public void user_click_on_a_General_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'General']")).click();
	}

	@Then("the Conversation pane should be displayed with the General in the header")
	public void the_Conversation_pane_should_be_displayed_with_the_General_in_the_header() throws InterruptedException {
		Thread.sleep(3000);
		boolean chat = driver.findElement(By.xpath("//android.widget.TextView[@text = 'General']")).isDisplayed();
		System.out.println(chat);
	}

	@When("user click on a Patient Issue tab")
	public void user_click_on_a_Patient_Issue_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Patient Issue']")).click();
	}

	@Then("the Conversation pane should be displayed with the Patient Issue in the header")
	public void the_Conversation_pane_should_be_displayed_with_the_Patient_Issue_in_the_header()
			throws InterruptedException {
		Thread.sleep(3000);
		boolean chat = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Patient Issue']")).isDisplayed();
		System.out.println(chat);
	}

	@When("user click on a Scheduling tab")
	public void user_click_on_a_Scheduling_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Scheduling']")).click();
	}

	@Then("the Conversation pane should be displayed with the Scheduling in the header")
	public void the_Conversation_pane_should_be_displayed_with_the_Scheduling_in_the_header()
			throws InterruptedException {
		Thread.sleep(3000);
		boolean chat = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Scheduling']")).isDisplayed();
		System.out.println(chat);
	}

	@When("user click on a Mobile App tab")
	public void user_click_on_a_Mobile_App_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Mobile App']")).click();
	}

	@Then("the Conversation pane should be displayed with the Mobile App in the header")
	public void the_Conversation_pane_should_be_displayed_with_the_Mobile_App_in_the_header()
			throws InterruptedException {
		Thread.sleep(3000);
		boolean chat = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Mobile App']")).isDisplayed();
		System.out.println(chat);
	}

	@When("user click on a EVV tab")
	public void user_click_on_a_EVV_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'EVV']")).click();
	}

	@Then("the Conversation pane should be displayed with the EVV in the header")
	public void the_Conversation_pane_should_be_displayed_with_the_EVV_in_the_header() throws InterruptedException {
		Thread.sleep(1000);
		boolean chat = driver.findElement(By.xpath("//android.widget.TextView[@text = 'EVV']")).isDisplayed();
		System.out.println(chat);
	}

}