package testcase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestUtil extends CaptureScreenshots_TestBase
{
    public static String palabra;

    public static void captureScreenshot()
    {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int sec=cal.get(Calendar.SECOND);
        int min=cal.get(Calendar.MINUTE);
        int date=cal.get(Calendar.DATE);
        int day=cal.get(Calendar.HOUR_OF_DAY);

        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try
        {
            palabra=System.getProperty("user.dir")+"\\screenshot\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_"+sec+".jpeg";
            FileUtils.copyFile(scrFile,new File(palabra));
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
