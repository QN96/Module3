package TH_Contacts.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactDetailPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ContactDetailPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String Contacts = "//a[text()='Contacts']";
    public static String Total_Contacts = "//div[@id='contact-table_info']";
}
