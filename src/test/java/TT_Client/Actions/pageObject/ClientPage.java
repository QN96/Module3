package TT_Client.Actions.pageObject;

import TT_Client.Interfaces.ClientPageUI;
import TT_Client.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static void Client(WebDriver driver)  {
        basePage.getElementText(driver, ClientPageUI.total_Clients);
        String totalClientsText = basePage.getElementText(driver, ClientPageUI.total_Clients);
        System.out.println("Total Clients Overview: " + totalClientsText);
        basePage.clickToElement(driver, ClientPageUI.Clients);
    }
}
