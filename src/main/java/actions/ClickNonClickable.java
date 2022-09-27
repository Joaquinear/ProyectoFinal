package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickNonClickable {
    public static void Click(WebDriver driver, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).click().perform();
    }
}
