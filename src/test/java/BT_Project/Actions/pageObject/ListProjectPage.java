package BT_Project.Actions.pageObject;

import BT_Project.Actions.commons.BasePage;
import BT_Project.Interfaces.ListProjectPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListProjectPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void List(WebDriver driver) throws InterruptedException {
        basePage.clickToElement(driver, ListProjectPageUI.add_project);
    }
}
