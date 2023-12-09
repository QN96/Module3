package TH_Login.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Chứa tất cả actions dưới dạng method đó: click/select/verify/getText
public class LoginPageUI {
    private static WebElement element = null;
    WebDriver driver;
    public LoginPageUI(WebDriver driver){

        this.driver=driver;
    }
    //Web locator
    public static String xpathUserName="//input[@placeholder='Email']";
    public static String xpathPassword="//input[@placeholder='Password']";
    public static String xpathLoginButton="//button[@type='submit']";

}
