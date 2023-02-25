package stepsDefinitions;

import actions.*;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import task.*;
import ui.UiMercadoLibre;

import java.io.ByteArrayInputStream;
import java.sql.Driver;

public class MercadoLibreTest extends BaseTest {
    private String price;
    @Parameters({"url"})
    @Before
    public void before() throws Exception {
        setUp();
    }
    @After
    public void afterSteps(Scenario scenario){
        if(scenario.isFailed()){
            Allure.addAttachment("failed scenario",new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        }
        tearDown();
    }
    private  String articuloSrch;
    @Given("Usuario este en la pagina de Ecomerce")
    public void usuarioEsteEnLaPaginaDeEcomerce() {
        TGoogleSearch.InputSearch(driver,"Mercado Libre");
        TGoogleClickFirstResult.firstResult(driver);
        Click.on(driver, UiMercadoLibre.country);
        String titulo = driver.getTitle();
        System.out.println(titulo);
        Assert.assertEquals("Mercado Libre Bolivia - Envíos Gratis en el día",titulo);
    }

    @When("^Usuario escriba lo que desea comprar en el buscador: (.*)$")
    public void usuarioEscribaLoQueDeseaComprarEnElBuscadorArticulo(String articulo) {
        articuloSrch = articulo;
        EnterText.text(driver,UiMercadoLibre.searchBar,articulo);
        Enter.enter(driver,UiMercadoLibre.searchBar);
        System.out.println(articulo);
    }

    @And("Usuario Verifica que el articulo tiene resultados")
    public void usuarioVerificaQueElArticuloTieneResultados() {
        String resultSrch = Text.getText(driver,UiMercadoLibre.resultSearch);
        Assert.assertEquals(articuloSrch,resultSrch);
    }

    @Then("Pagina mostrar resultados de la busqueda en la pantalla.")
    public void paginaMostrarResultadosDeLaBusquedaEnLaPantalla() {
        IsDisplayed.element(driver,UiMercadoLibre.verificationResult);
        //tearDown();
    }

    @And("Verifica si existen mas articulos nuevos que usados")
    public void siExistenMasArticulosNuevosQueUsados() {
        boolean asert = false;
            if(TQuantity.itemsAvailableNews(driver) > TQuantity.itemsAvailableUsed(driver)){
                asert = true;
            }
            Assert.assertTrue(asert,"usados que nuevos");
    }

    @Then("Usuario ingresa a ver los articulos nuevos")
    public void usuarioIngresaAVerLosArticulosNuevos() {
        Click.on(driver,UiMercadoLibre.newsItems);
        IsDisplayed.element(driver,UiMercadoLibre.newsItemsVerificacion);
        //tearDown();
    }

    @And("Verifica si existen mas de dos articulos usados")
    public void Verificasiexistenmasde2articulosusados() {
        int usados = TQuantity.itemsAvailableUsed(driver);
        if(usados>2){
            Click.on(driver,UiMercadoLibre.usedQuantity);
        }
    }

    @Then("Usuario ingresa a ver los articulos usados")
    public void usuarioIngresaAVerLosArticulosUsados() {
        IsDisplayed.element(driver,UiMercadoLibre.usedItemsVerificacion);
    }

    @When("Usuario escribe un articulo que no se puede encontrar")
    public void usuarioEscribeUnArticuloQueNoSePuedeEncontrar() {
        EnterText.text(driver,UiMercadoLibre.searchBar,"asjhdlkhfgk");
        Enter.enter(driver,UiMercadoLibre.searchBar);
    }

    @Then("Pagina mostrara mensaje avisando que no encontro coincidencias")
    public void paginaMostraraMensajeAvisandoQueNoEncontroCoincidencias() {
        Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.nonResults));
    }

    @Then("^Usuario verifica que los articulos esten ordenados de (.*)$")
    public void usuarioVerificaQueLosArticulosEstenOrdenadosDe(String relevancia) throws InterruptedException {
        IsDisplayed.element(driver,UiMercadoLibre.orderItemsDropdown);
        String texto = Text.getText(driver,UiMercadoLibre.orderItemsDropdown);
        if(texto.equals(relevancia)){
            Assert.assertEquals(relevancia,texto);
        }
        else{
            Thread.sleep(10000);
            TTipoBusqueda.Order(driver,relevancia);
            String order = Text.getText(driver, UiMercadoLibre.orderItemsDropdown);
            Assert.assertEquals(relevancia,order);
        }

    }

    @And("^Usuario escribe el precio menor (.*)$")
    public void usuarioEscribeElPrecioMenorPrecio_bajo(String precioMenor) {
        WaitUntilElement.isPresent(driver,UiMercadoLibre.menorPrice);
        EnterText.text(driver,UiMercadoLibre.menorPrice,precioMenor);
    }

    @And("^Usuario escribe el precio mayor (.*)$")
    public void usuarioEscribeElPrecioMayorPrecio_mayor(String precioMayor) {
        WaitUntilElement.isPresent(driver,UiMercadoLibre.HightPrice);
        IsDisplayed.element(driver,UiMercadoLibre.HightPrice);
        Click.on(driver,UiMercadoLibre.HightPrice);
        ClickNonClickable.Click(driver,UiMercadoLibre.HightPrice);
        EnterText.text(driver,UiMercadoLibre.HightPrice,precioMayor);

    }

    @And("Usuario aplica el filtro")
    public void usuarioAplicaElFiltro() {WaitUntilElement.isPresent(driver,UiMercadoLibre.HightPrice);
        WaitUntilElement.isPresent(driver,UiMercadoLibre.HightPrice);
        Enter.enter(driver,UiMercadoLibre.HightPrice);
    }

    @Then("pagina carga los articulos con esos precios mostrando etiqueta de busqueda")
    public void paginaCargaLosArticulosConEsosPreciosMostrandoEtiquetaDeBusqueda() {
        IsDisplayed.element(driver,UiMercadoLibre.filterPriceTag);
    }

    @When("Usuario intenta iniciar session")
    public void usuarioIntentaIniciarSession() {
        IsDisplayed.element(driver,UiMercadoLibre.btnLogin);
    }

    @And("Hace click en Ingresar")
    public void haceClickEnIngresar() {
        Click.on(driver,UiMercadoLibre.btnLogin);
    }

    @And("Pagina solicita correo")
    public void paginaSolicitaCorreo() {
        WaitUntilElement.isPresent(driver,UiMercadoLibre.email);
        Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.email));
    }

    @And("Usuario ingresa correo invalido {string}")
    public void usuarioIngresaCorreoInvalido(String email) {
        EnterText.text(driver,UiMercadoLibre.email,email);
    }

    @Then("Pagina muestra mensaje de validacion de correo invalido")
    public void paginaMuestraMensajeDeValidacionDeCorreoInvalido() {
        Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.messageEmailInvalid));
    }

    @And("Usuario introduce correo electronico valido {string}")
    public void usuarioIntroduceCorreoElectronicoValido(String correoValido) {
        WaitUntilElement.isPresent(driver,UiMercadoLibre.email);
        EnterText.text(driver,UiMercadoLibre.email,correoValido);
    }

    @And("Hace click en continuar")
    public void haceClickEnContinuar() {
        Click.on(driver,UiMercadoLibre.btnContinue);
    }

    @And("Ingresa password {string}")
    public void ingresaPassword(String password) {
        WaitUntilElement.isPresent(driver,UiMercadoLibre.password);
        EnterText.text(driver,UiMercadoLibre.password,password);
    }
    @And("Usuario hace click en Ingresa")
    public void usuarioHaceClickEnIngresa() {
        Click.on(driver,UiMercadoLibre.goIn);
    }
    @Then("Pagina mercado libre carga pagina principal con nombre del usuario al lado izquiero de Mis compras")
    public void paginaMercadoLibreCargaPaginaPrincipalConNombreDelUsuarioAlLadoIzquieroDeMisCompras() {
        Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.headUser));
    }


    @And("Cliente selecciona primer articulo")
    public void clienteSeleccionaPrimerArticulo() {
        price = Text.getText(driver,UiMercadoLibre.priceFistItem);
        Click.on(driver,UiMercadoLibre.firstElementList);
    }

    @And("Pagina carga pre visualizacion del articulo")
    public void paginaCargaPreVisualizacionDelArticulo() {
       Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.priceItemConfirmBuy));
    }

    @And("Se verifica que el precio sea el mismo que del item seleccionado previamente")
    public void seVerificaQueElPrecioSeaElMismoQueDelItemSeleccionadoPreviamente() {
        Assert.assertEquals(price,Text.getText(driver,UiMercadoLibre.priceItemConfirmBuy));
    }

    @And("Cliente hace click en comprar ahora")
    public void clienteHaceClickEnComprarAhora() {
        Click.on(driver,UiMercadoLibre.btnBuyNow);
        //Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.messageHaveToLoginToBuy));
        Click.on(driver,UiMercadoLibre.btnInToBuy);
        EnterText.text(driver,UiMercadoLibre.email,"joaquinear21@gmail.com");
        Click.on(driver,UiMercadoLibre.btnContinue);
        WaitUntilElement.isPresent(driver,UiMercadoLibre.capchaRequired);
        Assert.assertTrue(IsDisplayed.element(driver,UiMercadoLibre.capchaRequired));
    }
}
