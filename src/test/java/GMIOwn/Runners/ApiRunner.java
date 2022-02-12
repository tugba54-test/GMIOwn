package GMIOwn.Runners;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-default-report",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed.txt"
        },
        features = "src/test/resources/features",
        glue = "GMIOwn/StepDefinitions",
        tags = "@ReadingApplicant",
        dryRun = false

)



public class ApiRunner {
}
