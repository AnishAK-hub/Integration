package extentlisteners;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	static String reportPath = System.getProperty("user.dir") + "/Reports/";

	private static ExtentReports extent;
	
		    public static ExtentReports createInstance(String fileName) {
				DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
				Date date = new Date();
				String filePathdate = dateFormat.format(date).toString();
				String actualReportPath = reportPath + "index.html";
				new File(actualReportPath).renameTo(new File(
						System.getProperty("user.dir") + "/reports/" + "Automation_Report_" + filePathdate + ".html"));
		////////////////
//				ExtentReports , ExtentSparkReporter
				String path =System.getProperty("user.dir")+"//reports//index.html";

		    	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(path);

	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Rachana Pathak", "");
	        extent.setSystemInfo("Organization", "STC Kw");
	        extent.setSystemInfo("Application", "STC - Web");
	        return extent;
	    }

	    //
		    public static String screenshotPath;
		    public static String screenshotName;

		    public static void captureScreenshot() throws WebDriverException, SQLException {
		        File scrFile = ((TakesScreenshot) DriverManager.getDriver(reportPath)).getScreenshotAs(OutputType.FILE);

		        // Use a specific date format for the filename
		        String dateFormat = "yyyy-MM-dd_HH-mm-ss";
		        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		        Date d = new Date();
		        screenshotName = sdf.format(d) + ".jpg";

		        // Define the screenshot directory
		        String screenshotDir = System.getProperty("user.dir") + "\\Reports\\";

		        // Ensure the directory exists
		        File dir = new File(screenshotDir);
		        if (!dir.exists()) {
		            dir.mkdirs();
		        }

		        try {
		            // Save the screenshot to the specified directory
		            FileUtils.copyFile(scrFile, new File(screenshotDir + screenshotName));
		        } catch (IOException e) {
		            e.printStackTrace(); // Consider logging this exception
		        }
		    }
		}
	

	
