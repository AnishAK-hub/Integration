package com.STCWeb.reporting;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.stc.base.AutomationBase;
import io.qameta.allure.Allure;

public class AutomationReports extends AutomationBase implements ITestListener {

	public ExtentReports extent;
	public ExtentTest test;
	public ExtentSparkReporter spark;
	 //String reportPath;
	String reportPath = System.getProperty("user.dir") + "/Reports/";

	/**
	 * onTestStart() - Allows you to perform actions or setup activities before a
	 * specific test method is executed.
	 * 
	 * @author Anish
	 * @since 14/April/2024
	 */

	@Override
	public void onTestStart(ITestResult result) {
		try {
			System.out.println("onTestStart");
			test = extent.createTest(result.getName());
			test.log(Status.INFO, "Test started: " + result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * onTestSuccess() - Called when a test method successfully passes.
	 * 
	 * @author Anish
	 * @since 14/April/2024
	 */
	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			test.log(Status.PASS, "Test passed: " + result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * onTestFailure() - Called when a test method fails and provides information
	 * about the failure, including the exception that caused it. It can be used for
	 * logging failure details and capturing screenshots.
	 * 
	 * @author Anish
	 * @since 14/April/2024
	 */

	 @Override
	public void onTestFailure(ITestResult result) {
		try {
			if (driver != null) {

				Date d = new Date();
				String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
				File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File destinationFile = new File("./screenshot/" + "error_" + fileName);
				FileUtils.copyFile(pageScreenshot, destinationFile.getAbsoluteFile());

				InputStream is = new FileInputStream(destinationFile);
				Allure.addAttachment("Screenshot", is);
				/*
				// Attach the screenshot
				test.log(Status.FAIL, "Test failed: " + result.getName());
				test.log(Status.FAIL, "Failure Details: " + result.getThrowable());
				test.addScreenCaptureFromPath(destinationFile.getAbsolutePath(), result.getName());
				// test.fail("Failure screenshot:",
				// MediaEntityBuilder.createScreenCaptureFromPath("./screenshot/" + "error_" +
				// fileName).build());
				 */
			} else {
				System.err.println("WebDriver is null.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * onTestSkipped() - Called when a test method is skipped and provides
	 * information about skipped tests.
	 * 
	 * @author Anish
	 * @since 14/April/2024
	 */

	@Override
	public void onTestSkipped(ITestResult result) {
		try {
			test.log(Status.SKIP, "Test Skipped: " + result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * onStart() - Called before any test methods are run at the start of a test
	 * suite. It allows you to perform setup actions that apply to the entire test
	 * suite, such as initializing resources or setting up the environment.
	 * 
	 * @author Anish
	 * @since 14/April/2024
	 */
	@Override
	public void onStart(ITestContext context) {

		try {
			spark = new ExtentSparkReporter(reportPath);

			spark.config().setEncoding("utf-8");
			spark.config().setDocumentTitle("Automation Reports - STC Web");
			spark.config().setReportName("STC Web Test Results");
			spark.config().setTheme(Theme.STANDARD);

			extent = new ExtentReports();
			extent.attachReporter(spark);

			extent.setSystemInfo("Automation", "AnishKumar V");
			extent.setSystemInfo("Company", "STC");
			extent.setSystemInfo("Build", "Web");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * onFinish() - Called after all test methods in a test suite have finished
	 * executing. It is used for closing resources, generating test reports, or
	 * finalizing test results.
	 * 
	 * @author Anish
	 * @since 14/April/2024
	 */
	@Override
	public void onFinish(ITestContext context) {
		try {

			extent.flush();
			/// Report TimeStamp
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
			Date date = new Date();
			String filePathdate = dateFormat.format(date).toString();
			String actualReportPath = reportPath + "index.html";
			new File(actualReportPath).renameTo(new File(
					System.getProperty("user.dir") + "/Reports/" + "Automation_Report_" + filePathdate + ".html"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
