package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage {
    public static WebDriver driver;

    public CheckoutStepTwoPage (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy (xpath = "//span[@class='title']")
    private WebElement textTitleCheckout;

    @FindBy (xpath = "//div[@class='summary_subtotal_label']")
    private  WebElement textTotalItm;

    @FindBy (xpath = "//div[@class='summary_tax_label']")
    private WebElement textTax;

    @FindBy (xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement textTotal;

    @FindBy (xpath = "//button[@id='finish']")
    private WebElement finishBtn;

    @FindBy (xpath = "//img[@alt='Pony Express']")
    private  WebElement finishImg;

    public void clickFinishBtn() {finishBtn.click();}

    public void printTitleGetText(){
        String printTitleText = textTitleCheckout.getText();
        System.out.println (printTitleText);
    }

    public void printTotalItmGetText(){
        String printTotalItmText = textTotalItm.getText();
        System.out.println (printTotalItmText);
    }

    public void printTaxGetText(){
        String printTaxText = textTax.getText();
        System.out.println (printTaxText);
    }

    public void printTotalGetText(){
        String printTotalText = textTotal.getText();
        System.out.println (printTotalText);
    }

    public boolean checkoutCompleteImg() {
        return finishImg.isDisplayed();
    }




}
