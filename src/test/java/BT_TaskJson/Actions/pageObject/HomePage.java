package BT_TaskJson.Actions.pageObject;

import BT_TaskJson.Actions.commons.BasePage;
import BT_TaskJson.Interfaces.HomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private static WebElement element = null;
    //menu
    static BasePage basePage=new BasePage();
    //Page Actions
    public static void Home(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        basePage.clickToElement(driver,HomePageUI.tasksMenu);
    }
}
