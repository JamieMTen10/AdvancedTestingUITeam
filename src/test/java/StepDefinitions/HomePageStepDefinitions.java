package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

import static StepDefinitions.Hooks.driver;

public class HomePageStepDefinitions {

    // Create an instance of the HomePage class
    HomePage homePage;

    // Constructor for HomePageStepDefinitions
    public HomePageStepDefinitions() {
        homePage = new HomePage(driver);
    }


    /*----- STEP DEFINITIONS -----*/

    @Given("I am on the HomePage")
    public void iAmOnTheHomePage() {
        homePage.goTo();
    }

    @When("I click the All Products link")
    public void iClickAllProductsLink() {
        homePage.clickAllProductsLink();
    }
}
