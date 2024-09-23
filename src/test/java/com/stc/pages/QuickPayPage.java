package com.stc.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.stc.keywords.Keywords;

public class QuickPayPage extends Keywords {

	WebDriver driver;

	public QuickPayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By Edit = By.xpath("//span[contains(text(),'Edit')]");
	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	WebElement edit;
	@FindBy(xpath = "(//span[contains(text(),'Edit')])[2]")
	WebElement editTwo;

	public void setEdit() throws InterruptedException {
		waitForElementVisible(driver, Edit);
		Thread.sleep(1000);
		edit.click();
	}

	By EditTwo = By.xpath("(//span[contains(text(),'Edit')])[2]");

	public void setEditTwo() throws InterruptedException {
		waitForElementVisible(driver, EditTwo);
		Thread.sleep(1000);
		editTwo.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement Save;
	@FindBy(xpath = "(//input[@value='1.000'])[1]")
	WebElement EnterValue;

	public void setEnterValue(String value) throws InterruptedException {
		EnterValue.sendKeys(Keys.CONTROL + "A");
		Thread.sleep(1000);
		EnterValue.sendKeys(value);
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "(//button)[position()=31]")
	WebElement Continue;

	public void setContinue() throws InterruptedException {
		Continue.click();
	}

//	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	@FindBy(xpath = "(//span[.='Continue'])[2]")
	WebElement ContinueText;

	public void setContinueText() throws InterruptedException {
		Thread.sleep(4000);
		ContinueText.click();
	}
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	WebElement ContinueOne;
	public void setContinueOne() throws InterruptedException {
		Thread.sleep(4000);
		ContinueOne.click();
	}
	@FindBy(xpath = "(//span[contains(text(),'Continue')])[2]")
	WebElement ContinueTextTwo;

	public void setContinueTextTwo() throws InterruptedException {
		Thread.sleep(2000);
		ContinueTextTwo.click();
	}

	@FindBy(xpath = "(//button)[position()=36]")
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
		AddAnotherNumber.click();
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
	public void setCardDetailsDashboard(String Card, String Name, String CardExpire, String CV) throws InterruptedException {
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("KNET Payment Page"));
		String expectedTitle = driver.getTitle();
		String actualTitle = "KNET Payment Page";
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}
}
