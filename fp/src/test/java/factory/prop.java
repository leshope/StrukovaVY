package factory;

import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prop {
    public WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/cDriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void close() {
        driver.quit();
    }
}
