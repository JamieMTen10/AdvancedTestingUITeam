package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    // Method to wait for an element to be clickable and then click it.
    void waitAndClick(By selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    // Method to check if an element is visible.
    boolean elementIsVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    // Method to find an element by selector and type a specified string into it.
  
    void findAndType(By elementSelector, String inputString) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        element.sendKeys(inputString);
    }

    String getAttribute(By selector){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        return element.getAttribute("value");
    }

    // Method to clear the browser's cache by deleting all cookies.
    void clearBrowserCache() {
        driver.manage().deleteAllCookies(); //delete all cookies
    }
}