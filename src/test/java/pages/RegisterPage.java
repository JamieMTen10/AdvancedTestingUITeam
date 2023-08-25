package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.HashMap;
import java.util.Map;

import java.util.UUID;

import org.openqa.selenium.TimeoutException;


public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static final By PASSWORD_INPUT_FIELD = By.cssSelector(".form-control.js-child-focus.js-visible-password");

    private static final By ERROR_MESSAGE = By.cssSelector(".alert alert-danger");
    private static final By AUTH_ERROR_MESSAGE = By.cssSelector(".alert alert-danger");

    private static final By EMAIL_IN_USE_ALERT = By.cssSelector(".alert.alert-danger");
    private static final By FIRST_NAME = By.cssSelector("[name=firstname]");
    private static final By LAST_NAME = By.cssSelector("[name=lastname]");
    private static final By EMAIL_ADDRESS = By.cssSelector(".form-group.row:nth-of-type(4) input:first-child");
    private static final By SAVE_CUSTOMER = By.xpath("//button[contains(text(),\"Save\")]");

    public void enterRegistrationDetails(String name, String lastname, String emailaddress, String password){
        findAndType(FIRST_NAME, name);
        findAndType(LAST_NAME, lastname);
        findAndType(EMAIL_ADDRESS, emailaddress);
        findAndType(PASSWORD_INPUT_FIELD, password);
        waitAndClick(SAVE_CUSTOMER);
    }

    }






