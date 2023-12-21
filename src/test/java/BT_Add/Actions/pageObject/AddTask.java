package BT_Add.Actions.pageObject;

import BT_Add.Actions.commons.BasePage;
import BT_Add.Interfaces.AddTaskUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTask {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Task(WebDriver driver, String title, String Des, String Related, String Contract, String Point, String Assign, String Collaborators, String Status, String Priority, String Labels, String start, String deadline ) throws InterruptedException {
        basePage.clickToElement(driver, AddTaskUI.add_icon);
        basePage.clickToElement(driver, AddTaskUI.add_Task);
        basePage.sendKeyToElement(driver,AddTaskUI.add_title,title);
        basePage.sendKeyToElement1(driver,AddTaskUI.add_Description,Des);
        basePage.clickToElement(driver, AddTaskUI.click_Related);
        basePage.clickToElement(driver, AddTaskUI.select_Related(Related));
        Thread.sleep(3000);
        basePage.clickToElement(driver, AddTaskUI.click_Contract);
        basePage.clickToElement(driver, AddTaskUI.select_Contract(Contract));
        Thread.sleep(3000);
        basePage.clickToElement(driver, AddTaskUI.click_Point);
        basePage.clickToElement(driver, AddTaskUI.select_Point(Point));
        basePage.clickToElement(driver, AddTaskUI.click_Assign);
        basePage.clickToElement(driver, AddTaskUI.select_Assign(Assign));
        basePage.clickToElement(driver, AddTaskUI.click_Collaborators);
        basePage.clickToElement(driver, AddTaskUI.select_Collaborators(Collaborators));
        basePage.clickToElement(driver, AddTaskUI.click_Status);
        basePage.clickToElement(driver, AddTaskUI.select_Status(Status));
        basePage.clickToElement(driver, AddTaskUI.click_Priority);
        basePage.clickToElement(driver, AddTaskUI.select_Priority(Priority));
        basePage.clickToElement(driver, AddTaskUI.click_Labels);
        basePage.clickToElement(driver, AddTaskUI.select_Labels(Labels));
        basePage.sendKeyToElement(driver,AddTaskUI.start_date,start);
        basePage.sendKeyToElement(driver,AddTaskUI.deadline,deadline);
        basePage.clickToElement(driver, AddTaskUI.Recurring);
        basePage.clickToElement(driver, AddTaskUI.Save);
    }
}
