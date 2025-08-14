package com.testrunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features" }, glue = {
		"com.stepdefinition" }, dryRun = false, monochrome = true, plugin = { "pretty", "html:targets/cucumber.html",
				"json:target/reports.json" })

public class TestRunner {

}
