package com.stc.keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Keywords {

	WebElement element;

	/**
	 * Methods for selectOptionByVisibleText() - This action is typically used when
	 * dealing with dropdown/select elements on a web page. It allows you to select
	 * an option from the dropdown based on its visible text.
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param locator
	 * @param text
	 */

	public void selectOptionByVisibleText(WebDriver driver, By locator, String text) {
		try {
			element = driver.findElement(locator);
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Methods for clickElement() - This action simulates a click on a web page
	 * element, such as a button, link, or checkbox. It's commonly used to interact
	 * with various UI elements.
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param locator
	 */

	public void clickElement(WebDriver driver, By locator) {
		try {
			element = driver.findElement(locator);
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Methods for sendKeysToElement() - This method to send a sequence of
	 * characters (text) to that element. The text parameter should contain the text
	 * you want to enter into the input field.
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param locator
	 * @param text
	 */

	public void sendKeysToElement(WebDriver driver, By locator, String text) {
		try {
			element = driver.findElement(locator);
			element.sendKeys(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Methods for waitForElementVisible() - This condition is used with explicit
	 * waits used to pause the execution of your script until a certain condition is
	 * met or a specific element becomes available. 
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param locator
	 */

	public void waitForElementVisible(WebDriver driver, By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methods for waitForElementPresence() - This condition is used with explicit
	 * waits in Selenium WebDriver to wait for the presence of a specific element on
	 * a web page before proceeding with further actions.  
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param locator
	 */
	public void waitForElementPresence(WebDriver driver, By locator) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methods for loadUrl() - The 'driver.get(URL)' method is used in Selenium
	 * WebDriver to navigate to a specific URL in a web browser. It instructs the
	 * WebDriver instance to open a new browser window or tab and load the web page
	 * specified by the `URL` parameter.  
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param URL
	 */

	public void loadUrl(WebDriver driver, String URL) {
		try {
			driver.get(URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methods for scroll() - Scrolling is used to interact with elements that are
	 * not immediately visible on the screen. You can scroll a web page vertically
	 * or horizontally to bring specific elements into view.  
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param pixelsToScroll
	 */
	public void scroll(WebDriver driver, int pixelsToScroll) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String script = "window.scrollBy(0," + pixelsToScroll + ");";
			js.executeScript(script);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void scrollUp(WebDriver driver, int pixelsToScroll) {
	    try {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        String script = "window.scrollBy(0,-" + pixelsToScroll + ");";
	        js.executeScript(script);
	    } catch (Exception e) {
	        // Log or report the exception
	        e.printStackTrace();
	    }
	}
	/**
	 * Methods for assertNotEquals() - 'AssertNotEquals; is an assertion method used
	 * in testing to check that two values or objects are not equal. It compares the
	 * actual value with the expected value and fails the test if they are equal.  
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param actual
	 * @param unExpected
	 */
	public void assertNotEquals(String actual, String unExpected) {

		try {
			Assert.assertNotEquals(actual, unExpected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methods for assertEquals() - 'AssertEquals' is an assertion method used in
	 * testing to check that two values or objects are equal. It compares the actual
	 * value with the expected value and fails the test if they are not equal.
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param string
	 * @param unExpected
	 */
	public void assertEquals(String actual, String expected) {

		try {
			Assert.assertEquals(actual, expected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methods for assertTrue() - ‘AssertTrue’ is an assertion method used in
	 * testing to check that a given condition or expression evaluates to 'true'. If
	 * the condition is 'false', the test fails.
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param condition
	 * @param message
	 */
	public void assertTrue(boolean condition, String message) {
		try {
			Assert.assertTrue(condition, message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Methods for assertFalse() - 'AssertFalse' is an assertion method used in
	 * testing to check that a given condition or expression evaluates to 'false'.
	 * If the condition is 'true', the test fails.
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param condition
	 * @param message
	 */
	public void assertFalse(boolean condition, String message) {
		try {
			Assert.assertFalse(condition, message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methods for verifySoftAsserEqual() - It would involve comparing actual and
	 * expected values and handling assertion failures in a way that doesn't stop
	 * the test execution immediately. .
	 * 
	 * @author Anish
	 * @since 04/October/2023
	 * @Modified 09/October/2023
	 * @param driver
	 * @param Actual
	 * @param Expected
	 */

	public void verifySoftAssertEqual(String actual, String expected) {
		try {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actual, expected);
			softAssert.assertAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Methods for loadPropertyFile() - This method in your Selenium script to load
	 * your property file and access the properties.
	 * 
	 * @author Anish
	 * @since 09/October/2023
	 * @modified 10/October/2023
	 * @param propertyFileName
	 * @param propertyKey
	 * @throws IOException
	 */
	public String getPropertyValue(String propertyFileName, String propertyKey) throws IOException {
		String propertyValue = null;
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\properties\\" + propertyFileName + ".properties");
			prop.load(fis);
			propertyValue = prop.getProperty(propertyKey);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propertyValue;
	}

	/**
	 * Method for click() - This action simulates a click on a web page by using CSS
	 * or Xpath or ID.
	 * 
	 * @author Anish
	 * @since 10/October/2023
	 * @Modified 11/October/2023
	 * @param locator
	 * @throws IOException
	 */
	public void click(WebDriver driver, String locator) throws IOException {

		try {
			if (locator.endsWith("_ID")) {
				driver.findElement(By.id(getPropertyValue("object_repository", locator))).click();
			} else if (locator.endsWith("_XPATH")) {
				driver.findElement(By.xpath(getPropertyValue("object_repository", locator))).click();
			} else if (locator.endsWith("_CLASSNAME")) {
				driver.findElement(By.className(getPropertyValue("object_repository", locator))).click();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Method for type() - This method to send a sequence of characters (text) to
	 * that element by using CSS or Xpath or ID.
	 * 
	 * @author Anish
	 * @since 10/October/2023
	 * @Modified 11/October/2023
	 * @param locator
	 * @param value
	 * @throws IOException
	 */
	public void type(WebDriver driver, String locator, String value) throws IOException {
		try {
			if (locator.endsWith("_ID")) {
				driver.findElement(By.id(getPropertyValue("object_repository", locator))).sendKeys(value);
			} else if (locator.endsWith("_XPATH")) {
				driver.findElement(By.xpath(getPropertyValue("object_repository", locator))).sendKeys(value);
			} else if (locator.endsWith("_CLASSNAME")) {
				driver.findElement(By.className(getPropertyValue("object_repository", locator))).sendKeys(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method for select() - This action is typically used when dealing with
	 * dropdown/select elements on a web page by using CSS or Xpath or ID.
	 * 
	 * @author Anish
	 * @since 10/October/2023
	 * @Modified 11/October/2023
	 * @param locator
	 * @param value
	 * @throws IOException
	 */
	public void select(WebDriver driver, String locator, String value) throws IOException {

		try {
			if (locator.endsWith("_ID")) {
				element = driver.findElement(By.id(getPropertyValue("object_repository", locator)));
			} else if (locator.endsWith("_XPATH")) {
				element = driver.findElement(By.xpath(getPropertyValue("object_repository", locator)));
			} else if (locator.endsWith("_CLASSNAME")) {
				element = driver.findElement(By.className(getPropertyValue("object_repository", locator)));
			}

			Select select = new Select(element);
			select.selectByVisibleText(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Method for getData() - This method will help retrieve data from the Excel.
	 * 
	 * @author Anish
	 * @since 03/October/2023
	 * @param testcaseName
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String> getData(String testcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\StcTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int coloumn = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						coloumn = k;

					}

					k++;
				}
				System.out.println(coloumn);

				while (rows.hasNext()) {

					Row r = rows.next();

					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {

						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {

								a.add(c.getStringCellValue());
							} else {

								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}
						}
					}

				}

			}
		}
		return a;

	}

	/**
	 * Method for navigateBack() - This method is pressing the browser's back button
	 * 
	 * @author Anish
	 * @since 11/October/2023
	 * @param driver
	 */
	public void navigateBack(WebDriver driver) {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method for navigateForward() - This method is pressing the browser's forward
	 * button
	 * 
	 * @author Anish
	 * @since 11/October/2023
	 * @param driver
	 */
	public void navigateForward(WebDriver driver) {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * getText() method is used to get the text from the locator.
	 * @author Anish
	 * @since 13/October/2023
	 * @param driver
	 * @param element
	 * @return
	 */
	public String getText(WebDriver driver, WebElement element) {
	    try {
	        return element.getText();
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	
	
}
	


