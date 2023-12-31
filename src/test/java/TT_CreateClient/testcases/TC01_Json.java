package TT_CreateClient.testcases;

import TT_CreateClient.Actions.commons.BaseTest;
import TT_CreateClient.Actions.pageObject.HomePage;
import TT_CreateClient.Actions.pageObject.LoginPage;
import TT_CreateClient.Actions.pageObject.ClientPersonPage;
import TT_CreateClient.Actions.pageObject.ClientOrganizationPage;
import TT_CreateClient.Actions.pageObject.CreateClientlPage;
import TT_CreateClient.Utilities.Listeners.ReportListener;
import TT_CreateClient.Utilities.Helpers.DemoReadJsonFile;
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
    public void Test_Home(){
       HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Test_ClientOrganization() throws InterruptedException {
        ClientOrganizationPage.Client(driver);
    }
    @Test (priority = 3)
    public void Test_case_01() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_01");

        // Sử dụng giá trị trong test case
        CreateClientlPage.Create(driver, testCaseFields.get("company_name"), testCaseFields.get("Address"), testCaseFields.get("City"), testCaseFields.get("State"),testCaseFields.get("Zip"),testCaseFields.get("Country"),testCaseFields.get("Phone"),testCaseFields.get("Website"),testCaseFields.get("VAT"),testCaseFields.get("GST"),testCaseFields.get("symbol"));
    }
    @Test (priority = 4)
    public void Test_ClientOrganization2() throws InterruptedException {
        ClientOrganizationPage.Client(driver);
    }
    @Test (priority = 5)
    public void Test_case_02() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_02");

        // Sử dụng giá trị trong test case
        CreateClientlPage.Create(driver, testCaseFields.get("company_name"), testCaseFields.get("Address"), testCaseFields.get("City"), testCaseFields.get("State"),testCaseFields.get("Zip"),testCaseFields.get("Country"),testCaseFields.get("Phone"),testCaseFields.get("Website"),testCaseFields.get("VAT"),testCaseFields.get("GST"),testCaseFields.get("symbol"));
    }
    @Test (priority = 6)
    public void Test_Person() throws InterruptedException {
        ClientPersonPage.Client(driver);
    }
    @Test (priority = 7)
    public void Test_case_03() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_03");

        // Sử dụng giá trị trong test case
        CreateClientlPage.Create(driver, testCaseFields.get("name"), testCaseFields.get("Address"), testCaseFields.get("City"), testCaseFields.get("State"),testCaseFields.get("Zip"),testCaseFields.get("Country"),testCaseFields.get("Phone"),testCaseFields.get("Website"),testCaseFields.get("VAT"),testCaseFields.get("GST"),testCaseFields.get("symbol"));
    }
    @Test (priority = 8)
    public void Test_Person2() throws InterruptedException {
        ClientPersonPage.Client(driver);
    }
    @Test (priority = 9)
    public void Test_case_04() throws InterruptedException {
        // Đọc giá trị từ file JSON
        Map<String, String> testCaseFields = DemoReadJsonFile.getTestCaseFields("Test_case_04");

        // Sử dụng giá trị trong test case
        CreateClientlPage.Create(driver, testCaseFields.get("name"), testCaseFields.get("Address"), testCaseFields.get("City"), testCaseFields.get("State"),testCaseFields.get("Zip"),testCaseFields.get("Country"),testCaseFields.get("Phone"),testCaseFields.get("Website"),testCaseFields.get("VAT"),testCaseFields.get("GST"),testCaseFields.get("symbol"));
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}