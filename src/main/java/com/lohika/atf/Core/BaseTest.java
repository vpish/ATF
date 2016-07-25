package com.lohika.atf.Core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static com.lohika.atf.Core.DriverMaster.getDriver;

public abstract class BaseTest {

    protected WebDriver driver;

   @BeforeSuite (alwaysRun = true)
   @Parameters({"browser"})
    public void setUp(@Optional("ff") String browser) {
        driver = getDriver(browser);
    }

   @AfterSuite (alwaysRun = true)
    public void cleanUp() {
        driver.quit();
    }
}
