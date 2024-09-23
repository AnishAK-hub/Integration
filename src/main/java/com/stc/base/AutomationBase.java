package com.stc.base;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationBase {

    public WebDriver driver;

    /**
     * Method to start Browser session for Edge/Firefox in headless mode (suitable for Jenkins).
     * 
     * @author Anish
     * @since 03/October/2023
     * @param browserName
     * @return WebDriver instance
     * @throws IOException
     */
    public WebDriver startBrowserSession(String browserName) throws IOException {

        System.out.println("Launching browser: " + browserName);

        // Edge Browser Setup
        if (browserName.equalsIgnoreCase("edge") || browserName.equalsIgnoreCase("Edge_headless")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--disable-gpu", "--no-sandbox", "--disable-dev-shm-usage", "--guest");
            if (browserName.equalsIgnoreCase("Edge_headless")) {
                options.addArguments("--headless");  // Enable headless mode for Jenkins
            }
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(options);

        // Firefox Browser Setup
        } else if (browserName.equalsIgnoreCase("firefox") || browserName.equalsIgnoreCase("Firefox_headless")) {
            FirefoxOptions options = new FirefoxOptions();
            if (browserName.equalsIgnoreCase("Firefox_headless")) {
                options.addArguments("--headless");  // Enable headless mode for Jenkins
            }
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);

        } else {
            System.out.println("Unsupported browser: " + browserName);
        }

        // Maximize browser window and set implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    // Tear down method to close browser session after tests
    @AfterClass
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(2000);  // Delay for observation
            driver.quit();
        }
    }
}
