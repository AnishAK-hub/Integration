package com.stc.runner;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.stc.base.AutomationBase;
import com.stc.keywords.Keywords;

//@Listeners(AutomationReports.class)

public class TestRunner extends AutomationBase {

	 @BeforeClass
	    @Parameters({"browserName"})
	    public void setUp(@Optional("chrome") String browserName) throws IOException {
	        startBrowserSession(browserName);
	        String applicationUrl = new Keywords().getPropertyValue("Config", "applicationurl");
	        new Keywords().loadUrl(driver, applicationUrl);
	    }

}
