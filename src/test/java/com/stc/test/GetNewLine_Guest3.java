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

public class GetNewLine_Guest3 extends TestRunner{

	@Test(priority=1)
	@Description("Internet -> Prepaid: Verify that the guest user is able to create an order for Internet Prepaid.")
	public void SC_20_Guest_Internet_PrepaidScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		GetNewLinePage newLine = new GetNewLinePage(driver);
    	home.waitForPageLoad();
    	newLine.setGetNewLine();
    	newLine.browserRefresh();
    	newLine.setIntPrePaid();
    	newLine.setKDOne();
    	newLine.setConfirmPlan();
    	Thread.sleep(2000);
    	newLine.setNormalSim();
    	newLine.setContinueShopping();
    	newLine.setAlreadyCustomer();
    	ArrayList<String> data = new Keywords().getData("GetALineLogin");
		login.GetALineLogin(data.get(1).toString(), data.get(2).toString());
    	newLine.setPayKD();
    	newLine.setPayKNET();
    	newLine.setConfirmPayKD();
    	Thread.sleep(6000);
	}

}
