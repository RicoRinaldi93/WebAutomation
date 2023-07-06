package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement logoSauceDemo;

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//div[@class='error-message-container error']")
    private WebElement errorText;


    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;



    public void setUserName(String user){
        userName.sendKeys(user);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public boolean isDisplayed(){
        return userName.isDisplayed();
    }

    public boolean logoSd(){
        return logoSauceDemo.isDisplayed();
    }

    public String getErrorText(){
        return errorText.getText();
    }



}

