package TT_Client.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ClientPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String total_Clients = "//div[@class='widget-details']/h1[following-sibling::span[text()='Total clients']]";
    public static String Clients = "//a[text()='Clients']";

}
