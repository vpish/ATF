package com.lohika.atf.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverMaster {

    private  DriverMaster(){};

    public static WebDriver getDriver(String driverKey){
        BrowserType browser = BrowserType.get(driverKey);
        WebDriver driver;
        switch (browser){
            case Firefox:
                driver = new FirefoxDriver();
                break;
            case Chrome:
                System.setProperty("webdriver.chrome.driver", "D:\\Dev\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", "D:\\Dev\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            default:
                driver = new FirefoxDriver();
                break;
        }
        return driver;
    }

}
