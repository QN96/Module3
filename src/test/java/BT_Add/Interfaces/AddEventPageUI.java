package BT_Add.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEventPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public AddEventPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String add_icon = "//a[@id='quick-add-icon']";
    public static String add_event = "//a[@title='Add event']";
    public static String add_title = "//div//input[@id='title']";
    public static String add_Description = "//textarea[@id='description']";
    public static String start_date = "//input[@id='start_date']";
    public static String start_time = "//input[@id='start_time']";
    public static String end_date = "//input[@id='end_date']";
    public static String end_time = "//input[@id='end_time']";
    public static String add_location = "//input[@id='location']";
    public static String client = "//div[@id='s2id_clients_dropdown']";
    public static String option = "//div[text()='Zoila Hauck']";
    public static String dialog = "//span[@style='background-color:#37b4e1']";
    public static String Save = "//div[@class='modal-footer']//button[@type='submit']";
}
