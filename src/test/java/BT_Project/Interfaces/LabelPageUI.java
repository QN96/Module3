package BT_Project.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LabelPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public LabelPageUI(WebDriver driver)
    {
        this.driver = driver;
    }
   
    //Web locator

    //public static String color_label = "//span[@class='color-tag clickable mr15 ' and @data-color='%s']";
    public static String color_label(String Color){
        return String.format("//span[@class=\"color-tag clickable mr15 \"and @data-color=\"%s\"]",Color);
    }
    public static String labels = "//input[@id='title']";
    public static String save_button = "//button[@type='submit']";
    public static String close_button = "//button[@data-bs-dismiss='modal']";
}
