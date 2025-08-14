package com.libglobal;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import io.cucumber.java.Scenario;


public class Hooks extends BaseClass {


	@AfterClass
	public void afterScenario(Scenario s) {
		if (s.isFailed()) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		s.attach(screenshot,"image/png","Failure Screenshot");

			
		} else {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.attach(screenshot,"image/png","Failure Screenshot");
			
		}

	}
}
