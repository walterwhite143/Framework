package com.automation.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest implements ITestListener{
	  

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method
		System.out.println("suite execution is completed ");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("suite execution is started ");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-gene
		
	}
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("testcase is failed so taking screenshot" +arg0.getTestName());
		
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		 
		// TODO Auto-generated method stub
		System.out.println("testcase is skipped "+arg0.getName());
		
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase execution is started "+arg0.getName());
		
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase is passed "+arg0.getName());
		
	}

}
