package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    @FindBy(xpath = "//a[.='2']")
    private WebElement cartIcon;

    public void clickCartIcon()
    {
        cartIcon.click();
    }

    @FindBy (xpath = "//div[.='Sauce Labs Onesie']")
    private  WebElement displayItem1;

    public boolean isDisplayed1(){
        displayItem1.isDisplayed();
        return true;
    }

    @FindBy (xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement displayItem2;

    public boolean isDisplayed2(){
        displayItem2.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement rmvItem1;

    public void clickRmvItem1()
    {
        rmvItem1.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOutBtn;

    public void setCheckOutBtn()
    {
        checkOutBtn.click();
    }



}
