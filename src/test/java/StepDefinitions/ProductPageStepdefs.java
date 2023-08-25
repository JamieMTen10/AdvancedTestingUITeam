package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductPage;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;
public class ProductPageStepDefs {

    ProductPage productPage = new ProductPage(driver,wait);

    @And("I click to increase quantity on the product page {int} times")
    public void iClickToIncreaseQuantityOnTheProductPage(int times){
        System.out.println("I click to increase quantity on the product page");
        productPage.selectIncreaseQuantity(times);
    }

    @And("I click to decrease quantity on the product page")
    public void iClickToDecreaseQuantityOnTheProductPage() {
        System.out.println("I click to decrease quantity on the product page");
        productPage.selectDecreaseQuantity();
    }

    @Then("I see the quantity has increased on the product page")
    public void iSeeTheQuantityHasIncreasedOnTheProductPage() {
        System.out.println("I see the quantity has increased on the product page");
        Assert.assertEquals(productPage.getQuantity(),3);

    }
    @Then("I see the quantity has decreased on the product page")
    public void iSeeTheQuantityHasDecreasedOnTheProductPage() {
        System.out.println("I see the quantity has decreased on the product page");
        Assert.assertTrue(productPage.getQuantity() < 3);
    }


    @And("I click add to cart")
    public void iClickAddToCart() {
        System.out.println("I click add to cart");
        productPage.addToCart();
    }

    @And("I click proceed to checkout")
    public void iClickProceedToCheckout() {
        System.out.println("I click proceed to checkout");
        productPage.clickToCheckout();
    }
}

