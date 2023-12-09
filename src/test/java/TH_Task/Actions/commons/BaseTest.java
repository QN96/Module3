package TH_Task.Actions.commons;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//Chứa những hàm dùng chung dành cho TestCases
public class BaseTest {
    private static WebDriver driver;
    private String projectPath = System.getProperty("user.dir") + "/";


    //Hàm này để tùy chọn Browser. Cho chạy trước khi gọi class này (BeforeClass)
    private void setDriver(String browserType, String appURL) {
        // từ selenium 4. trở lên thì ko support Opera
        switch (browserType) {
            case "chrome":
                //driver = initChromeDriverWebDriverManager(appURL);
                driver = initChromeDriverExe(appURL);
                break;
            case "firefox":
                //driver = initFirefoxDriverWebDriverManager(appURL);
                driver = initFirefoxDriverExe(appURL);
                break;
//            case "edge":
//                //driver = initEdgeDriverWebDriverManager(appURL);
//                driver = initEdgeDriverExe(appURL);
//                break;
            default:
                System.out.println("Browser: " + browserType + " is invalid, Launching Chrome as browser of choice...");
                driver = initChromeDriverWebDriverManager(appURL);
                //Nếu không dùng switch thì dùng if. equalsIgnoreCase không phân biệt hoa thường
                //if (browserType.equalsIgnoreCase("chrome"))  {}
        }
    }

      public static WebDriver getDriver() {
          return driver;
      }

    //Khởi tạo cấu hình của các Browser để đưa vào Switch Case
    //Dùng WebDriverManager
    private WebDriver initChromeDriverWebDriverManager(String appURL) {
        System.out.println("Launching Chrome browser...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    private WebDriver initFirefoxDriverWebDriverManager(String appURL) {
        System.out.println("Launching Firefox browser...");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
    private WebDriver initEdgeDriverWebDriverManager(String appURL) {
        System.out.println("Launching Edge browser...");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
    //Or Dùng driver.exe
    private WebDriver initChromeDriverExe(String appURL) {
        System.out.println("Launching Chrome browser...");
        System.setProperty("webdriver.chrome.driver",projectPath + "src/test/java/TH_Task/Resource/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    private WebDriver initFirefoxDriverExe(String appURL) {
        System.out.println("Launching Firefox browser...");
        System.setProperty("webdriver.gecko.driver",projectPath + "src/test/java/TH_Task/Resource/geckodriver");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
//    private WebDriver initEdgeDriverExe(String appURL) {
//        System.out.println("Launching Edge browser...");
//        System.setProperty("webdriver.edge.driver",projectPath + "src/test/java/TH_Task/Resources/msedgedriver.exe");
//        driver=new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get(appURL);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        return driver;
//    }

    // Chạy hàm initializeTestBaseSetup trước hết khi class này được gọi
    @Parameters({"browserType","appURL"})
    @BeforeClass
    public void initializeTestBaseSetup(String browserType, String appURL) {
        try {
            // Khởi tạo driver và browser bằng WebDriverManager
            setDriver(browserType, appURL);
        } catch (Exception e) {
            System.out.println("Error..." + e.getStackTrace());
        }
    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
