package com.javaAutomationFramework.pages.pageObjectModel.vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;

    }

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By submit = By.id("js-login-btn");
    private By errormessage = By.id("js-notification-box-msg");


    public String invalidLogin(String user, String pwd) throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submit).click();
        Thread.sleep(3000);
        String errorMessagetext = driver.findElement(errormessage).getText();
        return errorMessagetext;
    }

    public void validLogin(String user, String pwd) throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(submit).click();
        Thread.sleep(3000);

    }

}
