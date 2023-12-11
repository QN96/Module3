package BT_3Task.testcases;

import BT_3Task.Actions.commons.BaseTest;
import BT_3Task.Actions.pageObject.HomePage;
import BT_3Task.Actions.pageObject.LoginPage;
import BT_3Task.Actions.pageObject.TaskPage;
import BT_3Task.Utilities.Helpers.PropertiesFile;
import BT_3Task.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC01_Config extends BaseTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
    }

    @Test (priority = 0)
    public void Test_login() throws InterruptedException {
        LoginPage.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
    }

    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_case_01() throws InterruptedException {
        TaskPage.Task(driver, PropertiesFile.getPropValue("title1"), PropertiesFile.getPropValue("description1"), PropertiesFile.getPropValue("start1"), PropertiesFile.getPropValue("deadline1") );
    }
    @Test (priority = 3)
    public void Test_Home1() {
        HomePage.Home(driver);
    }

    @Test (priority = 4)
    public void Test_case_02() throws InterruptedException {
        TaskPage.Task(driver, PropertiesFile.getPropValue("title2"), PropertiesFile.getPropValue("description2"), PropertiesFile.getPropValue("start2"), PropertiesFile.getPropValue("deadline2") );
    }
    @Test (priority = 5)
    public void Test_Home2() {
        HomePage.Home(driver);
    }

    @Test (priority = 6)
    public void Test_case_03() throws InterruptedException {
        TaskPage.Task(driver, PropertiesFile.getPropValue("title3"), PropertiesFile.getPropValue("description3"), PropertiesFile.getPropValue("start3"), PropertiesFile.getPropValue("deadline3") );
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}
