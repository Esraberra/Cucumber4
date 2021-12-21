package step_definitions;

import com.google.common.collect.Ordering;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.requests.OrderingRequest;
import org.junit.runner.manipulation.Orderable;

import java.util.List;

public class apiAssignment1 {


    /*
Technical Assigment 3 =====>>> Sizinle paylaşılan sayfadan API ile aldığınız verilerin sıralı olup olmadığını kontrol ediniz. (ürün ismine göre)
gelen veriler sirali mi onu test et
Assignment için bahsettiğim api adresleri;
kullanıcı oluşturma  : https://basicapitest.herokuapp.com/api/kullanici/olusturma  (post tipinde)
kullanıcı sorgulama : https://basicapitest.herokuapp.com/api/kullanici/bilgi  (get tipinde)
ürün listesi               : https://basicapitest.herokuapp.com/api/urun_listesi (get tipinde)
     */

    @Test
    public void test(){

//Assignment 3
        RestAssured.baseURI="https://basicapitest.herokuapp.com";

        RequestSpecification request=RestAssured.given();

        Response response= request.when().contentType(ContentType.JSON).get("/api/urun_listesi");


//response.prettyPrint();
        JsonPath json=response.jsonPath();
        System.out.println(json.getList("isim"));

        List<String> isimListe= json.getList("isim");

        Assert.assertTrue(Ordering.natural().isOrdered(isimListe));

    }

}
