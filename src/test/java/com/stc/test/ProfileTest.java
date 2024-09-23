package com.stc.test;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.stc.keywords.Keywords;
import com.stc.pages.HomePage;
import com.stc.pages.LoginPage;
import com.stc.pages.ProfilePage;
import com.stc.pages.SelfCardPage;
import com.stc.runner.TestRunner;
import io.qameta.allure.Description;

public class ProfileTest extends TestRunner {

	@Test(priority = 1)
	@Description("User verify the Profile Page")
	public void SC_17_VerifyProfile() throws InterruptedException, IOException {
		SelfCardPage selfcare = new SelfCardPage(driver);
		ProfilePage profile = new ProfilePage(driver);
		LoginPage login = new LoginPage(driver);
		//PostPaidLoginTwo
		ArrayList<String> data = new Keywords().getData("PostPaidLogin");
		login.PostPaidLogin(data.get(1).toString(), data.get(2).toString());
		selfcare.setUnlock();
		selfcare.setSTCUser();
		selfcare.setViewProfile();
		profile.setAccountDetails();
		profile.setAddress();
		profile.setContactDetails();
	}
	
@Test(priority = 2)
	@Description("User verify the Setting Page")
	public void SC_18_Setting() throws InterruptedException {
		SelfCardPage selfcare = new SelfCardPage(driver);
		ProfilePage profile = new ProfilePage(driver);
		selfcare.setSetting();
		profile.setNumberProperties();
		profile.setUserManagement();
		profile.setqitaf();
	//	profile.setAppearance();
		profile.setPaymentMethods();
		profile.setAutoPay();
		profile.setRefundRequests();
	}
	
	//@Test(priority = 3)
	@Description("Qitaf Page")
	//{Qitaf Pooling will be available for particular number}
	public void Qitaf() throws InterruptedException, IOException {
		ProfilePage profile = new ProfilePage(driver);
		HomePage home = new HomePage(driver);	
		ArrayList<String> SelfCareSettingUrlData = new Keywords().getData("SelfCareSettingUrl");
		home.SelfCareSettingUrl(SelfCareSettingUrlData.get(1).toString());
		profile.setqitaf();
	//	profile.setChange();
		home.SelfCareSettingUrl(SelfCareSettingUrlData.get(1).toString());
	/*	profile.setqitaf();
		profile.setAdd();
		profile.setPooling();
	*/	
	}
	
	@Test(priority = 4)
	@Description("User verify the List of Number from the Number Properties")
	public void SC_18_SettingNumberProperties() throws InterruptedException, IOException {
		SelfCardPage selfcare = new SelfCardPage(driver);
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.setLogoutProfileTwo();
    	home.waitForPageLoad();
		ArrayList<String> data = new Keywords().getData("PostPaidLoginFour");
		login.PostPaidLoginTwo(data.get(1).toString(), data.get(2).toString());
		selfcare.NumberProperties();
	}
}
