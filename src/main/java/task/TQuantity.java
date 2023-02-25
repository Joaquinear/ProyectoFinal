package task;

import actions.Text;
import org.openqa.selenium.WebDriver;
import ui.UiMercadoLibre;

public class TQuantity {
    public static int itemsAvailableNews(WebDriver driver){
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
        return  valor;
//        if(valor >=1)
//            return true;
//        return false;
     //return true;
    }

    public static int itemsAvailableUsed(WebDriver driver){
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

        return valor;
//        if(valor >=3)
//            return true;
//        return false;
        //return true;
    }
}
