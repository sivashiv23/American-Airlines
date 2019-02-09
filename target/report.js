$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/FlightStatus.feature");
formatter.feature({
  "name": "To test the flight status",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To test the flight status",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be in american airlines home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightStatusSteps.user_should_be_in_american_airlines_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on flight status",
  "keyword": "And "
});
formatter.match({
  "location": "FlightStatusSteps.user_clicks_on_flight_status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provide input for From ,TO,flight number,date",
  "keyword": "When "
});
formatter.match({
  "location": "FlightStatusSteps.user_provide_input_for_From_TO_flight_number_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the find status",
  "keyword": "And "
});
formatter.match({
  "location": "FlightStatusSteps.user_clicks_on_the_find_status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Flight status is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightStatusSteps.flight_status_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});