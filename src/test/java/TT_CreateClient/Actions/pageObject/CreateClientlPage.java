package TT_CreateClient.Actions.pageObject;

import TT_CreateClient.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TT_CreateClient.Interfaces.CreateClientPageUI;

public class CreateClientlPage {
    private static WebElement element = null;
    private static BasePage basePage=new BasePage();

    public static void Create(WebDriver driver, String company, String Address, String City, String State, String Zip, String Country, String Phone, String Website, String VAT, String GST, String symbol) throws InterruptedException {
        Thread.sleep(3000);
        basePage.sendKeyToElement(driver, CreateClientPageUI.company_name, company);
        basePage.clickToElement(driver, CreateClientPageUI.owner);
        basePage.clickToElement(driver, CreateClientPageUI.owner_option);
        basePage.sendKeyToElement(driver, CreateClientPageUI.address1, Address);
        basePage.sendKeyToElement(driver, CreateClientPageUI.city, City);
        basePage.sendKeyToElement(driver, CreateClientPageUI.state, State);
        basePage.sendKeyToElement(driver, CreateClientPageUI.zip, Zip);
        basePage.sendKeyToElement(driver, CreateClientPageUI.country, Country);
        basePage.sendKeyToElement(driver, CreateClientPageUI.phone, Phone);
        basePage.sendKeyToElement(driver, CreateClientPageUI.website, Website);
        basePage.sendKeyToElement(driver, CreateClientPageUI.vat, VAT);
        basePage.sendKeyToElement(driver, CreateClientPageUI.gst, GST);
        basePage.clickToElement(driver, CreateClientPageUI.client_group);
        basePage.clickToElement(driver, CreateClientPageUI.group);
        basePage.clickToElement(driver, CreateClientPageUI.currency);
        basePage.clickToElement(driver, CreateClientPageUI.currency_option);
        basePage.sendKeyToElement(driver, CreateClientPageUI.currency_symbol, symbol);
        basePage.clickToElement(driver, CreateClientPageUI.labels);
        basePage.clickToElement(driver, CreateClientPageUI.labels_option);
        basePage.clickToElement(driver, CreateClientPageUI.check_box);
        basePage.clickToElement(driver, CreateClientPageUI.Save1);
    }
}
