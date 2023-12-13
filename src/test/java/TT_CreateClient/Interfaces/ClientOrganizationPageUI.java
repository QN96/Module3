package TT_CreateClient.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientOrganizationPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ClientOrganizationPageUI(WebDriver driver) {

        this.driver = driver;
    }

    public static String add_Clients = "//div//a[@title='Add client']";
    public static String organization = "//input[@id='type_organization']";
}
