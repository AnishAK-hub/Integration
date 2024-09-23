package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stc.keywords.Keywords;

public class LoginPage extends Keywords{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/input[1]")
	WebElement phoneNumber;
	
	public void setPhoneNumber(String number) {
		phoneNumber.sendKeys(number);
	}
	By passwordPage = By.name("password");
	@FindBy(xpath="//body/div[@id='drawer']/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/input[1]") 
	WebElement password;
	
	public void setpassword(String number) throws InterruptedException {
		Thread.sleep(2000);
		password.sendKeys(number);
	}
	
//	@FindBy(xpath="(//input)[position()=5]")
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement phoneNumberTwo;
	
	public void setPhoneNumberTwo(String number) {
		phoneNumberTwo.sendKeys(number);
	}
	@FindBy(xpath="(//input)[position()=6]") 
	WebElement passwordTwo;
	
	public void setpasswordTwo(String number) throws InterruptedException {
		passwordTwo.sendKeys(number);
	}
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordText;
	
	public void setPasswordText(String number) throws InterruptedException {
	   Thread.sleep(2000);
	   passwordText.sendKeys(number);
	}
	
//	@FindBy(xpath="(//div[.='baity'])[2]") 
//	@FindBy(xpath="(//div[contains(text(),'baity')])[2]") 
	@FindBy(xpath="(//div[@class='StcTabs-styles__tabs SignInScreen-styles__tabsTabs']/div)[2]") 
	WebElement Baity;
	
	public void setBaity()  {
		Baity.click();
	}
//	@FindBy(xpath="(//span[contains(text(),'Continue')])[2]") 
	@FindBy(xpath="(//span[.='Continue'])[1]") 
	WebElement Continue;
	@FindBy(name="phoneNumber") 
	WebElement UserName;
	By SignInPage = By.xpath("//span[contains(text(),'Sign in')]");

	public void setUserName(String name) throws InterruptedException  {
		Thread.sleep(2000);
		UserName.sendKeys(name);
		Thread.sleep(2000);
		Continue.click();
		waitForElementVisible(driver, SignInPage);
	}
	public void setContinue() {
		Continue.click();
	}
	@FindBy(xpath="(//span[contains(text(),'Continue')])[2]") 
	WebElement ContinueTwo;
	public void setContinueTwo() {
		ContinueTwo.click();
	}
	
	@FindBy(xpath="(//button[@aria-label='Profie'])[2]") 
	WebElement ProfileIcon;
	@FindBy(xpath="(//button[@aria-label='Profie'])[5]") 
	WebElement logout;
	public void setLogoutProfile() throws InterruptedException {
		ProfileIcon.click();
		Thread.sleep(1000);
		logout.click();
	}
	@FindBy(xpath="(//button[@aria-label='profile'])[1]") 
	WebElement ProfileIconTwo;
	@FindBy(xpath="(//button[@aria-label='profile'])[4]") 
	WebElement logoutTwo;
	public void setLogoutProfileTwo() throws InterruptedException {
		ProfileIconTwo.click();
		Thread.sleep(1000);
		logoutTwo.click();
	}
	
	@FindBy(xpath="//input[@name='phoneNumber']") 
	WebElement PhoneTextTwo;
	
	public void setPhoneTextTwo(String number) throws InterruptedException {
	   Thread.sleep(2000);
	   PhoneTextTwo.sendKeys(number);
	}
	
	public void BaityLogin(String username, String password) throws InterruptedException {
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		home.waitForPageLoad();
		home.setSignIn();
		Thread.sleep(1000);
		login.setBaity();
		Thread.sleep(1000);
		login.setPhoneNumberTwo(username);
		Thread.sleep(1000);
		login.setContinue();
		Thread.sleep(1000);
		login.setpasswordTwo(password);
		Thread.sleep(1000);
		login.setContinueTwo();
	}
	
	public void PostPaidLogin(String username, String password) throws InterruptedException {
		HomePage home = new HomePage(driver);
		QuickPayPage quickPay = new QuickPayPage(driver);
		LoginPage login = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		driver.get("https://www.stc.com.kw/en");
		//	home.HomeUrl();
		home.waitForPageLoad();
		home.setSignIn();
		Thread.sleep(1000);
		login.setPhoneNumberTwo(username);
		Thread.sleep(1000);
		quickPay.setContinue();
		Thread.sleep(1000);
		login.setpasswordTwo(password);
		Thread.sleep(1000);
		quickPay.setContinueTwo();
		dashboard.setWelComeText();
		dashboard.viewDueAmount();
	}
	
	public void PrePaidLogin(String username, String password) throws InterruptedException {
		HomePage home = new HomePage(driver);
		QuickPayPage quickPay = new QuickPayPage(driver);
		LoginPage login = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		home.waitForPageLoad();
		home.setSignIn();
		Thread.sleep(1000);
		login.setPhoneNumberTwo(username);
		Thread.sleep(1000);
		quickPay.setContinue();
		Thread.sleep(1000);
		login.setpasswordTwo(password);
		Thread.sleep(1000);
		quickPay.setContinueTwo();
	//	dashboard.setWelComeText();
	//	dashboard.viewDueAmount();
	}
	
	public void GetALineLogin(String username, String password) throws InterruptedException {
		QuickPayPage quickPay = new QuickPayPage(driver);
		LoginPage login = new LoginPage(driver);
		Thread.sleep(1000);
		login.setPhoneNumberTwo(username);
		Thread.sleep(1000);
		quickPay.setContinueTextTwo();
		Thread.sleep(1000);
		login.setPasswordText(password);
		Thread.sleep(1000);
		quickPay.setLoginContinueTextThree();
	}
	public void PostPaidLoginTwo(String username, String password) throws InterruptedException {
		HomePage home = new HomePage(driver);
		QuickPayPage quickPay = new QuickPayPage(driver);
		LoginPage login = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		driver.get("https://www.stc.com.kw/en");
		//home.HomeUrl();
		home.waitForPageLoad();
		home.setSignIn();
		Thread.sleep(1000);
		login.setPhoneNumberTwo(username);
		Thread.sleep(1000);
		quickPay.setContinue();
		Thread.sleep(1000);
		login.setpasswordTwo(password);
		Thread.sleep(1000);
		quickPay.setContinueTwo();
		dashboard.setWelComeText();
		dashboard.viewDueAmount();
	}
}
