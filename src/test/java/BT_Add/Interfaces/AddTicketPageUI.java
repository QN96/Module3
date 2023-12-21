package BT_Add.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTicketPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public AddTicketPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String add_icon = "//a[@id='quick-add-icon']";
    public static String add_ticket = "//a[@title='Add ticket']";
    public static String add_title = "//div//input[@id='title']";
    public static String client = "//div[@id='s2id_client_id']";
    public static String client_option(String option){

        return String.format("//div[text()='%s']",option);
    }
    public static String type = "//label[text()='Ticket type']/following-sibling::div";
    public static String type_option(String option1){

        return String.format("//div[text()='%s']",option1);
    }
    public static String add_Description = "//textarea[@id='description']";
    public static String assign = "//label[text()='Assign to']/following-sibling::div";
    public static String assign_option(String option2){

        return String.format("//div[text()='%s']",option2);
    }

    public static String Save = "//div[@class='modal-footer']//button[@type='submit']";
}
