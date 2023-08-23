package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class CreateNewAccountPage extends BasePage {

    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }
    private static final By EMAIL_IN_USE_ALERT = By.cssSelector(".alert.alert-danger");
    private static final By FIRST_NAME = By.cssSelector("[name=firstname]");
    private static final By LAST_NAME = By.cssSelector("[name=lastname]");
    private static final By EMAIL_ADDRESS = By.cssSelector(".form-group.row:nth-of-type(4) input:first-child");
    private static final By PASSWORD = By.cssSelector(".form-control.js-child-focus.js-visible-password");
    private static final By DOB = By.cssSelector("[name=birthday]");
    private static final By SAVE_CUSTOMER = By.cssSelector("[data-link-action=save-customer]");



    public void emailInUseAlert(){
        WebElement alertBox = driver.findElement(EMAIL_IN_USE_ALERT);
        Assert.assertTrue(elementIsVisible(alertBox));
    }
    public void enterRegistrationDetails(String name, String lastname, String emailaddress, String password, String dob){
        findAndType(FIRST_NAME, name);
        findAndType(LAST_NAME, lastname);
        findAndType(EMAIL_ADDRESS, emailaddress);
        findAndType(PASSWORD, password);
        findAndType(DOB, dob);
        waitAndClick(SAVE_CUSTOMER);
    }
    public static String getUniqueId(){
        return String.format("%s_%s", UUID.randomUUID().toString().substring(0,5),System.currentTimeMillis()/1000);
    }
    public static String generateRandomEmail() {
        return String.format("%s_%s", getUniqueId(), "@gmail.com");
    }

}
