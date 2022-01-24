package step_definitions;

import org.openqa.selenium.By;
import utilities.Driver;

import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {
        Driver.getDriver().get("http://demoqa.com/browser-windows");
Driver.getDriver().findElement(By.id("details-button")).click();
Driver.getDriver().findElement(By.partialLinkText("demoqa.com sitesine ilerle (güvenli değil)")).click();
    Driver.getDriver().findElement(By.id("windowButton")).click();

   String mainWindowHandle= Driver.getDriver().getWindowHandle();

        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String E: windows
             ) {
            if (!(E == mainWindowHandle)) {
                Driver.getDriver().switchTo().window(E);
            }

        }

        System.out.println(Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().findElement(By.id("sampleHeading")).getText());
    }
}
