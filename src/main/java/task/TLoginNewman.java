package task;

import actions.EnterText;
import org.openqa.selenium.WebDriver;
import ui.UiLoginGestorNewman;

public class TLoginNewman {
    public static void loginTaskNewman(WebDriver driver,String user, String password){
        EnterText.text(driver, UiLoginGestorNewman.userName,user);
        EnterText.text(driver,UiLoginGestorNewman.password,password);
    }
}
