package com.javaAutomationFramework.tests.vowTestCases;

import com.javaAutomationFramework.pages.pageObjectModel.vwo.dashboardPage;
import com.javaAutomationFramework.pages.pageObjectModel.vwo.loginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class test_vwoLogin {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {
        WebDriver driver = new ChromeDriver();

        loginPage loginPage_vwo = new loginPage(driver);
        String errorMessage = loginPage_vwo.invalidLogin("admin@gmail.com", "123");
        assertThat(errorMessage).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(errorMessage, "Your email, password, IP address or location did not match");
        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null


    }

    @Description("Verify that with Valid email, pass, message is shown on the app.vwo.com")
    @Test
    public void test_vwo_login() throws Exception {
        WebDriver driver = new ChromeDriver();

        loginPage loginPage_vwo = new loginPage(driver);
        loginPage_vwo.validLogin("contact+aug@thetestingacademy.com", "TtxkgQ!s$rJBk85");

        dashboardPage dashBoardPage = new dashboardPage(driver);
        String loggedin_username_text = dashBoardPage.loggedin_username();

        assertThat(loggedin_username_text).isNotNull().isNotEmpty().isNotBlank();
        Assert.assertEquals(loggedin_username_text, "Aman");


        driver.quit();
        // It will close all the tabs. - session id == null


    }

}
