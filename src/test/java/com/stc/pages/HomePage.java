package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stc.keywords.Keywords;

public class HomePage extends Keywords{

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
  	By ProfileEnglish = By.xpath("(//a[contains(text(),'English')])[2]");
	@FindBy(xpath="(//a[contains(text(),'English')])[2]")
	 WebElement English;
  	By ProfileArabic = By.xpath("(//span[contains(text(),'تسجيل الدخول')])[2]");
	@FindBy(xpath="(//a[contains(text(),'العربية')])[2]")
	 WebElement Arabic;
	
	public void ArabicTransulate() throws InterruptedException {
		Arabic.click();
		waitForElementVisible(driver, ProfileArabic);
		Thread.sleep(1000);
		English.click();
		Thread.sleep(1000);
		//waitForElementVisible(driver, ProfileEnglish);
	}
	@FindBy(name="quickpay-number")
	 WebElement QuicPay;
	
	public void setQuicPay(String number) {
		QuicPay.sendKeys(number);
	}
	
	By PayForOtherTitle = By.xpath("//span[contains(text(),'Pay for Others')]");
	@FindBy(xpath="//span[contains(text(),'Proceed')]")
	 WebElement Proceed;
	
	public void setProceed() {
		Proceed.click();
		waitForElementVisible(driver, PayForOtherTitle);
	}
	By HomePageTitle = By.xpath("(//span[contains(text(),'Sign In')])[2]");
	By SignInTitle = By.xpath("(//div[contains(text(),'Personal')])[1]");
	@FindBy(xpath="(//span[contains(text(),'Sign In')])[2]")
	 WebElement SignIn;
	
	public void setSignIn() {
		waitForElementVisible(driver, HomePageTitle);
		SignIn.click();
		waitForElementVisible(driver, SignInTitle);
	}
	public void waitForPageLoad() throws InterruptedException {
		waitForElementVisible(driver, HomePageTitle);
	}
	
	By LoginHomePageTitle = By.xpath("(//p[contains(text(),'Devices')])[1]");
	public void waitForUserPage() throws InterruptedException {
		waitForElementVisible(driver, LoginHomePageTitle);
	}
	public void STCUrl() {
		driver.get("https://www.stc.com.kw/en");
	}
	
	@FindBy(xpath="//button[@aria-label='profile']")
	 WebElement Profile;
	@FindBy(xpath="//button[contains(text(),'Sign Out')]")
	 WebElement Logout;
	public void setLogout() throws InterruptedException {
		Profile.click();
		Logout.click();
		Thread.sleep(4000);
	}
	@FindBy(xpath="//p[.='Devices']")
	 WebElement Device;
	@FindBy(xpath="//a[.='E-Store']")
	 WebElement EStore;
	By EStorePageTitle = By.xpath("//p[.='All Products']");
	public void setEStore() throws InterruptedException {
		Device.click();
		Thread.sleep(1000);
		EStore.click();
		Thread.sleep(10000);
		Device.click();
		Thread.sleep(1000);
		EStore.click();
		waitForElementVisible(driver, EStorePageTitle);
		Thread.sleep(10000);
		scroll(driver, 200);
		Thread.sleep(1000);
		scroll(driver, 200);
		Thread.sleep(1000);
		scroll(driver, 200);
		Thread.sleep(1000);
		scroll(driver, 200);
		Thread.sleep(1000);
		scroll(driver, 200);
		Thread.sleep(1000);
		scroll(driver, 200);
		Thread.sleep(2000);
		scrollUp(driver, 1500);

	}
	public void HomeUrl(String URL) {
		driver.get(URL);
	}
	public void SelfCarePayUrl(String URL) {
		driver.get(URL);
	}
	public void SelfCareUrl(String URL) {
		driver.get(URL);
	}
	public void SelfCareSettingUrl(String URL) {
		driver.get(URL);
	}
}
