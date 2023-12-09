package BT_3Task.Actions.pageObject;

import BT_3Task.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BT_3Task.Interfaces.TaskPageUI;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TaskPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Task(WebDriver driver, String title, String Des, String start, String deadline ) throws InterruptedException {
        basePage.clickToElement(driver, TaskPageUI.click_add);
        basePage.sendKeyToElement(driver,TaskPageUI.add_title,title);
        basePage.sendKeyToElement(driver,TaskPageUI.add_Description,Des);
        basePage.clickToElement(driver, TaskPageUI.click_Related);
        basePage.clickToElement(driver, TaskPageUI.select_Related);
        Thread.sleep(3000);
        basePage.clickToElement(driver, TaskPageUI.click_Contract);
        basePage.clickToElement(driver, TaskPageUI.select_Contract);
        basePage.clickToElement(driver, TaskPageUI.click_Point);
        basePage.clickToElement(driver, TaskPageUI.select_Point);
        basePage.clickToElement(driver, TaskPageUI.click_Assign);
        basePage.clickToElement(driver, TaskPageUI.select_Assign);
        basePage.clickToElement(driver, TaskPageUI.click_Collaborators);
        basePage.clickToElement(driver, TaskPageUI.select_Collaborators);
        basePage.clickToElement(driver, TaskPageUI.click_Status);
        basePage.clickToElement(driver, TaskPageUI.select_Status);
        basePage.clickToElement(driver, TaskPageUI.click_Priority);
        basePage.clickToElement(driver, TaskPageUI.select_Priority);
        basePage.clickToElement(driver, TaskPageUI.click_Labels);
        basePage.clickToElement(driver, TaskPageUI.select_Labels);
        basePage.sendKeyToElement(driver,TaskPageUI.start_date,start);
        basePage.sendKeyToElement(driver,TaskPageUI.deadline,deadline);
        basePage.clickToElement(driver, TaskPageUI.Recurring);
        basePage.clickToElement(driver, TaskPageUI.Save);
    }
}
