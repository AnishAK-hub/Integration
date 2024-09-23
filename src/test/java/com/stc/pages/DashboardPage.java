package com.stc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.stc.keywords.Keywords;

public class DashboardPage extends Keywords{

	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	By DashboardPage = By.xpath("//div[contains(text(),'Hello')]");
	@FindBy(xpath="//div[contains(text(),'Hello')]")
	WebElement WelComeText;
	
	public void setWelComeText() {
       waitForElementVisible(driver, DashboardPage);
		WelComeText.isDisplayed();
		System.out.println("Welcome Text");
	}
	
	@FindBy(xpath="//p[contains(text(),'KD')]")
	WebElement DueAmount;
	
	public void viewDueAmount() {
         DueAmount.isDisplayed();
 		System.out.println("Due KD text");
	}

	

}
