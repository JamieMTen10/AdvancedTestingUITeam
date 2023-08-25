package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.Hooks.driver;


public class RegisterPageStepdefs {


    @And("I will be directed to the registration page")
    public void directToRegisterPage() {
    }
    @Then("I am Registered")
    public void iAmRegistered() {
        WebElement yourAccount = driver.findElement(By.cssSelector("h1"));
        String expected = "POPULAR PRODUCTS";
        Assert.assertEquals(expected, yourAccount.getText());
    }
}
