package BT_Add.testcases;

import BT_Add.Actions.commons.BaseTest;
import BT_Add.Actions.pageObject.AddEventPage;
import BT_Add.Actions.pageObject.AddNotePage;
import BT_Add.Actions.pageObject.HomePage;
import BT_Add.Actions.pageObject.LoginPage;
import BT_Add.Actions.pageObject.AddProjectPage;
import BT_Add.Actions.pageObject.AddTask;
import BT_Add.Actions.pageObject.AddTodoPage;
import BT_Add.Actions.pageObject.AddTicketPage;
import BT_Add.Utilities.Helpers.DemoReadJsonFile;
import BT_Add.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

@Listeners(ReportListener.class)
public class TC01_Json extends BaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = getDriver();
    }

    @Test (priority = 0)
    public void Test_login() {
        // Đọc giá trị từ file JSON
        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("login");
        Map<String, String> testCaseFields = testCaseFieldsList.get(0);

        // Sử dụng giá trị trong test case
        LoginPage.Login(driver, testCaseFields.get("username"), testCaseFields.get("password"));
    }

    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        HomePage.Home(driver);
    }


//    @Test (priority = 2)
//    public void Edit() throws InterruptedException {
//        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("Project");
//        Map<String, String> testCaseFields = testCaseFieldsList.get(0);
//
//        EditProjectPage.Edit_Project(driver, testCaseFields.get("title"), testCaseFields.get("des"),testCaseFields.get("start_date"),testCaseFields.get("deadline_project"),testCaseFields.get("price"),testCaseFields.get("option"));
//    }
//    @Test (priority = 3)
//    public void Delete() throws InterruptedException {
//        DeleteProjectPage.Delete_Project(driver);
//    }
//    @Test (priority = 4)
//    public void Filter_print_export() throws InterruptedException {
//
//        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("Filter");
//        Map<String, String> testCaseFields = testCaseFieldsList.get(0);
//
//        filterPage.Filter(driver, testCaseFields.get("status"));
//    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}