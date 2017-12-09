package com.aimin.service.gexianV1.impl;
import com.aimin.service.gexianV1.DetailService;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DetailServiceImpl implements DetailService {
    public void testModalByChrome (String url) {
        try {
            WebDriver driver = new ChromeDriver();
            WebDriver.Window window = driver.manage().window();
            window.setSize(new Dimension(320, 1000));
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            WebElement pTrail = driver.findElement(By.className("button"));
            pTrail.click();
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
            WebElement pModal = driver.findElement(By.id("product-select"));
            WebElement bg1 = pModal.findElement(By.className("page-bg"));
            bg1.click();
            pTrail.click();
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
            WebElement pBtnp = pModal.findElement(By.className("cr-link"));
            pBtnp.click();
            WebElement bg2 = pModal.findElement(By.className("drawer_bg"));
            bg2.click();
            bg1.click();
        }catch (Exception e){
           e.printStackTrace();
            logger.error(e);
        }
    }
}
