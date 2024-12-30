package com.sauace.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.report.ExtentReportUtils;
import com.sauace.test.BaseTest;

public class HomePage {
	
	
	@FindBy(xpath="//*[contains(@id, 'item_4_title_link')]")
	WebElement productNameLink;
	
	@FindBy(xpath="//*[contains(@class, 'bm-burger-button')]")
	WebElement buttonToClickLogOut;
	
	@FindBy(xpath="//*[@class='bm-item-list']//child::a[3]")
	WebElement logoutLink; 
	
	public HomePage() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}
	

	Logger log = LogManager.getLogger(HomePage.class);
	
	
	public void checkProductName() {
		
		productNameLink.getAccessibleName();
		log.info("Product name title is captured");
		ExtentReportUtils.addStep("Product name is captured");
	}
	
	public void logoutLink() {
		
		logoutLink.click();
		log.info("Clickoed on list view button");
		ExtentReportUtils.addStep("Clicked on list view button");
	}
	
	public void buttonToClickOnLogOut() {
		
		buttonToClickLogOut.click();
		log.info("Clicked on logout button");
		ExtentReportUtils.addStep("LOgOut button is clicked");
	}

}
