package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;


public class HomePageStepdefs {
    HomePage homePage = new HomePage(driver, wait);

    @Given("I am on the HomePage")
    public void iAmOnTheHomePage() {
        System.out.println("I am on the HomePage");
        homePage.goTo();
    }

    @When("I click on a product")
    public void iClickOnAProduct() {
        System.out.println("I click on a product");
        homePage.viewProduct();

    }

    @When("I click the All Products link")
    public void iClickAllProductsLink() {
        homePage.clickAllProductsLink();
    }
}
