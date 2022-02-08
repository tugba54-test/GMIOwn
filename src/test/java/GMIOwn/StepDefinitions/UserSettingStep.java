package GMIOwn.StepDefinitions;

import GMIOwn.Pages.RegistrationPage;
import GMIOwn.Pages.UserInfoPage;
import cucumber.api.java.en.Given;

public class UserSettingStep {

    UserInfoPage user=new UserInfoPage();
    RegistrationPage register=new RegistrationPage();

    @Given("User update {string} and lastname {string} email {string} and {string}")
    public void user_update_and_lastname_email_and(String name, String lastname, String email, String language) {
        register.signin.click();
        user.UpdateUser(name,lastname,email,language);

    }

    @Given("it should be language  option as Turkish and English")
    public void it_should_be_language_option_as_Turkish_and_English() {

    }

}
