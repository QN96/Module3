package BT_Add.Actions.pageObject;

import BT_Add.Actions.commons.BasePage;
import BT_Add.Interfaces.AddEventPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEventPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Event(WebDriver driver, String title, String Des, String startdate, String enddate, String starttime, String endtime, String locations) throws InterruptedException {
        basePage.clickToElement(driver, AddEventPageUI.add_icon);
        basePage.clickToElement(driver, AddEventPageUI.add_event);
        basePage.sendKeyToElement(driver,AddEventPageUI.add_title,title);
        basePage.sendKeyToElement(driver,AddEventPageUI.add_Description,Des);
        Thread.sleep(3000);
        basePage.sendKeyToElement(driver, AddEventPageUI.start_date, startdate);
        basePage.sendKeyToElement(driver, AddEventPageUI.start_time, starttime);
        basePage.sendKeyToElement2(driver, AddEventPageUI.end_date, enddate);
        basePage.sendKeyToElement2(driver, AddEventPageUI.end_time, endtime);
        basePage.sendKeyToElement(driver, AddEventPageUI.add_location, locations);
        basePage.clickToElement(driver, AddEventPageUI.client);
        basePage.clickToElement(driver, AddEventPageUI.option);
        basePage.clickToElement(driver, AddEventPageUI.dialog);
        basePage.clickToElement(driver, AddEventPageUI.Save);
    }
}
