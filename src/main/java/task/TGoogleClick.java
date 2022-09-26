package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.UiGoogleSearch;


public class TGoogleClick {
    public static void firstResult(WebDriver WebDriver){
        Click.on(WebDriver, UiGoogleSearch.googleFirstResultText);
    }
}
