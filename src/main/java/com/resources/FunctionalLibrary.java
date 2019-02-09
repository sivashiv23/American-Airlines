package com.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FunctionalLibrary {
	public static WebDriver driver;

	public static WebDriver driverInit(String BrowserName) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sb61\\eclipse-workspace\\sivaws\\AmericanAirlines\\src\\test\\java\\lib\\chromedriver.exe");
		if (BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
		}

		else if (BrowserName.equals("ie")) {
			driver = new InternetExplorerDriver();
		}

		else if (BrowserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void loadUrl(String name) {
		driver.get(name);
	}

	public static void buttonclick(WebElement element) {
		element.click();

	}
}
