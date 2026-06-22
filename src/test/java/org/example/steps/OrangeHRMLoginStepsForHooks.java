package org.example.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.context.HookTestContext;
import org.example.hooks.OrangeHRMLoginStepsHooks;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OrangeHRMLoginStepsForHooks {
    HookTestContext context;

    public OrangeHRMLoginStepsForHooks(HookTestContext context) {
        this.context = context;
    }

    @When("The user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        this.context.getDriver().findElement(By.name("username")).sendKeys(username);
        this.context.getDriver().findElement(By.name("password")).sendKeys(password);
    }

    @When("clicks on the login button \\(hooks)")
    public void clicks_on_the_login_button_hooks() {
        this.context.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("the dashboard is {string}")
    public void the_dashboard_is(String result) {
       if (result.equals("displayed")) {
           Assert.assertTrue(this.context.getDriver().getCurrentUrl().contains("dashboard"));
       }
       else {
           Assert.assertFalse(this.context.getDriver().getCurrentUrl().contains("dashboard"));
       }
    }
}
