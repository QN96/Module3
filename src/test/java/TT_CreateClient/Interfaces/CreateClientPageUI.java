package TT_CreateClient.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateClientPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public CreateClientPageUI(WebDriver driver) {

        this.driver = driver;
    }

    //Web locator
    public static String company_name = "//input[@id='company_name']";
    public static String owner = "//div[@id='s2id_created_by']";
    public static String owner_option = "//li[.//div[text()='Sara Ann']]";
    public static String address1 = "//textarea[@id='address']";
    public static String city = "//input[@id='city']";
    public static String state = "//input[@id='state']";
    public static String zip = "//input[@id='zip']";
    public static String country = "//input[@id='country']";
    public static String phone = "//input[@id='phone']";
    public static String website = "//input[@id='website']";
    public static String vat = "//input[@id='vat_number']";
    public static String gst = "//input[@id='gst_number']";
    public static String client_group = "//label[@for='groups' and text()='Client groups']/following-sibling::div[@class='col-md-9']//div[contains(@class,'select2-container-multi')]/ul[@class='select2-choices']";
    public static String group = "//li[contains(@class,'select2-result') and div[text()='VIP']]";
    public static String currency = "//div[@id='s2id_currency']";
    public static String currency_option = "//li[contains(@class,'select2-result') and div='ALL']";
    public static String currency_symbol = "//input[@id='currency_symbol']";
    public static String labels = "//div[@id='s2id_client_labels']";
    public static String labels_option = "//li[contains(@class,'select2-result') and div='Unsatisfied']";
    public static String check_box = "//input[@id='disable_online_payment']";
    public static String Save1 = "//button[@type='submit']";
}
