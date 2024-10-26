package com.apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PathAndQueryParameters {
    static Response response;

    void testQueryAndPathParameters(){

        String baseUrl = "https://qa-api.creditrepaircloud.com";

        RestAssured.baseURI = baseUrl;

        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyZWdfaWQiOjkzMjAsInVzZXJfdHlwZSI6ImFkbWluIiwidXNlcl9pZCI6MTM4NjI5LCJyb2xlX2lkIjoxLCJjb21wYW55X25hbWUiOiJDUkMiLCJmaXJzdF9uYW1lIjoiR2VvcmdlIEhhcnJpc29uIiwibGFzdF9uYW1lIjoiSGFycmlzb24iLCJhZG1pbl9lbWFpbCI6ImRlYnVnbG9nQGNyZWRpdHJlcGFpcmNsb3VkLmNvbSIsImFjY291bnRfc3RhdHVzIjoiYWN0aXZlIiwicmVjdXJseV9wYXltZW50X1N0YXR1cyI6InBhaWQiLCJjb3VudHJ5X2NvZGUiOjIyNCwiY291bnRyeSI6IlVuaXRlZCBTdGF0ZXMiLCJjdXJyZW5jeV9zeW1ib2wiOiIkIiwiY29tcGFueV90aW1lem9uZSI6IkFtZXJpY2EvQW5jaG9yYWdlIn0.SzGU7ERA99-1OTSXEDGti-XItDHq0OHgLBLmJCvD-HaSRng6v_XWYcMsFqOa8sdP5FAsjtl1GIFYF1La4X7EkPs9S8o4IW7v-CM72sjYNahahXkW9MtjasCELEin4oZJPzBtuea_vGoWPgl6w6GjamEj6p7FNthaipmO9XEHUnDVg2qVFsuEA1H0u6Y1BAlXEnwJRa0gSkj9cvxXPgnUoJaWQGPWzw8N56MoTyWEQAMFD_t5P4Ku4oEYZAnZQrHZmegMdfaUwFxHIJM-fpHDkiVso3rpBBesI7qVa-jLV5t14WJWNhDggmGCDkiXU7nWTxT9CMp2qWCAzwrTGdQakg";

        response = RestAssured.given()
                .header("Authorization", "Bearer "+token)
                .pathParam("mypath", "users")     //Path parameter
                .queryParams("page", 2)    //Query param
                .queryParams("id", 5)   // query param

                .when().get("api/invoice-options")
                .then().extract().response();

    }
}
