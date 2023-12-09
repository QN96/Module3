package TH_Contacts.Actions.pageObject;

import TH_Contacts.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TH_Contacts.Interfaces.ContactDetailPageUI;

public class ContactDetailPage {
    private static WebElement element = null;
    private static BasePage basePage = new BasePage();

    public static String Detail(WebDriver driver) {
        basePage.clickToElement(driver, ContactDetailPageUI.Contacts);

        // Get the text and check if it matches the expected format
        String totalContactsText = basePage.getElementText(driver, ContactDetailPageUI.Total_Contacts);
        String[] parts = totalContactsText.split("/");

        if (parts.length >= 2) {
            // Extract the last part after the '/' and trim any leading/trailing whitespaces
            String totalContactsCount = parts[1].trim();

            System.out.println("Total Contacts: " + totalContactsCount);

            // Return the totalContactsCount
            return totalContactsCount;
        } else {
            System.out.println("Unexpected format: " + totalContactsText);
            // You can add additional handling logic here, such as logging the error or throwing an exception

            // Return a default or error value (null in this case)
            return null;
        }
    }
}
