package TT_CreateClient.Actions.pageObject;

import TT_CreateClient.Interfaces.ClientOrganizationPageUI;
import TT_CreateClient.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientOrganizationPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Client(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        basePage.clickToElement(driver, ClientOrganizationPageUI.add_Clients);
        basePage.clickToElement(driver, ClientOrganizationPageUI.organization);

    }
}
