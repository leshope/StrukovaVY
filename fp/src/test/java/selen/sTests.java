package selen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sTests extends webProperties {
    public WebDriver driver;
    @Test
    public void registration() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.cssSelector("[href=\"/registration\"]")).click();
        driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("zxc");
        driver.findElement(By.xpath(".//input[@type='password'")).sendKeys("123");
        driver.findElement(By.xpath(".//input[@type='submit']")).click();

    }
    @Test
    public void signIn() {
        driver.get("http://localhost:8080/login");
        driver.findElement(By.id("text")).sendKeys("zxc");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("123");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/main\"]")).click();
    }

}
