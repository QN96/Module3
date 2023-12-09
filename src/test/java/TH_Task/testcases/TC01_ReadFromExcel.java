package TH_Task.testcases;

import TH_Task.Actions.pageObject.TaskPage;
import TH_Task.Actions.commons.BaseTest;
import TH_Task.Actions.pageObject.LoginPage;
import TH_Task.Utilities.Helpers.ExcelHelpers;
import TH_Task.Utilities.Listeners.TestListener;
import TH_Task.Actions.pageObject.HomePage;
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
        excel.setExcelFile("src/test/java/TH_Task/TestData/Login.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home(){
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_Task()  {
        TaskPage.Task(driver);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

