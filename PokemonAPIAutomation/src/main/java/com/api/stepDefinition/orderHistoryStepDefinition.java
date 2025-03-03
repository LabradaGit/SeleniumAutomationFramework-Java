package com.api.stepDefinition;

import com.api.services.orderHistory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class orderHistoryStepDefinition {
    com.api.services.orderHistory orderHistory;

    public orderHistoryStepDefinition(){
        orderHistory = new orderHistory();
    }

    @Given("GET call is made to {string}")
    public void getCallIsMade(String endpoint) {
        orderHistory.getAPICall(endpoint);
    }

    @Then("Validate the status code of the api response")
    public void validateTheStatusCodeOfTheApiResponse() {
        orderHistory.verifyStatus();
    }

    @And("Validate the schema response")
    public void validateTheSchemaResponse() {
        orderHistory.verifySchemaResponse();
    }

    @And("Validate that the value of the list of objects in the {string} property is not null or empty")
    public void validateThatTheValueOfTheListOfObjectsInTheResultsPropertyIsNotNullOrEmpty(String parameter) {
        orderHistory.verifyValueOfListOfObjectResultPropertyIsNotNull(parameter);
    }
}
