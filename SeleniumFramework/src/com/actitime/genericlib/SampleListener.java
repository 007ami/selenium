package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener{
	
	public void onTestFailure(ITestResult t){
		String fTestName = t.getMethod().getMethodName();
		System.out.println("===Failed Test===>" +fTestName);
		EventFiringWebDriver edriver= new EventFiringWebDriver(BaseClass.driver);
		
		File srcFile= edriver.getScreenshotAs(OutputType.FILE);
		
		File DstFile = new File("./screenshot/" +fTestName+ ".png");
		
		try {
			FileUtils.copyFile(srcFile, DstFile);
		} catch (IOException e) {
			
			
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
