package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stc.keywords.Keywords;

public class HeaderManuPage extends Keywords{

	WebDriver driver;
	Keywords key = new Keywords();
	public HeaderManuPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//p[contains(text(),'Mobile')])[1]")
	 WebElement mobile;
	
	public void setMobile() throws InterruptedException {
		mobile.click();
	}
	@FindBy(xpath="(//p[contains(text(),'Devices')])[1]")
	 WebElement device;
	
	public void setDevice() throws InterruptedException {
		device.click();
	}
	By smartphonesPage = By.xpath("//h2[contains(text(),'Smartphones')]");
	@FindBy(xpath="(//h2[contains(text(),'Smartphones')])[1]")
	 WebElement SmartphonesPage;
	@FindBy(xpath="//a[contains(text(),'Smartphones')]")
	 WebElement Smartphones;
	
	public void setSmartphones() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Smartphones.click();
		waitForElementVisible(driver, smartphonesPage);
		viewFilter();
		Thread.sleep(1000);
	}
	By TabletsPage = By.xpath("//h2[contains(text(),'Tablets')]");
	@FindBy(xpath="//a[contains(text(),'Tablets')]")
	 WebElement Tablets;
	
	public void setTablets() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Tablets.click();
		waitForElementVisible(driver, TabletsPage);
		viewFilter();
		Thread.sleep(1000);
	}
	By RoutersPage = By.xpath("//h2[contains(text(),'Routers')]");
	@FindBy(xpath="//a[contains(text(),'Routers')]")
	 WebElement Routers;
	
	public void setRouters() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Routers.click();
		waitForElementVisible(driver, RoutersPage);
		viewFilter();
		Thread.sleep(1000);
	}
	By GamingPage = By.xpath("//h2[contains(text(),'Gaming')]");
	@FindBy(xpath="//a[contains(text(),'Gaming')]")
	 WebElement Gaming;
	
	public void setGaming() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Gaming.click();
		waitForElementVisible(driver, GamingPage);
		viewFilter();
		Thread.sleep(1000);
	}
	By AccessoriesPage = By.xpath("//h2[contains(text(),'Wearables')]");
	@FindBy(xpath="//a[contains(text(),'Accessories')]")
	 WebElement Accessories;
	
	public void setAccessories() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Accessories.click();
		waitForElementVisible(driver, AccessoriesPage);
		viewFilter();
		Thread.sleep(1000);
	}
	By EStorePage = By.xpath("//h2[contains(text(),'All Products')]");
	@FindBy(xpath="//a[contains(text(),'E-Store')]")
	 WebElement EStore;
	
	public void setEStore() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		EStore.click();
		waitForElementVisible(driver, EStorePage);
		Thread.sleep(1000);
	}
	@FindBy(xpath="(//span[contains(text(),'Add filters')])[1]")
	 WebElement Filter;
	
	public void viewFilter() {
		Filter.isDisplayed();
	}
	@FindBy(xpath="//a[contains(text(),'Apple')]")
	 WebElement Apple;
	
	public void setApple() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Apple.click();
		waitForElementVisible(driver, EStorePage);
		viewFilter();
		Thread.sleep(1000);
	}
	@FindBy(xpath="//a[contains(text(),'Huawei')]")
	 WebElement Huawei;
	
	public void setHuawei() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Huawei.click();
		waitForElementVisible(driver, EStorePage);
		viewFilter();
		Thread.sleep(1000);
	}
	@FindBy(xpath="//a[contains(text(),'Samsung')]")
	 WebElement Samsung;
	
	public void setSamsung() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Samsung.click();
		waitForElementVisible(driver, EStorePage);
		viewFilter();
		Thread.sleep(1000);
	}
	@FindBy(xpath="//a[contains(text(),'Honor')]")
	 WebElement Honor;
	
	public void setHonor() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Honor.click();
		waitForElementVisible(driver, EStorePage);
		viewFilter();
		Thread.sleep(1000);
	}
	@FindBy(xpath="//a[contains(text(),'zeed')]")
	 WebElement zeed;
	
	public void setZeed() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		zeed.click();
		Thread.sleep(5000);
	}
	@FindBy(xpath="//a[contains(text(),'Plume SuperPods')]")
	 WebElement PlumeSuperPods;
	
	public void setPlumeSuperPods() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		PlumeSuperPods.click();
		Thread.sleep(5000);
	}
	@FindBy(xpath="//a[contains(text(),'stc Protect')]")
	 WebElement stcProtect;
	
	public void setStcProtect() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		stcProtect.click();
		Thread.sleep(5000);
	}
	@FindBy(xpath="(//a[contains(text(),'Streaming')])[1]")
	 WebElement Streaming;
	
	public void setStreaming() throws InterruptedException {
		setDevice();
		Thread.sleep(1000);
		Streaming.click();
		Thread.sleep(5000);
	}
	@FindBy(xpath="(//a[contains(text(),'Proceed')])[1]")
	 WebElement Proceed;
	@FindBy(xpath="(//a[contains(text(),'E-Payment')])[1]")
	 WebElement EPayment;
	
	public void setEPayment() throws InterruptedException {
		setDevice();
		EPayment.click();
		Proceed.isDisplayed();
	}
	By PostPaidPage = By.xpath("//h1[contains(text(),'Why Postpaid?')]");
	@FindBy(xpath="(//a[contains(text(),'Why Postpaid?')])[1]")
	 WebElement WhyPostpaid;
	
	public void setWhyPostpaid() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		WhyPostpaid.click();
		waitForElementVisible(driver, PostPaidPage);
		Thread.sleep(1000);
	}
	By GetPlanPage = By.xpath("//h1[contains(text(),'Get a Plan')]");
	@FindBy(xpath="(//a[contains(text(),'Get a plan')])[1]")
	 WebElement GetAPlan;
	
	public void setGetAPlan() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		GetAPlan.click();
		waitForElementVisible(driver, GetPlanPage);
		Thread.sleep(1000);
	}
	@FindBy(xpath="(//a[contains(text(),'Tamayouz')])[1]")
	 WebElement Tamayouz;
	
	public void setTamayouz() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		Tamayouz.click();
		Thread.sleep(3000);
	}
	By AddOnsPage = By.xpath("//h1[contains(text(),'Add Ons')]");
	@FindBy(xpath="(//a[contains(text(),'Add-Ons')])[1]")
	 WebElement AddOns;
	
	public void setAddOns() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		AddOns.click();
		waitForElementVisible(driver, AddOnsPage);
		Thread.sleep(1000);
	}
	
	By GoPage = By.xpath("(//h1[contains(text(),'go')])[1]");
	@FindBy(xpath="(//a[contains(text(),'go')])[1]")
	 WebElement WhyGo;
	
	public void setWhyGo() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		WhyGo.click();
		waitForElementVisible(driver, GoPage);
		Thread.sleep(1000);
	}
	@FindBy(xpath="(//a[contains(text(),'go')])[2]")
	 WebElement GetGo;
	
	public void setGetGo() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		GetGo.click();
		waitForElementVisible(driver, GoPage);
		Thread.sleep(1000);
	}
	@FindBy(xpath="(//a[contains(text(),'go')])[3]")
	 WebElement GoPlan;
	
	public void setGoPlan() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		GoPlan.click();
		waitForElementVisible(driver, GoPage);
		Thread.sleep(1000);
	}
	By AddOnsTwoPage = By.xpath("//h1[contains(text(),'Add-ons')]");
	@FindBy(xpath="(//a[contains(text(),'Add-Ons')])[2]")
	 WebElement AddOnsTwo;
	
	public void setAddOnsTwo() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		AddOnsTwo.click();
		waitForElementVisible(driver, AddOnsTwoPage);
		Thread.sleep(1000);
	}
	@FindBy(xpath="(//h1[contains(text(),'recharge')])[1]")
	 WebElement RechargePage;
	@FindBy(xpath="(//a[contains(text(),'Recharge')])[1]")
	 WebElement Recharge;
	
	public void setRecharge() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		Recharge.click();
		Thread.sleep(1000);
		RechargePage.isDisplayed();
	}
	@FindBy(xpath="(//h1[contains(text(),'Roaming')])[1]")
	 WebElement RoamingBundlesPage;
	@FindBy(xpath="(//a[contains(text(),'Roaming')])[1]")
	 WebElement RoamingBundles;
	
	public void setRoamingBundles() throws InterruptedException {
		setMobile();
		Thread.sleep(1000);
		RoamingBundles.click();
		Thread.sleep(1000);
		RoamingBundlesPage.isDisplayed();
	}
}
