package base;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import io.cucumber.java.*;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.TestResult;
import report.ReportManager;
//import webdriver.WebdriverFactory;

public class BaseTest {
    public WebDriver driver;


//    public void setUpSuit() throws Exception {
//        ReportManager.init("Report","ReporteTest");
//    }
    //public static driver;
    //@Before
    public void setUp() throws Exception {
        //ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.EXE");
        DesiredCapabilities obj = new DesiredCapabilities();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        obj.setCapability(ChromeOptions.CAPABILITY,option);

        driver = new ChromeDriver(obj);
        //driver = WebdriverFactory.getdriver(browser,url);
        driver.manage().window().maximize();
        //driver.get(url);
        driver.get("https://www.google.com/");
    }

    //@After
    public void tearDown(){
//        try {
//            switch (iTestResult.getStatus()){
//                case ITestResult.FAILURE:
//                    ReportManager.getInstance().getTest().log(Status.FAIL,"Test fallido");
//                    break;
//                case ITestResult.SUCCESS:
//                    ReportManager.getInstance().getTest().log(Status.PASS,"Test paso");
//                    break;
//                default:
//                    ReportManager.getInstance().getTest().log(Status.FAIL,"Test Incompleto");
//            }
//            if (iTestResult.getStatus() != ITestResult.SUCCESS){
//                ReportManager.getInstance().getTest().log(Status.FAIL,iTestResult.getThrowable().getMessage());
//                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.FAIL,"Failed Screen");
//            }
//            else {
//                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.PASS,"Screen capture");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(driver != null)
//                driver.quit();
//        }
        if(driver != null)
            driver.quit();
    }
    @AfterSuite
    public void tearDownS(){
        ReportManager.getInstance().flush();
    }
}
