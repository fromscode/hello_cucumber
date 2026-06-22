package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.context.HookTestContext;


public class OrangeHRMLoginStepsHooks {
    HookTestContext context;

    public OrangeHRMLoginStepsHooks(HookTestContext context) {
        this.context = context;
    }

    @Before
    public void setup() {
        context.setup("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @After
    public void teardown() {
        context.teardown();
    }
}
