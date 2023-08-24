package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.BasePage;
import pages.HomePage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.Hooks.driver;


public class HomePageStepdefs {

    BasePage basePage;
    HomePage homePage= new HomePage(driver);

    @Given("I am on the HomePage")
    public void iAmOnTheHomePage() {
        homePage.goTo();
    }

    @When("I enter my email address into the subscription box")
    public void iEnterMyEmailAddressIntoTheSubscriptionBox() {
        homePage.subToNewsletter();
   }

    @Then("I see confirmation that I have subscribed to the newsletter")
    public void newsletterConfirmation() {
        homePage.verifySubscription();
    }
}

