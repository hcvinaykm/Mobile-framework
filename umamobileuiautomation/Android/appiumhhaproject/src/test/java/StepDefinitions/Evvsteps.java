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

public class Evvsteps extends Base {

	@When("user Click on the patient details")
	public void user_Click_on_the_patient_details() throws InterruptedException {
		Thread.sleep(5000);
		//android.widget.TextView[@text= 'clone mac']
		driver.findElement(By.xpath("//android.widget.TextView[@text= 'jake mittal']")).click();
		//android.view.ViewGroup[1]//android.widget.TextView[@text = '']
	}

	@When("user Click on the Clock In button")
	public void user_Click_on_the_Clock_In_button() {
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Clock In']")).click();
		// code to automate clockin button
//		try   
//		  {    
//		    if(driver.findElement(By.xpath("//android.widget.Button[@text ='Clock In']")).isDisplayed() )     
//		    {   
//		    	System.out.println("True"); 
//		    	driver.findElement(By.xpath("//android.widget.Button[@text ='Clock In']")).click();     
//		    }    
//		  }      
//		  catch(Exception e)     
//		  {       
//		   System.out.println("False");   
//		  }       
	}

	@Then("user should land on Electronic Visit Verification screen")
	public void user_should_land_on_Electronic_Visit_Verification_screen() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'Electronic Visit Verification']"))
						.getText().contains("Electronic Visit Verification"));
	}

	@When("Click on continue")
	public void Click_on_continue() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
	}

	@When("User Do the signature and Click on Submit")
	public void User_Do_the_signature_and_Click_on_Submit() throws InterruptedException {
		Thread.sleep(1000);
		(new TouchAction(driver)).press(PointOption.point(510, 363))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(715, 465))
				.release().perform();

		(new TouchAction(driver)).press(PointOption.point(448, 403))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(608, 273))
				.release().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Submit']")).click();
	}

	@When("User Do the patient signature and Click on Submit")
	public void User_Do_the_patient_signature_and_Click_on_Submit() throws InterruptedException {
		Thread.sleep(1000);
		(new TouchAction(driver)).press(PointOption.point(528, 373))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(673, 488))
				.release().perform();
		Thread.sleep(1000);
		(new TouchAction(driver)).press(PointOption.point(678, 478))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(763, 300))
				.release().perform();

		Thread.sleep(000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Submit']")).click();
	}

	@When("User Do the caregiver signature and Click on Submit")
	public void User_Do_the_caregiver_signature_and_Click_on_Submit() throws InterruptedException {
		Thread.sleep(1000);
		(new TouchAction(driver)).press(PointOption.point(153, 478))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(263, 300))
				.release().perform();

		(new TouchAction(driver)).press(PointOption.point(678, 478))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300))).moveTo(PointOption.point(763, 300))
				.release().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Submit']")).click();
	}

	@When("User Record patient voice and click on stop recording")
	public void User_Record_patient_voice_and_click_on_stop_recording() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Record']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Stop Recording']")).click();

	}

	@When("Click on done")
	public void Click_on_done() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Done']")).click();
	}

	@When("User Fill the mandatory fields as well as value")
	public void User_Fill_the_mandatory_fields_as_well_as_value() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.Button[@text = '']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.Button[@text = '']"))
				.click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.Button[@text = '']"))
				.click();
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.EditText")).sendKeys("7");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup"))
				.click();

	}

	@When("user Click on the Clock In button for multiple devices")
	public void user_Click_on_the_Clock_In_button_for_multiple_devices() {

		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			try {
				driver.findElement(
						By.xpath("//android.view.ViewGroup[" + i + "]//android.widget.TextView[@text = '']")).click();
				// driver.findElement(By.xpath("(//android.widget.TextView[@content-desc=\"Accordian_FontLabel\"])[1]")).click();
				if (driver.findElement(By.xpath("//android.widget.Button[@text ='Clock In']")).isDisplayed()) {
					System.out.println("True");
					driver.findElement(By.xpath("//android.widget.Button[@text ='Clock In']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//android.widget.Button[@text = 'Clock Out']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
					Thread.sleep(5000);
					WebDriverWait wait = new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
							"//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]")));
					System.out.println("element located");
					Thread.sleep(3000);
				}
			} catch (Exception e) {
				System.out.println("Patient is not available to schedule");
			}
		}

	}

	@Then("click on Clock out")
	public void click_on_Clock_out() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Clock Out']")).click();

	}

	@When("user clicks on any patient which are in the list")
	public void user_clicks_on_any_patient_which_are_in_the_list() throws InterruptedException {
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//android.view.ViewGroup[2]//android.widget.TextView[@text
		// = '']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'kate perry']")).click();
	}

	@Then("user should land on Confirm Unscheduled Visit popup")
	public void user_should_land_on_Confirm_Unscheduled_Visit_popup() throws InterruptedException {
		Thread.sleep(2000);
		//Boolean visitpopup = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Confirm Unscheduled Visit']")).isDisplayed();
		//System.out.println("popup is available on login page" + visitpopup);
	}

	@When("user clicks on Create Unscheduled Visit button")
	public void user_clicks_on_Create_Unscheduled_Vist_buttin() throws InterruptedException {
		Thread.sleep(4000);
		try {
			if (driver.findElement(By.xpath("//android.widget.Button[@text = 'Create Unscheduled Visit']")).isDisplayed()) {
				System.out.println("True");
				driver.findElement(By.xpath("//android.widget.Button[@text = 'Create Unscheduled Visit']")).click();
			}
		} catch (Exception e) {
			System.out.println("False");
		}
	}

	@When("user selects any service from service code selection")
	public void user_selects_any_service_from_service_code_seection() throws InterruptedException {
		Thread.sleep(2000);
		//code to select service code if options are there
		//driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
		// driver.findElement(By.xpath("//android.widget.EditText[@text =
		// 'SC1']")).click();
		// driver.findElement(By.xpath("//android.widget.Button[@text =
		// 'SC2']")).click();
	}

	@When("user clicks on OK button")
	public void user_clicks_on_OK_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();
	}

	@When("user clicks on New Visit button")
	public void user_clicks_on_New_Visit_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'New Visit']")).click();
	}

	@When("user clicks on New Unscheduled Visit link")
	public void user_clicks_on_New_Unscheduled_Vist_link() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"+ New Unscheduled Visit\").instance(0))"))
				.click();
	}

	@When("user should click on View or Edit Visit")
	public void user_should_click_on_View_or_Edit_Visit() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"View/Edit Visit\"]")).click();
	}

	@Then("user should click on Edit time")
	public void user_should_click_on_Edit_time() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.Button[@text = '+ New Unscheduled Visit']")).click();
	}
}