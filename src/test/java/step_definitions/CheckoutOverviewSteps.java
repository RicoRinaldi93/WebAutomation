package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckoutStepTwoPage;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewSteps {
    private final WebDriver webDriver;

    public CheckoutOverviewSteps() {
        super ();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click finish button")
    public void clickFinishButton() throws InterruptedException {
        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(webDriver);
        checkoutStepTwoPage.clickFinishBtn();
        Thread.sleep(5000);
    }

    @Then("User completed checkout proses")
    public void checkoutCompleted(){
        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(webDriver);
        checkoutStepTwoPage.checkoutCompleteImg();
    }
}
