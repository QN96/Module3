package BT_Project.Actions.pageObject;

import BT_Project.Actions.commons.BasePage;
import BT_Project.Interfaces.ProjectCreatePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void filter(WebDriver driver,  String filter) throws InterruptedException {

        basePage.sendKeyToElementEnter(driver, ProjectCreatePageUI.search, filter);
    }
}
