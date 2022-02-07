package GMIOwn.StepDefinitions;

import GMIOwn.Utilities.BrowserUtils;
import GMIOwn.Utilities.ConfigurationReader;
import GMIOwn.Utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;

import static GMIOwn.Utilities.Driver.closeDriver;

public class Hooks {

    @Before
    public void start(Scenario scenario) {
        System.out.println("Starting scenario -->" + scenario.getName());
       // Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        
    }

    @After
    public void end(Scenario scenario) {
        byte[] pic ;
        if (!scenario.isFailed()) {
        pic = BrowserUtils.takeScreenshot("passed/" + scenario.getName());
        }
        else{
        pic = BrowserUtils.takeScreenshot("failed/" + scenario.getName());
        }

       //scenario.attach(pic, "image/png", scenario.getName());
       scenario.embed(pic, scenario.getName());
    
        closeDriver();
    }
}

