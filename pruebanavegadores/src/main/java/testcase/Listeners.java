package testcase;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
    /**
     * Si tenemos varias carpetas, tenemos que de alguna manera especificar la ruta, textng.xml
     */
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test pasado -- "+result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("ERROR -- "+result.getTestName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }
}
