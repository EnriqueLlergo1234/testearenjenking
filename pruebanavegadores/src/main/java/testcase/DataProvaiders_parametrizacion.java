package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvaiders_parametrizacion
{

    @DataProvider(name="dp")
    public Object[][] datos(Method m)
    {
        Object[][]data=null;
        if(m.getName().equals("doLogin3"))
        {
            data=new Object[2][2];
            data[0][0]="hola";
            data[0][1]=".*";

            data[1][0]="adios";
            data[1][1]=".*";
        }
        else if(m.getName().equals("doLogin4"))
        {
            data=new Object[2][3];
            data[0][0]="hola";
            data[0][1]=".*";
            data[0][2]="hola@gmail.com";

            data[1][0]="adios";
            data[1][1]=".*";
            data[1][2]="adios@gmail.com";
        }

        return data;
    }

    @DataProvider(name="dp1")
    public Object[][] datos1()
    {
        Object[][]data=new Object[2][2];
        data[0][0]="enrique";
        data[0][1]="1234";

        data[1][0]="kike";
        data[1][1]="9876";

        return data;
    }

    @DataProvider(name="dp2")
    public Object[][] datos2()
    {
        Object[][]data=new Object[2][3];
        data[0][0]="enrique";
        data[0][1]="1234";
        data[0][2]="1234@gmail.com";

        data[1][0]="kike";
        data[1][1]="9876";
        data[1][2]="9876@gmail.com";

        return data;
    }
}
