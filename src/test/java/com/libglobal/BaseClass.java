package com.libglobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maximizewindow() {
		driver.manage().window().maximize();

	}

	public static void type(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void btnClick(WebElement e) {
		e.click();

	}

	public static void getTittle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

}
