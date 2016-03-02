package com.lohika.atf.Tests;

import com.lohika.atf.Core.BaseTest;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MyFirstTest extends BaseTest{

    @Test
    public void testMethod(){
        driver.get("http://skype.com");
        Wait.seconds(3);
    }

    @Test
    public void testMethod2(){
        driver.get("http://google.com");
        Wait.seconds(3);
    }


}