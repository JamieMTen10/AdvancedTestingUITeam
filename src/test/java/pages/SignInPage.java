package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static final By EMAIL_ADDRESS_INPUT_BOX = By.cssSelector("[name=email]");
    private static final By PASSWORD = By.cssSelector("[name=password]");
    private static final By SIGN_IN_BUTTON = By.cssSelector("[data-link-action=sign-in]");
    private static final By VIEW_ACCOUNT_PAGE = By.cssSelector("div>a.account>span");

    public void enterEmailAddress(String emailAddress){
        findAndType(EMAIL_ADDRESS_INPUT_BOX, emailAddress);
    }
    public void enterPassword(String password){
        findAndType(PASSWORD, password);
    }
    public void clickSignIn(){
        waitAndClick(SIGN_IN_BUTTON);
    }
    public void navigateToAccountPage(){
        waitAndClick(VIEW_ACCOUNT_PAGE);
    }
}