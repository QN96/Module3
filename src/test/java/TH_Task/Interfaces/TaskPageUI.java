package TH_Task.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public TaskPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String import_Task = "//a[contains(@title,'Import tasks')]";
    public static String add_Multiple = "//a[@class='btn btn-default'][normalize-space()='Add multiple tasks']";
    public static String add_Task = "//a[@class='btn btn-default'][normalize-space()='Add task']";
    public static String colum = "//button[@class='btn btn-default column-show-hide-popover']";
    public static String filter = "//button[normalize-space()='Filters']";
    public static String all_Task = "//button[normalize-space()='All tasks']";
    public static String all_Bug = "//button[normalize-space()='Bug']";
    public static String button_i = "//button[@data-id='bqcysoeppi']";
    public static String excel = "//span[normalize-space()='Excel']";
    public static String print = "//span[normalize-space()='Print']";
    public static String search = "//input[@type='search']";

}
