package com.stc.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.stc.keywords.Keywords;

public class QuickPayDashboardPage extends Keywords {

	WebDriver driver;

	public QuickPayDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By PaymentOptionTitle = By.xpath("//span[contains(text(),'Payment Options')]");
	@FindBy(xpath = "//input[@name='quickpaynumber']")
	WebElement EnterNumber;

	public void setEnterNumber(String value) throws InterruptedException {
		waitForElementVisible(driver, PaymentOptionTitle);
		Thread.sleep(2000);
		EnterNumber.sendKeys(value);
	}

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
//	@FindBy(xpath = "(//span[.='Continue'])[2]")	
	WebElement ContinueText;

	public void setContinueText() throws InterruptedException {
		Thread.sleep(5000);
		ContinueText.click();
	}

	By Edit = By.xpath("//span[contains(text(),'Edit')]");
	
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	WebElement edit;
	@FindBy(xpath = "(//span[contains(text(),'Edit')])[2]")
	WebElement editTwo;

//	@FindBy(xpath = "(//span[contains(text(),'Continue')])[2]")
	@FindBy(xpath = "(//span[contains(text(),'Continue')])[1]")

	WebElement EditContinueText;
	public void setEditContinue() throws InterruptedException {
		waitForElementVisible(driver, Edit);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Continue')])[2] | (//span[.='Continue'])[2] | (//span[contains(text(),'Continue')])[1] | //span[contains(text(),'Continue')]")).click();
		//EditContinueText.click();
	}

	By EditTwo = By.xpath("(//span[contains(text(),'Edit')])[2]");

	public void setEditTwo() throws InterruptedException {
		waitForElementVisible(driver, EditTwo);
		Thread.sleep(1000);
		editTwo.click();
	}

	By ConfirmPage = By.xpath("//span[contains(text(),'Pay with')]");
	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement Confirm;

	public void setConfirm() throws InterruptedException {
		waitForElementVisible(driver, ConfirmPage);
		Thread.sleep(1000);
		Confirm.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//span[contains(text(),'Add Another Number')]")
	WebElement AddAnotherNumber;

	public void setAddAnotherNumber() throws InterruptedException {
		waitForElementVisible(driver, Change);
		AddAnotherNumber.click();
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement AddNumber;

	public void setAddNumber(String valueTwo) throws InterruptedException  {
		waitForElementVisible(driver, Change);
		Thread.sleep(1000);
		AddNumber.sendKeys(valueTwo);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement Save;

	public void setEditSave() throws InterruptedException {
		waitForElementVisible(driver, EditTwo);
		editTwo.click();
		Thread.sleep(2000);
		Save.click();
	}
	public void setEditSaveOne() throws InterruptedException {
		waitForElementVisible(driver, Edit);
		edit.click();
		Thread.sleep(2000);
		Save.click();
	}
	By Change = By.xpath("//span[.='Change']");
	By CustomAmount = By.xpath("(//span[.='Custom amount'])[2]");
	@FindBy(xpath = "//span[.='Change']")
	WebElement ChangeText;
	@FindBy(xpath = "(//span[.='Custom amount'])[2]")
	WebElement CustomAmountValue;
	@FindBy(xpath = "//span[.='Proceed']")
	WebElement Proceed;
	@FindBy(xpath = "//input[@placeholder='0.000']")
	WebElement CustomEnterAmountValue;
	
	public void setChange(String value) throws InterruptedException {
		waitForElementVisible(driver, Change);
		ChangeText.click();
	//	waitForElementVisible(driver, CustomAmount);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Custom amount'] | (//span[.='Custom amount'])[2]")).click();
		//CustomAmountValue.click();
		CustomEnterAmountValue.sendKeys(value);
		Thread.sleep(1000);
		Proceed.click();
		}
	By ChangeTwo = By.xpath("//span[.='Change']");
	@FindBy(xpath = "(//span[.='Change'])[2]")
	WebElement ChangeTwoText;
	public void setChangeTwo(String value) throws InterruptedException {
		waitForElementVisible(driver, ChangeTwo);
		ChangeTwoText.click();
	//	waitForElementVisible(driver, CustomAmount);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[.='Custom amount']) | //span[.='Custom amount'] | (//span[.='Custom amount'])[2]")).click();
		//CustomAmountValue.click();
		CustomEnterAmountValue.sendKeys(value);
		Thread.sleep(1000);
		Proceed.click();
		}
	public void SetContinueText() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Continue']")).click();
	}
	public void SetContinueSibling() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='QuickpayAmountScreen-styles__totalAmountWrapper']/following-sibling::button/span")).click();
	}
	public void SetContinueTextAll() throws InterruptedException {
		driver.findElement(By.xpath("//span[.='Continue'] | (//span[contains(text(),'Continue')])[2] | (//span[.='Continue'])[2] | (//span[contains(text(),'Continue')])[1] | //span[contains(text(),'Continue')]")).click();
	}
	@FindBy(xpath = "(//span[.='Proceed'])[2]")
	WebElement ProceedTwo;
	public void setChangeGuest(String value) throws InterruptedException {
		waitForElementVisible(driver, Change);
		ChangeText.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Custom amount'] | (//span[.='Custom amount'])[2]")).click();
		CustomEnterAmountValue.sendKeys(value);
		Thread.sleep(1000);
		ProceedTwo.click();
		}

