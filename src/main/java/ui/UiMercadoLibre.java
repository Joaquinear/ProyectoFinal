package ui;

import org.openqa.selenium.By;

public class UiMercadoLibre {
    public static By country = By.id("BO");
    public static By searchBar = By.id("cb1-edit");
    public static By resultSearch = By.xpath("(//h1)[1]");
    public static By usedQuantity = By.xpath("//div/ul/li/a[@aria-label='Usado']/span[@class='ui-search-filter-results-qty shops__filter-results-qty']");
    public static By newQuantity = By.xpath("//div/ul/li/a[@aria-label='Nuevo']/span[@class='ui-search-filter-results-qty shops__filter-results-qty']");
    public static By cacheBtn = By.xpath("//button[@class='cookie-consent-banner-opt-out__action cookie-consent-banner-opt-out__action--primary cookie-consent-banner-opt-out__action--key-accept']");
    public static By filterOption = By.xpath("//section/a/div/div");
}
