package task;

import actions.Text;
import org.openqa.selenium.WebDriver;
import ui.UiMercadoLibre;

public class StateItem {
    public static String getText(WebDriver driver){
        return Text.getText(driver, UiMercadoLibre.filterOption);
    }
}
