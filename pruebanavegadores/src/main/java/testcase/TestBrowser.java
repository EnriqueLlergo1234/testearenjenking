package testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser
{
    @Parameters({"browser"})
    @Test
    public void doLogin(String b) throws InterruptedException {
        System.out.println("Browser name: "+b);
        Thread.sleep(2000);
    }
}

