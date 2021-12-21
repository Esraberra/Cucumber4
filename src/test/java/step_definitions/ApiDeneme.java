package step_definitions;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Test;

public class ApiDeneme {



    @Test
    public void test(){

        RestAssured.baseURI="https://basicapitest.herokuapp.com";

        RequestSpecification request=RestAssured.given();
        request.header("Content-Type","application/json");
        JSONObject datas=new JSONObject();

datas.put("deneme",1234);
datas.put("isim","Esra");

request.body(datas.toString());
request.when().post("","");


//queryparams bölümüne nasil data eklenir?

        request.param("deneme",1234);

    }




}
