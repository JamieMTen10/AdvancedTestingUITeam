import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

import pages.ProductPage;

public class ProductPageStepDefs {

    ProductPage productPage;

    @And("I add the product to the cart")
    public void addProductToCart(){
        productPage.addToCart();

    }

    @And("I click proceed to checkout")
    public void iClickProceedToCheckout() {


    }
}


