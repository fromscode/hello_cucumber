package org.example.steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class OrangeHRMAdminDashboard {
    WebDriver driver;
    @Given("the user is on the OrangeHRM login page \\(admin)")
    public void the_user_is_on_the_orange_hrm_login_page_admin() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Given("the user logs in as an admin with username {string} and password {string}")
    public void the_user_logs_in_as_an_admin(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }

    @When("the admin clicks on the Admin option in the sidebar")
    public void the_admin_clicks_on_the_admin_option_in_the_sidebar() {
        driver.findElement(By.xpath("//ul/li[1]")).click();
    }

    @Then("the admin can see the user management page")
    public void the_admin_can_see_the_user_management_page() {
       String actual = driver.findElement(By.xpath("//span/h6[2]")).getText();
       Assert.assertEquals(actual, "User Management");
    }

    @When("The admin clicks on the Leave option in the sidebar")
    public void the_admin_clicks_on_the_leave_option_in_the_sidebar() {
        driver.findElement(By.xpath("//ul/li[3]")).click();
    }

    @Then("the admin can see the Leave page")
    public void the_admin_can_see_the_leave_page() {
        Assert.assertEquals(driver.findElement(By.tagName("h6")).getText(), "Leave");
    }
}
