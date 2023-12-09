package TT_Client.testcases;

import TT_Client.Actions.commons.BaseTest;
import TT_Client.Actions.pageObject.LoginPage;
import TT_Client.Actions.pageObject.ClientPage;
import TT_Client.Actions.pageObject.ClientDetailPage;
import TT_Client.Utilities.Helpers.ExcelHelpers;
import TT_Client.Utilities.Listeners.TestListener;
import TT_Client.Actions.pageObject.HomePage;
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
        excel.setExcelFile("src/test/java/TT_Client/TestData/Login.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home(){
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_Client()  {
        ClientPage.Client(driver);
    }
    @Test (priority = 3)
    public void Test_ClientDetail()  {
        ClientDetailPage.Detail(driver);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

