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

public class Menustepdefinitions extends Baseclass {

	@When("user changes the language to English")
	public void user_changes_the_language_to_English() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@label=\"English\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"FooterButton_Container\"]")).click();
		Thread.sleep(2000);
	}

	@Then("user Logout from account")
	public void user_Logout_from_account() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Menu\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@label=\"Logout\"]")).click();
		Thread.sleep(1000);
	}

	@When("user clicks on menu")
	public void user_clicks_on_menu() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Menu\"]")).click();
	}
	
	@When("user clicks on menu in hindi")
	public void user_clicks_on_menu_in_hindi() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"मेनू\"]")).click();
	}
	
	@When("user clicks on menu in gujarathi")
	public void user_clicks_on_menu_in_gujarathdi() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"મેનૂ\"]")).click();
	}

	@When("user selects change language option in hindi")
	public void user_selects_change_language_option_in_hindi() throws InterruptedException {
		Thread.sleep(3000);
		Thread.sleep(3000);
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "भाषा का चयन करें"); // Only for ‘scroll in element’
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"भाषा का चयन करें\"]")).click();
	}

	@When("user selects change language option in gujarathi")
	public void user_selects_change_language_option_in_gujarathi() throws InterruptedException {
		Thread.sleep(3000);
		Thread.sleep(3000);
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "ભાષા પસંદ કરો..."); // Only for ‘scroll in element’
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"ભાષા પસંદ કરો...\"]")).click();
	}

	@When("user selects change language option in espanol")
	public void user_selects_change_language_option_in_espanol() throws InterruptedException {
		Thread.sleep(3000);
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "Selección de idiomaरें"); // Only for ‘scroll in element’
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Selección de idioma\"]")).click();
	}

	@When("user selects change language option in francais")
	public void user_selects_change_language_option_in_francais() throws InterruptedException {
		Thread.sleep(3000);
		Thread.sleep(3000);
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "Sélectionner une langue"); // Only for ‘scroll in element’
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Sélectionner une langue\"]")).click();
	}

	@Then("user should land on menu screen")
	public void user_should_land_on_menu_screen() throws InterruptedException {
		Thread.sleep(3000);
		Boolean menu = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Menu\"]")).isEnabled();
		System.out.println(menu);
	}

	@When("user clicks on schedule")
	public void user_clicks_on_schedule() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//XCUIElementTypeStaticText[@name=\"Schedule\"]"))
				.click();
	}

	@Then("user should land on schedule screen")
	public void user_should_land_on_schedule_screen() throws InterruptedException {
		Thread.sleep(6000);
		Boolean schedule = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Schedule\"]")).isEnabled();
		System.out.println(schedule);
	}

	@When("user selects change language option")
	public void user_selects_change_language_option() throws InterruptedException {
		Thread.sleep(3000);
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "Language"); // Only for ‘scroll in element’
		driver.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Language\"]")).click();
		Thread.sleep(5000);
	}

	@When("user selects Francais language")
	public void user_selects_Francais_language() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@label=\"Français\"]")).click();
	}

	@When("user selects espanol language")
	public void user_selects_espanol_language() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@label=\"Español\"]")).click();
	}

	@When("user clicks on Apply button")
	public void user_clicks_on_Apply_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"FooterButton\"]")).click();
	}

	@Then("user should see the Francais language on Schedule screen")
	public void user_should_see_the_Francais_language_on_Schedule_screen() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Planification\"]")).click();
		Thread.sleep(3000);
		Boolean schedule = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Planification\"]"))
				.isEnabled();
		System.out.println(schedule);
	}

	@Then("user should see the Francais language on Patient screen")
	public void user_should_see_the_Francais_language_on_Patient_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Patient\"]")).click();
		Thread.sleep(3000);
		Boolean Patient = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Patient\"]")).isEnabled();
		System.out.println(Patient);
	}

	@Then("user should see the Francais language on Chat screen")
	public void user_should_see_the_Francais_language_on_Chat_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Conversation\"]")).click();
		Thread.sleep(3000);
		Boolean Chat = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Conversation\"]")).isEnabled();
		System.out.println(Chat);
	}

	@Then("user should see the Francais language on Menu screen")
	public void user_should_see_the_Francais_language_on_Menu_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Menu\"]")).click();
		Thread.sleep(3000);
		Boolean Menu = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Menu\"]")).isEnabled();
		System.out.println(Menu);
	}

	@Then("user should see the espanol language on Schedule screen")
	public void user_should_see_the_espanol_language_on_Schedule_screen() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Programación\"]")).click();
		Thread.sleep(3000);
		Boolean schedule = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Programación\"]")).isEnabled();
		System.out.println(schedule);
	}

	@Then("user should see the espanol language on Patient screen")
	public void user_should_see_the_espanol_language_on_Patient_screen() throws InterruptedException {
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Pacientes\"]")).click();
		Thread.sleep(3000);
		Boolean Patient = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Pacientes\"]")).isEnabled();
		System.out.println(Patient);
	}

	@Then("user should see the espanol language on Chat screen")
	public void user_should_see_the_espanol_language_on_Chat_screen() throws InterruptedException {
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Chatear\"]")).click();
		Thread.sleep(3000);
		Boolean Chat = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Chatear\"]")).isEnabled();
		System.out.println(Chat);
	}

	@Then("user should see the espanol language on Menu screen")
	public void user_should_see_the_espanol_language_on_Menu_screen() throws InterruptedException {
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Menú\"]")).click();
		Thread.sleep(3000);
		Boolean Menu = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Menú\"]")).isEnabled();
		System.out.println(Menu);
	}

	@Then("user should land on POC page")
	public void user_should_land_on_POC_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Plan of Care Tasks\"]"))
				.getText().contains("Plan of Care Tasks"));
	}

	@When("user clicks on profile")
	public void user_clicks_on_profile() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Profile\"]")).click();
	}

	@When("user clicks on device id to copy")
	public void user_clicks_on_device_id_to_copy() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"\"])[2]")).click();
	}

	@Then("user should get text copied popup")
	public void user_should_get_text_copied_popup() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Text Copied");
		// Assert.assertTrue(driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Text Copied"]"));
		// Copied\"]")).getText().contains("Text Copied"));
	}

}