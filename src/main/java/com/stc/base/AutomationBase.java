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
     * Method to start Browser session with Edge as the first priority, then Firefox
     * 
     * @author Anish
     * @since 03/October/2023
     * @param browserName
     * @return
     * @throws IOException
     */
    public WebDriver startBrowserSession(String browserName) throws IOException {
        System.out.println("Launching browser: " + browserName);

        if (browserName.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--disable-gpu", "--no-sandbox", "--disable-dev-shm-usage", "--guest");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);

        } else {
            System.out.println("Unsupported browser: " + browserName);
            return null; // Return null if browser is unsupported
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
