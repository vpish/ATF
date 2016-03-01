package com.lohika.atf.Tests;

import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.annotations.Test;


public class MyFirstTest {
    @Test
    public void testMethod(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://skype.com");
        try {
            Thread.sleep(3000);
        } catch (Exception e){}
        driver.quit();
    }
}