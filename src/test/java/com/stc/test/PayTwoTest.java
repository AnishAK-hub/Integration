package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.stc.keywords.Keywords;
import com.stc.pages.LoginPage;
import com.stc.pages.QuickPayDashboardPage;
import com.stc.runner.TestRunner;
import io.qameta.allure.Description;

public class PayTwoTest extends TestRunner {

	@Test(priority = 1)
	@Description("Verify that the STC user is able to proceed with payment in the Prepaid section.")
	public void SC_07_Prepaid_Pay() throws InterruptedException, IOException {

				QuickPayDashboardPage quickPay = new QuickPayDashboardPage(driver);
				LoginPage login = new LoginPage(driver);
			 	ArrayList<String> data = new Keywords().getData("PrePaidLogin");
				login.PrePaidLogin(data.get(1).toString(), data.get(2).toString());
				quickPay.setRechargeNow();
				ArrayList<String> CustomAmountData = new Keywords().getData("CustomAmount");
				quickPay.setEnterKD(CustomAmountData.get(1).toString());
				quickPay.setConfirm();
				quickPay.viewPaymentMerchantPage();
	}

}
