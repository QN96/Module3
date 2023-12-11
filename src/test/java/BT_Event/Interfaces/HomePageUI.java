package BT_Event.Interfaces;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageUI {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public HomePageUI(WebDriver driver){
        this.driver=driver;
    }

    //Web locator
    public static String eventMenu = "//a[@href='https://rise.fairsketch.com/events']";
}
