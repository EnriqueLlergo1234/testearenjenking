package testcase;

import org.testng.annotations.Test;

public class groups
{
    /**
     * A la hora de ejecutar un grupo, regression.xml, si tenemos varias carpetas, tenemos que de alguna manera especificar la ruta
     */
    @Test(priority = 1, groups = "grupo1")
    public void doUserReg()
    {
        System.out.println("grupo1");
    }

    @Test(priority = 2, groups = "grupo2")
    public void doLogin()
    {
        System.out.println("grupo");
    }

    @Test(groups = {"grupo"})
    public void probar()
    {
        System.out.println("asdlkjflsañkfdlsaldñfsajkfdsfda");
    }
}
