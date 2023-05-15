package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;

public class paralleltest_dataprovaider
{
    @Test(dataProvider = "getData")
    public void doLogin(String b) throws InterruptedException {
        Date d=new Date();
        System.out.println("Browser name: "+b+" --> "+d);
        Thread.sleep(2000);
    }

    @DataProvider(parallel = true)
    public Object[][] getData()
    {
        Object[][]data=new Object[2][1];
        data[0][0]="chrome";
        data[1][0]="firefox";
        return data;
    }
}
