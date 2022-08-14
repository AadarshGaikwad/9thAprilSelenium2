package kiteUTILITY;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
 public void onTestStart(ITestResult result)
 {
	Reporter.log("Tc execution is started"+result.getName(),true);
}
 public void onTestSkipped(ITestResult result) 
 {
	 Reporter.log("Tc execution is skipped"+result.getName(),true);	
}
 public void onTestFailure(ITestResult result) 
 {
	 Reporter.log("Tc execution is failed"+result.getName(),true);
	}
 public void onTestSuccess(ITestResult result)
 {
	 Reporter.log("Tc execution is successful"+result.getName(),true);
	}
}
