package TH_Form.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormUI {
    private static WebElement element = null;
    WebDriver driver;
    public FormUI(WebDriver driver){

        this.driver=driver;
    }
    //Web locator
    public static String xpathUserName="//input[@id='userName']";
    public static String xpathEmail="//input[@id='userEmail']";
    public static String xpathAddress="//textarea[@id='currentAddress']";
    public static String xpathPermaentAddress="//textarea[@id='permanentAddress']";
    public static String xpathSubmit="//button[@id='submit']";

}
