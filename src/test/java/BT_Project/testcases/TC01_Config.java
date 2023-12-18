package BT_Project.testcases;

import BT_Project.Actions.commons.BaseTest;
import BT_Project.Actions.pageObject.*;
import BT_Project.Utilities.Helpers.PropertiesFile;
import BT_Project.Utilities.Listeners.ReportListener;
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
    public void Label_create() throws InterruptedException {
        ListLabelPage.List(driver);

        LabelPage.Create_label(driver, PropertiesFile.getPropValue("Color1"),PropertiesFile.getPropValue("label1"));
    }
    @Test (priority = 3)
    public void Label_create2() throws InterruptedException {
        ListLabelPage.List(driver);

        LabelPage.Create_label(driver, PropertiesFile.getPropValue("Color2"),PropertiesFile.getPropValue("label2"));
    }
    @Test (priority = 4)
    public void Label_create3() throws InterruptedException {
        ListLabelPage.List(driver);

        LabelPage.Create_label(driver,PropertiesFile.getPropValue("Color3"), PropertiesFile.getPropValue("label3"));
    }
    @Test (priority = 5)
    public void Create_Project() throws InterruptedException {
        ListProjectPage.List(driver);
        ProjectCreatePage.Create_Project(driver, PropertiesFile.getPropValue("title1"),PropertiesFile.getPropValue("des1"),PropertiesFile.getPropValue("start_date1"),PropertiesFile.getPropValue("deadline_project1"), PropertiesFile.getPropValue("price1"),PropertiesFile.getPropValue("option1"));
    }
    @Test (priority = 6)
    public void Create_Project2() throws InterruptedException {
        ListProjectPage.List(driver);
        ProjectCreatePage.Create_Project(driver, PropertiesFile.getPropValue("title2"),PropertiesFile.getPropValue("des2"),PropertiesFile.getPropValue("start_date2"),PropertiesFile.getPropValue("deadline_project2"), PropertiesFile.getPropValue("price2"), PropertiesFile.getPropValue("option2"));
    }
    @Test (priority = 7)
    public void Create_Project3() throws InterruptedException {
        ListProjectPage.List(driver);
        ProjectCreatePage.Create_Project(driver, PropertiesFile.getPropValue("title3"),PropertiesFile.getPropValue("des3"),PropertiesFile.getPropValue("start_date3"),PropertiesFile.getPropValue("deadline_project3"), PropertiesFile.getPropValue("price3"),PropertiesFile.getPropValue("option3"));
    }
    @Test (priority = 8)
    public void Search() throws InterruptedException {
        FilterPage.filter(driver, PropertiesFile.getPropValue("title_filter"));
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

