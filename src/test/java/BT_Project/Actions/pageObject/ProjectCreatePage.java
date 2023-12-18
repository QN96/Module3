package BT_Project.Actions.pageObject;

import BT_Project.Interfaces.ProjectCreatePageUI;
import BT_Project.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static BT_Project.Interfaces.LabelPageUI.color_label;
import static BT_Project.Interfaces.ProjectCreatePageUI.label_option;

public class ProjectCreatePage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Create_Project(WebDriver driver, String title, String description, String startdate, String deadline, String price, String option) throws InterruptedException {
        basePage.sendKeyToElement(driver, ProjectCreatePageUI.title_project, title);
        basePage.clickToElement(driver, ProjectCreatePageUI.project_type);
        basePage.clickToElement(driver, ProjectCreatePageUI.type_option);
        basePage.sendKeyToElement(driver, ProjectCreatePageUI.des, description);
        basePage.sendKeyToElement(driver, ProjectCreatePageUI.start_date, startdate);
        basePage.sendKeyToElement(driver, ProjectCreatePageUI.deadline_project, deadline);
        basePage.sendKeyToElement(driver, ProjectCreatePageUI.price, price);
        basePage.clickToElement(driver, ProjectCreatePageUI.label_project);
        basePage.clickToElement(driver,label_option(option));
        basePage.clickToElement(driver, ProjectCreatePageUI.save_button);
        Thread.sleep(3000);
    }
}
