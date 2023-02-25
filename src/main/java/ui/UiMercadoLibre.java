package ui;

import org.openqa.selenium.By;

public class UiMercadoLibre {
    public static By country = By.id("BO");
    public static By searchBar = By.id("cb1-edit");
    public static By resultSearch = By.xpath("//h1");
    public static By usedQuantity = By.xpath("//div/ul/li/a[@aria-label='Usado']/span[@class='ui-search-filter-results-qty shops__filter-results-qty']");
    public static By newQuantity = By.xpath("//div/ul/li/a[@aria-label='Nuevo']/span[@class='ui-search-filter-results-qty shops__filter-results-qty']");
    public static By newsItemsDisplay = By.xpath("//span[contains(text(),'Nuevo')]");
    public static By filterOption = By.xpath("//section/a/div/div");
    public static By verificationResult = By.xpath("//span[contains(text(),'resultados')]");
    public static By newsItems = By.xpath("//span[contains(text(),'Nuevo')]");
    public static By newsItemsVerificacion = By.xpath("//div[contains(text(),'Nuevo')]");
    public static By usedItemsVerificacion = By.xpath("//div[contains(text(),'Usado')]");
    ////
    public static By nonResults = By.xpath("//h3[contains(text(),'No hay publicaciones que coincidan con tu búsqueda')]");
    /// Ordenamiento de articulos
    public static By orderItemsDropdown = By.xpath("//span[@class='andes-dropdown__display-values']");//"//span[@class='andes-dropdown__display-values']");
    public static By orderItemMostRelevants = By.xpath("//ul[@id='andes-dropdown-más-relevantes-list']");
    public static By orderItemsLowPrice = By.xpath("//span[normalize-space()='Menor precio']");
    public static By orderItemsHighPrice = By.xpath("//span[normalize-space()='Mayor precio']");
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////Filtros de precios
    public static By menorPrice = By.xpath("//input[@placeholder='Mínimo']");
    public static By HightPrice = By.xpath("//input[@placeholder='Máximo']");
    public static By filterPriceTag = By.xpath("//div[@class='andes-tag__label']");
    //public static By btnFilterSubmin = By.xpath("//div[@class='ui-search-price-filter-container']");

    ///// login H2
    public static By btnLogin = By.xpath("//nav[@id='nav-header-menu']//a[contains(text(),'Ingresa')]");
    public static By email = By.id("user_id");
    public static By btnContinue = By.xpath("//span[normalize-space()='Continuar']");
    public static By messageEmailInvalid = By.id("user_id-message");
    public static By password = By.id("password");
    public static By goIn = By.xpath("//span[normalize-space()='Ingresar']");
    public static By headUser = By.xpath("//span[@class='nav-header-username']");
    public static By logOut = By.xpath("//a[@data-id='logout']");
    public static By createUser = By.xpath("//nav[@id='nav-header-menu']//a[contains(text(),'Crea tu cuenta')]");
///////////////////////////////////////////////////////////////////////////////
    //BUY AN ITEM
    public static By firstElementList = By.xpath("//li[1]//div[1]//div[1]//div[2]//div[1]//a[1]//h2[1]");
    public static By priceFistItem = By.xpath("//body[1]/main[1]/div[1]/div[2]/section[1]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]/span[2]");

    public static By priceItemConfirmBuy = By.xpath("//body/main[@id='root-app']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[3]");
    public static By btnBuyNow = By.xpath("//span[normalize-space()='Comprar ahora']");
    public static By messageHaveToLoginToBuy = By.xpath("//h1[contains(text(),'¡Hola! Para comprar, ingresa a tu cuenta')])");
    public static By btnInToBuy = By.xpath("//a/span[contains(text(),'Ingresar')]");
    public static By capchaRequired = By.xpath("//div[contains(text(),'Completa este paso para continuar.')]");
}
