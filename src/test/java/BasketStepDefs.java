import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketStepDefs {
    @Given("I am on the Homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I go to the Products page")
    public void iGoToTheProductsPage() {
    }

    @And("I add {int} product to the cart")
    public void iAddProductToTheCart(int prodNo) {
    }

    @Then("The message {string} is displayed")
    public void theMessageIsDisplayed(String message) {
    }

    @And("I click the {string} button")
    public void iClickTheButton(String arg0) {
    }

    @And("I remove a product from the cart")
    public void iRemoveAProductFromTheCart() {
    }

    @Then("The product is no longer in the cart")
    public void theProductIsNoLongerInTheCart() {
    }

    @And("I increase the number of the product in the cart by {int}")
    public void iIncreaseTheNumberOfTheProductInTheCartBy(int prodNo) {
    }

    @Then("There are {int} of the product in the cart")
    public void thereAreOfTheProductInTheCart(int prodNo) {
    }

    @And("I decrease the number of the product in the cart by {int}")
    public void iDecreaseTheNumberOfTheProductInTheCartBy(int prodNo) {
    }

}
