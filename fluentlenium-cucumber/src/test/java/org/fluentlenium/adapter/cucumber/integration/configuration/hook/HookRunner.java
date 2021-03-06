package org.fluentlenium.adapter.cucumber.integration.configuration.hook;

import cucumber.api.CucumberOptions;
import net.jcip.annotations.NotThreadSafe;
import org.fluentlenium.adapter.cucumber.FluentCucumber;
import org.fluentlenium.configuration.FluentConfiguration;
import org.junit.runner.RunWith;

@RunWith(FluentCucumber.class)
@CucumberOptions(glue = "org.fluentlenium.adapter.cucumber.integration.configuration.hook.steps",
        features = "classpath:org/fluentlenium/adapter/cucumber/integration/configuration/hook",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
@FluentConfiguration(webDriver = "htmlunit")
@NotThreadSafe
public class HookRunner {

}
