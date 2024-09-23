package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stc.keywords.Keywords;

public class GetNewLinePage extends Keywords{

	WebDriver driver;
	public GetNewLinePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="(//button[@class='StcButton-styles__wrapper___2taQ- StcButton-styles__sizeSmall___2Y9s3 StcButton-styles__primary___3wMtY StcCwsCardImage-styles__bottomLink___239Ml']/span[contains(text(),'Buy Now')])[1]")
	@FindBy(xpath="(//span[.='Buy Now'])[8]")
	WebElement BuyNow;
	
	public void setGetNewLine() throws InterruptedException {
		Thread.sleep(8000);
		scroll(driver, 1500);
        Thread.sleep(1000);
  //    scroll(driver, 100);
        BuyNow.click();
	}
	public void browserRefresh() throws InterruptedException {
		Thread.sleep(10000);
		driver.navigate().refresh();
	//	Thread.sleep(6000);
		}
	public void setGetNewLineSecond() throws InterruptedException {
	      BuyNow.click();
		}
	
		By GetNewLinePage = By.xpath("//h5[contains(text(),'Choose your line type')]");
		@FindBy(xpath="(//span[contains(text(),'Postpaid')])[1]")
		WebElement MobPostPaid;
		
		public void setMobPostPaid() throws InterruptedException {
			waitForElementVisible(driver, GetNewLinePage);
			Thread.sleep(1000);
			MobPostPaid.click();
			waitForElementVisible(driver, ChooseYourLinePage);
		}
		
		@FindBy(xpath="(//span[contains(text(),'Prepaid')])[1]")
		WebElement MobPrePaid;
		
		public void setMobPrePaid() throws InterruptedException {
			waitForElementVisible(driver, GetNewLinePage);
			Thread.sleep(1000);
			MobPrePaid.click();
			waitForElementVisible(driver, BasePlanPage);			
		}
		@FindBy(xpath="(//span[contains(text(),'Postpaid')])[2]")
		WebElement IntPostPaid;
		public void setIntPostPaid() throws InterruptedException {
			waitForElementVisible(driver, GetNewLinePage);
			Thread.sleep(1000);
			IntPostPaid.click();
			waitForElementVisible(driver, ChooseYourLinePage);
		}
		
		@FindBy(xpath="(//span[contains(text(),'Prepaid')])[2]")
		WebElement IntPrePaid;
		
		public void setIntPrePaid() throws InterruptedException {
			waitForElementVisible(driver, GetNewLinePage);
			Thread.sleep(1000);
			IntPrePaid.click();
			waitForElementVisible(driver, BasePlanPage);
		}
		By GetNewLinePageTwo = By.xpath("//div[contains(text(),'youth Plans')]");
		@FindBy(xpath="//div[contains(text(),'youth Plans')]")
		WebElement YouthPlanTab;
		@FindBy(xpath="//span[contains(text(),'youth 7')]")
		WebElement YouthPlanSeven;
		
		public void setYouthPlanTab() throws InterruptedException {
			waitForElementVisible(driver, GetNewLinePageTwo);
			Thread.sleep(1000);
			YouthPlanTab.click();
			Thread.sleep(1000);
			YouthPlanSeven.click();
		}
	
		By ConfirmPlanPage = By.xpath("//span[contains(text(),'Confirm Plan')]");
		@FindBy(xpath="//span[contains(text(),'Confirm Plan')]")
		WebElement ConfirmPlan;
		
		public void setConfirmPlan() throws InterruptedException {
			waitForElementVisible(driver, ConfirmPlanPage);
			Thread.sleep(1000);
			ConfirmPlan.click();
		}
		
		By ChooseNumberPage = By.xpath("//h5[contains(text(),'Choose your new number')]");
		@FindBy(xpath="(//span[contains(text(),'Purple')])[1]")
		WebElement Purple;
		@FindBy(xpath = "//span[contains(text(),'Continue')]")
		WebElement ContinueText;
		
		public void setPurple() throws InterruptedException {
			waitForElementVisible(driver, ChooseNumberPage);
			Thread.sleep(8000);
			Purple.click();
			ContinueText.click();
		}
		
		By BasePlanPage = By.xpath("//h5[contains(text(),'Select your base plan')]");
		@FindBy(xpath="(//span[contains(text(),'KD')])[2]")
		WebElement KD;
		
		public void setKD() throws InterruptedException {
			//waitForElementVisible(driver, BasePlanPage);
			Thread.sleep(1000);
			KD.click();
		}
		@FindBy(xpath="(//span[contains(text(),'KD')])[1]")
		WebElement KDOne;
		
		public void setKDOne() throws InterruptedException {
		//	waitForElementVisible(driver, BasePlanPage);
			Thread.sleep(1000);
			KDOne.click();
		}
		//
		By ChooseYourLinePage = By.xpath("(//h5[contains(text(),'Choose your line type')])[1]");
		@FindBy(xpath="(//span[contains(text(),'KD')])[2]")
		WebElement InternetPostPaidKD;
		
		public void setInternetKD() throws InterruptedException {
			waitForElementVisible(driver, ChooseYourLinePage);
			Thread.sleep(1000);
			InternetPostPaidKD.click();
		}
		//
		By SimPage = By.xpath("//span[contains(text(),'Normal SIM')]");
		@FindBy(xpath="//span[contains(text(),'Normal SIM')]")
		WebElement NormalSim;
		
		public void setNormalSim() throws InterruptedException {
			waitForElementVisible(driver, SimPage);
			Thread.sleep(1000);
			NormalSim.click();
		}
		@FindBy(xpath="//span[contains(text(),'eSIM')]")
		WebElement ESim;
		
		public void setESim() throws InterruptedException {
			waitForElementVisible(driver, SimPage);
			Thread.sleep(1000);
			ESim.click();
		}
		By ShoppingCartPage = By.xpath("//span[contains(text(),'Shopping Cart')]");
		@FindBy(xpath="//span[contains(text(),'Continue')]")
		WebElement ContinueShopping;
		
		public void setContinueShopping() throws InterruptedException {
			waitForElementVisible(driver, ShoppingCartPage);
			Thread.sleep(1000);
			ContinueShopping.click();
		}
		//
		By ExistCustomerPage = By.xpath("//span[contains(text(),'Are you an existing customer?')]");
		@FindBy(xpath="//span[contains(text(),'Are you an existing customer?')]")
		WebElement ExistCustomer;
		
		public void setExistCustomer() throws InterruptedException {
			waitForElementVisible(driver, ExistCustomerPage);
			Thread.sleep(1000);
			ExistCustomer.click();
		}
		//
		By AccountVerificationPage = By.xpath("//span[contains(text(),'Account Verification')]");
		@FindBy(xpath="//div[contains(text(),'Already a Customer?')]")
		WebElement AlreadyCustomer;
		
		public void setAlreadyCustomer() throws InterruptedException {
			waitForElementVisible(driver, AccountVerificationPage);
			Thread.sleep(1000);
			AlreadyCustomer.click();
		}
		By OrderSummaryPage = By.xpath("//span[contains(text(),'Order Summary')]");
		@FindBy(xpath="//span[contains(text(),'Pay KD')]")
		WebElement PayKD;
		
		public void setPayKD() throws InterruptedException {
			waitForElementVisible(driver, OrderSummaryPage);
			Thread.sleep(8000);
			PayKD.click();
		}
		
		By AmountToBePaidPage = By.xpath("//span[contains(text(),'Amount to Be Paid')]");
		@FindBy(xpath="//span[contains(text(),'Confirm to Pay KD')]")
		WebElement ConfirmPayKD;
		
		public void setConfirmPayKD() throws InterruptedException {
			waitForElementVisible(driver, AmountToBePaidPage);
			Thread.sleep(1000);
			ConfirmPayKD.click();
		}
		@FindBy(xpath="//span[contains(text(),'K Net')]")
		WebElement PayKNET;
		
		public void setPayKNET() throws InterruptedException {
			waitForElementVisible(driver, AmountToBePaidPage);
			Thread.sleep(1000);
			PayKNET.click();
		}
		
		By ChoosePlanPage = By.xpath("//span[contains(text(),'Choose Plan')]");
		@FindBy(xpath = "//span[contains(text(),'Choose a SIM only plan')]")
		WebElement SimOnlyPlan;
		
		public void setSimOnlyPlan() {
			waitForElementVisible(driver, ChoosePlanPage);
			SimOnlyPlan.click();
		}
		//
		By CollectionTypePage = By.xpath("//span[contains(text(),'Get a new line')]");
		@FindBy(xpath = "(//span[contains(text(),'Continue')])[2]")
		WebElement SelectCollectionTypeContinue;
		
		public void setSelectCollection() {
			waitForElementVisible(driver, CollectionTypePage);
			scroll(driver, 200);
			SelectCollectionTypeContinue.click();
		}
		//
		By SelectCollectionPage = By.xpath("//h5[contains(text(),'Select Collection Type')]");
		@FindBy(xpath = "//span[contains(text(),'Continue')]")
		WebElement Continue;
		
		public void setContinue() {
			waitForElementVisible(driver, SelectCollectionPage);
			Continue.click();
		}
		By CustomizeRequestPage = By.xpath("//h2[contains(text(),'Customize your request')]/parent::div");
		
		public void setCustomizeRequest() throws InterruptedException {
			waitForElementVisible(driver, CustomizeRequestPage);
			Thread.sleep(1000);
			scroll(driver, 200);
			Thread.sleep(1000);
			Continue.click();
		}
		
		By CheckOutPage = By.xpath("//h2[contains(text(),'Checkout')]");
		//By CheckOutPage = By.xpath("//span[contains(text(),'Continue')]");

		public void setCheckOut() throws InterruptedException {
			waitForElementVisible(driver, CheckOutPage);
			scrollUp(driver, 1500);
			Thread.sleep(1000);
			scroll(driver, 200);
			Thread.sleep(1000);
			scroll(driver, 200);
			Thread.sleep(1000);
			Continue.click();
		}
		@FindBy(xpath = "//span[.='Are you an existing customer?']")
		WebElement ExistingCustomer;
		public void setCheckOutTwo() throws InterruptedException {
			waitForElementVisible(driver, CheckOutPage);
			Thread.sleep(1000);
			scroll(driver, 200);
			Thread.sleep(1000);
			ExistingCustomer.click();
		}
		By DeliveryTimePage = By.xpath("//h5[contains(text(),'Choose your Prefered Delivery Time')]");
		@FindBy(xpath = "//span[contains(text(),'Morning')]")
		WebElement Morning;

		public void setDeliveryTime() throws InterruptedException {
			waitForElementVisible(driver, DeliveryTimePage);
			scrollUp(driver, 1500);
			Thread.sleep(1000);
			Morning.click();
			Thread.sleep(1000);
		}
		By ContactDetailPage = By.xpath("//h5[contains(text(),'Enter your contact details')]");
		@FindBy(xpath = "//span[contains(text(),'Continue')]")
		WebElement ContactDetailContinue;
		public void setContactDetail() throws InterruptedException {
			waitForElementVisible(driver, ContactDetailPage);
			scrollUp(driver, 1500);
			Thread.sleep(1000);
			scroll(driver, 200);
			Thread.sleep(1000);
			scroll(driver, 100);
			ContactDetailContinue.click();
			Thread.sleep(1000);
		}
		By PackagePage = By.xpath("//h5[contains(text(),'Package')]");
		@FindBy(xpath = "//input[@id='accepted']/parent::span")
		WebElement Accept;
		
		public void setPackage() throws InterruptedException {
			waitForElementVisible(driver, PackagePage);
			scrollUp(driver, 1500);
			Thread.sleep(1000);
			scroll(driver, 1000);
			Thread.sleep(1000);
	   // 	scroll(driver, 500);
	//		Thread.sleep(1000);
	//		scroll(driver, 200);
			Thread.sleep(1000);
	//		scroll(driver, 200);
			Accept.click();
			Thread.sleep(1000);
			Continue.click();
			Thread.sleep(1000);
		}
		
		By MakePaymentPage = By.xpath("//h5[contains(text(),'Make Payment')]");
		@FindBy(xpath = "//span[contains(text(),'Place order')]")
		WebElement PlaceOrder;
		
		public void setMakePayment() throws InterruptedException {
			waitForElementVisible(driver, MakePaymentPage);
			scrollUp(driver, 1500);
			Thread.sleep(1000);
			scroll(driver, 500);
			Thread.sleep(1000);
			PlaceOrder.click();
		}
		public void setCheckOutThree() throws InterruptedException {
			waitForElementVisible(driver, CheckOutPage);
			Thread.sleep(2000);
			scroll(driver, 500);
			Thread.sleep(1000);
			Continue.click();
		}

		@FindBy(xpath = "(//span[.='Select your location'])[3]")
		WebElement SelectLocation;
		public void setPACINumber() throws InterruptedException {
			waitForElementVisible(driver, CheckOutPage);
			scroll(driver, 200);
			SelectLocation.click();
			waitForElementVisible(driver, CheckOutPage);
			Thread.sleep(5000);
			Continue.click();
		}
		@FindBy(xpath = "(//input[@type='number'])[1]")
		WebElement BuildingNumber;
		public void setAddressDetails() throws InterruptedException {
			waitForElementVisible(driver, CheckOutPage);
			scroll(driver, 1000);
			Thread.sleep(2000);
			BuildingNumber.sendKeys("1");
			Thread.sleep(2000);
			scroll(driver, 200);
			Thread.sleep(2000);
			Continue.click();
			Thread.sleep(2000);
		}
	//	By CheckOutPage = By.xpath("//h2[contains(text(),'Checkout')]");

		@FindBy(xpath = "(//span[contains(text(),'Always ON')])[1]")
		WebElement AlwaysOn;
		
		public void setAlwaysOn() throws InterruptedException {
		//	waitForElementVisible(driver, AlwaysOn);
			Thread.sleep(1000);
			AlwaysOn.click();
		}
}
