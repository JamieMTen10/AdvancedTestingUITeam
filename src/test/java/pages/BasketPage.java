package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Integer.parseInt;

public class BasketPage extends BasePage{
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    private static final By PRODUCT_QUANTITY = By.cssSelector("[name=product-quantity-spin]");

    public int getQuantity(){
        return parseInt(getAttribute(PRODUCT_QUANTITY));
    }
}
