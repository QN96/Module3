package BT_Event.testcases;

import BT_Event.Actions.commons.BaseTest;
import BT_Event.Actions.pageObject.HomePage;
import BT_Event.Actions.pageObject.LoginPage;
import BT_Event.Actions.pageObject.EventPage;
import BT_Event.Utilities.Helpers.DemoReadJsonFile;
import BT_Event.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Map;

@Listeners(ReportListener.class)
public class TC01_Json extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        // Bạn có thể thêm code khởi tạo cho driver ở đây nếu cần
    }

    @Test (priority = 0)
    public void Test_login() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("RISE_Login_001_Correct");
        // Sử dụng giá trị trong test case
        LoginPage.Login(driver, testCaseFields.get("username"), testCaseFields.get("password"));
    }

    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        HomePage.Home(driver);
    }

    @Test (priority = 2)
    public void Test_case_01() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_01");

        // Sử dụng giá trị trong test case
        EventPage.Event(driver, testCaseFields.get("title"), testCaseFields.get("description"), testCaseFields.get("startdate"), testCaseFields.get("starttime"),testCaseFields.get("enddate"),testCaseFields.get("endtime"),testCaseFields.get("locations"));
    }


    @Test (priority = 3)
    public void Test_Home2() throws InterruptedException {
        HomePage.Home(driver);
    }

    @Test (priority = 4)
    public void Test_case_02() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_02");

        // Sử dụng giá trị trong test case
        EventPage.Event(driver, testCaseFields.get("title"), testCaseFields.get("description"), testCaseFields.get("startdate"), testCaseFields.get("starttime"),testCaseFields.get("enddate"),testCaseFields.get("endtime"),testCaseFields.get("locations"));
    }
    @Test (priority = 5)
    public void Test_Home3() throws InterruptedException {
        HomePage.Home(driver);
    }

    @Test (priority = 6)
    public void Test_case_03() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_03");

        // Sử dụng giá trị trong test case
        EventPage.Event(driver, testCaseFields.get("title"), testCaseFields.get("description"), testCaseFields.get("startdate"), testCaseFields.get("starttime"),testCaseFields.get("enddate"),testCaseFields.get("endtime"),testCaseFields.get("locations"));
    }
}