package restAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteRequestDemo {
    @Test
    public static void deleteUser() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users";
        given()
                .when()
                    .delete()
                .then()
                .statusCode(204);

    }
}
