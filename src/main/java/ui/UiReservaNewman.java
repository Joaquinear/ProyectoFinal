package ui;

import org.openqa.selenium.By;

public class UiReservaNewman {
    //Paso 1
    public static By headH1 = By.xpath("//h1[contains(.,'Formulari')]");
    public static By nacionalitySelect = By.id("nacionalidad");
    //PE
    public static By tipydocumentSelect = By.id("tipoDocIdentidad");
    //PAS-PE
    public static By documentNumberText = By.id("numDocIdentidad");
    public static By emailText = By.id("email");
    public static By categoriProduct = By.id("categoriaProductoComercial");
    //values = 2
    public static By comercialProduct = By.xpath("//input[@placeholder='Seleccionar']");
    public static By comercialProductSelect = By.xpath("//div[@class='main-body child']//li[1]");
    public static By nextBtn = By.xpath("//button[contains(.,'Siguie')]");
    //paso 2
    public static By nameText = By.id("nombres");
    public static By firsLastName = By.id("apellidoUno");
    public static By secondLastName = By.id("apellidoDos");
    public static By selectSexo = By.id("sexo");
    public static By numberPhoneText = By.id("telefono");
    //-----------------------------------------------------------------
    public static By regionBornData = By.xpath("(//select[@id='sel-level-1'])[1]");
    public static By provinceBornData = By.xpath("(//select[@id='sel-level-2'])[1]");
    public static By distritBornData = By.xpath("(//select[@id='sel-level-3'])[1]");
    //------------------------------------------------------------------
    public static By regionDataResidence = By.xpath("(//select[@id='sel-level-1'])[2]");
    public static By districtDataResidence = By.xpath("(//select[@id='sel-level-3'])[2]");
    public static By addresDataResidence = By.id("domicilioResidencia");
    public static By facturationSelect = By.id("opcionDatosFacturacion");
    //------------------------------Data Facturation ----------------------------------------
    public static By countryResidenceFacturacion = By.id("opcionDatosFacturacion");
    public static By cityFacturation = By.id("ciudadResidenciaFacturacion");
    public static By adressFacturation = By.id("direccionFacturacion");
    public static By emailFacturation = By.id("direccionFacturacion");
    public static By nameSocialReason = By.id("razonSocial");
    public static By typePerson = By.id("tipoPersona");
    public static By typeIdentenficacionTributary = By.id("tipoDocumentoFacturacion");
    public static By numberIdentificacion = By.id("numDocumentoFacturacion");
    //-------------------------------------End data Facturation----------------------------------
    public static By emailAcces = By.id("email");
    public static By emailAccesConfirmation = By.id("emailConfirm");
    //---------------------Btn's notifacations--------
    public static By notificationBtnMailSI = By.xpath("//label[contains(.,'Sí')]");
    public static By notificacionBtnMailNO = By.xpath("//label[@class='btn btn-secondary']");
    public static By comeBackBtn = By.xpath("//button[contains(.,'Vol')]");
    public static By registerBtn = By.xpath("//button[contains(.,'Regis')]");

    //-------------------------------Comformation message
    //public static By confirmationMessage = By.xpath("//div[@id='toast-container']")
}
