package TH_Form.Actions.pageObject;


import TH_Form.Actions.commons.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import TH_Form.Interfaces.FormUI;

public class FormPage {

    WebDriver driver;
    private static BasePage basePage=new BasePage();
    //PageActions
    public static void Form(WebDriver driver , String username, String email, String address, String perAdd) {
        basePage.sendKeyToElement(driver,FormUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,FormUI.xpathEmail,email);
        basePage.sendKeyToElement(driver,FormUI.xpathAddress,address);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        basePage.sendKeyToElement(driver,FormUI.xpathPermaentAddress,perAdd);
        basePage.clickToElement(driver,FormUI.xpathSubmit);
    }

}

