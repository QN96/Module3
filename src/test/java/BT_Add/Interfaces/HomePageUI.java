package BT_Add.Interfaces;

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
        public static String text_dashboard = "//a[@class='sidebar-brand brand-logo']";
}



