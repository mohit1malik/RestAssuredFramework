<<<<<<<< HEAD:src/test/java/restUtils/JsonSchemaValidator.java
package restUtils;
========
package RestAssuredClasses;
>>>>>>>> main:src/test/java/RestAssuredClasses/JsonSchemaValidator.java

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class JsonSchemaValidator {
    @Test
    public void JsonSchemaValidate(){
        baseURI = "https://reqres.in/api";

        given().
                get("/users/2").
                then().
                statusCode(200).
                assertThat().body(matchesJsonSchemaInClasspath("user_schema.json"));

    }
}
