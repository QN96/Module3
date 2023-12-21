package BT_Add.Actions.pageObject;

import BT_Add.Interfaces.HomePageUI;
import BT_Add.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static void Home(WebDriver driver){
        basePage.isElementDisplayed(driver, HomePageUI.text_dashboard);
    }
}
