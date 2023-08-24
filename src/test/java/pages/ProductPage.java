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

    private static final By PRODUCT_PAGE = By.cssSelector("#product");
    //private static final By SELECT_COLOUR = By.cssSelector("span.sr-only, Blue");
    private static final By SELECT_SIZE = By.cssSelector("select");
    private static final By SELECT_QUANTITY = By.cssSelector(".touchspin-up");
    private static final By ADD_TO_CART = By.cssSelector(".add-to-cart");
    private static final By VERIFY_ADD_TO_CART = By.cssSelector("#myModalLabel");
    private static final By CHECKOUT_BUTTON = By.cssSelector("a.btn.btn-primary");


    public void productPageVisible() {
        WebElement alertBox = driver.findElement(PRODUCT_PAGE);
        Assert.assertTrue(elementIsVisible(alertBox));
    }

    //public void selectColour(){
    //waitAndClick(SELECT_COLOUR);
    //}
    public void selectSize() {
        waitAndClick(SELECT_SIZE);
    }

    public void selectQuantity() {
        waitAndClick(SELECT_QUANTITY);
    }

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
