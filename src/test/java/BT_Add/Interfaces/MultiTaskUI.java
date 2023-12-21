package BT_Add.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiTaskUI {
    private static WebElement element = null;
    WebDriver driver;

    public MultiTaskUI(WebDriver driver) {

        this.driver = driver;
    }
    public static String add_icon = "//a[@id='quick-add-icon']";
    public static String add_MultiTask = "//a[@id='js-quick-add-multiple-task']";

    public static String add_title = "//input[@id='title']";
    public static String add_Description = "//textarea[@id='description']";
    public static String click_Related = "//label[text()='Related to']/following::div[@id='s2id_task-context']/a";
    public static String select_Related(String Related){
        return String.format("//div[text()='%s']",Related);
    }
    public static String click_Contract = "//label[text()='Related to']/following::div[@id='s2id_client_id']/a";
    public static String select_Contract(String Contract){
        return String.format("//div[text()='%s']",Contract);
    }
    public static String click_Point = "//label[contains(text(), 'Points')]/following-sibling::div";
    public static String select_Point(String Point){
        return String.format("//div[text()='%s']",Point);
    }
    public static String click_Assign = "//label[text()='Assign to']/following::div[@id='s2id_assigned_to']";
    public static String select_Assign(String Assign){
        return String.format("//div[text()='%s']",Assign);
    }
    public static String click_Collaborators = "//label[text()='Collaborators']/following::div[@id='s2id_collaborators']";
    public static String select_Collaborators(String Collaborators){
        return String.format("//div[text()='%s']",Collaborators);
    }
    public static String click_Status = "//label[text()='Status']/following::div[@id='s2id_task_status_id']";
    public static String select_Status(String Status){
        return String.format("//div[text()='%s']",Status);
    }
    public static String click_Priority = "//label[text()='Priority']/following::div[@id='s2id_priority_id']";
    public static String select_Priority(String Priority){
        return String.format("//div[text()='%s']",Priority);
    }
    public static String click_Labels = "//label[text()='Labels']/following::div[@id='s2id_project_labels']";
    public static String select_Labels(String Labels){
        return String.format("//div[text()='%s']",Labels);
    }
    public static String start_date = "//input[@name='start_date']";
    public static String deadline = "//input[@name='deadline']";
    public static String Recurring = "(//input[@type='checkbox'])[3]";
    public static String Save = "//div[@class='modal-footer']//button[@type='submit']";
    public static String Close = "//div[@id='tasks-dropzone']//button[@type='button'][normalize-space()='Close']";

}
