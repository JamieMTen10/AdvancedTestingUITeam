package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SignInPage;
import pages.ViewAccountPage;

import static StepDefinitions.Hooks.driver;
import static StepDefinitions.Hooks.wait;

public class AddressStepdefs {
    SignInPage signInPage = new SignInPage(driver, wait);
    ViewAccountPage viewAccountPage = new ViewAccountPage(driver, wait);

    @And("I click View My Account link")
    public void iClickViewMyAccountLink() {
        signInPage.navigateToAccountPage();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "My account";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

    @And("I click add first address link")
    public void iClickAddFirstAddressLink() {
        viewAccountPage.clickViewFirstAddress();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Address";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
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
        viewAccountPage.selectState();
        viewAccountPage.enterPostcode(postcode);
    }


    @And("I click save button")
    public void iClickSaveButton() {
        viewAccountPage.clickSave();
    }

        @Then("the following address will be added to account")
    public void theFollowingAddressWillBeAddedToAccount() {
        System.out.println("I am looking at the added address");
    }

    @And("I click View My Account link again")
    public void iClickViewMyAccountLinkAgain() {
        signInPage.navigateToAccountPage();
    }

    @And("I click Addresses link")
    public void iClickAddressesLink() {
        viewAccountPage.clickViewAddress();
    }

    @And("I click update link")
    public void iClickUpdateLinkAndClearText() {
        viewAccountPage.clickUpdate();
    }

    @Then("the latter address will replace the former")
    public void theLatterAddressWillReplaceTheFormer() {
        System.out.println("The new address has replaced the previous address");
    }

    @And("I click Delete link")
    public void iClickDeleteLink() {
        viewAccountPage.clickDelete();
        System.out.println("the address has been deleted");
    }

    @Then("address will be deleted")
    public void addressWillBeDeleted() {
    }
}
