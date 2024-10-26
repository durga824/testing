package com.apiAutomation;
import com.google.gson.JsonObject;
import com.pojo.Clients;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DifferentWaysToCreatePostRequestBody {
static  Response response;
static String id;

//  -- Using Hashmap

//    void testPostUsingHashMap(){
//       String baseUrl = "https://qa-api.creditrepaircloud.com";
//
//       RestAssured.baseURI = baseUrl;
//
//        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyZWdfaWQiOjkzMjAsInVzZXJfdHlwZSI6ImFkbWluIiwidXNlcl9pZCI6MTM4NjI5LCJyb2xlX2lkIjoxLCJjb21wYW55X25hbWUiOiJDUkMiLCJmaXJzdF9uYW1lIjoiR2VvcmdlIEhhcnJpc29uIiwibGFzdF9uYW1lIjoiSGFycmlzb24iLCJhZG1pbl9lbWFpbCI6ImRlYnVnbG9nQGNyZWRpdHJlcGFpcmNsb3VkLmNvbSIsImFjY291bnRfc3RhdHVzIjoiYWN0aXZlIiwicmVjdXJseV9wYXltZW50X1N0YXR1cyI6InBhaWQiLCJjb3VudHJ5X2NvZGUiOjIyNCwiY291bnRyeSI6IlVuaXRlZCBTdGF0ZXMiLCJjdXJyZW5jeV9zeW1ib2wiOiIkIiwiY29tcGFueV90aW1lem9uZSI6IkFtZXJpY2EvQW5jaG9yYWdlIn0.SzGU7ERA99-1OTSXEDGti-XItDHq0OHgLBLmJCvD-HaSRng6v_XWYcMsFqOa8sdP5FAsjtl1GIFYF1La4X7EkPs9S8o4IW7v-CM72sjYNahahXkW9MtjasCELEin4oZJPzBtuea_vGoWPgl6w6GjamEj6p7FNthaipmO9XEHUnDVg2qVFsuEA1H0u6Y1BAlXEnwJRa0gSkj9cvxXPgnUoJaWQGPWzw8N56MoTyWEQAMFD_t5P4Ku4oEYZAnZQrHZmegMdfaUwFxHIJM-fpHDkiVso3rpBBesI7qVa-jLV5t14WJWNhDggmGCDkiXU7nWTxT9CMp2qWCAzwrTGdQakg";
//        HashMap data = new HashMap();
//
//        data.put("title", "automation");
//        data.put("description", "test");
//
//         response = RestAssured.given()
//                .header("Authorization", "Bearer "+token)
//                .contentType(ContentType.JSON)
//                .body(data)
//                .when().post("api/invoice-options")
//                .then().extract().response();
//
//        String title = response.jsonPath().getString("invoice_option_details.title");
//        Assert.assertEquals(response.getStatusCode(), 201);
//        Assert.assertTrue(title.contains("automation"), "Title not contains");
//
//        System.out.println(response.prettyPrint());
//
//    }


////  -- Using Json Object
//    @Test(priority = 1)
//    void testPostUsingJsonLibrary(){
//        String baseUrl = "https://qa-api.creditrepaircloud.com";
//
//        RestAssured.baseURI = baseUrl;
//
//        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyZWdfaWQiOjkzMjAsInVzZXJfdHlwZSI6ImFkbWluIiwidXNlcl9pZCI6MTM4NjI5LCJyb2xlX2lkIjoxLCJjb21wYW55X25hbWUiOiJDUkMiLCJmaXJzdF9uYW1lIjoiR2VvcmdlIEhhcnJpc29uIiwibGFzdF9uYW1lIjoiSGFycmlzb24iLCJhZG1pbl9lbWFpbCI6ImRlYnVnbG9nQGNyZWRpdHJlcGFpcmNsb3VkLmNvbSIsImFjY291bnRfc3RhdHVzIjoiYWN0aXZlIiwicmVjdXJseV9wYXltZW50X1N0YXR1cyI6InBhaWQiLCJjb3VudHJ5X2NvZGUiOjIyNCwiY291bnRyeSI6IlVuaXRlZCBTdGF0ZXMiLCJjdXJyZW5jeV9zeW1ib2wiOiIkIiwiY29tcGFueV90aW1lem9uZSI6IkFtZXJpY2EvQW5jaG9yYWdlIn0.SzGU7ERA99-1OTSXEDGti-XItDHq0OHgLBLmJCvD-HaSRng6v_XWYcMsFqOa8sdP5FAsjtl1GIFYF1La4X7EkPs9S8o4IW7v-CM72sjYNahahXkW9MtjasCELEin4oZJPzBtuea_vGoWPgl6w6GjamEj6p7FNthaipmO9XEHUnDVg2qVFsuEA1H0u6Y1BAlXEnwJRa0gSkj9cvxXPgnUoJaWQGPWzw8N56MoTyWEQAMFD_t5P4Ku4oEYZAnZQrHZmegMdfaUwFxHIJM-fpHDkiVso3rpBBesI7qVa-jLV5t14WJWNhDggmGCDkiXU7nWTxT9CMp2qWCAzwrTGdQakg";
//
//        JSONObject data = new JSONObject();
//        data.put("title", "automation");
//        data.put("description", "test");
//
//        response = RestAssured.given()
//                .header("Authorization", "Bearer "+token)
//                .contentType(ContentType.JSON)
//                .body(data.toString())
//                .when().post("api/invoice-options")
//                .then().extract().response();
//
//        String title = response.jsonPath().getString("invoice_option_details.title");
//        id = response.jsonPath().getString("invoice_option_details.id");
//        Assert.assertEquals(response.getStatusCode(), 201);
//        Assert.assertTrue(title.contains("automation"), "Title not contains");
//
//        System.out.println(response.prettyPrint());
//
//    }


////  -- Using POJO Class
//
//    @Test(priority = 1)
//    void testPostUsingJsonLibrary(){
//
//        Clients data = new Clients();
//        data.setTitle("Testing");
//        data.setDescription("Auto");
//
//
//        String baseUrl = "https://qa-api.creditrepaircloud.com";
//
//        RestAssured.baseURI = baseUrl;
//
//        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyZWdfaWQiOjkzMjAsInVzZXJfdHlwZSI6ImFkbWluIiwidXNlcl9pZCI6MTM4NjI5LCJyb2xlX2lkIjoxLCJjb21wYW55X25hbWUiOiJDUkMiLCJmaXJzdF9uYW1lIjoiR2VvcmdlIEhhcnJpc29uIiwibGFzdF9uYW1lIjoiSGFycmlzb24iLCJhZG1pbl9lbWFpbCI6ImRlYnVnbG9nQGNyZWRpdHJlcGFpcmNsb3VkLmNvbSIsImFjY291bnRfc3RhdHVzIjoiYWN0aXZlIiwicmVjdXJseV9wYXltZW50X1N0YXR1cyI6InBhaWQiLCJjb3VudHJ5X2NvZGUiOjIyNCwiY291bnRyeSI6IlVuaXRlZCBTdGF0ZXMiLCJjdXJyZW5jeV9zeW1ib2wiOiIkIiwiY29tcGFueV90aW1lem9uZSI6IkFtZXJpY2EvQW5jaG9yYWdlIn0.SzGU7ERA99-1OTSXEDGti-XItDHq0OHgLBLmJCvD-HaSRng6v_XWYcMsFqOa8sdP5FAsjtl1GIFYF1La4X7EkPs9S8o4IW7v-CM72sjYNahahXkW9MtjasCELEin4oZJPzBtuea_vGoWPgl6w6GjamEj6p7FNthaipmO9XEHUnDVg2qVFsuEA1H0u6Y1BAlXEnwJRa0gSkj9cvxXPgnUoJaWQGPWzw8N56MoTyWEQAMFD_t5P4Ku4oEYZAnZQrHZmegMdfaUwFxHIJM-fpHDkiVso3rpBBesI7qVa-jLV5t14WJWNhDggmGCDkiXU7nWTxT9CMp2qWCAzwrTGdQakg";
//
//        response = RestAssured.given()
//                .header("Authorization", "Bearer "+token)
//                .contentType(ContentType.JSON)
//                .body(data)
//                .when().post("api/invoice-options")
//                .then().extract().response();
//
//        String title = response.jsonPath().getString("invoice_option_details.title");
//        id = response.jsonPath().getString("invoice_option_details.id");
//        Assert.assertEquals(response.getStatusCode(), 201);
//        Assert.assertTrue(title.contains("Testing"), "Title not contains");
//
//        System.out.println(response.prettyPrint());
//
//    }


//  -- Using external file

    @Test(priority = 1)
    void testPostUsingExternalFile() throws FileNotFoundException {

        File file = new File(".\\Post.json");

        FileReader fileReader = new FileReader(file);

        JSONTokener jsonTokener = new JSONTokener(fileReader);

        JSONObject data = new JSONObject(jsonTokener);

        String baseUrl = "https://qa-api.creditrepaircloud.com";

        RestAssured.baseURI = baseUrl;

        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyZWdfaWQiOjkzMjAsInVzZXJfdHlwZSI6ImFkbWluIiwidXNlcl9pZCI6MTM4NjI5LCJyb2xlX2lkIjoxLCJjb21wYW55X25hbWUiOiJDUkMiLCJmaXJzdF9uYW1lIjoiR2VvcmdlIEhhcnJpc29uIiwibGFzdF9uYW1lIjoiSGFycmlzb24iLCJhZG1pbl9lbWFpbCI6ImRlYnVnbG9nQGNyZWRpdHJlcGFpcmNsb3VkLmNvbSIsImFjY291bnRfc3RhdHVzIjoiYWN0aXZlIiwicmVjdXJseV9wYXltZW50X1N0YXR1cyI6InBhaWQiLCJjb3VudHJ5X2NvZGUiOjIyNCwiY291bnRyeSI6IlVuaXRlZCBTdGF0ZXMiLCJjdXJyZW5jeV9zeW1ib2wiOiIkIiwiY29tcGFueV90aW1lem9uZSI6IkFtZXJpY2EvQW5jaG9yYWdlIn0.SzGU7ERA99-1OTSXEDGti-XItDHq0OHgLBLmJCvD-HaSRng6v_XWYcMsFqOa8sdP5FAsjtl1GIFYF1La4X7EkPs9S8o4IW7v-CM72sjYNahahXkW9MtjasCELEin4oZJPzBtuea_vGoWPgl6w6GjamEj6p7FNthaipmO9XEHUnDVg2qVFsuEA1H0u6Y1BAlXEnwJRa0gSkj9cvxXPgnUoJaWQGPWzw8N56MoTyWEQAMFD_t5P4Ku4oEYZAnZQrHZmegMdfaUwFxHIJM-fpHDkiVso3rpBBesI7qVa-jLV5t14WJWNhDggmGCDkiXU7nWTxT9CMp2qWCAzwrTGdQakg";

        response = RestAssured.given()
                .header("Authorization", "Bearer "+token)
                .contentType(ContentType.JSON)
                .body(data.toString())
                .when().post("api/invoice-options")
                .then().extract().response();

        String title = response.jsonPath().getString("invoice_option_details.title");
        id = response.jsonPath().getString("invoice_option_details.id");
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertTrue(title.contains("automation"), "Title not contains");

        System.out.println(response.prettyPrint());

    }

    @Test(priority = 2)
    void testDelete(){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJyZWdfaWQiOjkzMjAsInVzZXJfdHlwZSI6ImFkbWluIiwidXNlcl9pZCI6MTM4NjI5LCJyb2xlX2lkIjoxLCJjb21wYW55X25hbWUiOiJDUkMiLCJmaXJzdF9uYW1lIjoiR2VvcmdlIEhhcnJpc29uIiwibGFzdF9uYW1lIjoiSGFycmlzb24iLCJhZG1pbl9lbWFpbCI6ImRlYnVnbG9nQGNyZWRpdHJlcGFpcmNsb3VkLmNvbSIsImFjY291bnRfc3RhdHVzIjoiYWN0aXZlIiwicmVjdXJseV9wYXltZW50X1N0YXR1cyI6InBhaWQiLCJjb3VudHJ5X2NvZGUiOjIyNCwiY291bnRyeSI6IlVuaXRlZCBTdGF0ZXMiLCJjdXJyZW5jeV9zeW1ib2wiOiIkIiwiY29tcGFueV90aW1lem9uZSI6IkFtZXJpY2EvQW5jaG9yYWdlIn0.SzGU7ERA99-1OTSXEDGti-XItDHq0OHgLBLmJCvD-HaSRng6v_XWYcMsFqOa8sdP5FAsjtl1GIFYF1La4X7EkPs9S8o4IW7v-CM72sjYNahahXkW9MtjasCELEin4oZJPzBtuea_vGoWPgl6w6GjamEj6p7FNthaipmO9XEHUnDVg2qVFsuEA1H0u6Y1BAlXEnwJRa0gSkj9cvxXPgnUoJaWQGPWzw8N56MoTyWEQAMFD_t5P4Ku4oEYZAnZQrHZmegMdfaUwFxHIJM-fpHDkiVso3rpBBesI7qVa-jLV5t14WJWNhDggmGCDkiXU7nWTxT9CMp2qWCAzwrTGdQakg";

        response = RestAssured.given()
                .header("Authorization", "Bearer "+token)
                .delete("api/invoice-options/"+ id)
                .then().extract().response();

        System.out.println(response.prettyPrint());
        Assert.assertTrue(response.jsonPath().getString("message").contains("Options deleted successfully"));
    }

}
