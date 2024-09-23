package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.stc.keywords.Keywords;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayDashboardPage;
import com.stc.runner.TestRunner;
import io.qameta.allure.Description;

public class HomePayTest extends TestRunner {

	@Test(priority = 1)
	@Description("Verify that the STC user is able to proceed with payment in the Postpaid section.")
	public void LoginUser_PostPaid_Pay() throws InterruptedException, IOException {
		QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
		QuickPayDashboardPage quickPayOne = new QuickPayDashboardPage(driver);
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
	 	ArrayList<String> data = new Keywords().getData("PostPaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
		home.waitForUserPage();
		ArrayList<String> QuicPayData = new Keywords().getData("PostPaidLogin");
		home.setQuicPay(QuicPayData.get(1).toString());
		home.setProceed();
		///
		quickPayOne.setChangeGuest("2");
		quickPayOne.SetContinueSibling();
		///
		///
	//	quickPay.setEditSaveOne();
	//	quickPay.setEditContinue();
		///
	//	quickPay.setContinueText();
		quickPay.setConfirm();
		quickPay.viewPaymentMerchantPage();
		driver.navigate().back();
	}
//	@Test(priority = 2)
	@Description("Verify that the STC user is able to proceed with payment in the Multi Line Postpaid section.")
	public void LoginUser_MultiLine_Pospaid_pay() throws InterruptedException, IOException {
		QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
		HomePage home = new HomePage(driver);
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
		home.waitForUserPage();
		ArrayList<String> QuicPayData = new Keywords().getData("PostPaidNumberTwo");
		home.setQuicPay(QuicPayData.get(1).toString());
		home.setProceed();		
		quickPay.setAddAnotherNumber();
		ArrayList<String> QuicPayTwoData = new Keywords().getData("QuickPayOne");
		quickPay.setAddNumber(QuicPayTwoData.get(1).toString());
		quickPay.setEditSave();
		quickPay.setEditContinue();
		quickPay.setConfirm();
		quickPay.viewPaymentMerchantPage();
		driver.navigate().back();
	}

	@Test(priority = 3)
	@Description("Verify that the STC user is able to add a card and continue payment.")
	public void AddCard_Pay() throws InterruptedException, IOException {
				QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
				HomePage home = new HomePage(driver);
				QuickPayDashboardPage quickPayOne = new QuickPayDashboardPage(driver);
				ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
				home.HomeUrl(HomeUrlData.get(1).toString());
				home.waitForUserPage();
				ArrayList<String> setQuicPayData = new Keywords().getData("PostPaidNumberTwo");
				home.setQuicPay(setQuicPayData.get(1).toString());
				home.setProceed();	
				///
				quickPayOne.setChangeGuest("2");
				quickPayOne.SetContinueSibling();
				///
		//		quickPay.setEditSaveOne();
		//		quickPay.setEditContinue();
				///
				quickPay.setUseAnotherCard();
				quickPay.setCardDetails("2223000048410010", "Test", "10/26", "333");
				quickPay.setConfirm();
			//	quickPay.viewPaymentMerchantPage();
	}
	
}
