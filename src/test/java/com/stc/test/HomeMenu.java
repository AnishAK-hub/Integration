package com.stc.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.stc.pages.HeaderManuPage;
import com.stc.runner.TestRunner;

public class HomeMenu extends TestRunner{

	@Test(priority=1)
	public void AllDeviceMenu() throws InterruptedException {
		HeaderManuPage menu = new HeaderManuPage(driver);
		Thread.sleep(2000);
		menu.setSmartphones();
		menu.setTablets();
		menu.setRouters();
		menu.setGaming();
		menu.setAccessories();
		menu.setEStore();
	}
	
	@Test(priority=2)
	public void PopularBrandMenu() throws InterruptedException {
		HeaderManuPage menu = new HeaderManuPage(driver);
		Thread.sleep(2000);
		menu.setApple();
		menu.setHuawei();
		menu.setSamsung();
		menu.setHonor();
	}
	@Test(priority=3)
	public void MoreFromSTCMenu() throws InterruptedException {
		HeaderManuPage menu = new HeaderManuPage(driver);
		Thread.sleep(2000);
		menu.setZeed();
		menu.setPlumeSuperPods();
		menu.setStcProtect();
		menu.setStreaming();
	}
	@Test(priority=4)
	public void MobilePostPaidMenu() throws InterruptedException {
		HeaderManuPage menu = new HeaderManuPage(driver);
		Thread.sleep(2000);
		menu.setWhyPostpaid();
		menu.setGetAPlan();
		menu.setTamayouz();
		menu.setAddOns();
	}
	@Test(priority=5)
	public void MobilePrepaidMenu() throws InterruptedException {
		HeaderManuPage menu = new HeaderManuPage(driver);
		Thread.sleep(2000);
		menu.setWhyGo();
		menu.setGetGo();
		menu.setGoPlan();
		menu.setAddOnsTwo();
		menu.setRecharge();
		menu.setRoamingBundles();
       driver.quit();
	}

}
