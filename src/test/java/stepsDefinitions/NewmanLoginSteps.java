package stepsDefinitions;

import actions.Click;
import actions.IsDisplayed;
import actions.Text;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import task.*;
import ui.UiLoginGestorNewman;

import java.io.ByteArrayInputStream;

public class NewmanLoginSteps extends BaseTest {
    //@Parameters({"url"})
    private  String emailUser;
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
    @Given("Usuario ingresase al portal de login de newman he ingresa credenciales {string} y {string}")
    public void usuarioIngresaseAlPortalDeNewman(String user, String password) {
        emailUser = user;
        TLoginNewman.loginTaskNewman(driver,user,password);
    }

    @When("Usuario hace clic en el botón Acceder")
    public void usuarioEscribeSusCredencialesUserYPassword() {
        Click.on(driver, UiLoginGestorNewman.btnLogIn);
    }

    @Then("Ingresa al portal de newman.")
    public void ingresaAlPortalDeNewman() {
        String assertLoginNewmanExpected = "USUARIO: "+emailUser.toUpperCase();
        //System.out.println("esto es del displayed "+IsDisplayed.element(driver,UiLoginGestorNewman.userLoginPage));
        if(IsDisplayed.element(driver,UiLoginGestorNewman.userLoginPage)){
            Assert.assertEquals(Text.getText(driver,UiLoginGestorNewman.userLoginPage),assertLoginNewmanExpected);
        }else{
            Assert.assertEquals(Text.getText(driver,UiLoginGestorNewman.userLoginPageFail),"Credenciales de acceso incorrectas");
        }
    }

}
