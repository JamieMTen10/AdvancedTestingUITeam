package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.RegisterPage;


import static StepDefinitions.Hooks.driver;

public class RegisterPageStepdefs {
    RegisterPage registerPage = new RegisterPage(driver);

    @And("I will be directed to the registration page")
    public void directToRegisterPage() {
    }

    @Then("I enter {string}, {string}, {string}, {string}")
    public void iCanEnterDetailsAndCreateAnAccount(String firstname, String lastname, String email, String password) {
        registerPage.registerAnAccount();
    }

    @And("press {string}")
    public void press(String createAccount) {
        registerPage.pressSave();
    }

    @Then("I am registered")
    public void iAmRegistered() {
        WebElement yourAccount = driver.findElement(By.cssSelector("h1"));
        String expected = "POPULAR PRODUCTS";
        Assert.assertEquals(expected, yourAccount.getText());
    }

    @And("the HomePage is displayed")
    public void theHomePageIsDisplayed() {

    }

    @And("I am logged in")
    public void iAmLoggedIn() {
    }


}
