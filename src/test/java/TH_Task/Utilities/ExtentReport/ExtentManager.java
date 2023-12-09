package TH_Task.Utilities.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        //Nơi để xuất report ra
        ExtentSparkReporter reporter = new ExtentSparkReporter("ExtentReport.html");
        //Tên report
        reporter.config().setReportName("OrangeHRM Extent Report");
        extentReports.attachReporter(reporter);
        return extentReports;
    }
    public static void flushExtentReport(){
        extentReports.flush();
    }

}
