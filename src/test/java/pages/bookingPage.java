package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class bookingPage extends BasePage {

@FindBy (xpath = "//input[@type='search']")
    public WebElement search;
@FindBy(id = "onetrust-accept-btn-handler")
public WebElement cerez;

//  (//div[@class='sb-date-field__wrapper'])[1]

    // //div[@class='sb-date-field b-datepicker']
@FindBy (xpath = "(//div[@class='sb-date-field__display'])[1]")
    public WebElement checkinDate;

    @FindBy (xpath = "(//div[@class='sb-date-field__display'])[1]")
    public WebElement checkinDate2;



@FindBy(xpath = "//select[@name='checkin_monthday']")
public WebElement checkinDay;

@FindBy (xpath = "(//div[@class='sb-date-field__display'])[2]")
    public WebElement checkoutDate;

@FindBy(xpath = "(//select[@class='sb-date-field__select-field js-date-field__select'])[1]")
public WebElement selectCheckinMonth;
    @FindBy(xpath = "(//select[@class='sb-date-field__select-field js-date-field__select'])[3]")
    public WebElement selectCheckoutMonth;


@FindBy(xpath = "(//select[@class='sb-date-field__select-field js-date-field__select'])[4]")
public WebElement selectCheckoutDay;


@FindBy (xpath = "//label[@class='sb-destination-label-sr']")
public WebElement search1;
    //
    @FindBy (xpath = "//div[@class='xp__input-group xp__guests']")
    public WebElement guestCount;
@FindBy(id = "doneBtn")
public WebElement doneButton;




    @FindBy(className = "sb-group-field-has-error")
    public WebElement childrenAge;

@FindBy(name = "age")
    public WebElement childAge;


@FindBy(xpath = "//button[@data-sb-id='main']")
public WebElement ara;
@FindBy(xpath = "//table/tbody/tr[4]/td[3]")
    public WebElement checkinNovember;
@FindBy(xpath = "//table/tbody/tr[4]/td[6]")
    public WebElement checkoutNovember;

@FindBy(partialLinkText = "Fiyat (önce en düşük)")
    public WebElement priceLow;


private static By calendar= By.id("calendar");

private static By baltikDeniz=By.xpath("//span[contains(text(),'Deniz')]");

public static String getBaltikDenizText(By locator)
{

    WebElement element = Driver.getDriver().findElement(locator);
    Wait<WebDriver> wait=new FluentWait<WebDriver>(Driver.getDriver()).
            withTimeout(Duration.ofSeconds(10)).
            pollingEvery(Duration.ofSeconds(2)).withMessage("method failed");
    wait.until(ExpectedConditions.visibilityOf(element)).getText();



    return element.getText();


}

    public static void main(String[] args) throws NoSuchMethodException {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.elementToBeClickable(baltikDeniz));


        //bir kelimenin uzunluugunu hesaplama




    }



}
