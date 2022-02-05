package GMIOwn.Pages;

import GMIOwn.Utilities.Driver;
import GMIOwn.Utilities.PageInitilizar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegistrationPage extends PageInitilizar {

    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement registrationButton;


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

    @FindBy(id = "secondPassword")
    public WebElement newPasswordTextbox;

    @FindBy(xpath = "//div[contains(text(),'Your SSN is invalid')]")
    public WebElement invalidSSnWarningMessage;

    @FindBy(xpath = "//div[contains(text(),'Your mobile phone number is invalid')]")
    public WebElement invalidPhoneNumberWarningMessage;

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

    @FindBy(xpath="//ul[@id='header-tabs']//li[8]")
    public WebElement firstbutton;

    @FindBy(xpath ="//a[@id='login-item']")
    public WebElement signin;

    @FindBy(xpath ="//li[@id='account-menu']/div/a[2]/span")
    public WebElement register;


    @FindBy(xpath ="//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public List<WebElement> invalidEmailmessage;

    @FindBy(id = "firstPassword")
    public WebElement firstPassword;

    @FindBy(xpath = "//div[contains(text(),'Your password should contain at least one uppercase,one digit, one lowercase and one special character')]")
    public WebElement invalidPassword;

    //input[@id='firstPassword']

    public   void Register(){
        firstbutton.click();

        System.out.println("Selenium calisiyor");

         register.click();
    }



}