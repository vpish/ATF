package com.lohika.atf.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by vova on 19.04.2016.
 */
public class tempTest {

    WebDriver driver;

  //  @Test
    public void test(){
        driver = new FirefoxDriver();
        driver.get("http://localhost:4444");
        try {
            Thread.sleep(3000);
        } catch (Exception e){}
        driver.quit();

    }


}
