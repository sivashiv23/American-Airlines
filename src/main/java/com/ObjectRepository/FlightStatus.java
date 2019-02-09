package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlightStatus extends FunctionalLibrary {
	@FindBy(xpath = "(//a[@tabindex='-1'])[4]")
	private WebElement flightstatus;

	@FindBy(xpath = "//input[@name='originAirport']")
	private WebElement from;

	@FindBy(xpath = "//input[@name='destinationAirport']")
	private WebElement to;

	@FindBy(xpath = "//input[@id='flightNumber']")
	private WebElement flightnumber;

	@FindBy(xpath = "//input[@value='Find flight']")
	private WebElement findflight;

	@FindBy(xpath = "//div[@id='mainFlightStatus']")
	private WebElement flightdetails;

	public WebElement getFlightdetails() {
		return flightdetails;
	}

	public void setFlightdetails(WebElement flightdetails) {
		this.flightdetails = flightdetails;
	}

	public WebElement getFindflight() {
		return findflight;
	}

	public void setFindflight(WebElement findflight) {
		this.findflight = findflight;
	}

	public WebElement getFlightstatus() {
		return flightstatus;
	}

	public void setFlightstatus(WebElement flightstatus) {
		this.flightstatus = flightstatus;
	}

	public WebElement getFrom() {
		return from;
	}

	public void setFrom(WebElement from) {
		this.from = from;
	}

	public WebElement getTo() {
		return to;
	}

	public void setTo(WebElement to) {
		this.to = to;
	}

	public WebElement getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(WebElement flightnumber) {
		this.flightnumber = flightnumber;
	}

	public FlightStatus() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
}
