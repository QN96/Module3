package BT_Add.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTodoPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public AddTodoPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String add_icon = "//a[@id='quick-add-icon']";
    public static String add_todo = "//a[@title='Add to do']";
    public static String add_title = "//div//input[@id='title']";
    public static String add_Description = "//textarea[@id='description']";
    public static String date = "//input[@id='start_date']";
    public static String Save = "//div[@class='modal-footer']//button[@type='submit']";
}
