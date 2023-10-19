package ui;
import org.openqa.selenium.By;

public class UiLoginGestorNewman {
    public static By userName = By.id("Username");
    public static By password = By.xpath("//input[contains(@placeholder,'Contrase')]");
    public static By btnLogIn = By.id("btn-acceder");

    public  static By userLoginPage = By.xpath("//span[@class='badge badge-pill badge-light user']");
    public static By userLoginPageFail = By.xpath("//span[@class='field-validation-error with-errors help-block']");
}
