package ui;

import org.openqa.selenium.By;

public class UiMercadoLibre {
    public static By country = By.id("BO");
    public static By searchBar = By.id("cb1-edit");
    public static By resultSearch = By.xpath("(//h1)[1]");
    public static By usedQuantity = By.xpath("//a[@aria-label='Usado']//span[@class='ui-search-filter-results-qty']");
    public static By newQuantity = By.xpath("//a[@aria-label='Nuevo']//span[@class='ui-search-filter-results-qty']");
}
