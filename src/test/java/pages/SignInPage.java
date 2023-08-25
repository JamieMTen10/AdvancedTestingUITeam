package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSignInPage() {
        driver.get("http://3.11.77.136/index.php?controller=authentication&back=my-account");
    }

    public void createAnAccount() {
        driver.findElement(By.cssSelector("a[href='http://3.11.77.136/index.php?controller=authentication&create_account=1']")).click();
    }
}
