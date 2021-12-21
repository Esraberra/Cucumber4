package step_definitions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class apiDeneme2 {



    @Test

    public void test(){

        RestAssured.baseURI="https://basicapitest.herokuapp.com";

        RequestSpecification request=RestAssured.given();

        Response response=request.when().get("/api/urun_listesi").
                then().extract().response();

        String server=response.headers().get("Server").getValue();

     //   System.out.println(response.headers().toString());
        System.out.println(server);
        Assert.assertEquals("Cowboy",server);

        response.headers().get("Conten-Type").getValue();


    }
}
