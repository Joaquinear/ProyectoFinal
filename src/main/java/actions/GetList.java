package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetList {
    public static List<WebElement> elements(WebDriver driver, By locator){
        return driver.findElements(locator);
    }
}
