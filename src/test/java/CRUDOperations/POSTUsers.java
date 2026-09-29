package CRUDOperations;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POSTUsers {

    @Test
    public void createUser() {

        RestAssured.baseURI = "https://reqres.in";

        String requestBody = """
        {
            "name":"Yogesh",
            "job":"QA Engineer"
        }
        """;
     
        Response response =
            given()
                .header("Content-Type", "application/json")
                .header("x-api-key", System.getenv("REQRES_API_KEY")) // Replace with your actual API key
                .body(requestBody)
            .when()
                .post("/api/users");

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 201);
    }
}