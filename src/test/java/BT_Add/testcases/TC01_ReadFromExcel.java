package BT_Add.testcases;

import BT_Add.Actions.commons.BaseTest;
import BT_Add.Actions.pageObject.*;
import BT_Add.Utilities.Helpers.ExcelHelpers;
import BT_Add.Utilities.Listeners.TestListener;
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
        excel.setExcelFile("src/test/java/BT_Add/TestData/Excel.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home(){
        HomePage.Home(driver);
    }

//    @Test (priority = 2)
//    public void Edit() throws Exception {
//
//        ExcelHelpers excel=new ExcelHelpers();
//        excel.setExcelFile("src/test/java/BT_Add/TestData/Excel.xlsx", "Sheet3");
//        EditProjectPage.Edit_Project(driver, excel.getCellData("title",1),excel.getCellData("des",1),excel.getCellData("start_date",1),excel.getCellData("deadline_project",1),excel.getCellData("price",1),excel.getCellData("option",1));
//        Thread.sleep(1000);
//    }
//    @Test (priority = 3)
//    public void Delete() throws InterruptedException {
//
//        DeleteProjectPage.Delete_Project(driver);
//    }
//
//    @Test (priority = 8)
//    public void Filter() throws Exception {
//        ExcelHelpers excel=new ExcelHelpers();
//        excel.setExcelFile("src/test/java/BT_Add/TestData/Excel.xlsx", "Sheet4");
//        filterPage.Filter(driver, excel.getCellData("status",1));
//        Thread.sleep(1000);
//    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

