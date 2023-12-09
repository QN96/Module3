package TT_Client.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientDetailPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ClientDetailPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String Clients = "//a[text()='Clients']";
    public static String Total_Clients = "//div[@id='client-table_info']";


}
