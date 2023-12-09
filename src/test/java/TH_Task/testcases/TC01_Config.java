package TH_Task.testcases;

import TH_Task.Actions.commons.BaseTest;
import TH_Task.Actions.pageObject.LoginPage;
import TH_Task.Actions.pageObject.HomePage;
import TH_Task.Actions.pageObject.TaskPage;
import TH_Task.Utilities.Helpers.PropertiesFile;
import TH_Task.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC01_Config extends BaseTest {
    //ExtentReports extent=new ExtentReports();
    //ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReport.html");
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
        //extent.attachReporter(spark);

    }

    @Test (priority = 0)
    public void Test_Login() {
        LoginPage.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
    }

    @Test (priority = 1)
    public void Test_Home(){
        HomePage.Home(driver);
    }

    @Test (priority = 2)
    public void Test_Task()  {
        TaskPage.Task(driver);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}

