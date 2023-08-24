package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.ProductsPage;


import static StepDefinitions.Hooks.driver;
import static pages.ProductsPage.*;

public class ProductsPageStepDefinitions {

    // Create an instance of the ProductsPage class
    ProductsPage productsPage;

    // Constructor
    public ProductsPageStepDefinitions() {
        productsPage = new ProductsPage(driver);
    }



    /*----- STEP DEFINITIONS -----*/

    @And("I click the Women link")
    public void clickWomenLink() {
        productsPage.click(WOMEN_LINK);
    }

    @And("I click the Tops link")
    public void clickTopsLink() {
        productsPage.click(TOPS_LINK);
    }

    @And("I click the T-shirts link")
    public void clickTShirtsLink() {
        productsPage.click(TSHIRTS_LINK);
    }

    @And("I click the Blouses link")
    public void clickBlousesLink() {
        productsPage.click(BLOUSES_LINK);
    }

    @And("I click the Dresses link")
    public void clickDressesLink() {
        productsPage.click(DRESSES_LINK);
    }

    @And("I click the Casual Dresses link")
    public void clickCasualDressesLink() {
        productsPage.click(CASUAL_DRESSES_LINK);
    }

    @And("I click the Evening Dresses link")
    public void clickEveningDressesLink() {
        productsPage.click(EVENING_DRESSES_LINK);
    }

    @And("I click the Summer Dresses link")
    public void clickSummerDressesLink() {
        productsPage.click(SUMMER_DRESSES_LINK);
    }

    @Then("the {string} products page is displayed")
    public void womenProductsPageIsDisplayed(String page) {
        Assert.assertEquals(page, productsPage.getH1());
    }

    @And("I click the {string} filter")
    public void iClickTheFilter(String filter) {
        productsPage.toggleFilter(filter);
    }

    @Then("the products available in {string} are displayed")
    public void filteredProductsDisplayed(String filter) {
        productsPage.checkForFilter(filter);
    }

}
