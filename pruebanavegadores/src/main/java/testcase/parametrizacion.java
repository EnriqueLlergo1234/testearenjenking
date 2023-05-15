package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parametrizacion
{
    /**
     * - DataProvaider, el metodo siempre sera de tipo Object[][]
     * - El numero de columnas que tenga, tiene que ser el mismo que el numero de elementos que hay entre parentesis
     */
    @Test(dataProvider = "datos")
    public void doLogin(String usuario, String constraseña)
    {
        System.out.println(usuario+" ---- "+constraseña);
    }

    @DataProvider
    public Object[][] datos()
    {
        Object[][]data=new Object[3][2];
        data[0][0]="enrique";
        data[0][1]="1234";

        data[1][0]="kike";
        data[1][1]="9876";

        data[2][0]="llergo";
        data[2][1]="asdf";

        return data;
    }
}
