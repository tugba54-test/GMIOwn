package GMIOwn.Runners;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-default-report",
                //"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed.txt"
        },
        features = "src/test/resources/features",
        glue = "GMIOwn/StepDefinitions",
        tags = "@invalid",
        dryRun = false

)



public class SmokeRunner {
}
