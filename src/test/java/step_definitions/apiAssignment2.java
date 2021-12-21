package step_definitions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class apiAssignment2 {


    /*
    Technical Assigment 4 =====>>>
    API ile oluşturduğunuz kullanıcı
    kaydının,
    kullanıcı kayıtları
     bölümündeki sayfada varlığını doğrulayınız.
    Assignment için bahsettiğim api adresleri;
kullanıcı oluşturma  : https://basicapitest.herokuapp.com/api/kullanici/olusturma  (post tipinde)
kullanıcı sorgulama : https://basicapitest.herokuapp.com/api/kullanici/bilgi  (get tipinde)
ürün listesi               : https://basicapitest.herokuapp.com/api/urun_listesi (get tipinde)
     */

@Test
    public void test(){

    RestAssured.baseURI="https://basicapitest.herokuapp.com";
    RequestSpecification request=RestAssured.given();

    //kayit icin gönderdim
    JSONObject jsonObject= new JSONObject();


    jsonObject.put("isim","Esra");
    jsonObject.put("email","esra@gmail.com");
    jsonObject.put("sifre","1234");


    /*
    expectedData;{
    "sonuc": "sonuc",
    "email": "esra@gmail.com",
    "isim": "Esra",
    "sifre": "1234"
}
     */

    Response response=request.given().accept(ContentType.JSON).body(jsonObject).when().post("https://basicapitest.herokuapp.com/api/kullanici/olusturma");

    response.prettyPrint();
//bekledigim data
    JSONObject expectedData=new JSONObject();
    expectedData.put("sonuc","success");
    expectedData.put("email","esra@gmail.com");
    expectedData.put("isim","Esra");
    expectedData.put("sifre","1234");


    Response response1=request.given().accept(ContentType.JSON).when().get("https://basicapitest.herokuapp.com/api/kullanici/bilgi?email=esra@gmail.com");


    response1.prettyPrint();
    JsonPath jsonPath=response1.jsonPath();

    Assert.assertEquals(expectedData.getString("sonuc"),jsonPath.getString("sonuc"));
    Assert.assertEquals(expectedData.getString("email"),jsonPath.getString("email"));
    Assert.assertEquals(expectedData.getString("isim"),jsonPath.getString("isim"));
    Assert.assertEquals(expectedData.getString("sifre"),jsonPath.getString("sifre"));
}



}
