package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.stc.keywords.Keywords;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayDashboardPage;
import com.stc.pages.SelfCardPage;
import com.stc.runner.TestRunner;

import io.qameta.allure.Description;

public class PayTest extends TestRunner {

@Test(priority = 1)
	@Description("Verify that the STC user is able to proceed with payment in the Single Line Postpaid section.")
	public void SC_04_SingleLine_PostPaid_Pay_Scenario() throws InterruptedException, IOException {
		QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
		SelfCardPage selfcare = new SelfCardPage(driver);
		LoginPage login = new LoginPage(driver);
		ArrayList<String> data = new Keywords().getData("PostPaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());
		selfcare.setUnlock();
		selfcare.setPay();
		selfcare.setQuickPay();
		ArrayList<String> QuicPayData = new Keywords().getData("PostPaidNumberTwo");
		quickPay.setEnterNumber(QuicPayData.get(1).toString());
		quickPay.setContinueText();
		
		quickPay.setChange("2");
		quickPay.SetContinueTextAll();
		////
	//	quickPay.setEditSaveOne();
	//	quickPay.setEditContinue();
		////
		quickPay.setConfirm();
		quickPay.viewPaymentMerchantPage();
		driver.navigate().back();
	}

//	@Test(priority = 2)
	@Description("Verify that the STC user is able to proceed with payment in the Multi Line Postpaid section.")
	public void SC_05_MultiLine_Pospaid_pay() throws InterruptedException, IOException {
		QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
		SelfCardPage selfcare = new SelfCardPage(driver);
		
		selfcare.setPay();
		selfcare.setQuickPay();
		ArrayList<String> QuicPayData = new Keywords().getData("PostPaidNumberTwo");
		quickPay.setEnterNumber(QuicPayData.get(1).toString());
		quickPay.setContinueText();
		quickPay.setChange("2");
		quickPay.setAddAnotherNumber();
		ArrayList<String> QuicPayTwoData = new Keywords().getData("QuickPayOne");
		quickPay.setAddNumber(QuicPayTwoData.get(1).toString());
//Change two
		quickPay.setChangeTwo("4");
		quickPay.SetContinueTextAll();
	//	quickPay.setEditSave();
	//	quickPay.setEditContinue();
		quickPay.setConfirm();
		quickPay.viewPaymentMerchantPage();
		driver.navigate().back();
	}

@Test(priority = 3)
	public void SC_06_AddCard_Pay() throws InterruptedException, IOException {
		QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
		SelfCardPage selfcare = new SelfCardPage(driver);
		HomePage home = new HomePage(driver);
		ArrayList<String> SelfCareUrlData = new Keywords().getData("SelfCareUrl");
		home.SelfCareUrl(SelfCareUrlData.get(1).toString());
		selfcare.setPay();
		selfcare.setQuickPay();
		ArrayList<String> QuicPayData = new Keywords().getData("PostPaidNumberTwo");
		quickPay.setEnterNumber(QuicPayData.get(1).toString());
		quickPay.setContinueText();
		quickPay.setChange("2");
		quickPay.SetContinueTextAll();
	//	quickPay.setEditContinue();
		quickPay.setUseAnotherCard();
		quickPay.setCardDetailsDashboard("2223000048410010", "Test", "10/26", "333");
		quickPay.setConfirm();
		Thread.sleep(5000);
		// quickPay.viewPaymentMerchantPage();
	}

}
