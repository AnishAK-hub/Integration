package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.stc.keywords.Keywords;
import com.stc.pages.LoginPage;
import com.stc.pages.QitafPage;
import com.stc.pages.SelfCardPage;
import com.stc.runner.TestRunner;

import io.qameta.allure.Description;

public class QitafTest extends TestRunner {

	@Test(priority = 1)
	@Description("User verify the Qitaf page")

	public void SC_14_Qitaf_Scenario() throws InterruptedException, IOException {
		SelfCardPage selfcare = new SelfCardPage(driver);
		QitafPage qitaf = new QitafPage(driver);
		LoginPage login = new LoginPage(driver);
		//PostPaidLoginTwo
        ArrayList<String> data = new Keywords().getData("PostPaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());
		selfcare.setUnlock();
		selfcare.setQitaf();
		qitaf.setQitafUser();
		qitaf.scrollDownOne();
		qitaf.setSTCReward();
		qitaf.setKuwaitAirways();
	}
 //@Test(priority = 2)
	//{Issue=STC reward page are removed}
	public void SC_15_STCRewards() throws InterruptedException {
		QitafPage qitaf = new QitafPage(driver);
		qitaf.setYourRewards();
		qitaf.setSMS();
		qitaf.setQITAFPARTNERS();
		qitaf.setInternet();
		qitaf.setMinutes();
		qitaf.setBilldiscount();
				
	}
	
	@Test(priority = 3)
	@Description("User verify the Partner page")
	public void SC_16_Partners() throws InterruptedException {
		QitafPage qitaf = new QitafPage(driver);
		qitaf.setDiscoverPartner();
		qitaf.setEntertainment();
		qitaf.setTravel();
		qitaf.setFoodAndDrink();
		qitaf.setOnlineServices();
		qitaf.setShoppingRetail();
	}
	
}
