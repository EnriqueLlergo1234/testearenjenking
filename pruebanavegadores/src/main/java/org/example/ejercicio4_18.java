package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ejercicio4_18 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement reajustar=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
        Actions action=new Actions(driver);
        for(int i=0;i<500;i++)
        {
            Dimension dimension=new Dimension((i+1),i);
            driver.manage().window().setSize(dimension);
            Thread.sleep(1);
        }

    }
}
