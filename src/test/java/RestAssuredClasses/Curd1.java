package RestAssuredClasses;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Curd1 {

    @Test
    public void getTest(){
        Response response = get("https://reqres.in/api/users/2");
        String value = response.then().extract().jsonPath().getString("data.id");
        response.then().statusCode(200).log().all();
        System.out.println(value);
    }


    @Test
    public void getTest1(){
//        given().get()
    }
}
