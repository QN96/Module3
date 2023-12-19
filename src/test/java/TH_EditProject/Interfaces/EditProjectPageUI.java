package TH_EditProject.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public EditProjectPageUI(WebDriver driver) {

        this.driver = driver;
    }
    public static String edit_button = "(//a[@title='Edit project'])[1]";
    public static String title_project = "//input[@id='title']";
    public static String project_type = "//div[@id='s2id_project-type-dropdown']";
    public static String type_option = "//div[text()= 'Internal Project']";
    public static String des = "//div[@role='textbox']";
    public static String start_date = "//input[@id='start_date']";
    public static String deadline_project = "//input[@id='deadline']";
    public static String price = "//input[@id='price']";
    public static String label_project = "//div[@id='s2id_project_labels']";
    public static String label_option(String option){
        return String.format("//div[@class='select2-result-label' and text()='%s']",option);
    }
    public static String status = "//label[@for='status_id']//following::div[@class='select2-container select2']";
    public static String status_option = "//div[text()='Open']";
    public static String save_button = "//button[@type='submit']";

}
