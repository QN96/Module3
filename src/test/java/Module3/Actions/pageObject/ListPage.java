package Module3.Actions.pageObject;

import Module3.Interfaces.ListPageUI;
import Module3.Actions.commons.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ListPage {
    private static WebElement element = null;
    static BasePage basePage=new BasePage();
    private static WebDriverWait wait;
    public static void List(WebDriver driver, String invoice1, String note) throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // Chờ tối đa 5 giây
        WebElement payment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ListPageUI.payment_page)));
        basePage.clickToElement(driver, ListPageUI.payment_page);
        basePage.sendKeyToElement1(driver, ListPageUI.Search,invoice1);
        basePage.clickToElement(driver, ListPageUI.detail);
        basePage.clickToElement(driver, ListPageUI.tab_payments);
        basePage.sendKeyToElement1(driver, ListPageUI.Search_detail,note);
        basePage.clickToElement(driver, ListPageUI.delete);
    }
}
