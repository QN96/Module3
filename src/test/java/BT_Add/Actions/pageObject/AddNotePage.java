package BT_Add.Actions.pageObject;

import BT_Add.Actions.commons.BasePage;
import BT_Add.Interfaces.AddNotePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNotePage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Note(WebDriver driver, String title, String Des, String option) throws InterruptedException {
        basePage.clickToElement(driver, AddNotePageUI.add_icon);
        basePage.clickToElement(driver, AddNotePageUI.add_note);
        basePage.sendKeyToElement(driver,AddNotePageUI.add_title,title);
        basePage.sendKeyToElement(driver,AddNotePageUI.add_Description,Des);
        Thread.sleep(3000);
        basePage.clickToElement(driver, AddNotePageUI.label);
        basePage.sendKeyToElement(driver, AddNotePageUI.label_option(option), option);
        basePage.clickToElement(driver, AddNotePageUI.Save);
    }
}
