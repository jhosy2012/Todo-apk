package SesionManager;

import deviceFactory.factoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Sesion {

    private static Sesion sesion=null;
    private AppiumDriver driver;

    private Sesion() throws MalformedURLException {
        driver = factoryDevice.make("android").create();
    }

    public static Sesion getInstance() throws MalformedURLException {
        if (sesion==null)
            sesion=new Sesion();
        return sesion;
    }
    public void closeSesion(){
        driver.quit();
        sesion=null;
    }
    public AppiumDriver getDriver(){
        return driver;
    }
}
