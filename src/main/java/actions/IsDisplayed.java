package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsDisplayed {
    public static boolean element(WebDriver webDriver, By locator){
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            webDriver.findElement(locator);
            return  true;
        }catch (org.openqa.selenium.TimeoutException e){
            return false;
        }
    }
}
