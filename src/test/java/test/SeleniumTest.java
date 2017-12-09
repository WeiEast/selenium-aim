package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public  static  void main(String[]  args) {
        System.setProperty("webdriver.chrome.driver", "/users/aimin/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://youdao.com");
        WebElement element = driver.findElement(By.id("translateContent"));
        element.sendKeys("selenium");
        element.submit();
        //driver.quit();
    }
}
