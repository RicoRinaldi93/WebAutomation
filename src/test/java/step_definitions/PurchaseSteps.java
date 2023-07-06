package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.InventoryPage;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User sort filter {string}")
    public void clickSortFilter1(String filter) throws InterruptedException
    {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(1000);
        inventoryPage.clickSortFilter(filter);
        Thread.sleep(1000);
    }

    @And("User pick item 1 {string}")
    public void clickItemBasket1(String item1) throws InterruptedException
    {
        InventoryPage inventoryPage1 = new InventoryPage(webDriver);
        inventoryPage1.clickBasket1();
        Thread.sleep(1000);
    }

    @And("User pick item 2 {string}")
    public void clickItemBasket2(String item2) throws InterruptedException
    {
        InventoryPage inventoryPage2 = new InventoryPage(webDriver);
        inventoryPage2.clickBasket2();
        Thread.sleep(1000);
    }

}
