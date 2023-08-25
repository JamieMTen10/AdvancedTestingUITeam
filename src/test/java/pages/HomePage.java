package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void navigateToHomePage() {
        System.out.println("Navigating to Homepage");
        driver.get("http://3.11.77.136/index.php");
    }
    public void navigateToSignInPage() {
        System.out.println("Navigating to Sign in page");
        waitAndClick(By.cssSelector("a[href=\"http://3.11.77.136/index.php?controller=my-account\"]:not([class=text-uppercase])"));

    }


}

