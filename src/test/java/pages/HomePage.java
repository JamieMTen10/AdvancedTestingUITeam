package pages;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    private static String URL = "http://3.11.77.136/index.php";
    public static final By PRODUCT = By.cssSelector("[alt='Faded Short Sleeves T-shirt']");
    private static final By SIGN_IN_BUTTON = By.cssSelector("[title='Log in to your customer account']");
//    public static final By ACCOUNT_PAGE = By.cssSelector(".account");
//
    public void goTo(){
        driver.get(URL);
    }
    public void navigateToSignInPage(){
        waitAndClick(SIGN_IN_BUTTON);
    }
//    public void viewProduct(){
//        waitAndClick(PRODUCT);
//    }
//    public void accountPageVisible(){
//        WebElement alertBox = driver.findElement(ACCOUNT_PAGE);
//        Assert.assertTrue(elementIsVisible(alertBox));
//    }
//    @Override
//    public void clearBrowserCache() {
//        super.clearBrowserCache();
//    }
}