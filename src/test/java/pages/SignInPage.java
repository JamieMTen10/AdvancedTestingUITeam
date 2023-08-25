package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage extends BasePage {


    private static final By EMAIL_INPUT_FIELD = By.cssSelector(".form-control");
    private static final By PASSWORD_INPUT_FIELD = By.cssSelector("[name=\"password\"]");
    private static final By ERROR_MESSAGE = By.cssSelector(".alert");
    private static final By AUTH_ERROR_MESSAGE = By.cssSelector(".alert alert-danger");
    private static final By SIGN_IN_BUTTON = By.cssSelector("[data-link-action=\"sign-in\"]");
    public SignInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    //private static final By ALERT_MESSAGE = By.cssSelector()

    public void navigateToSignInPage() {
        driver.get("http://3.11.77.136/index.php?controller=authentication&back=my-account");
    }

    public void createAnAccount() {
        driver.findElement(By.cssSelector("a[href='http://3.11.77.136/index.php?controller=authentication&create_account=1']")).click();
    }
    public String getErrorMessageText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(ERROR_MESSAGE)).getText();
    }

   // public String getAlertMessage(){
      //  return wait.until(ExpectedConditions.visibilityOfElementLocated(ALERT_MESSAGE)).getText();
    //}
    public void SignInButton() {
        System.out.println("Click Sign in button");
        waitAndClick(SIGN_IN_BUTTON);

    }
    public void clickNoAccountButton() {
        System.out.println("Click Sign in button");
        waitAndClick(By.cssSelector(".no-account"));

    }


    public void enterEmailAddress(String emailaddress) {
        wait.until(ExpectedConditions.elementToBeClickable(EMAIL_INPUT_FIELD)).sendKeys(emailaddress);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(PASSWORD_INPUT_FIELD)).sendKeys(password);
    }
    public String getValidationErrorText() {
        return getAttribute(By.name("email"), "validationMessage");
    }
}

