package task;

import actions.Click;
import actions.Text;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.UiMercadoLibre;

public class TTipoBusqueda {
    public static void Order(WebDriver driver,String relevancia) throws InterruptedException {
        switch (relevancia){
            case "Más relevantes":
                Click.on(driver,UiMercadoLibre.orderItemsDropdown);
                if(WaitUntilElement.isPresent(driver,UiMercadoLibre.orderItemMostRelevants)){
                    Thread.sleep(5000);
                    Click.on(driver,UiMercadoLibre.orderItemMostRelevants);
                }
                break;
            case "Menor precio":
                Click.on(driver,UiMercadoLibre.orderItemsDropdown);
                if(WaitUntilElement.isPresent(driver,UiMercadoLibre.orderItemsLowPrice)){
                    Thread.sleep(5000);
                    Click.on(driver,UiMercadoLibre.orderItemsLowPrice);
                }
                break;
            case "Mayor precio":
                Click.on(driver,UiMercadoLibre.orderItemsDropdown);
                if(WaitUntilElement.isPresent(driver,UiMercadoLibre.orderItemsHighPrice)){
                    Thread.sleep(5000);
                    Click.on(driver,UiMercadoLibre.orderItemsHighPrice);
                }
                break;
        }
    }
}
