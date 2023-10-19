package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src/test/java/features/testLoginNewman.feature",
        glue = {"stepsDefinitions"},
        //tags = {"@pruebasDev"},
        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}

)
public class Run extends AbstractTestNGCucumberTests {


}
