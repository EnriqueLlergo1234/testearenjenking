package testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion_y_reporting
{
    String nombre="Enrique";
    String nombre_esperado="Enrique";

    @Test
    public void validar()
    {
        Assert.assertEquals(nombre,nombre_esperado);
        /*
        Assert.assertTrue(false,"para comprobar si un dato u objeto es true o false");
        Assert.fail("Para forzar a que falle");
        */
    }
}
