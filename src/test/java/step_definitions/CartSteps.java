package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.CartPage;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps()
    {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click the cart icon")
    public void clickCartIcon1() throws InterruptedException
    {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCartIcon();
        Thread.sleep(3000);
        cartPage.clickRmvItem1();
        Thread.sleep(3000);
        cartPage.setCheckOutBtn();
        Thread.sleep(3000);
    }
}
