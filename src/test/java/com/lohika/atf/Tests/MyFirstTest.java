package com.lohika.atf.Tests;

import com.lohika.atf.Core.BaseTest;
import com.lohika.atf.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import com.lohika.atf.Tests.Wait;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MyFirstTest extends BaseTest{


    @Test
    public void testMethod(){
        driver.get("http://www.skype.com");
        //driver.get("http://localhost:4444/");
        Wait.seconds(2);
       /* driver.get("http://localhost:4444/");
        Wait.seconds(3);
        MainPage mainPage1 = new MainPage(driver);
        mainPage1.selectContactsTab();
        mainPage1.selectCustomersTab();
        mainPage1.selectProductsTab();
        mainPage1.selectFirstTab(); */
    }


}