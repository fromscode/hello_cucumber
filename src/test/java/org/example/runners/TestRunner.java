package org.example.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/SauceLogin.feature",
        glue = "org.example.steps",
        plugin = "html:target/cucumber-reports.html"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

