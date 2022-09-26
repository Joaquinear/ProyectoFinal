package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterText {
    public static void text(WebDriver webDriver, By locator, String text){
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        webDriver.findElement(locator).sendKeys(text);
    }
}
