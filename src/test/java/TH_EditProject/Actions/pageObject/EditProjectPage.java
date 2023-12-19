package TH_EditProject.Actions.pageObject;

import TH_EditProject.Interfaces.EditProjectPageUI;
import TH_EditProject.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static TH_EditProject.Interfaces.EditProjectPageUI.label_option;

public class EditProjectPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Edit_Project(WebDriver driver, String title, String description, String startdate, String deadline, String price, String option) throws InterruptedException {
        basePage.clickToElement(driver, EditProjectPageUI.edit_button);
        basePage.sendKeyToElement(driver, EditProjectPageUI.title_project, title);
        basePage.clickToElement(driver, EditProjectPageUI.project_type);
        basePage.clickToElement(driver, EditProjectPageUI.type_option);
        basePage.sendKeyToElement(driver, EditProjectPageUI.des, description);
        basePage.sendKeyToElement(driver, EditProjectPageUI.start_date, startdate);
        basePage.sendKeyToElement(driver, EditProjectPageUI.deadline_project, deadline);
        basePage.sendKeyToElement(driver, EditProjectPageUI.price, price);
        basePage.clickToElement(driver, EditProjectPageUI.label_project);
        basePage.clickToElement(driver,label_option(option));
        basePage.clickToElement(driver, EditProjectPageUI.status);
        basePage.clickToElement(driver, EditProjectPageUI.status_option);
        Thread.sleep(3000);
        basePage.clickToElement(driver, EditProjectPageUI.save_button);
        Thread.sleep(3000);
    }
}
