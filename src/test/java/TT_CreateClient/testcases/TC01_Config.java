package TT_CreateClient.testcases;

import TT_CreateClient.Actions.commons.BaseTest;
import TT_CreateClient.Actions.pageObject.ClientOrganizationPage;
import TT_CreateClient.Actions.pageObject.LoginPage;
import TT_CreateClient.Actions.pageObject.HomePage;
import TT_CreateClient.Actions.pageObject.ClientPersonPage;
import TT_CreateClient.Actions.pageObject.CreateClientlPage;
import TT_CreateClient.Utilities.Helpers.PropertiesFile;
import TT_CreateClient.Utilities.Listeners.ReportListener;
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
    public void Test_ClientOrganization() throws InterruptedException {
        ClientOrganizationPage.Client(driver);
    }
    @Test (priority = 3)
    public void Test_CreateOrganization() throws InterruptedException {

        CreateClientlPage.Create(driver, PropertiesFile.getPropValue("company_name"),PropertiesFile.getPropValue("Address"),PropertiesFile.getPropValue("City"),PropertiesFile.getPropValue("State"),PropertiesFile.getPropValue("Zip"),PropertiesFile.getPropValue("Country"),PropertiesFile.getPropValue("Phone"),PropertiesFile.getPropValue("Website"),PropertiesFile.getPropValue("VAT"),PropertiesFile.getPropValue("GST"),PropertiesFile.getPropValue("symbol"));
    }

    @Test (priority = 4)
    public void Test_ClientPerson() throws InterruptedException {
        ClientPersonPage.Client(driver);
    }
    @Test (priority = 5)
    public void Test_CreatePerson() throws InterruptedException {

        CreateClientlPage.Create(driver, PropertiesFile.getPropValue("name"),PropertiesFile.getPropValue("Address"),PropertiesFile.getPropValue("City"),PropertiesFile.getPropValue("State"),PropertiesFile.getPropValue("Zip"),PropertiesFile.getPropValue("Country"),PropertiesFile.getPropValue("Phone"),PropertiesFile.getPropValue("Website"),PropertiesFile.getPropValue("VAT"),PropertiesFile.getPropValue("GST"),PropertiesFile.getPropValue("symbol"));
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

