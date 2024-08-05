package airline;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtitls;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class GetAirlineDetails {

    @Test
    public void getAllAirlineDetails(){
        Response response = given().
                baseUri("https://api.instantwebtools.net/v1/airlines").
                contentType("Application/Json").
                when().
                get().
                then().
                statusCode(200).log().all().extract().response();
        Assert.assertEquals(response.statusCode(),200);
    }


    @Test
    public void getAllAirlineDetailsSimple(){
        given().get("https://api.instantwebtools.net/v1/airlines").
                then().
                statusCode(200).log().all();
    }

    @Test
    public void postCall(){
            String endPoint = "https://api.instantwebtools.net/v1/airlines";
            String payload = "{\n" +
                    "    \"_id\":\"252d3bca-d9bb-476c-9a97-562d685e235c\",\n" +
                    "    \"name\": \"Sri Lankan Airways\",\n" +
                    "    \"country\": \"Sri Lanka\",\n" +
                    "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                    "    \"slogan\": \"From Sri Lanka\",\n" +
                    "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                    "    \"website\": \"www.srilankaaairways.com\",\n" +
                    "    \"established\": \"1990\"\n" +
                    "}";



            Response response = RestUtitls.performPost(endPoint,payload,new HashMap<>());
                    Assert.assertEquals(response.statusCode(),200);
    }

}
