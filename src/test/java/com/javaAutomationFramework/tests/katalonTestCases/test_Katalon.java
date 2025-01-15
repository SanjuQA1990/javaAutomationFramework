package com.javaAutomationFramework.tests.katalonTestCases;
import com.javaAutomationFramework.pages.pageObjectModel.Katalon.kt_homePage;
import com.javaAutomationFramework.pages.pageObjectModel.Katalon.kt_loginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class test_Katalon
{
    @Description("This is Katalon Home page Automation")
    @Test
    @Owner("Sanjay")
    public void homePage_Katalon()
    {
        WebDriver driver= new ChromeDriver();
        kt_homePage katalon_home= new kt_homePage(driver);
        katalon_home.homePageMakeAppointment();

    }


    @Description("Login page automation")
    @Test
    public void loginPage_Katalon() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        kt_loginPage katalon_Login= new kt_loginPage(driver);
        katalon_Login.verifyLogin("John Doe", "ThisIsNotAPassword");

    }

}
