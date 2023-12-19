package TH_EditProject.Actions.pageObject;

import TH_EditProject.Actions.commons.BasePage;
import TH_EditProject.Interfaces.DeleteProjectPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProjectPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Delete_Project(WebDriver driver) throws InterruptedException {
        basePage.clickToElement(driver, DeleteProjectPageUI.delete_button);
        Thread.sleep(3000);
        basePage.clickToElement(driver, DeleteProjectPageUI.confirm_button);
        Thread.sleep(3000);
    }
}
