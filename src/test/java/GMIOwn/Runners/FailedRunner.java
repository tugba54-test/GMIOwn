package GMIOwn.Runners;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failed.txt"
                 ,glue="GMIOwn.StepDefinitions",
                 monochrome = true,
                   plugin={ "pretty",
        "html:target/cucumber-default-report",})

public class FailedRunner {
}
