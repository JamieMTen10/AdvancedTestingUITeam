package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    BasePage basePage;


    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static String URL = ("http://3.11.77.136/index.php");
    public static final By PRODUCT = By.cssSelector("[alt='Faded Short Sleeves T-shirt']");
    private static final By SIGN_IN_BUTTON = By.cssSelector("[title='Log in to your customer account']");
    public static final By ACCOUNT_PAGE = By.cssSelector(".account");

    private static final By SEARCH_BAR = By.cssSelector("input.ui-autocomplete-input");

    private static final By NEWSLETTER_SUBSCRIBE = By.cssSelector("#footer > div.container > div > div.block_newsletter.col-lg-8.col-md-12.col-sm-12 > div > div > form > div > div:nth-child(1) > div.input-wrapper > input[type=text]");

    private static final By SUBSCRIPTION_CONFIRM =By.cssSelector("p.alert.alert-success");

    public void goTo(){

        driver.get(URL);
    }
    public void navigateToSignInPage(){
        waitAndClick(SIGN_IN_BUTTON);
    }
    public void viewProduct(){
        waitAndClick(PRODUCT);
    }

    public void subToNewsletter(){
        basePage.findAndType(NEWSLETTER_SUBSCRIBE, "exampleemail@test.com");
    }
    public void verifySubscription(){
        WebElement alertBox = driver.findElement(SUBSCRIPTION_CONFIRM);
        Assert.assertTrue(elementIsVisible(alertBox));

    }

    public void dressSearch(){
        basePage.findAndType(By.cssSelector("input.ui-autocomplete-input"), "dress");
    }


    public void accountPageVisible(){
        WebElement alertBox = driver.findElement(ACCOUNT_PAGE);
        Assert.assertTrue(elementIsVisible(alertBox));
    }

    private boolean elementIsVisible(WebElement alertBox) {
        return false;
    }

    @Override
    public void clearBrowserCache() {
        super.clearBrowserCache();
    }}