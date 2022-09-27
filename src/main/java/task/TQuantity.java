package task;

import actions.Text;
import org.openqa.selenium.WebDriver;
import ui.UiMercadoLibre;

public class TQuantity {
    public static boolean itemsAvailableNews(WebDriver driver){
        String newsItems = Text.getText(driver, UiMercadoLibre.newQuantity);
        System.out.println(newsItems);
        char [] cadenaNuevos = newsItems.toCharArray();
        String n = "";
        for(int i = 0; i<cadenaNuevos.length;i++){
            if(Character.isDigit(cadenaNuevos[i])){
                n+=cadenaNuevos[i];
            }
        }
        int valor = Integer.parseInt(n);

        if(valor >=3)
            return true;
        return false;
     //return true;
    }

    public static boolean itemsAvailableUsed(WebDriver driver){
        String newsItems = Text.getText(driver, UiMercadoLibre.usedQuantity);
        System.out.println(newsItems);
        char [] cadenaNuevos = newsItems.toCharArray();
        String n = "";
        for(int i = 0; i<cadenaNuevos.length;i++){
            if(Character.isDigit(cadenaNuevos[i])){
                n+=cadenaNuevos[i];
            }
        }
        int valor = Integer.parseInt(n);

        if(valor >=3)
            return true;
        return false;
        //return true;
    }
}
