package restAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import static io.restassured.RestAssured.given;
public class PostRequestDemo {
    public static HashMap map = new HashMap();
    @BeforeClass
    public void postData(){
        map.put("name", RestUtils.getUserName());
        map.put("job", RestUtils.getJob());

        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="/api/users";
    }
    @Test
    public void testPost(){
        given()
                    .contentType("application/json")
                    .body(map)
                .when()
                    .post()
                .then()
                    .statusCode(201);
    }

}
