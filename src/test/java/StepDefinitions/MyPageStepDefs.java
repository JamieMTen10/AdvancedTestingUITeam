package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegisterPage;
import pages.SignInPage;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;

public class MyPageStepDefs {
    HomePage homePage = new HomePage(driver, wait);
    SignInPage signInPage = new SignInPage(driver, wait);
    RegisterPage registerPage = new RegisterPage(driver, wait);

    @Given("I am on the HomePage")
    public void iAmOnTheHomePage() {
        homePage.navigateToHomePage();
    }


    @When("I click the Sign in link")
    public void iClickSignInLink() {
        homePage.navigateToSignInPage();
    }

    @And("I enter the email address: {string} and password: {string}")
    public void iEnterAnEmailAndPassword(String emailaddress, String password) {
        signInPage.enterEmailAddress(emailaddress);
        signInPage.enterPassword(password);
    }

    @And("I click the Sign in button")
    public void iClickSignInButton() {
        signInPage.SignInButton();
    }

    @Then("a {string} error message is displayed")
    public void invalidFormatError(String errorMessage) {
        Assert.assertEquals(errorMessage, signInPage.getErrorMessageText());
    }


//        @Then("the Please include an '@' in the email address error message is displayed")
//        public void includeSymbolInAddress(){
//            Assert.assertEquals("Please include an '@' in the email address", signInPage.getAlertMessage());
//        }


    //// @Then("a {string} error message is displayed")
    ///public void invalidFormatError(String errorMessage){
    //Assert.assertEquals(errorMessage, signInPage.getErrorMessageText());

    @And("I click on the No account? Create one here link")
    public void iClickOnTheNoAccount() {
        signInPage.clickNoAccountButton();
    }

    @And("I register without filling in {string} or {string}")
    public void iRegisterWithoutFillingInEmailOrPassword() {
    }


    @And("I register with email {string} and password {string}")
    public void iRegisterWithEmailAndPassword(String arg0, String arg1) {
    }

    @And("I register with the details in the input fields")
    public void iRegisterWithTheDetailsInTheInputFields() {
    }

    @And("I register with {string} and {string} and {string} and {string}")
    public void enterRegistrationDetails(String name, String lastname, String emailaddress, String password) {
        registerPage.enterRegistrationDetails(name, lastname, emailaddress, password);
    }

    @Then("the Please include an {string} in the email address error message is displayed")
    public void assertValidationErrorText(String Alert) {
    }
}






