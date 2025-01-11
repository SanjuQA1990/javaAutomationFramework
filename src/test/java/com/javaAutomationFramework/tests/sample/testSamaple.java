package com.javaAutomationFramework.tests.sample;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSamaple {
    @Description("Sample Test 1")
    @Test
    public void sampleTest()
    {
        //System.out.println("Sample Test One");
        Assert.assertTrue(true);
    }

    @Description("Sample Test 2")
    @Test
    public void sampleTest2()
    {
        System.out.println("Sample Test Two");
    }
}
