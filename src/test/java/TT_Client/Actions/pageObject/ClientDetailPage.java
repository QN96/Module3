package TT_Client.Actions.pageObject;

import TT_Client.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TT_Client.Interfaces.ClientDetailPageUI;

public class ClientDetailPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Detail(WebDriver driver) {
        basePage.clickToElement(driver, ClientDetailPageUI.Clients);

        String totalClientsText = basePage.getElementText(driver, ClientDetailPageUI.Total_Clients);
        String lastPart = totalClientsText.split("/")[1].trim();

        System.out.println("Total Clients: " + lastPart);
    }
}
