package BT_Add.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectUI {
    private static WebElement element = null;
    WebDriver driver;

    public AddProjectUI(WebDriver driver) {

        this.driver = driver;
    }
    public static String add_icon = "//a[@id='quick-add-icon']";
    public static String add_Project = "//a[@title='Add project time']";
    public static String title_project = "//input[@id='title']";
    public static String project_type = "//div[@id='s2id_project-type-dropdown']";
    public static String type_option = "//div[text()= 'Internal Project']";
    public static String des = "//textarea[@id='description']";
    public static String start_date = "//input[@id='start_date']";
    public static String deadline_project = "//input[@id='deadline']";
    public static String price = "//input[@id='price']";
    public static String label_project = "//div[@id='s2id_project_labels']";
    public static String label_option(String option){
        return String.format("//div[@class='select2-result-label' and text()='%s']",option);
    }
    public static String save_button = "//div[@class='modal-footer']//button[@type='submit']";

}
