package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class InvocationCount_ThreadPoolSize
{
    /**
     * InvocationCount -> Repite el test x numero de veces
     * threadPoolSize -> Ejecuta x numero de test a la vez
     */
    @Test(invocationCount = 3, threadPoolSize = 2)
    public void executeTest()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.way2automation.com/");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
