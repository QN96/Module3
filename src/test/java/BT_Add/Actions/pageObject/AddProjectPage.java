package BT_Add.Actions.pageObject;

import BT_Add.Actions.commons.BasePage;
import BT_Add.Interfaces.AddProjectUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Create_Project(WebDriver driver, String title, String description, String startdate, String deadline, String price, String option) throws InterruptedException {
        basePage.clickToElement(driver, AddProjectUI.add_icon);
        basePage.clickToElement(driver, AddProjectUI.add_Project);
        basePage.sendKeyToElement(driver, AddProjectUI.title_project, title);
        basePage.clickToElement(driver, AddProjectUI.project_type);
        basePage.clickToElement(driver, AddProjectUI.type_option);
        basePage.sendKeyToElement(driver, AddProjectUI.des, description);
        basePage.sendKeyToElement(driver, AddProjectUI.start_date, startdate);
        basePage.sendKeyToElement(driver, AddProjectUI.deadline_project, deadline);
        basePage.sendKeyToElement(driver, AddProjectUI.price, price);
        basePage.clickToElement(driver, AddProjectUI.label_project);
        basePage.clickToElement(driver,AddProjectUI.label_option(option));
        basePage.clickToElement(driver, AddProjectUI.save_button);
        Thread.sleep(3000);
    }
}
