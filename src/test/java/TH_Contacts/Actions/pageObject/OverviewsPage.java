package TH_Contacts.Actions.pageObject;

import TH_Contacts.Interfaces.OverviewPageUI;
import TH_Contacts.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverviewsPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static void Overview(WebDriver driver)  {
        basePage.getElementText(driver, OverviewPageUI.total_Contacts);
        String totalClientsText = basePage.getElementText(driver, OverviewPageUI.total_Contacts);
        System.out.println("Total Contacts Overview: " + totalClientsText);
        basePage.clickToElement(driver, OverviewPageUI.Contacts);
    }
}
