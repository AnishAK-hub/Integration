package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stc.keywords.Keywords;

public class QitafPage extends Keywords{

	WebDriver driver;
	public QitafPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	By DashboardPage = By.xpath("//div[contains(text(),'Hello')]");
	@FindBy(xpath="(//span[contains(text(),'PTS')])[1]")
	WebElement STCRewardOne;
	@FindBy(xpath="(//span[contains(text(),'PTS')])[2]")
	WebElement STCRewardTwo;
	@FindBy(xpath="(//span[contains(text(),'PTS')])[3]")
	WebElement STCRewardThree;
	@FindBy(xpath="(//span[contains(text(),'PTS')])[4]")
	WebElement STCRewardFour;
	public void scrollDownOne() {
		scroll(driver,500);
		System.out.println("Scroll down to STC rewards");
	}
	public void scrollDownTwo() {
		scroll(driver,200);
		System.out.println("Scroll down to Discover Partners");
	}
	public void setSTCReward() throws InterruptedException {
		Thread.sleep(2000);
		STCRewardOne.isDisplayed();
		STCRewardTwo.isDisplayed();
		STCRewardThree.isDisplayed();
		STCRewardFour.isDisplayed();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath = "(//span[contains(text(),'qitaf')])[1]")
	WebElement Qitaf;
	@FindBy(xpath = "//span[contains(text(),'50885069')]")
	WebElement QitafUserNumber;
	public void setQitafUser() {
		Qitaf.click();
	//	Boolean user =QitafUserNumber.isDisplayed();
	//	System.out.println("Qitaf User Number is displayed:"+user);
	}
	
