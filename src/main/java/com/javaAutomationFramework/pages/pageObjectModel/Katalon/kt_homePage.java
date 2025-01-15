package com.javaAutomationFramework.pages.pageObjectModel.Katalon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class kt_homePage {

    WebDriver driver;

    public kt_homePage(WebDriver driver)
    {
        this.driver=driver;
    }

    private By btnAppoitment= By.id("btn-make-appointment");

    public void homePageMakeAppointment()
    {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(btnAppoitment).click();
    }
}
