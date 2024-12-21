package packagemaven.Project_Maven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITestListners_Main implements ITestListener {

	static WebDriver driver;
	
	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		
		 TakesScreenshot t1= (TakesScreenshot) driver;
		 File Source= t1.getScreenshotAs(OutputType.FILE);
		 File destinantion = new File("D:\\Eclipse 2024\\Project_Maven\\ScreenShots_maven\\pass\\avinash.png");
		 try {
			FileHandler.copy(Source, destinantion);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 Reporter.log("The test cases has been passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("The test cases has been failed");
		
		TakesScreenshot t1= (TakesScreenshot) driver;
		 File Source= t1.getScreenshotAs(OutputType.FILE);
		 File destinantion = new File("D:\\Eclipse 2024\\Project_Maven\\ScreenShots_maven\\fail\\pooja.png");
		 try {
			FileHandler.copy(Source, destinantion);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
