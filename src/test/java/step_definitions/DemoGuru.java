package step_definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;

public class DemoGuru {


    @Given("Demo guru sitesine gider ve bir company secer")
    public void demo_guru_sitesine_gider_ve_bir_company_secer() throws InterruptedException {
        Driver.getDriver().get("https://demo.guru99.com/test/web-table-element.php");
        Thread.sleep(4000);
        Driver.getDriver().switchTo().frame(4);
        Driver.getDriver().findElement(By.id("save")).click();


        //  WebElement element = Driver.getDriver().findElement(By.xpath("(*//table/tbody/tr/td/a)[3]"));
        String sColValue = "Bank";

        List<WebElement> elementList = Driver.getDriver().findElements(By.xpath("*//table/tbody/tr/td/a"));

        WebElement elementTable=Driver.getDriver().findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
        List<WebElement> rows=elementTable.findElements(By.tagName("tr"));
        for(int rnum=0;rnum<rows.size();rnum++)
        {
            List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));
            System.out.println("Number of columns:"+columns.size());
            for(int cnum=0;cnum<columns.size();cnum++)
            {
                if (columns.get(cnum).getText().contains("Rashtriya Chemicals")) {
                    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
                    js.executeScript("arguments[0].click()", columns.get(cnum));

                }
                System.out.println(columns.get(cnum).getText());
            }
        }




        }

        }
