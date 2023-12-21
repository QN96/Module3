package BT_Add.Actions.pageObject;

import BT_Add.Interfaces.MultiTaskUI;
import BT_Add.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiTaskPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void MultiTask(WebDriver driver, String title, String Des, String Related, String Contract, String Point, String Assign, String Collaborators, String Status, String Priority, String Labels, String start, String deadline ) throws InterruptedException {
        basePage.clickToElement(driver, MultiTaskUI.add_icon);
        basePage.clickToElement(driver, MultiTaskUI.add_MultiTask);
        basePage.sendKeyToElement(driver,MultiTaskUI.add_title,title);
        basePage.sendKeyToElement1(driver,MultiTaskUI.add_Description,Des);
        basePage.clickToElement(driver, MultiTaskUI.click_Related);
        basePage.clickToElement(driver, MultiTaskUI.select_Related(Related));
        Thread.sleep(3000);
        basePage.clickToElement(driver, MultiTaskUI.click_Contract);
        basePage.clickToElement(driver, MultiTaskUI.select_Contract(Contract));
        Thread.sleep(3000);
        basePage.clickToElement(driver, MultiTaskUI.click_Point);
        basePage.clickToElement(driver, MultiTaskUI.select_Point(Point));
        basePage.clickToElement(driver, MultiTaskUI.click_Assign);
        basePage.clickToElement(driver, MultiTaskUI.select_Assign(Assign));
        basePage.clickToElement(driver, MultiTaskUI.click_Collaborators);
        basePage.clickToElement(driver, MultiTaskUI.select_Collaborators(Collaborators));
        basePage.clickToElement(driver, MultiTaskUI.click_Status);
        basePage.clickToElement(driver, MultiTaskUI.select_Status(Status));
        basePage.clickToElement(driver, MultiTaskUI.click_Priority);
        basePage.clickToElement(driver, MultiTaskUI.select_Priority(Priority));
        basePage.clickToElement(driver, MultiTaskUI.click_Labels);
        basePage.clickToElement(driver, MultiTaskUI.select_Labels(Labels));
        basePage.sendKeyToElement(driver,MultiTaskUI.start_date,start);
        basePage.sendKeyToElement(driver,MultiTaskUI.deadline,deadline);
        basePage.clickToElement(driver, MultiTaskUI.Recurring);
        basePage.clickToElement(driver, MultiTaskUI.Save);
        basePage.clickToElement(driver, MultiTaskUI.Close);
    }
}
