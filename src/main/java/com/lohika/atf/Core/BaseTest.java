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
    public void setUp(@Optional("ie") String browser) {
       if (browser.equals("ff")){
           driver = new FirefoxDriver();
       } else if (browser.equals("ie")) {
           System.setProperty("webdriver.ie.driver", "D:\\Dev\\IEDriverServer.exe");
           driver = new InternetExplorerDriver();
       } else if (browser.equals("chrome")){
           System.setProperty("webdriver.chrome.driver", "D:\\Dev\\chromedriver.exe");
           driver = new ChromeDriver();
       }
    }

   @AfterSuite (alwaysRun = true)
    public void cleanUp() {
        driver.quit();
    }
}
