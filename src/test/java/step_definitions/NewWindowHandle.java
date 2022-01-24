package step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Driver;

import java.util.Set;

public class NewWindowHandle {

    public static void main(String[] args) {

        Driver.getDriver().get("http://demoqa.com/browser-windows");
        Driver.getDriver().findElement(By.id("details-button")).click();
        Driver.getDriver().findElement(By.partialLinkText("demoqa.com sitesine ilerle (güvenli değil)")).click();
        Driver.getDriver().findElement(By.id("messageWindowButton")).click();

       /* String mainWindowHandle= Driver.getDriver().getWindowHandle();

        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String E: windows
        ) {
            if (!(E == mainWindowHandle)) {
                Driver.getDriver().switchTo().window(E);
            }

        }

        */
 Driver.getDriver().switchTo().defaultContent().getCurrentUrl();

        System.out.println("*******");
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().findElement(By.tagName("body")).getText());
    }
}
