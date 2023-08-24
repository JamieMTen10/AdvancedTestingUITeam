package StepDefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasketPage;

import static StepDefinitions.Hooks.driver;

public class basketPageStepdefs {
    BasketPage basketPage = new BasketPage(driver);
    @Then("I see the same quantity in the basket page")
    public void iSeeTheSameQuantityInTheBasketPage(){
        System.out.println("I see the same quantity in the basket page");
        Assert.assertEquals(basketPage.getQuantity(),3);
    }
}

