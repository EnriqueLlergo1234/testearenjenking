package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class ejercicio1_13
{
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.es/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("way2automation");
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();

        WebElement lista=driver.findElement(By.xpath("//*[@id=\"ast-desktop-header\"]/div[1]/div/div/div/div[1]/div/div/div/div/div/section[1]/div/div/div/div[2]/div/ul"));
        List<WebElement> values=lista.findElements(By.tagName("a"));
        System.out.println("Total enlaces: "+values.size());
    }
}
