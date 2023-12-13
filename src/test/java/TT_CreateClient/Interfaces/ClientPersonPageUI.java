package TT_CreateClient.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPersonPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ClientPersonPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String add_Clients = "//a[@title='Add client']";
    public static String person = "//input[@id='type_person']";
}
