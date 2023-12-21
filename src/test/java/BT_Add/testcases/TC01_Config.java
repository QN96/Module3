package BT_Add.testcases;

import BT_Add.Actions.commons.BaseTest;
import BT_Add.Actions.pageObject.*;
import BT_Add.Utilities.Helpers.PropertiesFile;
import BT_Add.Utilities.Listeners.ReportListener;
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
    public void Test_Login() {
        LoginPage.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
    }

    @Test (priority = 1)
    public void Test_Home(){

        HomePage.Home(driver);
    }
//    @Test (priority = 2)
//    public void Edit() throws InterruptedException {
//        EditProjectPage.Edit_Project(driver, PropertiesFile.getPropValue("title"),PropertiesFile.getPropValue("des"),PropertiesFile.getPropValue("start_date"),PropertiesFile.getPropValue("deadline_project"), PropertiesFile.getPropValue("price"),PropertiesFile.getPropValue("option"));
//    }
//    @Test (priority = 3)
//    public void Delete() throws InterruptedException {
//        DeleteProjectPage.Delete_Project(driver);
//    }
//    @Test (priority = 4)
//    public void Filter_print_export() throws InterruptedException {
//        filterPage.Filter(driver, PropertiesFile.getPropValue("status"));
//    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

