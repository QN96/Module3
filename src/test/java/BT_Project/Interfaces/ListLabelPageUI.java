package BT_Project.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListLabelPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ListLabelPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String manage_label = "//div[@class='title-button-group']/a[@title='Manage labels']";

}
