package com.apiTests;

import com.pojo.GetClients;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Clients {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://qa-api.creditrepaircloud.com";
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpZCI6IjJjNzY5MGI1MWI3NDU0NDc4MTMxZDI4NWY2YmU0YWIzOTA2MTRmYzhjNjY5NDkzOThlMDgyZGRkMGU1ZDk1ODhjOGQwMTgyOWRmMGUzZDY2IiwiY29tcGFueV9uYW1lIjoiQXV0b21hdGlvbiIsImZpcnN0X25hbWUiOiJwYXltZW50cyIsImxhc3RfbmFtZSI6InRlc3QiLCJhZG1pbl9lbWFpbCI6InBheW1lbnR0ZXN0OTBAeW9wbWFpbC5jb20iLCJ1c2VyX2lkIjo0MDA4ODUsInJlZ19pZCI6MjA0Nzg5LCJiaWxsaW5nX3JlZl9pZCI6IjA4MzdmMjIwLTYzNzItNDg3Yy05ZWM1LWVkYTIyNzlkMzIzYiIsInVzZXJfdHlwZSI6ImFkbWluIiwiYWNjb3VudF9zdGF0dXMiOiJhY3RpdmUiLCJyZWN1cmx5X3BheW1lbnRfc3RhdHVzIjoicGFpZCIsImNvdW50cnlfY29kZSI6MjI0LCJjb3VudHJ5X25hbWUiOiJVbml0ZWQgU3RhdGVzIiwidHdvX2RpZ2l0X2NvdW50cnlfY29kZSI6IlVTIiwiY3VycmVuY3lfY29kZSI6IlVTRCIsImN1cnJlbmN5X3N5bWJvbCI6IiQiLCJ0aW1lem9uZSI6IihHTVQtOTowMCkgIEFsYXNrYSBUaW1lIiwiaXNfZWFybHlfYWNjZXNzIjoxLCJpc19wcmVfbGF1bmNoIjpmYWxzZSwiY2hhcmdlYmVlX2Vucm9sbGVkIjp0cnVlLCJjaGFyZ2ViZWVfZW5hYmxlZCI6dHJ1ZSwiY3JjX2JpbGxpbmdfZW5hYmxlZCI6dHJ1ZSwiaWF0IjoxNzE2NzEwNDg0LCJuYmYiOjE3MTY3MTA0ODQsImV4cCI6MTcxNjc5Njg4NH0.h3FniIE4ibm5cRUolRcMHKmbexsOqh0MUlEocZ4HP8OJb4dEVKpsKjUHfEnPvS8U5XOzpNvoM-DALDTPkvZGQkdJyHhoG-QkHCrfmfdJuSIID7dI62_RmQj7OtckM69yTdnmtICv6IZuHxz0hd2b_hoPsSXeznzNu3sHrn9c9Vfbn-aRCOtQ9IhCFxY5-RlEPO6n1LK2S-RrWBos4IIgYyy1RS3zyQKnAqR_Xh6rRMNeWbsQDoOsbiK9Wm8lznVGmg_Rye21moHNvyBTsydLDiUwh_Bh8OwvtRXAVWr8F9Ab0YSCq07nlQB0J1Yd2QGXBdCvL56B8S8544ZvrD3zIA";

        GetClients response =
                RestAssured.given()
                        .header("Authorization", "Bearer "+token)
                        .header("Content-Type", "application/json")
                        .queryParams("type", "myclients", "page", "1", "limit", "20")
                        .when().get("/api/clients")
                        .as(GetClients.class);

        System.out.println(response.getCount());



    }


}
