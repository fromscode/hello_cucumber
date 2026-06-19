package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class OrangeHRMLoginSteps {
    WebDriver driver;

    @Given("the user is on the OrangeHRM login page")
    public void the_user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @And("clicks the OrangeHRM login button")
    public void clicks_on_the_login_button() {
        driver.findElement(By.tagName("button")).click();
    }

    @Then("the login status is {string}")
    public void the_login_status_is(String status) {
        if (status.equals("pass")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        }
        else {
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        }
    }
}
