package testcase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class before_after_suite
{
    @BeforeSuite
    public void setUp() {

        System.out.println("Initializing Everything !!!");
    }

    @AfterSuite
    public void tearDown() {

        System.out.println("Quitting Everything !!!");
    }
}
