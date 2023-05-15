package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertions_y_multiple_failures
{
    String nombre="Enrique";
    String nombre_esperado="nrique";

    @Test
    public void validar()
    {
        /**
         * SoftAssert, lo que hace es que independientemente de que haya excepciones, hara el test y no lo parara
         */
        SoftAssert softAssert=new SoftAssert();

        System.out.println("INICIO");

        softAssert.assertEquals(nombre,nombre_esperado,"No es igual");
        softAssert.assertTrue(false,"para comprobar si un dato u objeto es true o false");
        softAssert.assertEquals(true,false);
        //Assert.fail("Para forzar a que falle");

        System.out.println("FIN");

        softAssert.assertAll();
    }
}
