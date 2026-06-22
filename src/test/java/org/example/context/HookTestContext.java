package org.example.context;

// This context class is used only to inject the Webdriver dependency inside
// hook and step definition file

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HookTestContext {
    WebDriver driver;

    public void setup(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void teardown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
