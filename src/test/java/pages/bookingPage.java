package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bookingPage extends BasePage {

@FindBy (xpath = "//input[@type='search']")
    public WebElement search;


@FindBy (xpath = "(//div[@class='sb-searchbox__input sb-date-field__field  -empty sb-date__field-svg_icon'])[1]")
    public WebElement checkinDate;


@FindBy (xpath = "(//div[@class='sb-searchbox__input sb-date-field__field  -empty sb-date__field-svg_icon'])[2]")
    public WebElement checkoutDate;

////span[@class='xp__guests__count']

    @FindBy (xpath = "span[@class='xp__guests__count']")
    public WebElement guestCount;




}
