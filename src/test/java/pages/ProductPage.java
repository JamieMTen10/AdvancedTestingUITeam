package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static final By ADD_TO_CART = By.cssSelector(".add-to-cart");
    private static final By VERIFY_ADD_TO_CART = By.cssSelector("#myModalLabel");
    private static final By CHECKOUT_BUTTON = By.cssSelector("a.btn.btn-primary");


    public void addToCart() {
        waitAndClick(ADD_TO_CART);
    }

    public String verifyAddToCart() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(VERIFY_ADD_TO_CART)).getText();
    }

    public void checkout() {
        waitAndClick(CHECKOUT_BUTTON);
    }


}
