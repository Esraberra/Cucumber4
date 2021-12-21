package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Amazon;
import utilities.BrowserUtilities;
import utilities.Driver;



public class AmazonRegisterStepDefinitions {
    Amazon page=new Amazon();
    @Given("user goes to {string}")
    public void userGoesTo(String adres) {
        Driver.getDriver().get(adres);
    }

    @Then("hover over to account&signs")
    public void hoverOverToAccountSigns() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(page.accountSignIn).perform();

    }

    @Then("click startHereLink link")
    public void clickStartHereLink() {

        page.startHereLink.click();
    }

    @And("fill the create account part {string}, {string},{string},{string}")
    public void fillTheCreateAccountPart(String name, String email, String password, String passwordCheck) {

        page.nameInput.sendKeys(name);
        page.eMailInput.sendKeys(email);
        page.password.sendKeys(password);
        page.passwordCheck.sendKeys(passwordCheck);

    }

    @When("then click the continue Button")
    public void thenClickTheContinueButton() {

        BrowserUtilities.waitFor(3);
        page.continueL.click();

    }

    @Then("{string} text")
    public void text(String text) {

      text=  page.verifyEmail.getText();
        Assert.assertTrue("expected message is not displayed",text.equals("Verify email address"));
    }
}

