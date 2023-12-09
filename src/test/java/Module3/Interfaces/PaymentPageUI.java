package Module3.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public PaymentPageUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String click_Sales = "//span[text()='Sales']";
    public static String click_invoices = "//span[text()='Invoices']";
    public static String click_add = "//a[@title='Add payment']";
    public static String invoice = "//div[@id='s2id_invoice_id']";
    public static String select_invoice = "//li[contains(@class, 'select2-result') and contains(., 'INVOICE #20')]";
    public static String payment_mothod = "//div[@id='s2id_autogen10']";
    public static String select_payment_mothod = "//li[contains(@class, 'select2-result') and contains(@class, 'select2-highlighted') and contains(., 'Cash')]";
    public static String payment_date = "//input[@id='invoice_payment_date']";
    public static String Amount = "//input[@id='invoice_payment_amount']";
    public static String Note = "//textarea[@id='invoice_payment_note']";
    public static String Save = "//button[text()=' Save']";

}
