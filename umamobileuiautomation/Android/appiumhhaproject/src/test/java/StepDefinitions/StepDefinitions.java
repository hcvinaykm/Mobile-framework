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

public class StepDefinitions extends Base {

	@When("user reset app")
	public void user_reset_app() throws InterruptedException {
		driver.resetApp();
	}

	@When("user enters username")
	public void user_enters_username() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElementByAccessibilityId("EmailField").sendKeys("z@z.com");
	}

	@When("user enters password")
	public void user_enters_password() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("PasswordField").click();
		MobileElement option = (MobileElement) driver.findElementByAccessibilityId("PasswordField");
		Actions actions = new Actions(driver);
		actions.click(option);
		actions.sendKeys("vinay");
		actions.perform();
	}

	@When("user selects Date Range")
	public void user_selects_Date_Range() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[@text = 'mm/dd/yyyy']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/prev")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc = '02 July 2022']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'mm/dd/yyyy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@content-desc = '02 August 2022']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
	}

	@Then("user should land on patient screen")
	public void user_should_land_on_patient_screen() throws InterruptedException {
		Thread.sleep(3000);
		Boolean patient = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Patients']")).isEnabled();
		System.out.println(patient);
	}

	@When("user clicks on chat")
	public void user_clicks_on_chat() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Chat']")).click();
	}

	@Then("user should land on chat screen")
	public void user_should_land_on_chat_screen() throws InterruptedException {
		Thread.sleep(3000);
		Boolean chat = driver
				.findElement(By.xpath(
						"//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Chat']"))
				.isEnabled();
		System.out.println(chat);
	}

	@Then("user should see menu in bottom navbars")
	public void user_should_see_menu_in_bottom_navbars() throws InterruptedException {
		Thread.sleep(3000);
		Boolean menu = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Menu']")).isEnabled();
		System.out.println(menu);
	}

	@Then("user should see patients in bottom navbars")
	public void user_should_see_patients_in_bottom_navbars() throws InterruptedException {
		Thread.sleep(3000);
		Boolean menu = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Patients']")).isEnabled();
		System.out.println(menu);
	}

	@When("user clicks on menu")
	public void user_clicks_on_menu() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Menu']")).click();
	}

	@Then("user should land on menu screen")
	public void user_should_land_on_menu_screen() throws InterruptedException {
		Thread.sleep(3000);
		Boolean menu = driver
				.findElement(By.xpath(
						"//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Menu']"))
				.isEnabled();
		System.out.println(menu);
	}

	@When("user clicks on schedule")
	public void user_clicks_on_schedule() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//android.widget.HorizontalScrollView//android.widget.TextView[@text = 'Schedule']")).click();
	}

	@Then("user should land on schedule screen")
	public void user_should_land_on_schedule_screen() throws InterruptedException {
		Thread.sleep(3000);
		Boolean schedule = driver.findElement(By.xpath(
				"//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Schedule']"))
				.isEnabled();
		System.out.println(schedule);
	}

	@When("user selects change language option")
	public void user_selects_change_language_option() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Language\").instance(0))"))
				.click();
		Thread.sleep(5000);
	}

	@When("user selects Francais language")
	public void user_selects_Francais_language() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Français']")).click();
	}

	@When("user selects espanol language")
	public void user_selects_espanol_language() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Español']")).click();
	}

	@When("user clicks on Apply button")
	public void user_clicks_on_Apply_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Apply']")).click();
	}

	@Then("user should see the Francais language on Schedule screen")
	public void user_should_see_the_Francais_language_on_Schedule_screen() throws InterruptedException {
		driver.findElement(
				By.xpath("//android.widget.HorizontalScrollView//android.widget.TextView[@text = 'Planification']"))
				.click();
		Thread.sleep(3000);
		Boolean schedule = driver.findElement(By.xpath(
				"//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Planification']"))
				.isEnabled();
		System.out.println(schedule);
	}

	@Then("user should see the Francais language on Patient screen")
	public void user_should_see_the_Francais_language_on_Patient_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Patient']")).click();
		Thread.sleep(3000);
		Boolean Patient = driver.findElement(By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Patient']"))
				.isEnabled();
		System.out.println(Patient);
	}

	@Then("user should see the Francais language on Chat screen")
	public void user_should_see_the_Francais_language_on_Chat_screen() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Conversation']")).click();
		Thread.sleep(3000);
		Boolean Chat = driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Conversation']"))
				.isEnabled();
		System.out.println(Chat);
	}

	@Then("user should see the Francais language on Menu screen")
	public void user_should_see_the_Francais_language_on_Menu_screen() throws InterruptedException {
		driver.findElement(By.xpath("//android.view.ViewGroup[4]//android.widget.TextView[@text = 'Menu']"))
				.click();
		Thread.sleep(3000);
		Boolean Menu = driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Menu']"))
				.isEnabled();
		System.out.println(Menu);
	}

	@Then("user should see the espanol language on Schedule screen")
	public void user_should_see_the_espanol_language_on_Schedule_screen() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Programación']")).click();
		Thread.sleep(3000);
		Boolean schedule = driver.findElement(By.xpath(
				"//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Programación']"))
				.isEnabled();
		System.out.println(schedule);
	}

	@Then("user should see the espanol language on Patient screen")
	public void user_should_see_the_espanol_language_on_Patient_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Pacientes']")).click();
		Thread.sleep(3000);
		Boolean Patient = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Pacientes']"))
				.isEnabled();
		System.out.println(Patient);
	}

	@Then("user should see the espanol language on Chat screen")
	public void user_should_see_the_espanol_language_on_Chat_screen() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Chatear']")).click();
		Thread.sleep(3000);
		Boolean Chat = driver.findElement(By
				.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Chatear']"))
				.isEnabled();
		System.out.println(Chat);
	}

	@Then("user should see the espanol language on Menu screen")
	public void user_should_see_the_espanol_language_on_Menu_screen() throws InterruptedException {
		driver.findElement(By.xpath("//android.view.ViewGroup[4]//android.widget.TextView[@text = 'Menú']")).click();
		Thread.sleep(3000);
		Boolean Menu = driver
				.findElement(By.xpath(
						"//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'Menú']"))
				.isEnabled();
		System.out.println(Menu);
	}

	@When("user clicks on LanguagePicker button")
	public void user_clicks_on_LanguagePicker_button() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
	}

	@Then("user should see select language page")
	public void user_should_see_select_language_page() throws InterruptedException {
		Thread.sleep(3000);
		Boolean Select = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Language']"))
				.isEnabled();
		System.out.println(Select);
	}

	@When("user selects Hindi language")
	public void user_selects_Hindi_language() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"हिन्दी\").instance(0))"))
				.click();
		Thread.sleep(5000);
	}

	@When("user clicks on Login for hindi")
	public void user_clicks_on_Login_for_hindi() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'लॉग इन करें']")).click();
	}

	@Then("user should see all content in hindi")
	public void user_should_see_all_content_in_hindi() throws InterruptedException {
		Thread.sleep(3000);
		Boolean Schedule = driver.findElement(By.xpath(
				"//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'शेड्यूल']"))
				.isEnabled();
		System.out.println("Schedule is available in Hindi Language" + Schedule);
	}

	@When("user selects Gujarathi language")
	public void user_selects_Gujarathi_language() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"ગુજરાતી\").instance(0))"))
				.click();
		Thread.sleep(5000);
	}

	@When("user clicks on Login for Gujarathi")
	public void user_clicks_on_Login_for_Gujarathi() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'લૉગ ઇન']")).click();
	}

	@Then("user should see all content in Gujarathi")
	public void user_should_see_all_content_in_Gujarathi() throws InterruptedException {
		Thread.sleep(3000);
		Boolean Schedule = driver.findElement(By.xpath(
				"//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[@text = 'શેડ્યૂલ કરો']"))
				.isEnabled();
		System.out.println("Schedule is available in Hindi Language" + Schedule);
	}

	@When("user clicks on visit search")
	public void user_clicks_on_visit_search() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
	}

	@Then("user should land on visit search page")
	public void user_should_land_on_visit_search_page() throws InterruptedException {
		Thread.sleep(8000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Visit Search']")).getText()
				.contains("Visit Search"));
	}

	@When("user enters patient name")
	public void user_enters_patient_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("kate perry");
		Thread.sleep(2000);
	}

	@When("user enters date range to search")
	public void user_enters_date_range_to_search() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@text = '1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@text = '6']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();

	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Search']")).click();
	}

	@Then("user should see the data")
	public void user_should_see_the_data() throws InterruptedException {
		Thread.sleep(5000);
		MobileElement Patientname = (MobileElement) driver
				.findElement(By.xpath("//android.widget.TextView[@text = 'kate perry']"));
		Assert.assertTrue(Patientname.getText().contains("kate perry"));
		System.out.println("Patient Available");
	}

	@When("user Click on the consecutive patient details")
	public void user_Click_on_the_consecutive_patient_details() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text= 'harry don']")).click();
	//	driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.TextView[@text = '']")).click();
		Thread.sleep(5000);
	}

	@When("user Click on the mutual patient details")
	public void user_Click_on_the_mutual_patient_details() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"rick blake\").instance(0))"))
				.click();
		Thread.sleep(5000);
	}

	@When("user Click on the linked patient details")
	public void user_Click_on_the_linked_patient_details() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text= 'kate perry']")).click();
		//driver.findElement(By.xpath("//android.view.ViewGroup[3]//android.widget.TextView[@text = '']")).click();
		Thread.sleep(5000);
	}

	@When("user Click on the comingled consecutive patient details")
	public void user_Click_on_the_comingled_consecutive_patient_details() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.view.ViewGroup[1]//android.widget.TextView[@text = '']")).click();
		Thread.sleep(5000);
	}

	@When("user Click on the Clock In button for consecutive shift")
	public void user_Click_on_the_Clocks_In_button_for_consecutive_shift() {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Clock In\").instance(0))"))
				.click();
	}

	@When("user Click on the Clock In button for comingled consecutive shift")
	public void user_Click_on_the_Clocks_In_button_for_comingled_consecutive_shift() {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Clock In\").instance(0))"))
				.click();
	}

	@When("Click on continue for first shift")
	public void Click_on_continue_for_first_shift() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
	}

	@When("Click on continue for second shift")
	public void Click_on_continue_for_second_shift() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
	}

	@When("Click on continue for third shift")
	public void Click_on_continue_for_third_shift() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
	}

	@When("Click on continue for fourth shift")
	public void Click_on_continue_for_fourth_shift() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
	}

	@Then("user should land on POC page")
	public void user_should_land_on_POC_page() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Plan of Care Tasks']"))
				.getText().contains("Plan of Care Tasks"));
	}

	@When("user clicks on profile")
	public void user_clicks_on_profile() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Profile']")).click();
	}

	@When("user clicks on device id to copy")
	public void user_clicks_on_device_id_to_copy() throws InterruptedException {
		Thread.sleep(3000);
		boolean icon = driver.findElement(By.xpath("//android.widget.Button[@text = '']")).isEnabled();
		System.out.println(icon);
		driver.findElement(By.xpath("//android.widget.Button[@text = '']")).click();
	}

	@Then("user should get text copied popup")
	public void user_should_get_text_copied_popup() {
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Text Copied']")).getText()
				.contains("Text Copied"));
		System.out.println("Text Copied");
	}

	@When("user clicks on New Unscheduled Visit")
	public void user_clicks_on_New_Unscheduled_Vist() throws InterruptedException {
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//android.widget.Button[@text = '+ New
		// Unscheduled Visit']")).click();
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"+ New Unscheduled Visit\").instance(0))"))
				.click();
	}

	@Then("user should land on new visit page")
	public void user_should_land_on_new_visit_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'New Visit']")).getText()
				.contains("New Visit"));
	}

	@When("user clicks on patient not in list button")
	public void user_clicks_on_patient_not_in_list_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Patient not in list']")).click();
	}

}
