package com.javaAutomationFramework.pages.pageObjectModel.Katalon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class kt_loginPage {
    WebDriver driver;

    public kt_loginPage(WebDriver driver) {
        this.driver = driver;

    }
    private By username = By.id("txt-username");
    private By password = By.id("txt-password");
    private By submit = By.id("btn-login");


    public void verifyLogin(String user, String pwd) throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submit).click();
        Thread.sleep(3000);
    }


}
