package BT_3Task.Actions.pageObject;

import BT_3Task.Actions.commons.BasePage;
import BT_3Task.Interfaces.HomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private static WebElement element = null;
    //menu
    static BasePage basePage=new BasePage();
    //Page Actions
    public static void Home(WebDriver driver){
        basePage.clickToElement(driver,HomePageUI.tasksMenu);
    }
}
