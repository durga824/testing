package com.apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CookiesDemo {

    @Test
    void testCookies(){

        Response response = RestAssured
                .given()
                .when().get("https://www.google.com/")
                .then().assertThat().cookie("AEC", "").log().all()
                .extract().response();

        System.out.println(response);
    }
}
