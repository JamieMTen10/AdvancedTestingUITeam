package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.SignInPage;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;

public class HomePageStepdefs {
HomePage homePage = new HomePage(driver, wait);
SignInPage signInPage = new SignInPage(driver, wait);
    @Given("I am on the HomePage")
    public void iAmOnTheHomepage() {
        System.out.println("I am on the HomePage");
        homePage.goTo();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Ten10 Store";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }
    @When("I click Sign in link")
    public void iClickSignInLink() {
        homePage.navigateToSignInPage();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Login";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }
    @And("I enter {string} and {string}")
    public void iEnterAnd(String emailaddress, String password) {
        signInPage.enterEmailAddress(emailaddress);
        signInPage.enterPassword(password);
    }

    @And("I click the Sign in button")
    public void iClickTheSignInButton() {
        signInPage.clickSignIn();
    }

}
