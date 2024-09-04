
package RestAssuredClasses;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestExample {

    public void test1(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getStatusCode());

        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
}
