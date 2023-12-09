package BT_CreateTask.testcases;

import BT_CreateTask.Actions.commons.BaseTest;
import BT_CreateTask.Actions.pageObject.LoginPage;
import BT_CreateTask.Actions.pageObject.TaskPage;
import BT_CreateTask.Utilities.Helpers.PropertiesFile;
import BT_CreateTask.Utilities.Listeners.ReportListener;
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
//        ExtentTest test=extent.createTest("Verify log in");
//        test.log(Status.PASS,"user login");
//        test.pass("login verified");
    }

    @Test (priority = 1)
    public void Test_Task() throws InterruptedException {
        TaskPage.Task(driver, "Bug 1", "Bug không login được", "23-11-2023", "24-11-2023" );
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}