	By EnterNumberTitle = By.xpath("//input[@placeholder='KD Amount']");
	@FindBy(xpath = "//input[@placeholder='KD Amount']")
	WebElement EnterKD;

	public void setEnterKD(String value) throws InterruptedException {
		waitForElementVisible(driver, EnterNumberTitle);
		Thread.sleep(1000);
		EnterKD.sendKeys(value);
		Thread.sleep(2000);
		Confirm.click();
	}

	@FindBy(xpath = "(//button)[position()=37]")
	WebElement Continue;

	public void setContinue() throws InterruptedException {
		Continue.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Continue')])[2]")
	WebElement ContinueTextTwo;

	public void setContinueTextTwo() throws InterruptedException {
		Thread.sleep(2000);
		ContinueTextTwo.click();
	}

	@FindBy(xpath = "(//button)[position()=47]")
	WebElement ContinueTwo;

	public void setContinueTwo() {
		ContinueTwo.click();
	}

	@FindBy(xpath = "(//button)[position()=47]")
	WebElement GetLoginContinue;

	public void setGetLoginContinue() {
		GetLoginContinue.click();
	}

	@FindBy(xpath = "(//button)[position()=50]")
	WebElement GetLoginContinueTwo;

	public void setGetLoginContinueTwo() {
		GetLoginContinueTwo.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Continue')])[3]")
	WebElement getLoginContinueTextThree;

	public void setLoginContinueTextThree() {
		getLoginContinueTextThree.click();
	}

	public void setContinueAll() {
		driver.findElement(By.xpath("//body/div[@id='drawer']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
	}

	@FindBy(name = "username")
	WebElement Number;

	public void setNumber(String number) throws InterruptedException {
		Number.sendKeys(number);
	}

	By AddNewPage = By.xpath("(//span[contains(text(),'Add New')])[1]");
	@FindBy(xpath = "//span[contains(text(),'Use Another Card')]")
	WebElement UseAnotherCard;

	public void setUseAnotherCard() throws InterruptedException {
		Thread.sleep(1000);
		UseAnotherCard.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//span[contains(text(),'MASTERCARD')]")
	WebElement MASTERCARD;
	@FindBy(name = "payment-method-view-number")
	WebElement CardNumber;
	@FindBy(name = "payment-method-view-holder")
	WebElement CardHolder;
	@FindBy(name = "payment-method-view-expiry-date")
	WebElement ExpireDate;
	@FindBy(name = "payment-method-view-expiry-cvv")
	WebElement CVV;
	@FindBy(xpath = "(//span[contains(text(),'Add New')])[2]")
	WebElement AddNewButton;

	public void setCardDetails(String Card, String Name, String CardExpire, String CV) throws InterruptedException {
		waitForElementVisible(driver, AddNewPage);
		CardNumber.sendKeys(Card);
		CardHolder.sendKeys(Name);
		ExpireDate.sendKeys(CardExpire);
		CVV.sendKeys(CV);
		AddNewButton.click();
		Thread.sleep(2000);
		MASTERCARD.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement CardConfirm;

	public void setCardDetailsDashboard(String Card, String Name, String CardExpire, String CV)
			throws InterruptedException {
		waitForElementVisible(driver, AddNewPage);
		Thread.sleep(2000);
		CardNumber.sendKeys(Card);
		CardHolder.sendKeys(Name);
		ExpireDate.sendKeys(CardExpire);
		CVV.sendKeys(CV);
		Thread.sleep(1000);
		CardConfirm.click();
		Thread.sleep(4000);
		MASTERCARD.click();
		Thread.sleep(1000);
	}

	public void viewPaymentMerchantPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.titleContains("KNET Payment Page"));

		String expectedTitle = driver.getTitle();
		String actualTitle = "KNET Payment Page";

		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}
	
	By PrepaidTitle = By.xpath("//div[contains(text(),'Recharge Now')]");
	@FindBy(xpath = "//div[contains(text(),'Recharge Now')]")
	WebElement RechargeNow;

	public void setRechargeNow() {
		waitForElementVisible(driver, PrepaidTitle);
		RechargeNow.click();
	}
}
