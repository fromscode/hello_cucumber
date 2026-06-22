package org.example.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/OrangeHRMAdminDashboard.feature",
        glue = "org.example"
)
public class OrangeHRMAdminRunner {
}
