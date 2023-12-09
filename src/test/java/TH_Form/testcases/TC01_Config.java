package TH_Form.testcases;

import TH_Form.Actions.commons.BaseTest;
import TH_Form.Actions.pageObject.FormPage;
import TH_Form.Utilities.Helpers.PropertiesFile;
import TH_Form.Utilities.Listeners.ReportListener;
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
    public void Test_Form() {
        FormPage.Form(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("email"),PropertiesFile.getPropValue("address"),PropertiesFile.getPropValue("perAdd"));
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}

