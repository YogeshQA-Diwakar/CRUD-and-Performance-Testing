package CRUDOperations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETUsers {
    private static final Logger log = LogManager.getLogger(GETUsers.class);
    @Test
    public void getUsers() {

        RestAssured.baseURI = "https://reqres.in";

        Response response =
                given()
                .header("x-api-key", System.getenv("REQRES_API_KEY"))
                .when()
                .get("/api/users?page=2")
                .then()
                .extract()
                .response();

        log.info("Sending GET Request...");
        log.info("Status Code : " + response.getStatusCode());
        log.info("Response Body:");
        log.info(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}