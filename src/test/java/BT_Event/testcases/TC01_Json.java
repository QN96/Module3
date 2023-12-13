package BT_Event.testcases;

import BT_Event.Actions.commons.BaseTest;
import BT_Event.Actions.pageObject.HomePage;
import BT_Event.Actions.pageObject.LoginPage;
import BT_Event.Actions.pageObject.EventPage;
import BT_Event.Utilities.Helpers.DemoReadJsonFile;
import BT_Event.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
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

@Test(priority = 2)
public void createEventsFromJson() throws InterruptedException {
    int numberOfEvents = 3; // Số lượng event cần tạo

    for (int i = 1; i <= numberOfEvents; i++) {
        createEventFromJson(driver, i);
        Thread.sleep(1000); // Đợi giữa các event để chắc chắn rằng event trước đã được tạo xong
        HomePage.Home(driver); // Quay lại trang Home
    }
}

    private void createEventFromJson(WebDriver driver, int eventNumber) throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_0" + eventNumber);

        // Sử dụng giá trị trong test case để tạo event
        EventPage.Event(
                driver,
                testCaseFields.get("title"),
                testCaseFields.get("description"),
                testCaseFields.get("startdate"),
                testCaseFields.get("enddate"),
                testCaseFields.get("starttime"),
                testCaseFields.get("endtime"),
                testCaseFields.get("locations"));
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}