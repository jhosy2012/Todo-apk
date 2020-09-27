package pruebaConexion;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class pruebaTodo {
    private AppiumDriver driver;


    @Before
    public void before() throws MalformedURLException {
        System.out.println("Iniciando conexion....");
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","df2e6ab8");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
        capabilities.setCapability("platformName","Android");

        this.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }
    @Test
    public void myfirstTest(){
        //agregar nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/notesList")).click();
        //ingresar datos
        //com.vrproductiveapps.whendo:id/noteTextTitle
        //com.vrproductiveapps.whendo:id/noteTextNotes

        // aceptar notas
        //this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
    }
    @Test
    public void myfirstTest2(){
        System.out.println("Test....");

    }
    @After
    public void After(){
        System.out.println("After....");
    }
}
