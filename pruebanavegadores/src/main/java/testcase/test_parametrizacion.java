package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_parametrizacion
{
    /**
     * - Si queremos tener los test parametrizados en otra clase, tenemos que indicarle donde se encuentran los
     *   datos para poder interactuar con estos
     * - Tambien tenemos la opcion de en el DataProvaiders_parametrizacion, hacerlo todo desde el mismo DataProvaider
     *   independientemente, de si el total de valores entre parentesis en uno u otro
     */
    @Test(dataProviderClass = DataProvaiders_parametrizacion.class, dataProvider = "dp1")
    public void doLogin(String usuario, String constraseña)
    {
        System.out.println(usuario+" ---- "+constraseña);
    }

    @Test(dataProviderClass = DataProvaiders_parametrizacion.class, dataProvider = "dp2")
    public void doLogin2(String usuario, String constraseña, String gmail)
    {
        System.out.println(usuario+" ---- "+constraseña+" ---- "+gmail);
    }

    @Test(dataProviderClass = DataProvaiders_parametrizacion.class, dataProvider = "dp")
    public void doLogin3(String usuario, String constraseña)
    {
        System.out.println(usuario+" ---- "+constraseña);
    }

    @Test(dataProviderClass = DataProvaiders_parametrizacion.class, dataProvider = "dp")
    public void doLogin4(String usuario, String constraseña, String gmail)
    {
        System.out.println(usuario+" ---- "+constraseña+" ---- "+gmail);
    }
}
