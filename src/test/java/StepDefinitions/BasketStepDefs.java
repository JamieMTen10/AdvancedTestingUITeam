package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.ProductPage;
import pages.BasketPage;

import java.util.Optional;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;

public class BasketStepDefs {

    HomePage homePage = new HomePage(driver, wait);
    ProductPage productPage = new ProductPage(driver, wait);
    BasketPage basketPage = new BasketPage(driver, wait);

    @Given("I am on the Homepage")
    public void iAmOnTheHomepage() {

        homePage.goTo();
        System.out.println("I am on the Homepage");
    }

    @When("I go to the Products page")
    public void iGoToTheProductsPage() {

        homePage.viewProduct();
        System.out.println("I am on the products page");
    }

    @And("I add {int} product(s) to the cart")
    public void iAddProductToTheCart(int prodNo) {
        // i've used a few for loops so that you can edit the scenarios
        // to add/increase/decrease as many items as you want without changing the step definition code
        for (int i = 1; i < prodNo; i++) {
            basketPage.increaseBasketQuantity();
        }
        productPage.addToCart();
        System.out.println("I add " + prodNo + " product(s) to the cart");
    }

    @Then("The message {string} is displayed")
    public void theMessageIsDisplayed(String message) {
        Assert.assertTrue(productPage.verifyAddToCart().contains(message));
        System.out.println("The message " + message + " is displayed");
    }

    @And("I click the {string} button")
    public void iClickTheButton(String checkout) {
        productPage.checkout();
        System.out.println("I click the " + checkout + "button");
    }

    @And("I remove a product from the cart")
    public void iRemoveAProductFromTheCart() {
        basketPage.removeFromCart();
        System.out.println("I remove a product from the cart");
    }

    @Then("The product is no longer in the cart")
    public void theProductIsNoLongerInTheCart() {
        Assert.assertFalse(basketPage.productNotPresent());
        System.out.println("The product is no longer in the cart");
    }

    @And("I increase the number of the product in the cart by {int}")
    public void iIncreaseTheNumberOfTheProductInTheCartBy(int prodNo) {
        // for loop used so that you can change the number of times you decrease a product from the scenario
        for (int i = 0; i < prodNo; i++) {
            basketPage.increaseBasketQuantity();
        }
        System.out.println("I increase the number of the product in the cart by " + prodNo);
    }

    @Then("There are {int} of the product in the cart")
    // if statement is needed because the assertEquals doesn't work when there are 0 products in the cart
    // instead, need to assert that the element isn't there
    public void thereAreOfTheProductInTheCart(int prodNo) {
        if (prodNo >= 1) {
            Assert.assertEquals(String.valueOf(prodNo), basketPage.getQuantity());
        } else {
            Assert.assertFalse(basketPage.productNotPresent());
        }
        System.out.println("There are " + prodNo + " of the product in the cart");
    }

    @And("I decrease the number of the product in the cart by {int}")
    public void iDecreaseTheNumberOfTheProductInTheCartBy(int prodNo) {
        // for loop used so that you can change the number of times you decrease a product from the scenario
        for (int i = 0; i < prodNo; i++) {
            basketPage.decreaseBasketQuantity();
        }
        System.out.println("I decreased the number of the product in the cart by " + prodNo);
    }

}
