package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameters;
import com.stc.keywords.Keywords;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayPage;
import com.stc.pages.SelfCardPage;
import com.stc.runner.TestRunner;

import io.qameta.allure.Description;

public class DashboardTest extends TestRunner{

//	@BeforeClass
//    @Parameters({"browserName"})
//    public void setUp(@Optional("chrome") String browserName) {
//        // Initialize the driver and other setup tasks
//        driver = initializeDriver(browserName); // Example method to initialize WebDriver with the browserName
//    }

///	@Test(priority=1)
	@Description("Users should be able to pay outstanding, billed, or custom amounts.")
	public void SC_01_PayAdvanceScenario() throws InterruptedException, IOException {
		HomePage home = new HomePage(driver);
		QuickPayPage quickPay = new QuickPayPage(driver);
		SelfCardPage selfcare =  new SelfCardPage(driver);
		LoginPage login = new LoginPage(driver);
		ArrayList<String> HomeUrlData = new Keywords().getData("HomeUrl");
		home.HomeUrl(HomeUrlData.get(1).toString());
    	home.waitForPageLoad();
    	ArrayList<String> data = new Keywords().getData("PostPaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());
		System.out.println("Custom Pay");
		ArrayList<String> SelfCarePayUrlData = new Keywords().getData("SelfCarePayUrl");
		home.SelfCarePayUrl(SelfCarePayUrlData.get(1).toString());
    	selfcare.setPay();
    	selfcare.setPayBill();
    	ArrayList<String> CustomPayData = new Keywords().getData("CustomAmount");
    	selfcare.setCustomPay(CustomPayData.get(1).toString());
    	selfcare.setContinue();    	
    	quickPay.setConfirm();
    	quickPay.viewPaymentMerchantPage();
    	System.out.println("Add Another Card");
		home.SelfCarePayUrl(SelfCarePayUrlData.get(1).toString());
    	selfcare.setPay();
    	selfcare.setPayBill();
    	selfcare.setCustomPay(CustomPayData.get(1).toString());
    	selfcare.setContinue();
    	quickPay.setUseAnotherCard();
    //	ArrayList<String> CardDetailsData = new Keywords().getData("CardDetails");
    //	quickPay.setCardDetailsDashboard(CardDetailsData.get(1).toString(), CustomPayData.get(2).toString(), CustomPayData.get(3).toString(), CustomPayData.get(4).toString());
		quickPay.setCardDetailsDashboard("2223000048410010", "Test", "10/26", "333");
    	quickPay.setConfirm();
    	Thread.sleep(10000); 	
    	//quickPay.viewPaymentMerchantPage();
    	/*
		System.out.println("OutStanding Pay");
		home.SelfCarePayUrl(SelfCarePayUrlData.get(1).toString());
		selfcare.setPay();
    	selfcare.setPayBill();
    	selfcare.setOutStandingPay();
    	selfcare.setContinue();
    	quickPay.setConfirm();
    	quickPay.viewPaymentMerchantPage();
    	System.out.println("Billed Pay");
		home.SelfCarePayUrl(SelfCarePayUrlData.get(1).toString());
    	selfcare.setPay();
    	selfcare.setPayBill();
    	selfcare.setBilledPay();
    	selfcare.setContinue();
    	quickPay.setConfirm();
    	quickPay.viewPaymentMerchantPage();
    	*/

	}

}
