package TH_Contacts.Actions.pageObject;

import TH_Contacts.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TH_Contacts.Interfaces.ContactDetailPageUI;

public class ContactDetailPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Detail(WebDriver driver) {
        basePage.clickToElement(driver, ContactDetailPageUI.Contacts);

        String totalClientsText = basePage.getElementText(driver, ContactDetailPageUI.Total_Contacts);
        String lastPart = totalClientsText.split("/")[1].trim();

        System.out.println("Total Contact: " + lastPart);
    }
}
