package com.lohika.atf.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeSuite (alwaysRun = true)
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @AfterSuite (alwaysRun = true)
    public void cleanUp() {
        driver.quit();
    }
}
