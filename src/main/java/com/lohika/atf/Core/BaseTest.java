package com.lohika.atf.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public abstract class BaseTest {

    protected WebDriver driver;

   @BeforeSuite (alwaysRun = true)
   @Parameters({"browser"})
    public void setUp(@Optional("firefox") String browser) {
       if (browser.equals("firefox")){
           driver = new FirefoxDriver();
       } else if (browser.equals("ie")) {
           driver = new InternetExplorerDriver();
       } else if (browser.equals("chrome")){
           driver = new ChromeDriver();
       }
    }

   @AfterSuite (alwaysRun = true)
    public void cleanUp() {
        driver.quit();
    }
}
