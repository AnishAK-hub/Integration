package com.stc.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stc.keywords.Keywords;

public class SelfCardPage extends Keywords {

	WebDriver driver;

	public SelfCardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By SelfCarePage = By.xpath("//span[contains(text(),'Pay')]");
	@FindBy(xpath = "//span[contains(text(),'Pay')]")
	WebElement Pay;

	public void setPay() {
		waitForElementVisible(driver, SelfCarePage);
		Pay.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Pay Bill')]")
	WebElement PayBill;

	public void setPayBill() {
		PayBill.click();
	}

	By SelectAmount = By.xpath("//span[contains(text(),'Pay Bills')]");
	@FindBy(xpath = "//span[contains(text(),'Outstanding')]")
	WebElement OutStandingPay;

	public void setOutStandingPay() throws InterruptedException {
		waitForElementVisible(driver, SelectAmount);
		Thread.sleep(2000);
		OutStandingPay.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Billed')]")
	WebElement BilledPay;

	public void setBilledPay() throws InterruptedException {
		waitForElementVisible(driver, SelectAmount);
		Thread.sleep(2000);
		BilledPay.click();
	}

	@FindBy(xpath = "//input[@placeholder='0.000']")
	WebElement CustomAmount;
	@FindBy(xpath = "//span[contains(text(),'Custom')]")
	WebElement CustomPay;

	public void setCustomPay(String CustomValue) throws InterruptedException {
		waitForElementVisible(driver, SelectAmount);
		Thread.sleep(2000);
		CustomPay.click();
		CustomAmount.sendKeys(CustomValue);
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	WebElement Continue;

	public void setContinue() throws InterruptedException {
		Thread.sleep(2000);
		Continue.click();
	}

	@FindBy(xpath = "//span[contains(text(),'50012053')]")
	WebElement UsageDashboard;

	public void setUsageDashboard() throws InterruptedException {
		Thread.sleep(2000);
		UsageDashboard.click();
	}

	By UsageTitle = By.xpath("(//span[contains(text(),'Usage')])[1]");
	@FindBy(xpath = "(//span[contains(text(),'Usage')])[2]")
	WebElement Usage;

	public void setUsage() throws InterruptedException {
		waitForElementVisible(driver, UsageTitle);
		Usage.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Local')])")
	WebElement Local;

	public void setLocal() throws InterruptedException {
		Local.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//div[contains(text(),'Roaming')])")
	WebElement Roaming;

	public void setRoaming() throws InterruptedException {
		Thread.sleep(1000);
		Roaming.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//span[contains(text(),'Local Minutes')]")
	WebElement LocalMinutes;
	@FindBy(xpath = "(//span[contains(text(),'Mins')])[1]")
	WebElement Mins;
	@FindBy(xpath = "(//span[contains(text(),'SMS')])[1]")
	WebElement SMS;
	@FindBy(xpath = "//span[contains(text(),'Local SMS')]")
	WebElement LocalSMS;

	public void viewCallAndSMS() throws InterruptedException {
		scroll(driver, 1500);
		Thread.sleep(1000);
		System.out.println("Scroll to view Call and SMS");
		Boolean LocalMinute = LocalMinutes.isDisplayed();
		System.out.println("LocalMinute is displayed: " + LocalMinute);
		Boolean Min = Mins.isDisplayed();
		System.out.println("Mins is displayed: " + Min);
		Boolean InternationalSms = SMS.isDisplayed();
		System.out.println("SMS is displayed: " + InternationalSms);
		Boolean localSms = LocalSMS.isDisplayed();
		System.out.println("LocalSms is displayed: " + localSms);

	}
	
	@FindBy(xpath = "//span[contains(text(),'Don’t show this again')]")
	WebElement DontShow;
	@FindBy(xpath = "//span[contains(text(),'Unlock')]")
	WebElement UnLock;

	public void setUnlock() throws InterruptedException {
		UnLock.click();
		Thread.sleep(1000);
		DontShow.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'Recharge')]")
	WebElement Recharge;

	public void setRecharge() throws InterruptedException {
		Recharge.click();
	}
	
	@FindBy(xpath = "//input[@placeholder='KD Amount']")
	WebElement RechargeValue;

	public void setRechargeValue(String Value) throws InterruptedException {
		RechargeValue.sendKeys(Value);
	}
	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement Confirm;

	By ConfirmTitle = By.xpath("//span[contains(text(),'Confirm')]");
	public void setConfirm() throws InterruptedException {
		waitForElementVisible(driver, ConfirmTitle);
		Thread.sleep(10000);
		Confirm.click();
	}
	
	By RechargeTitle = By.xpath("(//span[contains(text(),'Recharge')])[2]");
	@FindBy(xpath = "(//button)[position()=13]")
	WebElement BackToRecharge;

	public void setBackToRecharge() throws InterruptedException {
		waitForElementVisible(driver, RechargeTitle);
		Thread.sleep(1000);
		BackToRecharge.click();
	}
	
	By MyBillTitle = By.xpath("//span[contains(text(),'My Bills')]");
	By ShowingAllTitle = By.xpath("//span[contains(text(),'Showing all')]");
	@FindBy(xpath = "//*[contains(text(),'My Bills')]")
	WebElement MyBill;

	public void setMyBill() {
		waitForElementVisible(driver, MyBillTitle);
		Setting.click();
		MyBill.click();
		waitForElementVisible(driver, ShowingAllTitle);
	}
	
	By PaidTitle = By.xpath("(//span[contains(text(),'Paid')])[2]");
	@FindBy(xpath = "(//a)[position()=5]")
	WebElement PaidBill;

	public void setPaidBill() throws InterruptedException {
		PaidBill.click();
		waitForElementVisible(driver, PaidTitle);
		Thread.sleep(2000);
	}
	By AllTranscationsTitle = By.xpath("(//span[contains(text(),'KD')])[1]");
	@FindBy(xpath = "(//span[contains(text(),'All Transactions')])[1]")
	WebElement AllTranscations;

	public void setAllTranscations() throws InterruptedException {
		AllTranscations.click();
		waitForElementVisible(driver, AllTranscationsTitle);
		Thread.sleep(2000);
	}
	
	By PaymentOptionTitle = By.xpath("//span[contains(text(),'Payment Options')]");
	@FindBy(xpath = "//h3[contains(text(),'Quick Pay')]")
	WebElement QuickPay;

	public void setQuickPay() {
		QuickPay.click();
		waitForElementVisible(driver, PaymentOptionTitle);
	}
	
	By EStorePageTitle = By.xpath("//p[contains(text(),'All Products')]");
	@FindBy(xpath = "//span[contains(text(),'eStore')]")
	WebElement EStore;

	public void setEStore() throws InterruptedException {
		EStore.click();
		waitForElementVisible(driver, EStorePageTitle);
		Thread.sleep(2000);
		scroll(driver, 500);
		Thread.sleep(2000);
		scroll(driver, 500);
		Thread.sleep(2000);
	}
	@FindBy(xpath = "(//span[contains(text(),'qitaf')])[1]")
	WebElement Qitaf;
	By QitafPage = By.xpath("(//span[contains(text(),'qitaf')])[1]");

	public void setQitaf() throws InterruptedException {
		waitForElementVisible(driver, QitafPage);
		Qitaf.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//button[@class='_1HVKqTctdY16c95QZShNHf']/span")
	WebElement STCUser;
	public void setSTCUser() throws InterruptedException {
		Thread.sleep(2000);
		STCUser.click();
	}
	By AccountDetailsPageTitle = By.xpath("//span[contains(text(),'Account Details')]");
	@FindBy(xpath = "//button[contains(text(),'View Profile')]")
	WebElement ViewProfile;
	public void setViewProfile() {
		ViewProfile.click();
		waitForElementVisible(driver, AccountDetailsPageTitle);
	}
	By SettingPageTitle = By.xpath("//span[contains(text(),'SETTINGS')]");
	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	WebElement Setting;
	public void setSetting() {
		Setting.click();
		waitForElementVisible(driver, SettingPageTitle);
	}
	By YourSimPageTitle = By.xpath("//span[contains(text(),'SETTINGS')]");
	public void NumberProperties() {
			driver.get("https://www.stc.com.kw/selfcare/settings/number-properties/");
			waitForElementVisible(driver, YourSimPageTitle);
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_2SzNyWc6_fnda7ERI3SZ37']/a"));
			System.out.println(elements);
			driver.findElement(By.xpath("//div[@class='_2SzNyWc6_fnda7ERI3SZ37']/a")).isDisplayed();
			driver.findElement(By.xpath("(//div[@class='_2SzNyWc6_fnda7ERI3SZ37']/a)[2]")).isDisplayed();
			driver.findElement(By.xpath("(//div[@class='_2SzNyWc6_fnda7ERI3SZ37']/a)[3]")).isDisplayed();
			driver.findElement(By.xpath("(//div[@class='_2SzNyWc6_fnda7ERI3SZ37']/a)[4]")).isDisplayed();
			driver.findElement(By.xpath("(//div[@class='_2SzNyWc6_fnda7ERI3SZ37']/a)[5]")).isDisplayed();
			System.out.println("Mobile number list are displayed");
	}
}
