package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SignInPage;
import static StepDefinitions.Hooks.driver;

public class SignInPageStepDef {

    SignInPage signInPage;
    public SignInPageStepDef(){signInPage=new SignInPage(driver);}
    @Given("I am on the Sign in page")
    public void iAmOnTheSignInPage() {
        signInPage.navigateToSignInPage();
        System.out.println("I am on the sign in page");
    }

    @When("I press {string}")
    public void iPress(String signIn) {
        signInPage.createAnAccount();
        System.out.println("I am going to register an account");
    }
}
