package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static String URL = "http://3.11.77.136/index.php";
    public static final By PRODUCT = By.cssSelector("[data-id-product='1']");
    private static final By SIGN_IN_BUTTON = By.cssSelector("[title='Log in to your customer account']");
    public static final By ACCOUNT_PAGE = By.cssSelector(".account");
    public static final By ALL_PRODUCTS_LINK = By.cssSelector(".all-product-link");
    private static final By SEARCH_BAR = By.cssSelector("input.ui-autocomplete-input");
    private static final By NEWSLETTER_SUBSCRIBE = By.cssSelector(".input-wrapper");
    private static final By SUBSCRIPTION_CONFIRM =By.cssSelector("p.alert.alert-success");


    // Method to navigate to the home page
    public void goTo() {
        driver.get(URL);
    }

    // Method to navigate to the sign-in page.
    public void navigateToSignInPage() {
        waitAndClick(SIGN_IN_BUTTON);
    }

    // Method to view a product by clicking on it.
    public void viewProduct() {
        waitAndClick(PRODUCT);
    }

    // Method to check if the account page is visible.
    public void accountPageVisible() {
        WebElement alertBox = driver.findElement(ACCOUNT_PAGE);
        Assert.assertTrue(elementIsVisible(alertBox));
    }

    public void subToNewsletter(){
        findAndType(NEWSLETTER_SUBSCRIBE, "exampleemail@test.com");
    }

    public void verifySubscription(){
        WebElement alertBox = driver.findElement(SUBSCRIPTION_CONFIRM);
        Assert.assertTrue(elementIsVisible(alertBox));
    }

    public void dressSearch(){
        findAndType(By.cssSelector("input.ui-autocomplete-input"), "dress");
    }

    boolean elementIsVisible(WebElement alertBox) {
        return false;
    }

    // Method to click on the "All Products" link.
    public void clickAllProductsLink() {
        waitAndClick(ALL_PRODUCTS_LINK);
    }

    // Override the clearBrowserCache method from the BasePage class.
    @Override
    public void clearBrowserCache() {
        super.clearBrowserCache();
    }


    public void navigateToHomePage() {
        System.out.println("Navigating to Homepage");
        driver.get("http://3.11.77.136/index.php");
    }



}

