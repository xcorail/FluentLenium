package org.fluentlenium.adapter.cucumber.integration.configuration.inheritance.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.fluentlenium.adapter.cucumber.integration.configuration.inheritance.BaseTest;

public class Hooks extends BaseTest {

    @Before
    public void beforeScenario(Scenario scenario) {
        this.before(scenario);
    }

    @After
    public void afterScenario(Scenario scenario) {
        this.after(scenario);
    }
}
