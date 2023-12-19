package TH_EditProject.Actions.pageObject;

import TH_EditProject.Actions.commons.BasePage;
import TH_EditProject.Interfaces.filterPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class filterPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Filter(WebDriver driver, String status) throws InterruptedException {
        basePage.clickToElement(driver, filterPageUI.plus_button);
        basePage.clickToElement(driver, filterPageUI.status_button);
        basePage.clickToElement(driver,filterPageUI.status_option(status));
        Thread.sleep(3000);
        basePage.clickToElement(driver, filterPageUI.export);
        basePage.clickToElement(driver, filterPageUI.print);
    }
}
