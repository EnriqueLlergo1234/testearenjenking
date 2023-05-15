package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testDependencies
{
    /**
     * - dependsOnMethods -> Si utilizamos esto, estamos indicando que para que se ejecute este test, previamente
     *   tiene que haber pasado el test del que depende, sino lo ignora, por ejemplo, si el usuario no se ha
     *   registrado, para que vamos a comprobar el login
     * - Tambien podemos hacer que un test dependa de varios expresandolo como un array
     * - alwaysRun -> independientemente del test que dependa, se ejecutara
     */
    @Test(priority = 1)
    public void doUserReg()
    {
        System.out.println("hola");
        Assert.fail("Usuario no registrado");
    }

    @Test(priority = 2, dependsOnMethods = "doUserReg", groups = "grupo1")
    public void doLogin()
    {
        System.out.println("Adios");
    }

    @Test(priority = 3, dependsOnMethods = {"doUserReg","doLogin"}, groups = "grupo2")
    public void jugar()
    {
        System.out.println("Jugando");
    }

    @Test(priority = 2, dependsOnMethods = "doUserReg", alwaysRun = true, groups = "grupo3")
    public void mostrarpuntuacion()
    {
        System.out.println("Puntuacion");
    }
}
