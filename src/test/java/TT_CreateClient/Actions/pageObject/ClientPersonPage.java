package TT_CreateClient.Actions.pageObject;

import TT_CreateClient.Actions.commons.BasePage;
import TT_CreateClient.Interfaces.ClientPersonPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPersonPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Client(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        basePage.clickToElement(driver, ClientPersonPageUI.add_Clients);
        basePage.clickToElement(driver, ClientPersonPageUI.person);
    }
}
