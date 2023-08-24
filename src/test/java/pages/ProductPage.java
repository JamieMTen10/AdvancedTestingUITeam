package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Integer.parseInt;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    private static final By SELECT_INCREASE_QUANTITY = By.cssSelector(".material-icons.touchspin-up");
    private static final By SELECT_DECREASE_QUANTITY = By.cssSelector(".material-icons.touchspin-down");
    private static final By ADD_TO_CART = By.cssSelector(".add-to-cart");
    private static final By VERIFY_ADD_TO_CART = By.cssSelector("#myModalLabel");
    private static final By CHECKOUT_BUTTON = By.cssSelector("a.btn.btn-primary");
    private static final By PRODUCT_QUANTITY = By.cssSelector("#quantity_wanted");


    public void addToCart() {
        waitAndClick(ADD_TO_CART);
    }

    public String verifyAddToCart() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(VERIFY_ADD_TO_CART)).getText();
    }

    public void checkout() {
        waitAndClick(CHECKOUT_BUTTON);
    }
  //select one or the other
    public void clickToCheckout(){
        waitAndClick(CHECKOUT_BUTTON);
    }
  
    public int getQuantity(){
        return parseInt(getAttribute(PRODUCT_QUANTITY));
    }
    public void selectIncreaseQuantity(int times){
        for(int i = 1; i <= times; i++) {
            waitAndClick(SELECT_INCREASE_QUANTITY);
        }
    }
    public void selectDecreaseQuantity(){
        waitAndClick(SELECT_DECREASE_QUANTITY);
    }

}
