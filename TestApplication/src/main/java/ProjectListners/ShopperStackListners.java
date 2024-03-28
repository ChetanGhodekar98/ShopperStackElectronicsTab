package ProjectListners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ShopperStackListners extends TakeScreenShotOnFailure implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("EXECUATION STARTED-> "+result.getName(),true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("EXECUATION DONE SUCCESSFULLY-> "+result.getName(),true);
	}

	
	public void onTestFailure(ITestResult result) {
		Reporter.log("EXECUATION FAILED! "+result.getName(),true);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("EXECUTION SKIPPED ! "+result.getName(),true);
	}
	
	

}
