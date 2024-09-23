package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.stc.keywords.Keywords;
import com.stc.pages.BaityPage;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayDashboardPage;
import com.stc.runner.TestRunner;
import io.qameta.allure.Description;

public class BaityTest extends TestRunner {

	@Description("Users should be able to log in to Baity, upgrade their plan, and continue with the payment.")
	public void Baity_UpgradePlan() throws InterruptedException, IOException {
				QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
				BaityPage baity = new BaityPage(driver);
				LoginPage login = new LoginPage(driver);
				ArrayList<String> data = new Keywords().getData("BaityLogin");
				login.BaityLogin(data.get(1).toString(), data.get(2).toString());
				baity.setUpgradePlan();
				baity.setKD();
				baity.setContinue();
				baity.setConfirm();
				quickPay.viewPaymentMerchantPage();		
	}
	
	@Test(priority = 1)
	public void Baity_Login() throws InterruptedException, IOException {
		BaityPage baity = new BaityPage(driver);
		LoginPage login = new LoginPage(driver);
		ArrayList<String> data = new Keywords().getData("BaityLogin");
		login.BaityLogin(data.get(1).toString(), data.get(2).toString());
		baity.BaityPage();

}

}
