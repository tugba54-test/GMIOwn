package GMIOwn.Pages;

import GMIOwn.Utilities.BrowserUtils;
import GMIOwn.Utilities.PageInitilizar;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserInfoPage extends PageInitilizar {

    @FindBy(xpath ="//a[@href='/account/settings']")   //li[@id='account-menu']/following::a")
    public WebElement userInfo;//*[@id="account-menu"]/div/a[1]

    @FindBy(xpath ="//input[@name='firstName']")
    public WebElement firstname;

    @FindBy(xpath ="//input[@name='lastName']")
    public WebElement lastname;

    @FindBy(xpath ="//input[@name='email']")
    public WebElement email;

    @FindBy(xpath ="//select[@id='langKey']")
    public WebElement language;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement save;

    @FindBy(xpath ="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement settingSaved;

    public void UpdateUser(String name,String lastname1,String email1,String language1){
        BrowserUtils.verifyElementDisplayed(userInfo);

        userInfo.click();
        firstname.clear();
         firstname.sendKeys(name);
         lastname.clear();
         lastname.sendKeys(lastname1);
        email.clear();
        email.sendKeys(email1);
        save.click();
        Select select=new Select(language);
       select.selectByValue("en");

        System.out.println(language);
          //  Assert.assertTrue("Language does not match", lan.contains("English"));
           // Assert.assertTrue("Language does not match", lan.contains("Turkish"));

//        if(lan.equals(language1)){
//            language.click();
//        }
        save.click();
        System.out.println(settingSaved.getText());


//        Assert.assertEquals(name,firstname.getText());
//        Assert.assertEquals(lastname1,lastname.getText());
//        Assert.assertEquals(email1,email.getText());
//        Assert.assertEquals(language1,language.getText());

//        firstname.clear();
//        firstname.sendKeys("t37");
//        lastname.clear();
//        lastname.sendKeys("customer");
//        email.clear();
//        email.sendKeys(email1);
//        save.click();
//
//        if(lan.equals("English")){
//            language.click();
//        }
//        save.click();
//
//

    }
}
