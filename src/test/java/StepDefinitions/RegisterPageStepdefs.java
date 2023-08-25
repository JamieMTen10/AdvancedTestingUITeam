package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;


import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;

public class RegisterPageStepdefs {
    RegisterPage registerPage=new RegisterPage(driver, wait);
    @And("I will be directed to the registration page")
    public void directToRegisterPage() {
    }

    @Then("I enter {string}, {string}, {string}, {string}")
    public void iCanEnterDetailsAndCreateAnAccount(String firstname,String lastname,String email,String password) {
        registerPage.registerAnAccount();
    }

    @And("press {string}")
    public void press(String createAccount) {
        registerPage.pressSave();
    }

    @Then("I am registered")
    public void iAmRegistered() {

    }

    @And("the HomePage is displayed")
    public void theHomePageIsDisplayed() {

    }

    @And("I am logged in")
    public void iAmLoggedIn() {
    }

    @When("I click on a {string}")
    public void iClickOnA(String socialTitle) {
        registerPage.pressSocialTitle();
        System.out.println("Choosing a social title");
    }

    @And("I enter {string}")
    public void iEnter(String DOB) {
        registerPage.enterDateOfBirth();
        System.out.println("Ive entered DOB");
    }
}
