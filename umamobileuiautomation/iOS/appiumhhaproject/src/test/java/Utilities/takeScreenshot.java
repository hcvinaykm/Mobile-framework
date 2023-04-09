package Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseClass.Baseclass;

public class takeScreenshot extends Baseclass {
	
	public boolean Screenshot(final String name) {
		
		   String screenshotDirectory = System.getenv("WORKING_DIRECTORY");
		    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
			
		}

}
