package org.example.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/OrangeHRMLogin.feature",
        glue = {"org.example.steps"}
)
public class OrangeHRMLoginTestRunner extends AbstractTestNGCucumberTests {
}
