package BT_Project.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListProjectPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public ListProjectPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String add_project = "//div[@class='title-button-group']/a[@title='Add project']";
}
