package factory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class registraion extends prop {
    WebDriver driver;

    @Test
    public void regis(){
        RegisPage regisPage = PageFactory.initElements(driver, RegisPage.class);
        regisPage.reg();
    }
}
