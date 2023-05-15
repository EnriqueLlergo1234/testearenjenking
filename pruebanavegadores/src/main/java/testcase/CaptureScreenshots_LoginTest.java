package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CaptureScreenshots_LoginTest extends CaptureScreenshots_TestBase
{
    @Test
    public void doLogin()
    {
        if(driver==null)
        {
            System.out.println("Es nulo "+num);
        }
        else
        {
            driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("holamundo");
            driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[4]/button")).click();

        }
    }
}
