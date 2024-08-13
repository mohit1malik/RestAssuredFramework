package restUtils;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;


public class CURD_Operations_API {
    @Test
    public void getTest(){
        baseURI= "https://reqres.in/api";
        given().get("/users?page=2")
                .then()
                        .statusCode(201);
    }

    @Test
    public void postTest(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name", "Roberrtt");
        map.put("job", "Typist");

        System.out.println(map);

        JSONObject request = new JSONObject(map);
        System.out.println(request);
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";

        given().
                header("Conten-Type", "application/json").
                contentType(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post("/users").
        then().
                statusCode(201).
                log().all();

    }

    @Test
    public void putTest(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("last_name", "Typist");

        System.out.println(map);

        JSONObject request = new JSONObject(map);
        System.out.println(request);
        System.out.println(request.toJSONString());

        baseURI = "https://reqres.in/api";

        given().
                header("content-type","application/json" ).
                body(request.toJSONString()).
        when(). put("/users/2").
        then().
                statusCode(200).log().all();

    }
}
