package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SesionManager.Sesion;

import java.net.MalformedURLException;

public class Control {

    protected WebElement control;
    protected By locator;

    public Control(By locator){
        this.locator=locator;
    }

    public void findControl() throws MalformedURLException {
        this.control= Sesion.getInstance().getDriver().findElement(this.locator);
    }
    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }

    public boolean isDisplayed(){
        try{
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }


}
