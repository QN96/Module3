package BT_Add.Actions.pageObject;

import BT_Add.Actions.commons.BasePage;
import BT_Add.Interfaces.AddTicketPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTicketPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Note(WebDriver driver, String title, String option, String Des, String option1,String option2) throws InterruptedException {
        basePage.clickToElement(driver, AddTicketPageUI.add_icon);
        basePage.clickToElement(driver, AddTicketPageUI.add_ticket);
        basePage.sendKeyToElement(driver,AddTicketPageUI.add_title,title);
        basePage.clickToElement(driver, AddTicketPageUI.client);
        basePage.sendKeyToElement(driver,AddTicketPageUI.client_option(option),option);
        basePage.clickToElement(driver, AddTicketPageUI.type);
        basePage.sendKeyToElement(driver,AddTicketPageUI.type_option(option1),option1);
        basePage.sendKeyToElement(driver,AddTicketPageUI.add_Description,Des);
        Thread.sleep(3000);
        basePage.clickToElement(driver, AddTicketPageUI.assign);
        basePage.sendKeyToElement(driver,AddTicketPageUI.assign_option(option2),option2);
        basePage.clickToElement(driver, AddTicketPageUI.Save);
    }
}
