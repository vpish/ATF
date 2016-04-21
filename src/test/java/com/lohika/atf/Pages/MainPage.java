package com.lohika.atf.Pages;

import com.lohika.atf.Core.BaseTest;
import com.lohika.atf.Tests.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//div/a[@href='#']")
    private WebElement FirstTab;

    @FindBy(xpath = "//li/a[@href='#' and contains(text(),'Customers')]")
    //@FindBy(xpath = "//li/a[@href='#' and child::span[@class='glyphicon glyphicon-user']]")
    private WebElement CustomersTab;

    @FindBy(xpath = "//li/a[@href='#' and contains(text(),'Products')]")
    private WebElement ProductsTab;

    @FindBy(xpath = "//li/a[@href='#' and contains(text(),'Contacts')]")
    private WebElement ContactsTab;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectFirstTab(){
        FirstTab.click();
        Wait.seconds(2);
    }

    public void selectCustomersTab(){
        CustomersTab.click();
        Wait.seconds(2);
    }

    public void selectProductsTab(){
        ProductsTab.click();
        Wait.seconds(2);
    }

    public void selectContactsTab(){
        ContactsTab.click();
        Wait.seconds(2);
    }

}
