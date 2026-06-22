package org.example.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/OrangeHRMHooksFeatures.feature",
        glue = "org.example"
)
public class OrangeHRMHookRunner {

}
