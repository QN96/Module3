package BT_Event.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public EventPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String add_event = "//a[@class='btn btn-default add-btn']";
    public static String add_title = "//div//input[@id='title']";
    public static String add_Description = "//textarea[@id='description']";
    public static String start_date = "//input[@id='start_date']";
    public static String start_time = "//input[@id='start_time']";
    public static String end_date = "//input[@id='end_date']";
    public static String end_time = "//input[@id='end_time']";
    public static String add_location = "//input[@id='location']";
    //public static String labels = "//input[@id='s2id_autogen15']";
    public static String client = "//div[@id='s2id_clients_dropdown']";
    public static String option = "//div[text()='Zoila Hauck']";
    public static String dialog = "//span[@style='background-color:#37b4e1']";
    public static String Save = "//button[text()=' Save']";
}
