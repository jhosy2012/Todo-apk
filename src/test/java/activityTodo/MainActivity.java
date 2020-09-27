package activityTodo;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainActivity {

    public Button add;
    public Button delete;
    public Button confirmation;
    public TextBox titleBox;
    public TextBox noteBox;
    public Button checkButton;
    public Label resultLabel;



    public MainActivity(){
        add= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        titleBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        noteBox=new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        checkButton=new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        resultLabel= new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
        delete=new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
        confirmation=new Button(By.id("android:id/button1"));

    }

    public boolean isDisplayedTodo(String nameTodo){
        String locator="//android.widget.TextView[@text='"+nameTodo+"']";
        Label todoItem = new Label(By.xpath(locator));
        return todoItem.isDisplayed();
    }

    public void selectItem(String nameTodo) throws MalformedURLException {
        String locator="//android.widget.TextView[@text='"+nameTodo+"']";
        Label todoItem = new Label(By.xpath(locator));
        todoItem.click();
    }
}
