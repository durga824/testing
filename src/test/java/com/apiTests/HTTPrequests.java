package com.apiTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HTTPrequests {


    public String getPetBreedId(){
        String baseUrl = "https://dogapi.dog";

        RestAssured.baseURI = baseUrl;

        Response response =
                RestAssured.given()
                        .header("Content-Type", "application/json")
                        .when().get("/api/v2/groups")
                        .then()
                        .extract()
                        .response();

        String groupId = response.jsonPath().getString("data[1].id");

        return groupId;
    }

    public void getGetBreedById(){

        String baseUrl = "https://dogapi.dog";

        RestAssured.baseURI = baseUrl;

        Response response =
                RestAssured.given()
                        .header("Content-Type", "application/json")
                        .when().get("/api/v2/breeds")
                        .then()
                        .extract()
                        .response();

//        System.out.println(response.prettyPrint());

     String id = response.jsonPath().getString("data[4].id");
        System.out.println(id);

    }


}
