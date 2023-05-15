package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CaptureScreenshots_TestBase
{
    public static ChromeDriver driver;
    public static int num;

    @BeforeSuite
    public void setUp()
    {
        if(driver==null)
        {
            num=5;
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get("https://store.steampowered.com/login/?l=spanish");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        }
    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }
}