	By Continue = By.xpath("//span[contains(text(),'Continue')]");
	By PTS = By.xpath("(//span[contains(text(),'PTS')])[1]");
	By YourRewardPage = By.xpath("//div[contains(text(),'Your Rewards')]");
	@FindBy(xpath = "//span[contains(text(),'Your Rewards')]")
	WebElement YourRewards;
	@FindBy(xpath = "(//span[contains(text(),'PTS')])[1]")
	WebElement pts;
	@FindBy(xpath = "(//div[@id='drawer']/div/div/div/div/div/button)[1]")
	WebElement CloseX;
	public void setYourRewards() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/rewards/YOUR%20REWARDS");
		YourRewards.click();
		Thread.sleep(1000);
		waitForElementVisible(driver, YourRewardPage);
		waitForElementVisible(driver, PTS);
		pts.click();
		waitForElementVisible(driver, Continue);
		CloseX.click();
	}
	By RedeemNowPage = By.xpath("//span[contains(text(),'Redeem Now')]");
	By SMSPage = By.xpath("//div[contains(text(),'SMS')]");
	@FindBy(xpath = "//span[contains(text(),'SMS')]")
	WebElement SMS;
	public void setSMS() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/rewards/MESSAGES");
		SMS.click();
		Thread.sleep(1000);
		waitForElementVisible(driver, SMSPage);
		waitForElementVisible(driver, PTS);
		pts.click();
		waitForElementVisible(driver, RedeemNowPage);
		CloseX.click();
	}
	By QITAF_PARTNERSPage = By.xpath("//div[contains(text(),'QITAF_PARTNERS')]");
	@FindBy(xpath = "//span[contains(text(),'QITAF')]")
	WebElement QITAFPARTNERS;
	public void setQITAFPARTNERS() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/rewards/QITAF_PARTNERS");
		QITAFPARTNERS.click();
		Thread.sleep(1000);
		waitForElementVisible(driver, QITAF_PARTNERSPage);
		waitForElementVisible(driver, PTS);
		pts.click();
		waitForElementVisible(driver, RedeemNowPage);
		CloseX.click();
	}
	
	By InternetPage = By.xpath("//div[contains(text(),'Internet')]");
	@FindBy(xpath = "//span[contains(text(),'Internet')]")
	WebElement Internet;
	public void setInternet() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/rewards/INTERNET");
		Internet.click();
		Thread.sleep(1000);
		waitForElementVisible(driver, InternetPage);
		waitForElementVisible(driver, PTS);
		pts.click();
		waitForElementVisible(driver, RedeemNowPage);
		CloseX.click();
	}
	
	By MinutesPage = By.xpath("//div[contains(text(),'Minutes')]");
	@FindBy(xpath = "//span[contains(text(),'Minutes')]")
	WebElement Minutes;
	public void setMinutes() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/rewards/MINUTES");
		Minutes.click();
		Thread.sleep(1000);
		waitForElementVisible(driver, MinutesPage);
		waitForElementVisible(driver, PTS);
		pts.click();
		waitForElementVisible(driver, RedeemNowPage);
		CloseX.click();
	}
	
	By BilldiscountPage = By.xpath("//div[contains(text(),'Bill discount')]");
	@FindBy(xpath = "//span[contains(text(),'discount')]")
	WebElement Billdiscount;
	public void setBilldiscount() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/rewards/BILLADJUST");
		Thread.sleep(1000);
		Billdiscount.click();
		Thread.sleep(1000);
		waitForElementVisible(driver, BilldiscountPage);
		waitForElementVisible(driver, PTS);
		pts.click();
		waitForElementVisible(driver, RedeemNowPage);
		CloseX.click();
	}
	/////////
	@FindBy(xpath = "(//span[contains(text(),'Travel and Transportation')])[2]")
	WebElement TravelTransport;
	By DISCOVERPARTNERSPage = By.xpath("//div[contains(text(),'DISCOVER PARTNERS')]");

	@FindBy(xpath = "(//span[contains(text(),'Discover Partner')])[1]")
	WebElement DiscoverPartner;
	public void setDiscoverPartner() throws InterruptedException {
		//Qitaf.click();
		driver.get("https://www.stc.com.kw/selfcare/qitaf/partners/discover");
		DiscoverPartner.click();
		waitForElementVisible(driver, DISCOVERPARTNERSPage);
		//TravelTransport.click();
	}
	By EntertainmentPage = By.xpath("//div[contains(text(),'Entertainment')]");
	By MusicPage = By.xpath("//span[contains(text(),'Offers')]");
	@FindBy(xpath = "(//span[contains(text(),'The Museum')])[1]")
	WebElement Music;
	@FindBy(xpath = "(//span[contains(text(),'Entertainment')])[1]")
	WebElement Entertainment;
	public void setEntertainment() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/partners/Entertainment");
		Entertainment.click();
	}
	By TravelTransportationPage = By.xpath("//div[contains(text(),'TRAVEL AND TRANSPORTATION')]");
	@FindBy(xpath = "(//span[contains(text(),'Travel and Transportation')])[3]")
	WebElement Travel;
	@FindBy(xpath = "(//span[contains(text(),'Travel and Transportation')])[1]")
	WebElement TravelTransportation;
	public void setTravel() throws InterruptedException {
    	driver.get("https://www.stc.com.kw/selfcare/qitaf/partners/Travel%20and%20Transportation");
		TravelTransportation.click();
		waitForElementVisible(driver, TravelTransportationPage);
		Travel.isDisplayed();
	}

	By FoodAndDrinkPage = By.xpath("//div[contains(text(),'FOOD AND DRINKS')]");
	@FindBy(xpath = "(//span[contains(text(),'Food')])[1]")
	WebElement FoodAndDrink;
	@FindBy(xpath = "(//span[contains(text(),'Food')])[3]")
	WebElement Food;
	public void setFoodAndDrink() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/partners/Food%20and%20Drinks");
		FoodAndDrink.click();
		waitForElementVisible(driver, FoodAndDrinkPage);
	}
	
	By OnlineServicesPage = By.xpath("//div[contains(text(),'ONLINE SERVICES AND OTHERS')]");
	@FindBy(xpath = "(//span[contains(text(),'Online services')])[1]")
	WebElement OnlineServices;
	@FindBy(xpath = "(//span[contains(text(),'Online services')])[3]")
	WebElement Online;
	public void setOnlineServices() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/partners/Online%20services%20and%20others");
		OnlineServices.click();
	}
	By ShoppingRetailPage = By.xpath("//div[contains(text(),'SHOPPING AND RETAIL')]");
	@FindBy(xpath = "(//span[contains(text(),'Shopping and Retail')])[1]")
	WebElement ShoppingRetail;
	@FindBy(xpath = "(//span[contains(text(),'Shopping and Retail')])[3]")
	WebElement Shopping;
	public void setShoppingRetail() throws InterruptedException {
		driver.get("https://www.stc.com.kw/selfcare/qitaf/partners/Shopping%20and%20Retail");
		ShoppingRetail.click();

	}
	
	//
	By DISCOVERPARTNERSPageTitle = By.xpath("//div[contains(text(),'DISCOVER PARTNERS')]");

	@FindBy(xpath = "(//span[contains(text(),'Kuwait Airways')])[1]")
	WebElement KuwaitAirways;
	public void setKuwaitAirways() throws InterruptedException {
		KuwaitAirways.click();
		waitForElementVisible(driver, DISCOVERPARTNERSPageTitle);
	}
	
	public void rewards() throws InterruptedException {
		System.out.println("Scroll to find Rewards");
		scroll(driver,500);
		Thread.sleep(1000);
		scroll(driver,500);
		Thread.sleep(1000);
		scroll(driver,500);
		Thread.sleep(1000);
		scroll(driver,500);
		}
	
}
