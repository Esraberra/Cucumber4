package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.customer;
import utilities.ConfigurationReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GmiBankApi1 {
    Response response;
    String bearerToken= ConfigurationReader.getProperty("api_bearer_Token");

    customer [] customers;
    String fileName=ConfigurationReader.getProperty("fileNameOfCustomerSSN");

    @Given("Kullanici Api endpointe gidecek {string} datalari alacak")
    public void kullanici_api_endpointe_gidecek_datalari_alacak(String url) {
        response=given().headers(
                "Authorization",
                "Bearer " + bearerToken,
                "Content-Type",
                ContentType.JSON,
                "Accept",ContentType.JSON
                ).when().get(url).
                then().contentType(ContentType.JSON).extract().response();
response.prettyPrint();

    }




    @Given("Kullanici müsteri datalari alir")
    public void kullanici_müsteri_datalari_alir() throws IOException {

        ObjectMapper obj=new ObjectMapper();

customers=obj.readValue(response.asString(), customer [].class);

        for (int i = 0; i < customers.length; i++) {
           // System.out.println(customers[i].getId());
          //  System.out.println(customers[i].getFirstName());

        }

        }


    @Then("kullanici aldigi datalari kaydeder")
    public void kullanici_aldigi_datalari_kaydeder() {
WriteToTxt.saveDataInFileWithSSN(fileName, customers);

    }

    @Then("kullanici Customer datalarini onaylar")
    public void kullanici_customer_datalarini_onaylar() {

        List<String> expectedList=new ArrayList<>();
expectedList.add("821-84-3971");
       // expectedList.add("584-56-2333");

       List<String> actualSsnList= ReadTxt.returnCustomerSNNList(fileName);

        Assert.assertTrue("SSN DOESNT MATCH",actualSsnList.containsAll(expectedList));

    }

}
