package BT_3Task.testcases;

import BT_3Task.Actions.commons.BaseTest;
import BT_3Task.Actions.pageObject.HomePage;
import BT_3Task.Actions.pageObject.LoginPage;
import BT_3Task.Actions.pageObject.TaskPage;
import BT_3Task.Utilities.Helpers.ExcelHelpers;
import BT_3Task.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TC01_ReadFromExcel extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }

    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_3Task/TestData/Login.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_Task() throws InterruptedException {
        TaskPage.Task(driver, "Bug 1", "Bug không login được", "23-11-2023", "24-11-2023" );
    }
    @Test (priority = 3)
    public void Test_Home1() throws InterruptedException {
        HomePage.Home(driver);
    }
    @Test (priority = 4)
    public void Test_Task1() throws InterruptedException {
        TaskPage.Task(driver, "Bug 2", "Bug không login được", "23-11-2023", "24-11-2023" );
    }
    @Test (priority = 5)
    public void Test_Home2() throws InterruptedException {
        HomePage.Home(driver);
    }
    @Test (priority = 6)
    public void Test_Task2() throws InterruptedException {
        TaskPage.Task(driver, "Bug 3", "Bug không login được", "23-11-2023", "24-11-2023" );
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

