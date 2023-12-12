package BT_TaskJson.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public TaskPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String click_add = "//a[text()=' Add task']";
    public static String add_title = "//input[@id='title']";
    public static String add_Description = "//textarea[@id='description']";
    public static String click_Related = "//label[text()='Related to']/following::div[@id='s2id_task-context']/a";
    public static String select_Related = "//div[text()='Client']";
    public static String click_Contract = "//label[text()='Related to']/following::div[@id='s2id_client_id']/a";
    public static String select_Contract = "//div[text()='Zoila Hauck']";
    public static String click_Point = "//label[contains(text(), 'Points')]/following-sibling::div";
    public static String select_Point = "//div[text()='2 Points']";
    public static String click_Assign = "//label[text()='Assign to']/following::div[@id='s2id_assigned_to']";
    public static String select_Assign = "//div[text()='Michael Wood']";
    public static String click_Collaborators = "//label[text()='Collaborators']/following::div[@id='s2id_collaborators']";
    public static String select_Collaborators = "//div[text()='Sara Ann']";
    public static String click_Status = "//label[text()='Status']/following::div[@id='s2id_task_status_id']";
    public static String select_Status = "//div[text()='To do']";
    public static String click_Priority = "//label[text()='Priority']/following::div[@id='s2id_priority_id']";
    public static String select_Priority = "//div[text()='Major']";
    public static String click_Labels = "//label[text()='Labels']/following::div[@id='s2id_project_labels']";
    public static String select_Labels = "//div[text()='Bug']";
    public static String start_date = "//input[@name='start_date']";
    public static String deadline = "//input[@name='deadline']";
    public static String Recurring = "(//input[@type='checkbox'])[3]";
    public static String Save = "//button[text()=' Save']";

}
