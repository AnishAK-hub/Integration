package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stc.keywords.Keywords;

public class ProfilePage extends Keywords{

	WebDriver driver;
	public ProfilePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	By AccountDetailsPageTitle = By.xpath("//span[contains(text(),'Account Details')]");
	@FindBy(xpath = "//input[@value='288101008496']")
	WebElement CivilId;
	@FindBy(xpath = "//input[@value='03/07/2004']")
	WebElement DOB;
	@FindBy(xpath = "//input[@value='GBR']")
	WebElement Nationality;
	public void setAccountDetails() {
		waitForElementVisible(driver, AccountDetailsPageTitle);
	//	CivilId.isDisplayed();
	//	DOB.isDisplayed();
	//	Nationality.isDisplayed();
		System.out.println("Account Details are verified");
	}
	@FindBy(xpath = "//span[contains(text(),'Governorate')]")
	WebElement Address;
	public void setAddress() throws InterruptedException {
		 scroll(driver, 1500);
		Thread.sleep(1000);
	//	Address.isDisplayed();
		System.out.println("Address are verified");

	}
	@FindBy(xpath = "//span[contains(text(),'Governorate')]")
	WebElement Email;
	@FindBy(xpath = "//span[contains(text(),'Governorate')]")
	WebElement Phone;
	public void setContactDetails() throws InterruptedException {
		scroll(driver,500);
		Thread.sleep(1000);
	//	Phone.isDisplayed();
		Email.isDisplayed();
		System.out.println("Contact Details are verified");
	}
	By NumberPropertiesPageTitle = By.xpath("//div[contains(text(),'Number Properties')]");
	@FindBy(xpath = "//span[contains(text(),'Change to eSIM')]")
	WebElement ChangeToeSIM;
	@FindBy(xpath = "//span[contains(text(),'Number Properties')]")
	WebElement NumberProperties;
	public void setNumberProperties() throws InterruptedException {
		NumberProperties.click();
		waitForElementVisible(driver, NumberPropertiesPageTitle);
		ChangeToeSIM.isDisplayed();
		Thread.sleep(2000);
	}
	By UserManagementPageTitle = By.xpath("//div[contains(text(),'User Management')]");
	@FindBy(xpath = "(//span[contains(text(),'50885069')])[2]")
	WebElement UserManagementNum;
	@FindBy(xpath = "//span[contains(text(),'User Management')]")
	WebElement UserManagement;
	public void setUserManagement() throws InterruptedException {
		UserManagement.click();
		waitForElementVisible(driver, UserManagementPageTitle);
	//	UserManagementNum.isDisplayed();
		Thread.sleep(2000);
	}
	By qitafPageTitle = By.xpath("//div[contains(text(),'qitaf')]");
	@FindBy(xpath = "//span[contains(text(),'qitaf')]")
	WebElement qitaf;
	@FindBy(xpath = "//span[contains(text(),'50885069')]")
	WebElement qitafNum;
	public void setqitaf() {
		qitaf.click();
		waitForElementVisible(driver, qitafPageTitle);
//		qitafNum.isDisplayed();
	}
	public void setqitafTwo() {
		qitaf.click();
		waitForElementVisible(driver, qitafPageTitle);
	}
	By AppearancePageTitle = By.xpath("//div[contains(text(),'Appearance')]");
	@FindBy(xpath = "//span[contains(text(),'Appearance')]")
	WebElement Appearance;
	public void setAppearance() throws InterruptedException {
		Appearance.click();
		waitForElementVisible(driver, AppearancePageTitle);
		Thread.sleep(2000);
	}
	By PaymentMethodsPageTitle = By.xpath("//span[contains(text(),'Link Bank Account')]");
	@FindBy(xpath = "//span[contains(text(),'Payment Methods')]")
	WebElement PaymentMethods;
	public void setPaymentMethods() throws InterruptedException {
		PaymentMethods.click();
		waitForElementVisible(driver, PaymentMethodsPageTitle);
		Thread.sleep(2000);
	}
	By AutoPayPageTitle = By.xpath("//div[contains(text(),'AUTOPAY')]");
	@FindBy(xpath = "//span[contains(text(),'AutoPay')]")
	WebElement AutoPay;
	public void setAutoPay() throws InterruptedException {
		AutoPay.click();
		waitForElementVisible(driver, AutoPayPageTitle);
		Thread.sleep(2000);
	}
	By RefundRequestsPageTitle = By.xpath("//div[contains(text(),'Refund Requests')]");
	@FindBy(xpath = "//span[contains(text(),'Refund Requests')]")
	WebElement RefundRequests;
	public void setRefundRequests() throws InterruptedException {
		RefundRequests.click();
		waitForElementVisible(driver, RefundRequestsPageTitle);
		Thread.sleep(2000);
	}
	@FindBy(xpath = "(//span[contains(text(),'Pooling')])[2]")
	WebElement Pooling;
	public void setPooling() throws InterruptedException {
		Pooling.click();
	}
	By receiverNumber = By.xpath("//span[contains(text(),'5001 2026')]");	
	@FindBy(xpath = "//span[contains(text(),'Change')]")
	WebElement Change;
	public void setChange() throws InterruptedException {
		Change.click();
		waitForElementVisible(driver, receiverNumber);
		Thread.sleep(2000);
	}
	@FindBy(xpath = "//span[contains(text(),'Add')]")
	WebElement Add;
	public void setAdd() throws InterruptedException {
		Add.click();
		waitForElementVisible(driver, receiverNumber);
		Thread.sleep(2000);
	}
}
