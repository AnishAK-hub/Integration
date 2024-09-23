package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.stc.keywords.Keywords;
import com.stc.pages.GetNewLinePage;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.SelfCardPage;
import com.stc.runner.TestRunner;

import io.qameta.allure.Description;

public class User_GetNewLineTest extends TestRunner{
	
	@Test(priority=1)
	@Description("Mobile -> Prepaid: Verify that the login user is able to create an order for Mobile Prepaid.")
	public void SC_08_User_Mobile_PrePaidScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		GetNewLinePage newLine = new GetNewLinePage(driver);
		SelfCardPage selfcare = new SelfCardPage(driver);
		LoginPage login = new LoginPage(driver);
		ArrayList<String> data = new Keywords().getData("PostPaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());
		selfcare.setEStore();
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
    	home.waitForUserPage();
    	newLine.setGetNewLine();
    	newLine.setMobPrePaid();
    	newLine.setKD();
    	newLine.setConfirmPlan();
    	Thread.sleep(2000);
    	newLine.setNormalSim();
    	newLine.setContinueShopping();
    	newLine.setPayKD();
    	newLine.setConfirmPayKD();
    	Thread.sleep(5000);    	
    	
	}
	@Test(priority=2)
	@Description("Mobile -> Postpaid: Verify that the login user is able to create an order for Mobile Postpaid.")
	public void SC_09_User_Mobile_PostPaidScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		GetNewLinePage newLine = new GetNewLinePage(driver);	
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
    	home.waitForUserPage();
    	newLine.setGetNewLine();
    	newLine.setMobPostPaid();
    	newLine.setAlwaysOn();
  //  	newLine.setYouthPlanTab();
    	newLine.setConfirmPlan();
    	newLine.setPurple();
    //	newLine.setContinueShopping();
    	newLine.setSimOnlyPlan();
    	newLine.setSelectCollection();
    	newLine.setCustomizeRequest();
    	
    	///
    	newLine.setPACINumber();
    	newLine.setAddressDetails();
    	///
    	newLine.setDeliveryTime();
    	newLine.setContactDetail();
    	newLine.setPackage();
    	newLine.setMakePayment();
    	Thread.sleep(5000);
	}
	
	@Test(priority=3)
	@Description("Internet -> Prepaid: Verify that the login user is able to create an order for Internet Prepaid.")
	public void SC_10_User_Internet_PrePaidScenario() throws InterruptedException, IOException {

		HomePage home = new HomePage(driver);
		GetNewLinePage newLine = new GetNewLinePage(driver);
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
    	home.waitForUserPage();
    	newLine.setGetNewLine();
    	newLine.setIntPrePaid();
    	newLine.setKDOne();
    	newLine.setConfirmPlan();
    	Thread.sleep(2000);
    	newLine.setNormalSim();
    	newLine.setContinueShopping();
    	newLine.setPayKD();
    	newLine.setConfirmPayKD();
    	Thread.sleep(5000);    	
	
	}
	@Test(priority=4)
	@Description("Internet -> Postpaid: Verify that the login user is able to create an order for Internet Postpaid.")
	public void SC_11_User_Internet_PostPaidScenario() throws InterruptedException, IOException{

		HomePage home = new HomePage(driver);
		GetNewLinePage newLine = new GetNewLinePage(driver);
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
    	home.waitForUserPage();
    	newLine.setGetNewLine();
    	newLine.setIntPostPaid();
    	newLine.setInternetKD();
    	newLine.setConfirmPlan();
    	newLine.setPurple();
    	newLine.setSimOnlyPlan();
    	newLine.setSelectCollection();
    	newLine.setCustomizeRequest();
   // 	newLine.setCheckOut();
    	///
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
