package Module3.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPageUI {
    private static WebElement element = null;
    //menu
    WebDriver driver;

    public ListPageUI(WebDriver driver) {

        this.driver = driver;
    }

        //Web locator
        public static String payment_page = "//a[span[text()='Payments']]";
        public static String Search = "//input[@type='search']";
        public static String detail = "//a[text()='INVOICE #20']";
        public static String tab_payments = "//a[text()='Payments']";
        public static String Search_detail = "//input[@type='search']";
        public static String delete = "//td[text()='Ghi chú 5']/ancestor::tr//a[@class='delete']";
}



