package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;

public class booking {



    @When("Musteri {string} sayfayı acar")
    public void musteri_sayfayı_acar(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("bookingUrl"));
    }




    @Given("Anasayfadaki Hotels linkine tıklar")
    public void anasayfadaki_hotels_linkine_tıklar() {


    }
    @Given("{string} bölümüne \"New York” yazar")
    public void bölümüne_new_york_yazar(String city) {


    }
    @Given("{int} Aralık ile {int} Aralık tarihleri arasında {string} Yetişkin ve {string} yaşında bir çocuk için hotel araması yapılabilmeli.")
    public void aralık_ile_aralık_tarihleri_arasında_yetişkin_ve_yaşında_bir_çocuk_için_hotel_araması_yapılabilmeli(Integer int1, Integer int2, String string, String string2) {

    }
    @Then("Sonuc sayfasına gecince {string} butonuna tıklayabilmeli ve sonuçları görebilmelidir.")
    public void sonuc_sayfasına_gecince_butonuna_tıklayabilmeli_ve_sonuçları_görebilmelidir(String string) {

    }

}
