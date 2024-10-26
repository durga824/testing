package com.apiAutomation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class XMLResponseParsing {

    static RestAssured restAssured;

    @Test
    void testXMLResponse(){

        Response response = restAssured.
                given()
                .when().get("http://restapi.adequateshop.com/api/Traveler?page=1")
                .then()
                .extract().response();

        System.out.println(response.prettyPrint());

    }

}
