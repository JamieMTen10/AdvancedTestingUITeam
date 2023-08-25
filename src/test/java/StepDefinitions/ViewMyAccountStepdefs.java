package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SignInPage;
import pages.ViewMyAccountPage;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;

public class ViewMyAccountStepdefs {
    SignInPage signInPage = new SignInPage(driver, wait);
    ViewMyAccountPage viewAccountPage = new ViewMyAccountPage(driver, wait);

    @And("I click View My Account link")
    public void iClickViewMyAccountLink() {
        signInPage.navigateToAccountPage();
    }

    @And("I click add first address link")
    public void iClickAddFirstAddressLink() {
        viewAccountPage.clickViewFirstAddress();

    }

    @And("I enter {string}, {string}, {string}, {string}, {string}, {string} and {string}")
    public void iEnterAnd(String firstname, String lastname, String address, String city, String state, String postcode, String country) {
        viewAccountPage.clearFirstName();
        viewAccountPage.clearLastName();
        viewAccountPage.clearAddress();
        viewAccountPage.clearCity();
        viewAccountPage.clearPostcode();
        viewAccountPage.enterFirstName(firstname);
        viewAccountPage.enterLastName(lastname);
        viewAccountPage.enterAddress(address);
        viewAccountPage.enterCity(city);
        viewAccountPage.selectState(state);
        viewAccountPage.enterPostcode(postcode);
    }

    @And("I click save button")
    public void iClickSaveButton() {
        viewAccountPage.clickSave();
    }

    @Then("the following address will be added to account")
    public void theFollowingAddressWillBeAddedToAccount() {
        System.out.println("I am looking at the added address");
        WebElement yourAccount = driver.findElement(By.cssSelector("h1"));
        String expected = "Your addresses";
        Assert.assertEquals(expected,yourAccount.getText());
    }

    @And("I click View My Account link again")
    public void iClickViewMyAccountLinkAgain() {
        signInPage.navigateToAccountPage();

    }

    @And("I click Addresses link")
    public void iClickAddressesLink() {
        viewAccountPage.clickViewAddresses();

    }

    @And("I click update link")
    public void iClickUpdateLinkAndClearText() {
        viewAccountPage.clickUpdate();
    }

    @Then("the latter address will replace the former")
    public void theLatterAddressWillReplaceTheFormer() {
        System.out.println("The new address has replaced the previous address");
        WebElement yourAccount = driver.findElement(By.cssSelector("h1"));
        String expected = "Your addresses";
        Assert.assertEquals(expected,yourAccount.getText());
    }

    @And("I click Delete link")
    public void iClickDeleteLink() {
        viewAccountPage.clickDelete();
        System.out.println("the address has been deleted");
    }

    @Then("address will be deleted")
    public void addressWillBeDeleted() {
        WebElement yourAccount = driver.findElement(By.cssSelector("h1"));
        String expected = "Your addresses";
        Assert.assertEquals(expected,yourAccount.getText());
    }

}
