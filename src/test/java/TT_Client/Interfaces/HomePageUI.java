package TT_Client.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageUI {
    private static WebElement element = null;
    //menu
    WebDriver driver;

    public HomePageUI(WebDriver driver) {

        this.driver = driver;
    }

        //Web locator
        public static String text_dashboard = "//h4[text()='Dashboard']";
        public static String menu_client = "//span[text()='Clients']";
}



