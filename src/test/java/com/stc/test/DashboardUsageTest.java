package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.stc.keywords.Keywords;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayPage;
import com.stc.pages.SelfCardPage;
import com.stc.runner.TestRunner;
import io.qameta.allure.Description;

public class DashboardUsageTest extends TestRunner{

	@Test(priority=1)
	@Description("Verify that users can enter amounts between KD1.5 and KD25.")
	public void SC_02_PrepaidBalanceRecharge() throws InterruptedException, IOException {
		QuickPayPage quickPay = new QuickPayPage(driver);
		SelfCardPage selfcare =  new SelfCardPage(driver);
		LoginPage login = new LoginPage(driver);
		ArrayList<String> data = new Keywords().getData("PrePaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());
    //	selfcare.setUnlock();
    	selfcare.setUsageDashboard();
    	selfcare.setUsage();
  /*
    	selfcare.setRoaming();
    	selfcare.setLocal();
    	selfcare.viewCallAndSMS();
   	*/
    	selfcare.setRecharge();
    	selfcare.setRechargeValue("1.5");
    	selfcare.setConfirm();
    	quickPay.setConfirm();
    	quickPay.viewPaymentMerchantPage();
    	driver.navigate().back();
    	////
   // 	selfcare.setUsage();
    // 	selfcare.setRoaming();
   // 	selfcare.setLocal();
    	////
    	selfcare.setRecharge();
    	selfcare.setRechargeValue("25");
    	selfcare.setConfirm();
    	quickPay.setConfirm();
    	quickPay.viewPaymentMerchantPage();
    	
	}
	
	//@Test(priority=2)
	@Description("User should be able to see the paid bills and transaction Histrory.")
	public void SC_03_myBill() throws InterruptedException, IOException {
		
		SelfCardPage selfcare =  new SelfCardPage(driver);
		HomePage home = new HomePage(driver);
		ArrayList<String> SelfCareUrlData = new Keywords().getData("SelfCareUrl");
		home.SelfCareUrl(SelfCareUrlData.get(1).toString());
		System.out.println("URl loaded");
		selfcare.setMyBill();
		selfcare.setPaidBill();
		selfcare.setAllTranscations();
	}
	
}
