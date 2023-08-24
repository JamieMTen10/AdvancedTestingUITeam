package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Integer.parseInt;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private static final By REMOVE_FROM_CART = By.cssSelector(".remove-from-cart");
    private static final By INCREASE_QUANTITY = By.cssSelector(".touchspin-up");
    private static final By PRODUCT_QUANTITY = By.cssSelector("[name=product-quantity-spin]");
    private static final By DECREASE_QUANTITY = By.cssSelector(".touchspin-down");

    public void removeFromCart() {
        waitAndClick(REMOVE_FROM_CART);
    }

    public Boolean productNotPresent() {
        WebElement remove = driver.findElement(REMOVE_FROM_CART);
        try {
            wait.until(ExpectedConditions.visibilityOf(remove));
            return false;
        } catch (TimeoutException e) {
            return true;
        }
    }

    public void increaseBasketQuantity() {
        waitAndClick(INCREASE_QUANTITY);
    }

    public void decreaseBasketQuantity() {
        waitAndClick(DECREASE_QUANTITY);
    }

    public int getQuantity() {
        return parseInt(getAttribute(PRODUCT_QUANTITY));
    }
}



