package TH_EditProject.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteProjectPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public DeleteProjectPageUI(WebDriver driver) {

        this.driver = driver;
    }
    public static String delete_button = "(//a[@title='Delete project'])[2]";
    public static String confirm_button = "//button[@id='confirmDeleteButton']";

}
