package TH_Contacts.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public OverviewPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String total_Contacts = "//div[@class='widget-details']/h1[following-sibling::span[text()='Total contacts']]";
    public static String Contacts = "//a[text()='Contacts']";

}
