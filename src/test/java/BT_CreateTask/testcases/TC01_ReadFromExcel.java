package BT_CreateTask.testcases;

import BT_CreateTask.Actions.commons.BaseTest;
import BT_CreateTask.Actions.pageObject.LoginPage;
import BT_CreateTask.Actions.pageObject.TaskPage;
import BT_CreateTask.Utilities.Helpers.ExcelHelpers;
import BT_CreateTask.Utilities.Listeners.TestListener;
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
        excel.setExcelFile("src/test/java/luyentap2_POM/TestData/Login.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Task() throws InterruptedException {
        TaskPage.Task(driver, "Bug 2", "Bug không login được", "23-11-2023", "24-11-2023" );
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

