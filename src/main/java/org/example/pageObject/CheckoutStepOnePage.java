package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage {
    public static WebDriver driver;

    public CheckoutStepOnePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameField;

    @FindBy (xpath = "//input[@id='last-name']")
    private WebElement lastNameField;

    @FindBy (xpath = "//input[@id='postal-code']")
    private WebElement postalCodelField;

    @FindBy (xpath = "//input[@id='continue']")
    private WebElement continueBtn;

    @FindBy (xpath = "//input[@id='finish']")
    private WebElement finishBtn;

    public void setFirstNameField(String firstName)
    {
        firstNameField.sendKeys(firstName);
    }

    public void setLastNameField(String lastName)
    {
        lastNameField.sendKeys(lastName);
    }

    public void setPostalCodelField(String postalCode)
    {
        postalCodelField.sendKeys(postalCode);
    }

    public void clickContinueBtn()
    {
        continueBtn.click();
    }

    public boolean isDisplayed() {
        firstNameField.isDisplayed();
        return true;
    }
}
