package restAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class PutRequestDemo {
public  static  HashMap map=new HashMap();
@BeforeClass
public static void putData(){
    map.put("name",RestUtils.getUserName());
    map.put("job",RestUtils.getJob());
    RestAssured.baseURI="https://reqres.in";
    RestAssured.basePath="/api/users/2";
}
@Test
public static void testPUT(){
    given()
                .contentType("application/json")
                .body(map)
            .when()
                .put()
            .then()
                .statusCode(200)
                .log().all();

}

}
