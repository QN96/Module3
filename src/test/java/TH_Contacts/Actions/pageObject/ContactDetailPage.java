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

        basePage.scrollToBottomPage(driver);
        basePage.waitForElementVisible(driver, ContactDetailPageUI.Total_Contacts);
        String totalContactsText = basePage.getElementText(driver, ContactDetailPageUI.Total_Contacts);
        String[] substrings = totalContactsText.split(" ");
        String lastPart = substrings[substrings.length - 1];
        System.out.println("Total contacts: " + lastPart);
    }
}
