package TT_CreateClient.Actions.pageObject;


import TT_CreateClient.Actions.commons.BasePage;
import org.openqa.selenium.WebDriver;
import TT_CreateClient.Interfaces.LoginPageUI;

public class LoginPage {

    WebDriver driver;
    private static BasePage basePage=new BasePage();
    //PageActions
    public static void Login(WebDriver driver , String username, String password) {
        basePage.sendKeyToElement(driver,LoginPageUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,LoginPageUI.xpathPassword,password);
        basePage.clickToElement(driver,LoginPageUI.xpathLoginButton);

    }

}

