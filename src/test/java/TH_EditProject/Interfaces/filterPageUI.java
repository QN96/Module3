package TH_EditProject.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class filterPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public filterPageUI(WebDriver driver) {

        this.driver = driver;
    }
    public static String plus_button = "//button[@class='btn btn-default show-filter-form-button']";

    public static String status_button = "//button[normalize-space()='Status']";
    public static String status_option(String status){
        return String.format("//li[normalize-space()='%s']",status);
    }
    public static String print = "//button[@class='btn btn-default buttons-print']";
    public static String export = "//button[@class='btn btn-default buttons-excel buttons-html5']";



}
