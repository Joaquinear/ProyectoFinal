package task;

import actions.Enter;
import actions.EnterText;
import org.openqa.selenium.WebDriver;
import ui.UiGoogleSearch;


public class TGoogleSearch {
    public static void InputSearch(WebDriver driver, String searching){
        EnterText.text(driver, UiGoogleSearch.googleSearchBar,searching);
        Enter.enter(driver,UiGoogleSearch.googleSearchBar);

    }
}
