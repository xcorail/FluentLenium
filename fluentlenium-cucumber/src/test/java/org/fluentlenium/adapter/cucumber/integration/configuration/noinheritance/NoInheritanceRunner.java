package org.fluentlenium.adapter.cucumber.integration.configuration.noinheritance;

import cucumber.api.CucumberOptions;
import net.jcip.annotations.NotThreadSafe;
import org.fluentlenium.adapter.cucumber.FluentCucumber;
import org.fluentlenium.configuration.FluentConfiguration;
import org.junit.runner.RunWith;

@RunWith(FluentCucumber.class)
@CucumberOptions(features = "classpath:org/fluentlenium/adapter/cucumber/integration/scenario",
        glue = "org.fluentlenium.adapter.cucumber.integration.configuration.noinheritance.steps",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
@NotThreadSafe
@FluentConfiguration(webDriver = "htmlunit")
public class NoInheritanceRunner {
}
