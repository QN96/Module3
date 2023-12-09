package Module3.testcases;

import Module3.Actions.commons.BaseTest;
import Module3.Actions.pageObject.LoginPage;
import Module3.Actions.pageObject.PaymentPage;
import Module3.Actions.pageObject.ListPage;
import Module3.Utilities.Helpers.ExcelHelpers;
import Module3.Utilities.Listeners.TestListener;
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
        excel.setExcelFile("src/test/java/Module3/TestData/Login.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Task() throws InterruptedException {
        PaymentPage.Payment(driver,"05-12-2023", "200000", "Ghi chú" );
    }
    @Test (priority = 2)
    public void Test_List() throws InterruptedException {
        ListPage.List(driver,"INVOICE #20", "Ghi chú");
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

