package com.stepdefinition;

import com.ObjectRepository.FlightStatus;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightStatusSteps extends FunctionalLibrary {

	FlightStatus func = new FlightStatus();

	@Given("User should be in american airlines home page")
	public void user_should_be_in_american_airlines_home_page() {

		System.out.println("Checking the flight status");
		func.loadUrl("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
	}

	@Given("User clicks on flight status")
	public void user_clicks_on_flight_status() {
		func.getFlightstatus().click();
	}

	@When("User provide input for From ,TO,flight number,date")
	public void user_provide_input_for_From_TO_flight_number_date() {
		func.getFlightnumber().sendKeys("2491");

	}

	@When("User clicks on the find status")
	public void user_clicks_on_the_find_status() {
		func.getFindflight().click();
	}

	@Then("Flight status is displayed")
	public void flight_status_is_displayed() {
		String string = func.getFlightdetails().getText();
		System.out.println(string);
	}

}
