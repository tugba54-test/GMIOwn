package GMIOwn.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfoPage {

    @FindBy(xpath ="//li[@id='account-menu']/following::a")
    public WebElement userInfo;

    @FindBy(xpath ="//input[@name='firstName']")
    public WebElement firstname;

    @FindBy(xpath ="//input[@name='lastName']")
    public WebElement lastname;

    @FindBy(xpath ="//input[@name='email']")
    public WebElement email;

    @FindBy(xpath ="//select[@id='langKey']")
    public WebElement language;
}
