package restUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestUtitls {
    public static Response performPost(String endPoint, String payload, Map<String,String> headers){

        return given().baseUri(endPoint).
                contentType(ContentType.JSON).
                headers(headers).
                body(payload).
                when().post().
                then().statusCode(200).log().all().extract().response();
    }

}
