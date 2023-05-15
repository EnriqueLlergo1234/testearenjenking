package org.example;

import io.cucumber.java.an.E;
import io.cucumber.java.bs.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Driver;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ParseException {

        /**
         * - WebDriver, provee la capacidad de navegar por paginas web, sistemas de usuarios, ..., todo esto
         *   para el testing de aplicaciones web en distintos navegadores
         * - Si al ejecutar nuestro codigo nos salta el error de websocket, tenemos que ponerle el options
         * - El get, abre Abre automáticamente una nueva ventana del explorador y busca la página que
         *   especifique dentro de sus paréntesis.
         * - El getTitle, devuelve el titulo de la pagina
         * - El close, cierra la pagina que se acaba de abrir, y el quit, cierra todas las paginas que se
         *   hayan abierto, con el firefox, da error
         * - Maximize -> Maximiza la pagina
         * - Minimeze -> Minimiza la pagina
         */

        //Edge

        /*EdgeOptions options=new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.manage().window().minimize();*/


        //Chrome
        /*ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        String palabra=driver.getTitle();
        System.out.println(palabra);

        driver.close();*/

        //Firefox
        /*WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        String palabra=driver.getTitle();
        System.out.println(palabra);*/

        /**
         * A la hora de mandar texto a una pagina, necesiteramos un identificador, para conseguirlo, tendremo que dar click derecho
         * sobre el campo, inspeccionar, se nos abrira la consola de navegador y nos apareceran unas lineas resaltadas, estan son las
         * lineas de codigo del campo en cuestion, damos click derecho sobre estas lineas, copiar y seleccionamos la opcion de Copy Xpath,
         * por ultimo, escribimos driver.findElement(By.xpath("pegamos_lo_que_copiamos_antes")).sendKeys("texto a mandar")
         */
        //Mandar texto a campos Text de las paginas
        /*ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://store.steampowered.com/login/?l=spanish");
        driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("hola");
        driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("adios");*/

        /**
         * - Para interactuar con un boton, es igual que para agregar un texto a un Text, solo que en vez de añadir sendKeys, ponemos click
         * - Si queremos mostrar por consola un mensaje de la pagina, seria igual que sendKeys o click, solo que pondriamos getText
         * - El driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)), se utiliza porque las paginas pueden cargar a intervalos
         *   diferentes, y por ello tenemos que esperar a que cargen para poder interactuar con sus elementos
         */
        //Interactuar con los diferentes elementos de una pagina web, y esperar a que aparezcan
        /*ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://store.steampowered.com/login/?l=spanish");

        driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("hola");
        driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("adios");

        driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[4]/button")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[5]")).getText()+" hola");*/

        /**
         * El FluentWait, lo que hace en el ejemplo de abajo es comprobar una sentencia que se especificaria al
         * final de todo, esta se comprobaria si se cumple cada 5 seg durante 30 seg
         */
        //FluentWait

        //Wait<WebDriver> wait=new FluentWait<WebDriver>(Driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5));

        /**
         *
         */
        //Above, below, RightOf, LeftOf y Near
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement element = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
        element.sendKeys("trainer@way2automation.com");*/

        /*ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://store.steampowered.com/login/?l=spanish");

        driver.findElement(with(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input"))
                .below(By.xpath("")));*/

        /**
         * Para seleccionar una opcion de un combobox, es tan secillo como mandarle el nombre
         * de la opcion del combobox
         */
        //Seleccionar opciones de un combobox
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("searchLanguage")).sendKeys("Dansk");*/

        /**
         *   Para obtener los valores de un combobox, tenemos que meter dichos valores en una lista, apartir de esta,
         *   podriamos consultar el total de valores con size -1 (siempre devuelve uno de mas), para obtener el contenido
         *   tenemos que poner getText
         */
        //Obtener elementos de un combobox
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> values=driver.findElements(By.tagName("option"));

        System.out.println("Total de opciones: "+values.size());

        System.out.println("Valor Nº 7: "+values.get(7).getText());

        for(int i=0;i<values.size();i++)
        {
            System.out.println(values.get(i).getAttribute("lang"));
        }*/

        /**
         * - isDisplayed -> Nos dice si el elemento esta visible (nos devuelve true), u oculto (nos devuelve false)
         * - isElementPresent -> No es un metodo como tal, sino que tenemos que hacer una funcion que recoja la excepcion
         *   Throwable en un try/cath, y que devuelva true o false
         */
        //isDisplayed, isElementPresent, isEnabled, isSelected
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        System.out.println(driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).isDisplayed());*/

        /**
         * Para activar un checkbox, simplemente tenemos que buscar el xpath del elemento en cuestion, y .click
         */
        //Activar checkbox especificos
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.htmlquick.com/es/reference/tags/input-checkbox.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//*[@id=\"examples\"]/div[2]/div/form/p[1]/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"examples\"]/div[2]/div/form/p[1]/label[2]/input")).click();*/

        //Activar checkbox de un bloque
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.htmlquick.com/es/reference/tags/input-checkbox.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement block=driver.findElement(By.xpath("//*[@id=\"examples\"]/div[2]"));
        List<WebElement>checkboxes =block.findElements(By.name("cb-autos"));

        for(WebElement checkbox:checkboxes)
        {
            checkbox.click();
        }*/

        /**
         * Tenemos que tener cuidao de que a la hora de leer la tabla, cojamos los campos adecuado (td )
         */
        //Como leer una tabla
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.htmlquick.com/es/tutorials/tables.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> rowNum=driver.findElements(By.xpath("//*[@id=\"header-cells\"]/div/div/table/tbody/tr"));
        System.out.println("Total de filas: "+rowNum.size());

        List<WebElement> colNum=driver.findElements(By.xpath("//*[@id=\"header-cells\"]/div/div/table/tbody/tr[2]/td"));
        System.out.println("Total de columnas: "+colNum.size());

        //System.out.println(driver.findElement(By.xpath("//*[@id=\"header-cells\"]/div/div/table/tbody/tr["+2+"]/td["+1+"]")).getText()+"   ");

        for(int i=2;i<=rowNum.size();i++)
        {
            for(int j=1;j<=colNum.size();j++)
            {
                System.out.println(driver.findElement(By.xpath("//*[@id=\"header-cells\"]/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"      ");
            }
        }*/

        /**
         *                           $x("(//tagName[@attribute='attribute_value'])")
         * - Basico -> $x("(//input[@name='identifier'])") - $x("(//input[@name='identifier'][@id='identifier'])")
         * - Concatendao -> $x("(//input[@name='identifier' and @id='identifier'])")
         * - Cuando tenemos varias lineas con los mismo elementos -> $x("(//input[@type='text'])[1]")
         * - Si queremos encontrar un elemento pero solo sabemos su texto -> $x("//*[contains(text(),'Signin')]")
         * - Para acceder a un elemento de forma manual -> $x("//html/body/div[1]/div[1]/div[2]/div[1]/c-wiz/div[1]/div[2]//div[1]/div[1]/div[1]/form/span/section/div[1]/div[1]/div[1]//div[1]/div[1]/div[1]/div[1]/input")
         * - Que empiecen por un determinado valor -> $x("//input[starts-with(@class,'whsOnd zH')]")
         * - Que contenga un valor especifico -> $x("//input[contains(@class,'whsOnd zHQkBf')]")
         */

        /**
         * El .click es de aceptar los terminos y condiciones cuando te metes en google
         */
        //Tomar capturas de elementos
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.es/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

        WebElement above = driver.findElement(with(By.xpath("/html/body/div[1]/div[2]/div/img")));
        File aboveScrn = above.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(aboveScrn, new File("./screenshot/logo3.jpg"));*/

        /**
         *
         */
        //Tomar capturas de pantalla
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://way2automation.com");
        driver.manage().window().maximize();

        if(driver instanceof FirefoxDriver) {

            //Full Page
            File fullPage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(fullPage, new File("./screenshot/fullpage.jpg"));


        }else if(driver instanceof ChromeDriver) {


            File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.jpg"));}*/

        /**
         * Para poder abrir una pestaña nueva, dentro del for, la tercera linea, lo que hace es buscar los elementos
         * de tipo a, obtener el enlace, y por ultimo con la linea definida anteriormente estamos indicando que se presion
         * control y luego enter, el control lo que hace es poner el .com, y el enter buscar
         * El codigo de abajo da error, porque los elementos dentro de tienda no es capaz de obtener el enlace
         */
        //Abrir varias pestañas
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://store.steampowered.com/login/?l=spanish");
        driver.manage().window().maximize();

        WebElement columndriver=driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]"));
        System.out.println("Total de link-->"+columndriver.findElements(By.tagName("a")).size());

        for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++)
        {
            String clickonlinkTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(1000);
        }*/

        /**
         * Si queremos interactuar con un mensaje emergente, al no poder hacer click derecho sobre este, tenemos
         * que utilizar las lineas que aparecen abajo
         */
        //Interactuar con mensajes emergentes
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();*/

        /**
         * La clase action se utiliza para emular el raton o el teclado
         */
        //Interactuar con un elemento de una lista desplegable al pasar el raton por encima
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://store.steampowered.com/login/?l=spanish");
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[1]"));

        Actions a =new Actions(driver);
        a.moveToElement(element).build().perform();

        driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/div[2]/div/a[1]")).click();*/

        /**
         *
         */
        //Escribir en un buscador y recoger las opciones que te recomienda
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://ksrtc.in/oprs-web/");
        driver.manage().window().maximize();

        driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.id("fromPlaceName")).getAttribute("value"));*/

        /**
         *
         */
        //Ejecutar javascript
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://ksrtc.in/oprs-web/");
        driver.manage().window().maximize();

        driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script="return document.getElementById(\"fromPlaceName\").value";
        String text=(String)js.executeScript(script);
        System.out.println(text);*/

        /**
         *
         */
        //ESTA MAL
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.htmlquick.com/es/reference/tags/input-date.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"examples\"]/div[1]/div/form/p/input[1]")).click();
        String d="31/03/2021";
        String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};

        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        Date mydate=df.parse(d);
        java.util.Calendar cal=java.util.Calendar.getInstance();
        cal.setTime(mydate);

        int day=cal.get(Calendar.DAY_OF_MONTH);
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        System.out.println(day+"-"+months[month]+"-"+year);*/

        /**
         * Para pasar de un frame a otro, se puede pasar mediante el id, o mediante el indice que empieza en 0
         */
        //Como pasar de un frame a otro
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(driver.findElements(By.tagName("iframe")).size());;

        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

        driver.switchTo().frame("iframeResult");
        System.out.println(driver.findElements(By.tagName("iframe")).size());;

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

        driver.switchTo().parentFrame();
        System.out.println("hola: "+driver.findElements(By.tagName("iframe")).size());*/

        /**
         * - Para crear nuevas ventanas seria con window, si lo que queremos es abrir una pestaña, tab
         * - WindowHandles, se utiliza para el manejo de ventanas, es decir, por si queremos cambiar de pestaña
         * - Tenemos que poner driver.quit, porque cuando cerramos la tercera pestaña, la sesion sigue abierta, pero
         *   no hay nada
         */
        //Abrir nuevas pestañas o ventanas, y acceder a cada una para poder interactuar una vez abiertas
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://drive.google.com/drive/my-drive");
        //driver.findElement(By.name("q")).sendKeys("Hola mundo");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://mail.google.com/mail/u/0/#inbox");

        System.out.println(driver.getWindowHandles().size());
        Set<String> winids = driver.getWindowHandles();
        Iterator<String> iterator = winids.iterator();

        List<String> winIndex = new ArrayList<String>();
        while (iterator.hasNext()) {

            winIndex.add(iterator.next());
        }

        driver.switchTo().window(winIndex.get(0));
        System.out.println("First window title is :" + driver.getTitle());

        driver.close();

        driver.switchTo().window(winIndex.get(1));
        System.out.println("second window title is :" + driver.getTitle());

        driver.close();

        driver.switchTo().window(winIndex.get(2));
        System.out.println("third window title is :" + driver.getTitle());

        driver.quit();*/

        /**
         * - HasAuthentication, que es lo que no dicen en el tutorial de usar no funciona
         */
        //Que hacer si nos sale una ventana emergente que nos pide usuario y contraseña
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        String usuario="admin";
        String contraseña="admin";

        driver.get("https://"+usuario+":"+contraseña+"@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/

        /**
         * - Para que no nos salte ninguna excepcion, tenemos que poner el modo en headless
         * - Al llamar al metodo print, esto no devolvera un pdf, a continuacion en la siguiente linea,
         *   lo convertimos, y lo mandamos a la direccion especificada
         */
        //Convertir a pdf
        /*ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(opt);
        opt.addArguments("headless");

        driver.get("https://selenium.dev/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
        Files.write(Paths.get("./selenium.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));*/

        /**
         * - El modo incognito, no funciona
         * - La linea de debajo del ChromeOptions, lo que hace es si te pone que la pagina, no es segura,
         *   y te recomienda no seguir, se salta esta recomendacion
         * - window-size, es para ajustar las dimensiones de la ventana al inicio
         * - Con las dos lienas que estan separadas, emulamos que la pagina esta siendo lanzada en un telefono
         */
        //Diferentes funcionalidades
        /*Map<String,String> mobileEm = new HashMap<String,String>();
        mobileEm.put("deviceName", "iPhone X");

        ChromeOptions options = new ChromeOptions();

        //options.addArguments("--headless");
        options.setAcceptInsecureCerts(true);
        //option.addArguments("disable-infobars");
        options.addArguments("--window-size=100,100");
        //options.addArguments("--incognito");

        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("mobileEmulation",mobileEm );

        options.addArguments("--remote-allow-origins=*");
        //DesiredCapabilities asdf=DesiredCapabilities.chrome();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/

        /**
         *
         */
        //Obtener las coordenadas de un elemento
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://gmail.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement img = driver.findElement(By.xpath("//*[@id=\"logo\"]"));


        Rectangle rect = img.getRect();

        System.out.println("Height : "+rect.getHeight());
        System.out.println("Width : "+rect.getWidth());
        System.out.println("X Coord : "+rect.getX());
        System.out.println("Y Coord : "+rect.getY());*/

        /**
         *
         */
        //Poner el raton encima de un elemento para que se abra una lista desplegable, y hacer click en uno de los elementos de esta lista
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://store.steampowered.com/login/?l=spanish");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement menu=driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/a[1]"));
        Actions action=new Actions(driver);
        action.moveToElement(menu).perform();
        driver.findElement(By.xpath("//*[@id=\"global_header\"]/div/div[2]/div[2]/div/a[5]")).click();*/

        /**
         *
         */
        //Interactuar con un slider
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com/resources/demos/slider/default.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement slider=driver.findElement(By.id("slider"));
        int mitad_slider = slider.getSize().width/2;
        System.out.println(slider.getSize().width+" - "+(slider.getSize().width/2));

        WebElement boton=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        new Actions(driver).dragAndDropBy(boton,mitad_slider,0).perform();*/

        /**
         * No funciona bien, el valor y no puede ser mayor que el x
         */
        //Reajustar el tamaño de un elemento con esta opcion
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement reajustar=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
        Actions action=new Actions(driver);
        action.dragAndDropBy(reajustar,400,300).perform();*/

        /**
         *
         */
        //Coger un elemento y arrastrarlo dentro de otro
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dragable=driver.findElement(By.id("draggable"));
        WebElement dropable=driver.findElement(By.id("droppable"));

        Actions action=new Actions(driver);
        action.dragAndDrop(dragable,dropable).perform();*/

        /**
         *
         */
        //Interactuar con un elemento que tenga la opcion de click derecho, e interactuar con las diferentes opciones
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://deluxe-menu.com/popup-mode-sample.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement img=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
        Actions action=new Actions(driver);
        action.contextClick(img).perform();

        WebElement op1=driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdA\"]"));
        action.moveToElement(op1).perform();

        WebElement op2=driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]"));
        action.moveToElement(op2).perform();

        driver.findElement(By.xpath("//*[@id=\"dm2m3i1tdT\"]")).click();*/

        /**
         * Para poder utilizar combinaciones de teclas, tenemos que utilizar el chord, despues
         * de haber indicado el elemento con el que queremos interactuar
         */
        //Utilizar convinaciones de teclas
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.ugr.es/~pjara/D/Docen14/TR/index.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("/html")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("/html")).sendKeys(Keys.chord(Keys.CONTROL,"c"));*/

        /**
         * - WebDriverWait -> Esperamos x tiempo a que aparezca un elemento
         * - Alert -> La clase Alert, proporciona algunos elementos para poder manejar
         *   ventanas emergentes
         */
        //Aceptar una alerta emergente
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();*/

        /**
         *
         */
        //interactuar con los javascripts, he inyectar codigo javascript
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

        driver.switchTo().frame("iframeResult");
        JavascriptExecutor java=(JavascriptExecutor) driver;
        java.executeScript("myFunction()");
        java.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));*/

        /**
         *
         */
        //Recorrer una grafica, y obtener sus valores
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.covid19india.org/state/MH");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement>lista=driver.findElements(By.xpath("(//*[name()='svg' and @preserveAspectRatio='xMidYMid meet'])[7]//*[local-name()='circle']"));
        Actions action=new Actions(driver);
        for(WebElement point:lista)
        {
            action.moveToElement(point).perform();
            System.out.println(driver.findElement(By.xpath("//div[@class='stats is-confirmed']/div/h2")).getText());
        }*/

        /**
         * Si el elemento con el que queremos interactuar, esta dentro de un shadow-root, nos tenemos que fijar,
         * en que este este en open, en caso contrario, no podremos hacer nada
         */
        //Seleccionar un elemento que esta dentro de un shadow-root
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("chrome://downloads/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement root = driver.findElement(By.cssSelector("downloads-manager"));

        SearchContext shadowRoot1 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root);

        WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
        SearchContext shadowRoot2 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root2);

        WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
        SearchContext shadowRoot3 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root3);

        WebElement root4 = shadowRoot3.findElement(By.cssSelector("cr-toolbar-search-field"));
        SearchContext shadowRoot4 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root4);

        shadowRoot4.findElement(By.cssSelector("#searchInput")).sendKeys("Hello");*/

        /**
         * La razon por la que le ponemos de nombre la fecha, es porque necesitamos un nombre dinamico,
         * si el nombre se repite, el archivo se sobrescribe
         */
        //Tomar capturas de pantalla
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://giphy.com/gifs/studiosoriginals-svabhu-kohli-duo-viplov-singh-3oKIP6HlUXldWQ209y");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@id=\"didomi-notice-agree-button\"]")).click();

        File captura=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date d=new Date();
        String filename=d.toString().replace(":","_").replace(" ","_")+".jpg";
        FileUtils.copyFile(captura,new File(".//screenshot//"+filename));*/

        /**
         *
         */
        // Capturar elemento especifico, no funciona
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.way2automation.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"MzUwOjY5OQ==-1\"]"));

        Date d = new Date();
        String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        BufferedImage fullImg = ImageIO.read(screenshot);

        Point point = ele.getLocation();

        int eleWidth = ele.getSize().getWidth();
        int eleHeight = ele.getSize().getHeight();

        BufferedImage eleScreenshot = fullImg.getSubimage(point.x, point.y, eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "jpg", screenshot);

        File screenshotLocation = new File(".\\screenshot\\"+fileName);
        FileUtils.copyFile(screenshot, screenshotLocation);*/

        /**
         *
         */
        //Interactuar con un datepicker, vete al main datepicker



    }
}