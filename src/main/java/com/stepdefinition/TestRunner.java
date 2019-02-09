package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/feature/FlightStatus.feature", glue = { "com.stepdefinition" }, plugin = {
		"html:target" })

public class TestRunner {

}
