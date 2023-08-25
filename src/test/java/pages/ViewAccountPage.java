package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewAccountPage extends BasePage {
    public ViewAccountPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    private static final By FIRST_ADDRESS_BOX = By.cssSelector("a#address-link > span");
    private static final By YOUR_ADDRESSES_BOX = By.cssSelector("a#addresses-link > span");
    private static final By FIRSTNAME = By.cssSelector("[name=firstname]");
    private static final By LASTNAME = By.cssSelector("[name=lastname]");
    private static final By ADDRESS_INPUT = By.cssSelector("[name=address1]");
    private static final By CITY_INPUT = By.cssSelector("[name=city]");
    private static final By STATE_INPUT = By.cssSelector("div>select[name=id_state]>option:nth-child(5)");
    private static final By POSTCODE_INPUT = By.cssSelector("[name=postcode]");
    private static final By SAVE_BUTTON = By.cssSelector("div>form>footer>button");
    private static final By UPDATE_LINK = By.cssSelector("div.address-footer > a:nth-child(1) > span");
    private static final By DELETE_LINK = By.cssSelector("div.address-footer > a:nth-child(2) > span");
    public void clickViewAddresses(){
        waitAndClick(YOUR_ADDRESSES_BOX);
    }
    public void clickViewFirstAddress(){
        waitAndClick(FIRST_ADDRESS_BOX);
    }
    public void clearFirstName(){
        findAndClear(FIRSTNAME);
    }
    public void clearLastName(){
        findAndClear(LASTNAME);
    }
    public void clearAddress(){
        findAndClear(ADDRESS_INPUT);
    }
    public void clearCity(){
        findAndClear(CITY_INPUT);
    }
    public void clearPostcode(){
        findAndClear(POSTCODE_INPUT);
    }
    public void enterFirstName(String firstname){
        findAndType(FIRSTNAME,firstname);
    }
    public void enterLastName(String lastname){
        findAndType(LASTNAME,lastname);
    }
    public void enterAddress(String address){
        findAndType(ADDRESS_INPUT,address);
    }
    public void enterCity(String city){
        findAndType(CITY_INPUT,city);
    }
    public void selectState(){
        waitAndClick(STATE_INPUT);
    }
    public void enterPostcode(String postcode){
        findAndType(POSTCODE_INPUT,postcode);
    }
    public void clickSave(){
        waitAndClick(SAVE_BUTTON);
    }
    public void clickUpdate(){
        waitAndClick(UPDATE_LINK);
    }
    public void clickDelete(){
        waitAndClick(DELETE_LINK);
    }
}
