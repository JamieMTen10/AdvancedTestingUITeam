package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterPage extends BasePage {

    private static final By PASSWORD_INPUT_FIELD = By.cssSelector(".form-control.js-child-focus.js-visible-password");
    private static final By ERROR_MESSAGE = By.cssSelector(".alert alert-danger");
    private static final By AUTH_ERROR_MESSAGE = By.cssSelector(".alert alert-danger");
    private static final By EMAIL_IN_USE_ALERT = By.cssSelector(".alert.alert-danger");
    private static final By FIRST_NAME = By.cssSelector("[name=firstname]");
    private static final By LAST_NAME = By.cssSelector("[name=lastname]");
    private static final By EMAIL_ADDRESS = By.cssSelector(".form-group.row:nth-of-type(4) input:first-child");
    private static final By SAVE_CUSTOMER = By.xpath("//button[contains(text(),\"Save\")]");
    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void registerAnAccount(){
        driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("Zuber");
        driver.findElement(By.cssSelector("[name=lastname]")).sendKeys("Mahmood");
        driver.findElement(By.cssSelector("[name=email]")).sendKeys("jobbbhjoe10@gmail.com");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("Password123");
    }

    public void pressSave(){
        driver.findElement(By.cssSelector(".btn.btn-primary.form-control-submit.float-xs-right")).click();
    }
    public void pressSocialTitle(){
        driver.findElement(By.cssSelector("[name=id_gender]")).click();
    }
    public void enterDateOfBirth(){
        driver.findElement(By.cssSelector("[name=birthday]")).sendKeys("04/11/1999");
    }
    public void enterRegistrationDetails(String name, String lastname, String emailaddress, String password){
        findAndType(FIRST_NAME, name);
        findAndType(LAST_NAME, lastname);
        findAndType(EMAIL_ADDRESS, emailaddress);
        findAndType(PASSWORD_INPUT_FIELD, password);
        waitAndClick(SAVE_CUSTOMER);
    }
}
