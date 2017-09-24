package logintest;
//////////// must be defined on testng.xml file ////////////////////
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.testng.ITestContext;

import org.testng.ITestListener;

import org.testng.ITestResult;


/**
 *
 * @author python27
 */
public class TestListener1 implements ITestListener{
    

    @Override

    public void onStart(ITestContext arg0) {

         System.out.println("Start Of Execution(TEST)->"+arg0.getName());

    }

    @Override

    public void onTestStart(ITestResult arg0) {

        System.out.println("Test Started->"+arg0.getName());

    }

    @Override

    public void onTestSuccess(ITestResult arg0) {

        System.out.println("Test Pass->"+arg0.getTestName());

    }

    @Override

    public void onTestFailure(ITestResult arg0) {

        System.out.println("Test Failed->"+arg0.getTestName());

    }

    @Override

    public void onTestSkipped(ITestResult arg0) {

        System.out.println("Test Skipped->"+arg0.getTestName());

    }

    @Override

    public void onFinish(ITestContext arg0) {

System.out.println("END Of Execution(TEST)->"+arg0.getName());

    }

    @Override

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

        // TODO Auto-generated method stub

        

    }

    

}
