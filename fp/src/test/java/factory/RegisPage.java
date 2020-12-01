package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class RegisPage {
    WebDriver driver;
    @FindBy(id = "text")
    WebElement login;
    @FindBy(how = How.XPATH, using = ".//input[@type='password']")
    WebElement password;
    @FindBy(how = How.XPATH, using = ".//input[@type='submit']")
    WebElement button;

    public RegisPage(WebDriver driver){
        this.driver = driver;
    }


    public void reg() {
        driver.get("http://localhost:8080/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login.sendKeys("zxc");
        password.sendKeys("123");
        button.click();
    }
}
