package testcase;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skip_test
{
    @Test
    public void isSkip()
    {
        throw new SkipException("Con esto se salta el test");
    }
}
