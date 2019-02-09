package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Helper {


	@Before
	public static void beforeScenario() {

		FunctionalLibrary.driverInit("chrome");
	}
//
//	@After
//	public static void afterScenario() {
//		FunctionalLibrary.closeBrowser();
//	}

}
