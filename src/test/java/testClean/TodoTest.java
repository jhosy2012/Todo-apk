package testClean;

import SesionManager.Sesion;
import activityTodo.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class TodoTest {
    MainActivity todoActivity=new MainActivity();
    @Test
    public void verifyAddNote() throws MalformedURLException {

        for (int i=0; i<6; i++) {
            todoActivity.add.click();
            todoActivity.titleBox.type("Case "+i);
            todoActivity.noteBox.type("Note "+i);
            todoActivity.checkButton.click();
        }
        //verificacion
        boolean actualResult=todoActivity.isDisplayedTodo("Case 5");
        Assert.assertTrue("Error",actualResult);
    }
    @Test
    public void verifydeleteNote() throws MalformedURLException {

        for (int i=0; i<5; i++) {
            todoActivity.add.click();
            todoActivity.titleBox.type("Case "+i);
            todoActivity.noteBox.type("Note "+i);
            todoActivity.checkButton.click();
        }

        todoActivity.selectItem("Case 3");
        todoActivity.delete.click();
        todoActivity.confirmation.click();

        //verificacion
        boolean actualResult=todoActivity.isDisplayedTodo("Case 3");
        Assert.assertFalse("Error",actualResult);


    }

    @After
    public void after() throws MalformedURLException {
        Sesion.getInstance().closeSesion();
    }
}
