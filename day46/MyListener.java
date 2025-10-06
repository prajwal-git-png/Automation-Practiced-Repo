package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyListener implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("On start..");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("On test started..");

    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("On test success..");

    }

    public void onTestFailure(ITestResult result) {
        System.out.println("On test fail..");

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("OnTest skipped..");

    }

    public  void onFinish(ITestContext context) {

        System.out.println("All test completed..");
    }

}
