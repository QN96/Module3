package BT_Add.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNotePageUI {
    private static WebElement element = null;
    WebDriver driver;

    public AddNotePageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String add_icon = "//a[@id='quick-add-icon']";
    public static String add_note = "//a[@title='Add note']";
    public static String add_title = "//div//input[@id='title']";
    public static String add_Description = "//textarea[@id='description']";
    public static String label = "//ul[@class='select2-choices']";
    public static String label_option(String option){
        return String.format("//div[text()='%s']",option);
    }
    public static String Save = "//div[@class='modal-footer']//button[@type='submit']";
}
