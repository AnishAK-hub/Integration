package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stc.keywords.Keywords;

public class BaityPage extends Keywords{

	WebDriver driver;
	public BaityPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	By BaityPage = By.xpath("//span[contains(text(),'Account Summary')]");
	By UpgradePlan = By.xpath("//span[.='Upgrade']");
	@FindBy(xpath = "//div[@class='_3iTk93MmRDSahD5cEyUCRK']/button")
	WebElement Upgrade;
	public void setUpgradePlan() throws InterruptedException {
		waitForElementVisible(driver, BaityPage);
	//	waitForElementVisible(driver, UpgradePlan);
		Thread.sleep(5000);
		Upgrade.click();
		Thread.sleep(2000);
	}
	public void BaityPage() {
		waitForElementVisible(driver, BaityPage);
	}
	By PlansPage = By.xpath("//div[contains(text(),'Plans')]");
	@FindBy(xpath = "//span[contains(text(),'KD')]")
	WebElement KD;
	public void setKD() throws InterruptedException {
		waitForElementVisible(driver, PlansPage);
		KD.click();
	}
	By ContinuePage = By.xpath("//span[contains(text(),'Continue')]");
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	WebElement Continue;
	public void setContinue() throws InterruptedException {
		waitForElementVisible(driver, ContinuePage);
		Thread.sleep(1000);
		Continue.click();
	}
	By ConfirmPage = By.xpath("//span[contains(text(),'Payment')]");
	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement Confirm;
	public void setConfirm() throws InterruptedException {
		waitForElementVisible(driver, ConfirmPage);
		Thread.sleep(1000);
		Confirm.click();
	}

	
}
