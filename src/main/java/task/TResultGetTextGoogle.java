package task;

import actions.Text;
import org.openqa.selenium.WebDriver;
import ui.UiGoogleSearch;


public class TResultGetTextGoogle {
    public static String firstResult(WebDriver driver){
        return Text.getText(driver, UiGoogleSearch.googleFirstResultText);
    }
}
