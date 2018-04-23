// We are going to create a Utility that will help to  capture a screen shot  . When a test case fails, find out when it is failing.   //step 4
/*What are listeners? Listeners are somebody who are going to listen whatever we say. Likewise, Listeners are nothing but your interfacers
whihc contains methods . OR listeners are somthing which is going to listen to you on any particular condition.*/
package com.craftsvilla.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
/*import org.apache.commons.io.FilenameUtils;*/
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String name = result.getMethod().getMethodName();
		EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver); //it is going to trigger some events based on our usage.
		File src = event.getScreenshotAs(OutputType.FILE);                                     //driver is refering to basetest
		try
		{
			FileUtils.copyFile(src, new File("./Screenshots/" +name+ ".png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	

}