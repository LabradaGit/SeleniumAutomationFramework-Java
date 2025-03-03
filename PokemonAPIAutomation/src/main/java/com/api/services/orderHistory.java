package com.api.services;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class orderHistory extends BaseServices{
    Response response;
    public void getAPICall(String endpoint){
        response = given()
                .header("Content-Type","application/json")
                .get(_baseURL + endpoint);
    }

    public void verifyStatus(){
        response.then()
                .assertThat()
                .statusCode(200);
    }

    public void verifySchemaResponse(){
        File file = new File("src/test/resources/testData/responseSchema.json");
        response.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(file));
    }

    public void verifyValueOfListOfObjectResultPropertyIsNotNull(String parameter){
        response.then()
                .assertThat()
                .body(parameter, Matchers.notNullValue());
    }
}
