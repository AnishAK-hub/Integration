package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.stc.keywords.Keywords;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayDashboardPage;
import com.stc.pages.QuickPayPage;
import com.stc.runner.TestRunner;

import io.qameta.allure.Description;

public class guestTest extends TestRunner{

	@Test(priority=2)
	@Description("Verify that the STC user is able to proceed with payment in Quick Pay.")
	public void SC_12_QuickPayScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		QuickPayPage quickPay = new QuickPayPage(driver);
		QuickPayDashboardPage quickPayOne = new QuickPayDashboardPage(driver);

		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
		home.waitForPageLoad();
		home.ArabicTransulate();
		home.waitForPageLoad();
		ArrayList<String> QuicPayData = new Keywords().getData("QuickPayOne");
		home.setQuicPay(QuicPayData.get(1).toString());
		home.setProceed();
		quickPayOne.setChangeGuest("2");
		quickPayOne.SetContinueSibling();
/*
	//	quickPay.setEdit();
		ArrayList<String> EnterValue = new Keywords().getData("CustomAmount");
	//	quickPay.setEnterValue(EnterValue.get(1).toString());
		quickPay.setAddAnotherNumber();
		ArrayList<String> QuicPayTwoData = new Keywords().getData("QuickPayTwo");
		quickPay.setNumber(QuicPayTwoData.get(1).toString());
		quickPayOne.setChangeTwo("4");
		//	quickPay.setEditTwo();
		quickPay.setEnterValue(EnterValue.get(1).toString());
		quickPayOne.SetContinueSibling();
	*/
		quickPay.setConfirm();
		quickPay.viewPaymentMerchantPage();
	
	}
  @Test(priority=3)
	@Description("Verify that the STC user is able to add a card and continue payment in Quick Pay.")
	public void SC_13_AddCardScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		QuickPayPage quickPay = new QuickPayPage(driver);
		QuickPayDashboardPage quickPayOne = new QuickPayDashboardPage(driver);

		LoginPage login = new LoginPage(driver);
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
		home.waitForPageLoad();
		ArrayList<String> QuicPayData = new Keywords().getData("QuickPayOne");
		home.setQuicPay(QuicPayData.get(1).toString());
		home.setProceed();
	//	quickPay.setEdit();
		quickPayOne.setChangeGuest("2");
		quickPayOne.SetContinueSibling();
		ArrayList<String> EnterValue = new Keywords().getData("CustomAmount");
	//	quickPay.setEnterValue(EnterValue.get(1).toString());
	//	quickPay.setContinueOne();
		quickPay.setUseAnotherCard();
		quickPay.setCardDetails("2223000048410010", "Test", "10/26", "333");
		quickPay.setConfirm();
		Thread.sleep(5000);
	 	ArrayList<String> data = new Keywords().getData("PostPaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());

	}
	
	@Test(priority=1)
	@Description("User should be redirected to the estore Screen.")
	public void eStore() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.waitForPageLoad();
		home.setEStore();
	}

}
