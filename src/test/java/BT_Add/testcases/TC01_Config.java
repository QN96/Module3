package BT_Add.testcases;

import BT_Add.Actions.commons.BaseTest;
import BT_Add.Actions.pageObject.*;
import BT_Add.Utilities.Helpers.PropertiesFile;
import BT_Add.Utilities.Listeners.ReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ReportListener.class)
public class TC01_Config extends BaseTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
    }

    @Test (priority = 0)
    public void Test_Login() {
        LoginPage.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
    }

    @Test (priority = 1)
    public void Test_Home(){

        HomePage.Home(driver);
    }
    @Test (priority = 2)
    public void Add_task() throws InterruptedException {
        AddTask.Task(driver, PropertiesFile.getPropValue("title1"),PropertiesFile.getPropValue("description1"),PropertiesFile.getPropValue("Related1"),PropertiesFile.getPropValue("Contract1"),PropertiesFile.getPropValue("Point1"),PropertiesFile.getPropValue("Assign1"),PropertiesFile.getPropValue("Collaborators1"),PropertiesFile.getPropValue("Status1"),PropertiesFile.getPropValue("Priority1"),PropertiesFile.getPropValue("Labels1"),PropertiesFile.getPropValue("start1"),PropertiesFile.getPropValue("deadline1"));
    }
    @Test (priority = 3)
    public void Add_Multi() throws InterruptedException {
        MultiTaskPage.MultiTask(driver, PropertiesFile.getPropValue("title2"), PropertiesFile.getPropValue("description2"), PropertiesFile.getPropValue("Related2"), PropertiesFile.getPropValue("Contract2"), PropertiesFile.getPropValue("Point2"), PropertiesFile.getPropValue("Assign2"), PropertiesFile.getPropValue("Collaborators2"), PropertiesFile.getPropValue("Status2"), PropertiesFile.getPropValue("Priority2"), PropertiesFile.getPropValue("Labels2"), PropertiesFile.getPropValue("start2"), PropertiesFile.getPropValue("deadline2"));
    }
    @Test (priority = 4)
    public void Add_Project() throws InterruptedException {
        AddProjectPage.Create_Project(driver, PropertiesFile.getPropValue("title3"),PropertiesFile.getPropValue("des3"),PropertiesFile.getPropValue("start_date3"),PropertiesFile.getPropValue("deadline_project3"),PropertiesFile.getPropValue("price3"),PropertiesFile.getPropValue("option3"));
    }
    @Test (priority = 5)
    public void Event() throws InterruptedException {
        AddEventPage.Event(driver, PropertiesFile.getPropValue("title4"),PropertiesFile.getPropValue("des4"),PropertiesFile.getPropValue("start_date4"),PropertiesFile.getPropValue("end_date4"),PropertiesFile.getPropValue("start_time4"),PropertiesFile.getPropValue("end_time4"),PropertiesFile.getPropValue("locations4"));
    }
    @Test (priority = 6)
    public void note() throws InterruptedException {
        AddNotePage.Note(driver, PropertiesFile.getPropValue("title5"),PropertiesFile.getPropValue("des5"),PropertiesFile.getPropValue("option5"));
    }
    @Test (priority = 7)
    public void Todo() throws InterruptedException {
        AddTodoPage.Todo(driver, PropertiesFile.getPropValue("title6"),PropertiesFile.getPropValue("des6"),PropertiesFile.getPropValue("date6"));
    }
    @Test (priority = 7)
    public void Ticket() throws InterruptedException {
        AddTicketPage.Ticket(driver, PropertiesFile.getPropValue("title7"),PropertiesFile.getPropValue("option_client"),PropertiesFile.getPropValue("option_type"),PropertiesFile.getPropValue("des7"),PropertiesFile.getPropValue("option_assign"));
    }

    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
    }
}

