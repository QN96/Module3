package BT_Event.testcases;

import BT_Event.Actions.commons.BaseTest;
import BT_Event.Actions.pageObject.HomePage;
import BT_Event.Actions.pageObject.LoginPage;
import BT_Event.Actions.pageObject.EventPage;
import BT_Event.Utilities.Helpers.ExcelHelpers;
import BT_Event.Utilities.Listeners.TestListener;
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
        excel.setExcelFile("src/test/java/BT_Event/TestData/Login.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home1() throws InterruptedException {
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_event1() throws Exception {
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Event/TestData/event.xlsx", "Sheet1");
        EventPage.Event(driver, excel.getCellData("title",1),excel.getCellData("des",1),excel.getCellData("startdate",1),excel.getCellData("enddate",1),excel.getCellData("starttime",1),excel.getCellData("endtime",1),excel.getCellData("locations",1));
        Thread.sleep(1000);    }
    @Test (priority = 3)
    public void Test_Home2() throws InterruptedException {
        HomePage.Home(driver);
    }
    @Test (priority = 4)
    public void Test_event2() throws Exception {
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Event/TestData/event.xlsx", "Sheet1");
        EventPage.Event(driver, excel.getCellData("title",2),excel.getCellData("des",2),excel.getCellData("startdate",2),excel.getCellData("enddate",2),excel.getCellData("starttime",2),excel.getCellData("endtime",2),excel.getCellData("locations",2));
        Thread.sleep(1000);    }
    @Test (priority = 5)
    public void Test_Home3() throws InterruptedException {
        HomePage.Home(driver);
    }
    @Test (priority = 6)
    public void Test_event3() throws Exception {
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Event/TestData/event.xlsx", "Sheet1");
        EventPage.Event(driver, excel.getCellData("title",3),excel.getCellData("des",3),excel.getCellData("startdate",3),excel.getCellData("enddate",3),excel.getCellData("starttime",3),excel.getCellData("endtime",3),excel.getCellData("locations",3));
        Thread.sleep(1000);    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

