package task;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.UiGoogleSearch;


public class TResultGetTextGoogle {
    public static String firstResult(WebDriver driver){
        return GetText.getText(driver, UiGoogleSearch.googleFirstResultText);
    }
}
