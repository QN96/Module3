package TH_Contacts.testcases;

import TH_Contacts.Actions.commons.BaseTest;
import TH_Contacts.Actions.pageObject.ContactDetailPage;
import TH_Contacts.Actions.pageObject.LoginPage;
import TH_Contacts.Actions.pageObject.HomePage;
import TH_Contacts.Actions.pageObject.OverviewsPage;
import TH_Contacts.Utilities.Helpers.PropertiesFile;
import TH_Contacts.Utilities.Listeners.ReportListener;
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
    public void Test_Overview()  {
        OverviewsPage.Overview(driver);
    }
    @Test (priority = 3)
    public void Test_ContactDetail()  {
        ContactDetailPage.Detail(driver);
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}

