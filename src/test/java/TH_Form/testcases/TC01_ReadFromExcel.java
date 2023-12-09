package TH_Form.testcases;

import TH_Form.Actions.commons.BaseTest;
import TH_Form.Actions.pageObject.FormPage;
import TH_Form.Utilities.Helpers.ExcelHelpers;
import TH_Form.Utilities.Listeners.TestListener;
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
    public void Test_Form() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/TH_Form/TestData/Login.xlsx", "Sheet1");
        FormPage.Form(driver, excel.getCellData("username",1),excel.getCellData("email",1),excel.getCellData("address",1), excel.getCellData("perAdd",1));
        Thread.sleep(1000);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

