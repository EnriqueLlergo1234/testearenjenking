package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1
{
    /**
     * - A los test, podemos darle prioridad, siendo 1 la mayor prioridad, de tal manera que
     *   si ejecutamos todos a la vez, siempre se ejecutara primero el de prioridad 1
     * - BeforeMethod -> Esto lo que hace es que independientemente de la prioridad, se ejecuta
     *   antes
     * - AfterMethod -> Igual que el BeforeMethod, pero al final
     */
    @BeforeMethod
    public void launchBrowser()
    {
        System.out.println("primero");
    }

    @Test(priority = 1)
    public void doUserReg()
    {
        System.out.println("hola");
    }

    @Test(priority = 2, groups = {"grupo2", "grupo1"})
    public void doLogin()
    {
        System.out.println("Adios 2");
    }

    @AfterMethod
    public void closeBrowser()
    {
        System.out.println("ultimo");
    }
}
