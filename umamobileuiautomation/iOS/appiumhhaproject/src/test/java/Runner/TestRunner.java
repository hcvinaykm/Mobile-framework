package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Test Runner file to run the test cases based on given parameters.
 */

@CucumberOptions(features = { "classpath:Features/RC4.feature" },
                 glue = { "StepDefinitions", "Apphooks" }, 
                 plugin = {
		"pretty", "html:target/cucumber-reports",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "junit:Reports/Cucumber.xml",
		"timeline:test-output-thread/" }, 
                 monochrome = true)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
