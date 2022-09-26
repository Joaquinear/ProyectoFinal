package base;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import report.ReportManager;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setUpSuit() throws Exception {
        ReportManager.init("Report","ReporteTest");
    }

    @BeforeMethod
    public void setUp(ITestResult iTestResult){
        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.EXE");
        DesiredCapabilities obj = new DesiredCapabilities();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        obj.setCapability(ChromeOptions.CAPABILITY,option);
        driver = new ChromeDriver(obj);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }


    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        try {
            switch (iTestResult.getStatus()){
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL,"Test fallido");
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS,"Test paso");
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL,"Test Incompleto");
            }
            if (iTestResult.getStatus() != ITestResult.SUCCESS){
                ReportManager.getInstance().getTest().log(Status.FAIL,iTestResult.getThrowable().getMessage());
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.FAIL,"Failed Screen");
            }
            else {
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.PASS,"Failed Screen");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(driver != null)
                driver.quit();
        }
    }
    @AfterSuite
    public void tearDownS(){
        ReportManager.getInstance().flush();
    }
}
