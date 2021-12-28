package step_definitions;

import com.google.common.collect.Ordering;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.bookingPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class booking {

bookingPage page=new bookingPage();
Actions actions=new Actions(Driver.getDriver());

    @When("Musteri {string} sayfayı acar")
    public void musteri_sayfayı_acar(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("bookingUrl"));
        page.cerez.click();



    }



    @Given("{string} bölümüne \"New York” yazar")
    public void bölümüne_new_york_yazar(String city) {
        BrowserUtilities.waitFor(2);
        page.search1.sendKeys("New York");


    }

    @Then("Sonuc sayfasına gecince {string} butonuna tıklayabilmeli ve sonuçları görebilmelidir.")
    public void sonuc_sayfasına_gecince_butonuna_tıklayabilmeli_ve_sonuçları_görebilmelidir(String string) {

        page.priceLow.click();
/*
      List<WebElement> LIST= Driver.getDriver().findElements(By.xpath("//span[@class='fde444d7ef _e885fdc12']"));

      List<String> listeÜrun=new ArrayList<>();
        for (WebElement e:LIST
             ) {
            System.out.println(e.getText());
        }

 */
        System.out.println(BrowserUtilities.getElementsText(By.xpath("//span[@class='fde444d7ef _e885fdc12']")));

        BrowserUtilities.waitFor(2);

    }



    @And("yirmi iki Aralık ile yirmibes Aralık tarihleri arasında {string} Yetişkin ve {string} yaşında bir çocuk için hotel araması yapılabilmeli.")
    public void yirmiIkiAralıkIleYirmibesAralıkTarihleriArasındaYetişkinVeYaşındaBirÇocukIçinHotelAramasıYapılabilmeli(String arg0, String arg1) {


        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB). build().perform();
        actions  . sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

        BrowserUtilities.waitFor(4);
        Select select=new Select(page.childAge);
        select.selectByValue("12");
        BrowserUtilities.waitFor(3);


        Select select1=new Select(page.selectCheckinMonth);
        select1.selectByValue("11-2021");
        Select selectday=new Select(page.checkinDay);
        selectday.selectByValue("22");

        Select select2=new Select(page.selectCheckoutMonth);
        select2.selectByVisibleText("Aralık 2021");
        Select select3=new Select(page.selectCheckoutDay);
        select3.selectByVisibleText("26, Pazar");
        page.ara.click();

    }
}
