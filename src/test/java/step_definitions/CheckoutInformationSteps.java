package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutStepOnePage;
import org.example.pageObject.CheckoutStepTwoPage;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationSteps {
    private final WebDriver webDriver;

    public CheckoutInformationSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User on the checkout information page")
    public void verifyDisplay() {
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(webDriver);
        checkoutStepOnePage.isDisplayed();
    }

    @When("User input {string} on First Name field")
    public void inputFirstName(String fn) throws InterruptedException {
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(webDriver);
        checkoutStepOnePage.setFirstNameField(fn);
        Thread.sleep(2000);
    }

    @And("User input {string} on Last Name field")
    public void inputLastName(String lm) throws InterruptedException {
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(webDriver);
        checkoutStepOnePage.setLastNameField(lm);
        Thread.sleep(2000);

    }

    @And("User input {string} on ZIP or Postal Code field")
    public void inputPostalCode(String zc) throws InterruptedException {
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(webDriver);
        checkoutStepOnePage.setPostalCodelField(zc);
        Thread.sleep(2000);
    }

    @And("User click continue button")
    public void clickContinueButton() throws InterruptedException {
        CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(webDriver);
        checkoutStepOnePage.clickContinueBtn();
        Thread.sleep(5000);
    }

    @Then("User directed to check out overview page")
    public void checkoutOverview (){
        CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage(webDriver);
        checkoutStepTwoPage.printTitleGetText();
        checkoutStepTwoPage.printTotalItmGetText();
        checkoutStepTwoPage.printTaxGetText();
        checkoutStepTwoPage.printTotalGetText();
   }

    @And("User input {int} on ZIP\\/Postal Code field")
    public void userInputOnZIPPostalCodeField(int arg0) {
    }
}
