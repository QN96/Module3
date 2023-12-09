package BT_CreateTask.Actions.pageObject;

import BT_CreateTask.Actions.commons.BasePage;
import BT_CreateTask.Interfaces.HomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private static WebElement element = null;
    //menu
    static BasePage basePage=new BasePage();
    //Page Actions
    public static void Logout(WebDriver driver){
        basePage.clickToElement(driver,HomePageUI.avt);
        basePage.clickToElement(driver,HomePageUI.logout);
    }
}
