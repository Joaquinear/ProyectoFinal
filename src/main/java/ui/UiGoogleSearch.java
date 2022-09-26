package ui;

import org.openqa.selenium.By;

public class UiGoogleSearch {
    public static By googleSearchBar = By.xpath("//input[@name='q']");
    public static By googleFistResult = By.xpath("//div[@id='res']/div/div/div/div[1]/div/div/div/div/div/div/div/a");
    public static By googleFirstResultText = By.xpath("(//h3)[1]");
}
