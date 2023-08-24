package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static final String URL = "http://3.11.77.136/";
    public static final By PRODUCT = By.cssSelector("[data-id-product='1']");

    public void goTo(){
        driver.get(URL);
    }
    public void viewProduct(){
        waitAndClick(PRODUCT);
    }
    @Override
    public void clearBrowserCache() {
        super.clearBrowserCache();
    }
}