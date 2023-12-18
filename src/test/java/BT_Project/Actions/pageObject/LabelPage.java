package BT_Project.Actions.pageObject;

import BT_Project.Actions.commons.BasePage;
import BT_Project.Interfaces.LabelPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static BT_Project.Interfaces.LabelPageUI.color_label;

public class LabelPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    public static void Create_label(WebDriver driver, String Color, String label) throws InterruptedException {
        basePage.clickToElement(driver,color_label(Color));
        basePage.sendKeyToElement1(driver, LabelPageUI.labels, label);
        basePage.clickToElement(driver, LabelPageUI.save_button);
        Thread.sleep(2000);
        basePage.clickToElement(driver, LabelPageUI.close_button);
        Thread.sleep(2000);
    }
}
