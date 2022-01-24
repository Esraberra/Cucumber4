package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Driver;

import java.util.Set;

public class deneme1 {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().navigate().to("https://demoqa.com/browser-windows");

//        driver.findElement(By.id("tabButton")).click();
//        driver.findElement(By.id("windowButton")).click();
        Driver.getDriver().findElement(By.id("messageWindowButton")).click();

        String mainWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println(mainWindowHandle);
        System.out.println(Driver.getDriver().findElement(By.className("main-header")).getText());
        System.out.println();
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                Driver.getDriver().switchTo().window(handle);
                System.out.println(handle);
                String el1 =  js.executeScript("return document.body.innerText;").toString();
                System.out.println(el1);
                //  System.out.println(Driver.getDriver().findElement(By.tagName("body")).getText());
                System.out.println();
                Driver.getDriver().close();
            }
        }
    }
}