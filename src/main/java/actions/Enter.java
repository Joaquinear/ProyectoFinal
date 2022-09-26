package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enter {
    public static void enter(WebDriver webDriver, By locator){
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        webDriver.findElement(locator).sendKeys(Keys.ENTER);
    }
}
