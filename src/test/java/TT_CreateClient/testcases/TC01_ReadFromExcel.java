package TT_CreateClient.testcases;

import TT_CreateClient.Actions.commons.BaseTest;
import TT_CreateClient.Actions.pageObject.LoginPage;
import TT_CreateClient.Actions.pageObject.ClientOrganizationPage;
import TT_CreateClient.Actions.pageObject.CreateClientlPage;
import TT_CreateClient.Actions.pageObject.ClientPersonPage;
import TT_CreateClient.Utilities.Helpers.ExcelHelpers;
import TT_CreateClient.Utilities.Listeners.TestListener;
import TT_CreateClient.Actions.pageObject.HomePage;
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
        excel.setExcelFile("src/test/java/TT_CreateClient/TestData/Excel.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home(){
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_Client() throws InterruptedException {
        ClientOrganizationPage.Client(driver);
    }
    @Test (priority = 3)
    public void Test_Organization() throws Exception {
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/TT_CreateClient/TestData/Excel.xlsx", "Sheet2");
        CreateClientlPage.Create(driver, excel.getCellData("company_name",1),excel.getCellData("Address",1),excel.getCellData("City",1),excel.getCellData("State",1),excel.getCellData("Zip",1),excel.getCellData("Country",1),excel.getCellData("Phone",1),excel.getCellData("Website",1),excel.getCellData("VAT",1),excel.getCellData("GST",1),excel.getCellData("symbol",1));
        Thread.sleep(1000);
    }
    @Test (priority = 4)
    public void Test_ClientPerson() throws InterruptedException {
        ClientPersonPage.Client(driver);
    }
    @Test (priority = 5)
    public void Test_Person() throws Exception {
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/TT_CreateClient/TestData/Excel.xlsx", "Sheet3");
        CreateClientlPage.Create(driver, excel.getCellData("name",1),excel.getCellData("Address",1),excel.getCellData("City",1),excel.getCellData("State",1),excel.getCellData("Zip",1),excel.getCellData("Country",1),excel.getCellData("Phone",1),excel.getCellData("Website",1),excel.getCellData("VAT",1),excel.getCellData("GST",1),excel.getCellData("symbol",1));
        Thread.sleep(1000);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

