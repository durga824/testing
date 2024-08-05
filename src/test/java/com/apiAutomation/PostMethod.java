package com.apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethod {
    public static void main(String[] args) {

        // Base URL of the API
        String baseUrl = "https://qa-api.creditrepaircloud.com";

        // Bearer token
        String bearerToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpZCI6ImNkMDRmNjNlZTc0Nzk4ODQzYWYyNzk3Y2U3MDI3MjEwNjE4Nzk5NTlmMmVmYTgxNmE1NTdhZTBlZjMxODgyMjY0OWI5Mjc5MzczNDExYmQ0IiwiY29tcGFueV9uYW1lIjoiQXV0b21hdGlvbiIsImZpcnN0X25hbWUiOiJQZXJmb21hbmNlIiwibGFzdF9uYW1lIjoidGVzdGluZyAiLCJhZG1pbl9lbWFpbCI6InBlcmZvcm1hbmNldGVzdEB5b3BtYWlsLmNvbSIsInVzZXJfaWQiOjM5MzI1OCwicmVnX2lkIjoyMDM2ODcsImJpbGxpbmdfcmVmX2lkIjpudWxsLCJ1c2VyX3R5cGUiOiJhZG1pbiIsImFjY291bnRfc3RhdHVzIjoiYWN0aXZlIiwicmVjdXJseV9wYXltZW50X3N0YXR1cyI6InBhaWQiLCJjb3VudHJ5X2NvZGUiOjIyNCwiY291bnRyeV9uYW1lIjoiVW5pdGVkIFN0YXRlcyIsInR3b19kaWdpdF9jb3VudHJ5X2NvZGUiOiJVUyIsImN1cnJlbmN5X2NvZGUiOiJVU0QiLCJjdXJyZW5jeV9zeW1ib2wiOiIkIiwidGltZXpvbmUiOiIoR01ULTk6MDApICBBbGFza2EgVGltZSIsImlzX2Vhcmx5X2FjY2VzcyI6MCwiaXNfcHJlX2xhdW5jaCI6ZmFsc2UsImNoYXJnZWJlZV9lbnJvbGxlZCI6ZmFsc2UsImNoYXJnZWJlZV9lbmFibGVkIjpmYWxzZSwiY3JjX2JpbGxpbmdfZW5hYmxlZCI6ZmFsc2UsImlhdCI6MTcxMzM0OTQ3OSwibmJmIjoxNzEzMzQ5NDc5LCJleHAiOjE3MTM0MzU4Nzl9.bKeMDw6qqan4g3Avt_08L4ROVYAvf4jXWHIU5OVHMe8CUC5cbYowptrbAcxWMrZELx4lunDIZVAZ-7abjpbtqziWQbHj8meLjNf2iZc2t5mAX__0nc3Y8w3iKO1jcz8BJG_V5QDHKoMMoAifd51oxc0ODUXXzWexe7oNHnIZyAVc28HyaGJ5AtJmPyYnMUpA5Eo0FK3kTiHVQaMDSLhPcNPuD-bjD--wHaL3Ww3uE6klOAbN8gs62gAd4wkM1gB4wO1lzIoztf1cTg-vovRRpNbdEB_nvz5wVTRT8rhNvqjSMpJd_6jzPhH6OTV5H6FVm5nhV3CWMg5chnR92beTSg";

        // JSON payload for the POST request
        String jsonPayload = "{\n" +
                "  \"reminder_type\": \"Billing\",\n" +
                "  \"other_type\": \"\",\n" +
                "  \"color\": \"string\",\n" +
                "  \"subject\": \"task15\",\n" +
                "  \"start_date_reminder\": \"04/16/2024\",\n" +
                "  \"start_date_time\": \"22:00:00\",\n" +
                "  \"end_date_reminder\": \"12/28/2022\",\n" +
                "  \"end_date_time\": \"22:00:00\",\n" +
                "  \"location\": \"USA\",\n" +
                "  \"IsAllDayEvent\": 0,\n" +
                "  \"client_id\": 11,\n" +
                "  \"team_id\": 1,\n" +
                "  \"notes\": \"General task type\"\n" +
                "}";

        // Setting the base URL
        RestAssured.baseURI = baseUrl;

        // Making the POST request with the Bearer token in the header
        Response response = RestAssured.given()
                .contentType(ContentType.JSON) // Set content type as JSON
                .header("Authorization", "Bearer " + bearerToken) // Add Bearer token as a header
                .body(jsonPayload) // Set the JSON payload
                .log().all().post("/api/tasks?type=task"); // Specify the endpoint here

        // Printing the response

        System.out.println("Response status code: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody().asString());

    }
}
