package BT_Add.Actions.pageObject;

import BT_Add.Actions.commons.BasePage;
import BT_Add.Interfaces.AddTodoPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTodoPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Note(WebDriver driver, String title, String Des, String date) throws InterruptedException {
        basePage.clickToElement(driver, AddTodoPageUI.add_icon);
        basePage.clickToElement(driver, AddTodoPageUI.add_todo);
        basePage.sendKeyToElement(driver,AddTodoPageUI.add_title,title);
        basePage.sendKeyToElement(driver,AddTodoPageUI.add_Description,Des);
        Thread.sleep(3000);
        basePage.sendKeyToElement(driver, AddTodoPageUI.date,date);
        basePage.clickToElement(driver, AddTodoPageUI.Save);
    }
}
