package BT_Project.testcases;

import BT_Project.Actions.commons.BaseTest;
import BT_Project.Actions.pageObject.*;
import BT_Project.Utilities.Helpers.ExcelHelpers;
import BT_Project.Utilities.Listeners.TestListener;
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
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet1");
        LoginPage.Login(driver, excel.getCellData("username",1),excel.getCellData("password",1));
        Thread.sleep(1000);
    }
    @Test (priority = 1)
    public void Test_Home(){
        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Label_create() throws Exception {
        ListLabelPage.List(driver);
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet2");
        LabelPage.Create_label(driver,excel.getCellData("Color",1), excel.getCellData("label",1));
        Thread.sleep(1000);
    }
    @Test (priority = 3)
    public void Label_create2() throws Exception {
        ListLabelPage.List(driver);
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet2");
        LabelPage.Create_label(driver, excel.getCellData("Color",2),excel.getCellData("label",2));
        Thread.sleep(1000);
    }
    @Test (priority = 4)
    public void Label_create3() throws Exception {
        ListLabelPage.List(driver);
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet2");
        LabelPage.Create_label(driver,excel.getCellData("Color",3),excel.getCellData("label",3));
        Thread.sleep(1000);
    }
    @Test (priority = 5)
    public void Create_project() throws Exception {
        ListProjectPage.List(driver);
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet3");
        ProjectCreatePage.Create_Project(driver, excel.getCellData("title",1),excel.getCellData("des",1),excel.getCellData("start_date",1),excel.getCellData("deadline_project",1),excel.getCellData("price",1),excel.getCellData("option",1));
        Thread.sleep(1000);
    }
    @Test (priority = 6)
    public void Create_project2() throws Exception {
        ListProjectPage.List(driver);
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet3");
        ProjectCreatePage.Create_Project(driver, excel.getCellData("title",2),excel.getCellData("des",2),excel.getCellData("start_date",2),excel.getCellData("deadline_project",2),excel.getCellData("price",2),excel.getCellData("option",2));
        Thread.sleep(1000);
    }
    @Test (priority = 7)
    public void Create_project3() throws Exception {
        ListProjectPage.List(driver);
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet3");
        ProjectCreatePage.Create_Project(driver, excel.getCellData("title",3),excel.getCellData("des",3),excel.getCellData("start_date",3),excel.getCellData("deadline_project",3),excel.getCellData("price",3), excel.getCellData("option",3));
        Thread.sleep(1000);
    }
    @Test (priority = 8)
    public void Filter() throws Exception {
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/test/java/BT_Project/TestData/Excel.xlsx", "Sheet4");
        FilterPage.filter(driver, excel.getCellData("title_filter",1));
        Thread.sleep(1000);
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

