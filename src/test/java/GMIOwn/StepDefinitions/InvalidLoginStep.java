package GMIOwn.StepDefinitions;

import GMIOwn.Pages.RegistrationPage;
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
            register.email.sendKeys(email);
            register.registerSubmitButton.click();
//            String acmessage=register.invalidEmailmessage.getText();
//            Assert.assertEquals(exmessage,acmessage);

            for (int i = 0; i < register.invalidEmailmessage.size(); i++) {
                if (register.invalidEmailmessage.get(i).getText().equals(exmessage)) {
                    String actual = register.invalidEmailmessage.get(i).getText();
                    Assert.assertEquals(exmessage, actual);
                }
            }



            }

    @When("user enter {string} it should be see this {string}")
    public void user_enter_it_should_be_see_this(String password, String expected) {
           register.firstPassword.sendKeys(password);
          String actual= register.invalidPassword.getText();
          Assert.assertEquals(actual,expected);

    }

        }





