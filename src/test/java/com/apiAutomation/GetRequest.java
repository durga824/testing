package com.apiAutomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.checkerframework.checker.index.qual.LessThan;
import org.testng.Assert;

import java.io.File;

public class GetRequest {

    public static void main(String[] args) {


        RestAssured.baseURI = "https://qa-api.creditrepaircloud.com";
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpZCI6ImY4MTdiM2JiODY2MDBhNTM5YTIwYWJiNjA0ZTMyZDNlM2ExOTc2OGUxMzAwMTYzYWFiNTk0MzY4YjIxZTcyODRmNWEzM2JjYmE5MWY5YWM5IiwiY29tcGFueV9uYW1lIjoiTXkgQ3JlZGl0IHJlcGFpciBjb21wYW55IiwiZmlyc3RfbmFtZSI6IlJlYWN0IiwibGFzdF9uYW1lIjoiQXBwIiwiYWRtaW5fZW1haWwiOiJyZWFjdGFwcDFAeW9wbWFpbC5jb20iLCJ1c2VyX2lkIjozOTk5MDQsInJlZ19pZCI6MjA0NzE1LCJiaWxsaW5nX3JlZl9pZCI6ImNiYjA2NWEwLWFkYmQtNDRhZS1hYTg4LTlhOTYyZThkMTJiNCIsInVzZXJfdHlwZSI6ImFkbWluIiwiYWNjb3VudF9zdGF0dXMiOiJhY3RpdmUiLCJyZWN1cmx5X3BheW1lbnRfc3RhdHVzIjoicGFpZCIsImNvdW50cnlfY29kZSI6MjI0LCJjb3VudHJ5X25hbWUiOiJVbml0ZWQgU3RhdGVzIiwidHdvX2RpZ2l0X2NvdW50cnlfY29kZSI6IlVTIiwiY3VycmVuY3lfY29kZSI6IlVTRCIsImN1cnJlbmN5X3N5bWJvbCI6IiQiLCJ0aW1lem9uZSI6IkFtZXJpY2EvTmV3X1lvcmsiLCJpc19lYXJseV9hY2Nlc3MiOjEsImlzX3ByZV9sYXVuY2giOmZhbHNlLCJjaGFyZ2ViZWVfZW5yb2xsZWQiOnRydWUsImNoYXJnZWJlZV9lbmFibGVkIjp0cnVlLCJjcmNfYmlsbGluZ19lbmFibGVkIjp0cnVlLCJpYXQiOjE3MjM1NDQzODcsIm5iZiI6MTcyMzU0NDM4NywiZXhwIjoxNzIzNjMwNzg3fQ.HyWM-7Z58W-A6Ga6Sw_H5QRmyp5tyfYvU0knH8qCU5SRQ1WnUymW-zyPWRyRfzK_koUf_0ZUL3J27FIwN9YylMRPGgP165vQRTmHJmiE9kv80yoOA7N2-09HOJkcWOIyqKQwUGYlHXfpl8feuLyf1I1JKpuefzSP_72cEB0Wc6_1uTwAo2jmO7FqL4rg70gUMiri3BUBZ6-TQCzJt6sASasgW892oiB9Ge0SqyTCDeRo5p6kd-TlD1wp-41QJwenkXCBQtWTWr0itqSD5gPXpzGTu2WtaNM_oGA9u6s2bQP_U6OyQ-ylhfwaCu7q0cA1hufggYf6gixdGgcG8VSPog";

        Response response = RestAssured
                .given()
                .header("Authorization", "Bearer "+token)
                .when()
                .get("/api/client-self-onboarding/settings")
                .then().extract().response();
        System.out.println(response.prettyPrint());

        String onboardingId = response.jsonPath().getString("onboarding_settings.id");

        Assert.assertTrue(response.time()<= 5000);

        System.out.println(onboardingId);


        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.getBody().toString().contains("id"));
        Assert.assertTrue(response.getTime()<= 8000L);

        File file = new File("");

        RestAssured.given()
                .multiPart("file", file);


    }
}
