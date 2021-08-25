package listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test has started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped"+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test passed partially"+result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		context.getFailedTests();
	}

	@Override
	public void onFinish(ITestContext context) {
		context.getFailedTests();
	}

}
