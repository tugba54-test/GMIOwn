package GMIOwn.Packages;

import GMIOwn.Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static GMIOwn.Utilities.BrowserUtils.doubleClick;

public class RegistrationPage{

    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement registrationButton;

    @FindBy(xpath="//a[@href='/loan']")
    public WebElement firstbutton;

////li[@id='account-menu' and @class ='dropdown nav-item']
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public List<WebElement> fieldList;

    @FindBy(id = "ssn")
    public WebElement ssnTextbox;

    @FindBy(id = "firstname")
    public WebElement firstnameTextbox;

    @FindBy(id = "lastname")
    public WebElement lastnameTextbox;

    @FindBy(id = "address")
    public WebElement addressTextbox;

    @FindBy(id = "mobilephone")
    public WebElement mobilephoneTextbox;

    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextbox;

    @FindBy(id = "secondPassword")
    public WebElement newPasswordTextbox;

    @FindBy(id = "register-submit")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//div[contains(text(),'Your SSN is invalid')]")
    public WebElement invalidSSnWarningMessage;

    @FindBy(xpath = "//div[contains(text(),'Your mobile phone number is invalid')]")
    public WebElement invalidPhoneNumberWarningMessage;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public List<WebElement> invalidEmailmessage;

    @FindBy(xpath = "//div[contains(text(),'translation-not-found')]")
    public WebElement ssnWarningmessage;

    @FindBy(xpath = "//strong[contains(text(),'Registration saved!')]")
    public WebElement successMessage;



    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//input[@title='Search']")
    public WebElement search;

    @FindBy(xpath = "//ul[@id='strengthBar']//li[5]")
    public WebElement PasswordStrength;

    @FindBy(xpath ="//div[@class='invalid-feedback']")
    public WebElement invalidpassword;

    @FindBy(xpath ="//a[@id='login-item']")
    public WebElement signin;

    public void navigateRegister() {
           System.out.println("Selenium calismiyor");



         JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", firstbutton);
        Driver.waitAndClick(accountMenu, 5);

        System.out.println("Galiba calisyr artik");


        // Driver.waitForVisibility(firstbutton,3);
        // Driver.waitAndClick(firstbutton,3);

       // registrationButton.click();
    }
    public   void Register(){

        Actions act = new Actions(Driver.getDriver());

        //act.click(firstbutton);
        firstbutton.click();
        System.out.println("Selenium calisiyor");



          act.moveToElement(signin).click().perform();
        // signin.click();

    }


}