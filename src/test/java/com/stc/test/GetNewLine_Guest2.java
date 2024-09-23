package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.stc.keywords.Keywords;
import com.stc.pages.GetNewLinePage;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.runner.TestRunner;
import io.qameta.allure.Description;

public class GetNewLine_Guest2 extends TestRunner{

	@Test(priority=1)
	@Description("Mobile -> Postpaid: Verify that the guest user is able to create an order for Mobile Postpaid.")
	public void SC_20_Guest_Mobile_PostPaidScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		GetNewLinePage newLine = new GetNewLinePage(driver);
    	home.waitForPageLoad();
    	newLine.setGetNewLine();
    	newLine.browserRefresh();
    	newLine.setMobPostPaid();
    	newLine.setAlwaysOn();
  //  	newLine.setYouthPlanTab();
    	newLine.setConfirmPlan();
    	newLine.setPurple();
    	newLine.setSimOnlyPlan();
    	newLine.setCustomizeRequest();
    	newLine.setExistCustomer();
    //	newLine.setAlreadyCustomer();
    	ArrayList<String> data = new Keywords().getData("GetALineLogin");
		login.GetALineLogin(data.get(1).toString(), data.get(2).toString());
		newLine.setPACINumber();
    	newLine.setAddressDetails();
    	///
    	newLine.setDeliveryTime();
    	newLine.setContactDetail();
    	newLine.setPackage();
    	newLine.setMakePayment();
    	Thread.sleep(5000);
	

	}

}
