package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private static final By EMAIL_ADDRESS_INPUT_BOX = By.cssSelector("[name=email]");
    private static final By PASSWORD = By.cssSelector("[name=password]");
    private static final By CREATE_NEW_ACCOUNT_BUTTON = By.cssSelector(".no-account >a");
    private static final By SIGN_IN_BUTTON = By.cssSelector("[data-link-action=sign-in]");
    private static final By SIGN_OUT_BUTTON = By.cssSelector(".logout.hidden-sm-down");
    private static final By FORGOTTEN_PASSWORD = By.cssSelector(".forgot-password >a");
    private static final By RESET_LINK_EMAIL = By.cssSelector(".col-md-5.email >input");
    private static final By SEND_RESET_LINK = By.cssSelector(".form-fields button:first-of-type");
    private static final By AUTHENTICATION_FAILED = By.cssSelector(".alert.alert-danger");
    private static final By FORGOTTEN_PASSWORD_CONFIRMATION = By.cssSelector(".ps-alert-success:first-child p");
    private static final By CHECK_SIGNED_OUT = By.cssSelector(".page-header h1");

    public void enterEmailAddress(String emailAddress){
        findAndType(EMAIL_ADDRESS_INPUT_BOX, emailAddress);
    }
    public void enterResetEmail(String emailAddress){
        findAndType(RESET_LINK_EMAIL, emailAddress);
    }
    public void enterPassword(String password){
        findAndType(PASSWORD, password);
    }
    public void clickForgottenPassword(){
        waitAndClick(FORGOTTEN_PASSWORD);
    }
    public void clickSignIn(){
        waitAndClick(SIGN_IN_BUTTON);
    }
    public void clickSignOut(){
        waitAndClick(SIGN_OUT_BUTTON);
    }
    public void clickCreateAnAccount(){
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }
    public void clickSendResetLink(){
        waitAndClick(SEND_RESET_LINK);
    }

    public void authenticationFailed(){
        WebElement alertBox = driver.findElement(AUTHENTICATION_FAILED);
        Assert.assertTrue(elementIsVisible(alertBox));
    }
    public void forgottenPasswordConfirmation(){
        WebElement alertBox = driver.findElement(FORGOTTEN_PASSWORD_CONFIRMATION);
        Assert.assertTrue(elementIsVisible(alertBox));
    }
    public void signIn(String email,String password){
        enterEmailAddress(email);
        enterPassword(password);
        clickSignIn();
    }
    public void signedOut(){
        WebElement alertBox = driver.findElement(CHECK_SIGNED_OUT);
        Assert.assertTrue(elementIsVisible(alertBox));
    }

}
