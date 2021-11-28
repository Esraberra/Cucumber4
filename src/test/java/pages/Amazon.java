package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon extends BasePage {
    /* 1.WithURL go to https://wwww.amazon.com

    2.hover over to account&signs
    3.then click 'start here' link
    4.fill the 'create account' part
  datas:your name:Esra
  Mobile number or email:esraberra6@gmail.com
  PASSWORD: 3434!uK
  Re-enter password :3434!uK
  5.then clcik the continue Button
  6. verify: user should see "Verify email address" text


     */


    @FindBy(partialLinkText = "Account & Lists")

    public WebElement accountSignIn;


    @FindBy(partialLinkText="Start here.")
    public WebElement startHereLink;

    @FindBy (id = "ap_customer_name")
    public WebElement nameInput;


    @FindBy (id = "ap_email")
    public WebElement eMailInput;


    @FindBy(id="ap_password")
    public WebElement password;

    @FindBy(id="ap_password_check")
    public WebElement passwordCheck;

    @FindBy(xpath = "//input[@id='continue']")

    public WebElement continueL;

    @FindBy(xpath = "//h1[text()='Verify email address']")

    public  WebElement verifyEmail;



}
