package GMIOwn.StepDefinitions;

import GMIOwn.Packages.RegistrationPage;
import GMIOwn.Utilities.ConfigurationReader;
import GMIOwn.Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class InvalidLoginStep {
    RegistrationPage register=new RegistrationPage();

    @Given("user navigate to {string}")
    public void user_navigate_to(String url) throws InterruptedException {
        Driver.getDriver().get(url);
        Thread.sleep(9000);
    }
        @Then("click register")
        public void click_register () {
            register.Register();
        }

        @When("user enter the {string} see {string}")
        public void user_enter_the_see (String email, String exmessage){
            register.emailTextbox.sendKeys(email);
            register.registerSubmitButton.click();

            for (int i = 0; i < register.invalidEmailmessage.size(); i++) {
                if (register.invalidEmailmessage.get(i).getText().equals(exmessage)) {
                    String actual = register.invalidEmailmessage.get(i).getText();
                    Assert.assertEquals(exmessage, actual);
                }

            }

        }

    }



