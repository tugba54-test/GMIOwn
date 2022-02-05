package GMIOwn.Utilities;

import org.openqa.selenium.support.PageFactory;

public class PageInitilizar  {

    public PageInitilizar () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}