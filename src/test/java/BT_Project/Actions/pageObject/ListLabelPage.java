package BT_Project.Actions.pageObject;

import BT_Project.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BT_Project.Interfaces.ListLabelPageUI;

public class ListLabelPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void List(WebDriver driver) throws InterruptedException {

        basePage.clickToElement(driver, ListLabelPageUI.manage_label);
    }
}
