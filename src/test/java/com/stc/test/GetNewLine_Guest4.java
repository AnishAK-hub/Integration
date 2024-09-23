package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.stc.keywords.Keywords;
import com.stc.pages.GetNewLinePage;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayPage;
import com.stc.runner.TestRunner;

import io.qameta.allure.Description;

public class GetNewLine_Guest4 extends TestRunner{

	@Test(priority=1)
	@Description("Internet -> Postpaid: Verify that the guest user is able to create an order for Internet Postpaid.")
	public void SC_20_Guest_Internet_PostpaidScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		GetNewLinePage newLine = new GetNewLinePage(driver);
    	home.waitForPageLoad();
    	newLine.setGetNewLine();
    	newLine.browserRefresh();
    	newLine.setIntPostPaid();
    	newLine.setKD();
    	newLine.setConfirmPlan();
    	Thread.sleep(2000);
    	newLine.setPurple();
    	newLine.setSimOnlyPlan();
    	newLine.setCustomizeRequest();
    	newLine.setCheckOutTwo();
    	ArrayList<String> data = new Keywords().getData("PostPaidLogin");
    	SignIn(data.get(1).toString(), data.get(2).toString());
		
    	newLine.setPACINumber();
    	newLine.setAddressDetails();
    //	newLine.setCheckOutThree();
		newLine.setDeliveryTime();
		newLine.setContactDetail();
		newLine.setPackage();
		newLine.setMakePayment();
		Thread.sleep(10000);
		
	}
	private void SignIn(String username, String password) throws InterruptedException, IOException {
		QuickPayPage quickPay = new QuickPayPage(driver);
		LoginPage login = new LoginPage(driver);
		login.setPhoneTextTwo(username);
		quickPay.setContinueTextTwo();
		login.setPasswordText(password);
		quickPay.setLoginContinueTextThree();
		
	}
	

}
