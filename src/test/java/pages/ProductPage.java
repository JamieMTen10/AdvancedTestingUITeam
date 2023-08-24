package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Integer.parseInt;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver){
        super(driver);
    }
    private static final By SELECT_INCREASE_QUANTITY = By.cssSelector(".material-icons.touchspin-up");
    private static final By SELECT_DECREASE_QUANTITY = By.cssSelector(".material-icons.touchspin-down");
    private static final By ADD_TO_CART = By.cssSelector(".add-to-cart");
    private static final By PRODUCT_QUANTITY = By.cssSelector("#quantity_wanted");
    private static final By PROCEED_TO_CHECKOUT = By.cssSelector("a.btn.btn-primary");

    public void selectIncreaseQuantity(int times){
        for(int i = 1; i <= times; i++) {
            waitAndClick(SELECT_INCREASE_QUANTITY);
        }
    }
    public void selectDecreaseQuantity(){
        waitAndClick(SELECT_DECREASE_QUANTITY);
    }
    public void addToCart(){
        waitAndClick(ADD_TO_CART);
    }
    public int getQuantity(){
        return parseInt(getAttribute(PRODUCT_QUANTITY));
    }
    public void clickToCheckout(){
        waitAndClick(PROCEED_TO_CHECKOUT);
    }


}