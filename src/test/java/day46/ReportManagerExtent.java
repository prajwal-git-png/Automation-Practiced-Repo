package day46;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportManagerExtent implements ITestListener {

    private ExtentReports extent;

    // Initialize ExtentReports once when the suite starts
    @Override
    public void onStart(ITestContext context) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport_" + timestamp + ".html";

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functional Test Report");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // System info
        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Host Name", "localhost");
        extent.setSystemInfo("Tester Name", "Prajwal");
        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser Name", "Chrome");
    }

    // Create a new ExtentTest for each test method
    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        // Store ExtentTest in ITestResult so we can use it in success/failure/skip
        result.setAttribute("extentTest", test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = (ExtentTest) result.getAttribute("extentTest");
        test.log(Status.PASS, "Test case PASSED: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = (ExtentTest) result.getAttribute("extentTest");
        test.log(Status.FAIL, "Test case FAILED: " + result.getMethod().getMethodName());
        test.log(Status.FAIL, "Cause: " + result.getThrowable());

        // Optional: take screenshot and attach here if needed
        // String screenshotPath = takeScreenshot(result.getMethod().getMethodName());
        // test.addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest test = (ExtentTest) result.getAttribute("extentTest");
        test.log(Status.SKIP, "Test case SKIPPED: " + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush(); // Save the report
        }
    }

    // Optional: you can implement onTestFailedButWithinSuccessPercentage if needed
}
