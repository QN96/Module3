package BT_Project.testcases;

import BT_Project.Actions.commons.BaseTest;
import BT_Project.Actions.pageObject.FilterPage;
import BT_Project.Actions.pageObject.LabelPage;
import BT_Project.Actions.pageObject.HomePage;
import BT_Project.Actions.pageObject.LoginPage;
import BT_Project.Actions.pageObject.ListLabelPage;
import BT_Project.Actions.pageObject.ListProjectPage;
import BT_Project.Actions.pageObject.ProjectCreatePage;
import BT_Project.Utilities.Helpers.DemoReadJsonFile;
import BT_Project.Utilities.Listeners.ReportListener;
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
        Map<String, String> testCaseFields = testCaseFieldsList.get(0); // Assuming there is only one set of credentials

        // Sử dụng giá trị trong test case
        LoginPage.Login(driver, testCaseFields.get("username"), testCaseFields.get("password"));
    }

    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        HomePage.Home(driver);
    }

    @Test (priority = 2)
    public void Label_create1() throws InterruptedException {
        ListLabelPage.List(driver);

        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("label");
        Map<String, String> testCaseFields = testCaseFieldsList.get(0);

        LabelPage.Create_label(driver, testCaseFields.get("color"), testCaseFields.get("label"));
    }

    @Test (priority = 3)
    public void Label_create2() throws InterruptedException {
        ListLabelPage.List(driver);

        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("label");
        Map<String, String> testCaseFields = testCaseFieldsList.get(1);

        LabelPage.Create_label(driver, testCaseFields.get("color"), testCaseFields.get("label"));
    }
    @Test (priority = 4)
    public void Label_create3() throws InterruptedException {
        ListLabelPage.List(driver);

        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("label");
        Map<String, String> testCaseFields = testCaseFieldsList.get(2);

        LabelPage.Create_label(driver, testCaseFields.get("color"), testCaseFields.get("label"));
    }
    @Test (priority = 5)
    public void Project_create1() throws InterruptedException {
        ListProjectPage.List(driver);

        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("Project");
        Map<String, String> testCaseFields = testCaseFieldsList.get(0);

        ProjectCreatePage.Create_Project(driver, testCaseFields.get("title"), testCaseFields.get("des"),testCaseFields.get("start_date"),testCaseFields.get("deadline_project"),testCaseFields.get("price"),testCaseFields.get("option"));
    }
    @Test (priority = 5)
    public void Project_create2() throws InterruptedException {
        ListProjectPage.List(driver);

        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("Project");
        Map<String, String> testCaseFields = testCaseFieldsList.get(1);

        ProjectCreatePage.Create_Project(driver, testCaseFields.get("title"), testCaseFields.get("des"),testCaseFields.get("start_date"),testCaseFields.get("deadline_project"),testCaseFields.get("price"),testCaseFields.get("option"));
    }
    @Test (priority = 6)
    public void Project_create3() throws InterruptedException {
        ListProjectPage.List(driver);

        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("Project");
        Map<String, String> testCaseFields = testCaseFieldsList.get(2);

        ProjectCreatePage.Create_Project(driver, testCaseFields.get("title"), testCaseFields.get("des"),testCaseFields.get("start_date"),testCaseFields.get("deadline_project"),testCaseFields.get("price"),testCaseFields.get("option"));
    }

    @Test (priority = 7)
    public void Test_filter() throws InterruptedException {
        // Đọc giá trị từ file JSON
        List<Map<String, String>> testCaseFieldsList = DemoReadJsonFile.getTestCaseFields("Filter");
        Map<String, String> testCaseFields = testCaseFieldsList.get(0);
        // Sử dụng giá trị trong test case
        FilterPage.filter(driver, testCaseFields.get("title_filter"));
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}