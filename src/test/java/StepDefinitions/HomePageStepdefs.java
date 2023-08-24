package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

import static StepDefinitions.Hooks.driver;

public class HomePageStepdefs {
    HomePage homepage = new HomePage(driver);
    @Given("I am on the HomePage")
    public void iAmOnTheHomePage(){
        System.out.println("I am on the HomePage");
        homepage.goTo();
    }

    @When("I click on a product")
    public void iClickOnAProduct() {
        System.out.println("I click on a product");
        homepage.viewProduct();

    }
}
