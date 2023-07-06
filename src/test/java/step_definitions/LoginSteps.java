package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage;
    public LoginSteps(){
        loginPage = new LoginPage(Hooks.webDriver);
    }

    @Given("User open the website sauce demo")
    public void verifyDisplay() throws InterruptedException {
        loginPage.logoSd();
        loginPage.isDisplayed();
        Thread.sleep(3000);
    }

    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        Thread.sleep(3000);
    }
    @And("User click login button")
    public void clickLoginButton() throws InterruptedException {
        loginPage.clickLogin();
        Thread.sleep(5000);
    }

    @Then("User see error {string} on login page")
    public void errorText(String errorText) throws InterruptedException {
        Assert.assertEquals(errorText,loginPage.getErrorText());
        Thread.sleep(3000);
    }

}
