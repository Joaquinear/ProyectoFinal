package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.UiGoogleSearch;


public class TGoogleClickFirstResult {
    public static void firstResult(WebDriver WebDriver){
        Click.on(WebDriver, UiGoogleSearch.googleFirstResultText);
    }
}
