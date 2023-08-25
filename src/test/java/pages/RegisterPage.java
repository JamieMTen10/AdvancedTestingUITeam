package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void registerAnAccount(){
        driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("Zuber");
        driver.findElement(By.cssSelector("[name=lastname]")).sendKeys("Mahmood");
        driver.findElement(By.cssSelector("[name=email]")).sendKeys("jooobbbbbbbbbbhjoe10@gmail.com");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("Password123");
    }

    public void pressSave(){
        driver.findElement(By.cssSelector(".btn.btn-primary.form-control-submit.float-xs-right")).click();
    }
    public void pressSocialTitle(){
        driver.findElement(By.cssSelector("[name=id_gender]")).click();
    }
    public void enterDateOfBirth(){
        driver.findElement(By.cssSelector("[name=birthday]")).sendKeys("04/11/1999");
    }
}
