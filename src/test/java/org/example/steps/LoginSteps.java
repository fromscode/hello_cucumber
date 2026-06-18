package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSteps {
    WebDriver driver;

    @Given("the user navigates to the SauceDemo login page")
    public void navigateToLogin() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters the username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("clicks the login button")
    public void clickLoginBtn() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the user should be redirected to the products page")
    public void verifyRedirect() {
        Assert.assertTrue(driver.getCurrentUrl().endsWith("inventory.html"));
    }


}
