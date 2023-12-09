package TT_Client.testcases;

import TT_Client.Actions.commons.BaseTest;
import TT_Client.Actions.pageObject.LoginPage;
import TT_Client.Actions.pageObject.HomePage;
import TT_Client.Actions.pageObject.ClientPage;
import TT_Client.Actions.pageObject.ClientDetailPage;
import TT_Client.Utilities.Helpers.PropertiesFile;
import TT_Client.Utilities.Listeners.ReportListener;
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
    public void Test_Client()  {
        ClientPage.Client(driver);
    }
    @Test (priority = 3)
    public void Test_ClientDetail()  {
        ClientDetailPage.Detail(driver);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}

