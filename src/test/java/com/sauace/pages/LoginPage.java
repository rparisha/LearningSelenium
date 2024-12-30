package com.sauace.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.report.ExtentReportUtils;
import com.sauace.test.BaseTest;

public class LoginPage {
	
	
	//Username
	@FindBy(id="user-name")
	WebElement userNameTextBox;
	
	//Password
	@FindBy(id="password")
	WebElement passwordTextBox;
	
	//Login Button
	@FindBy(id="login-button")
	WebElement loginBtn;
	 
	
	//Constructor
	public LoginPage() {
		
		PageFactory.initElements(BaseTest.driver, this);		
	}
	
	Logger log = LogManager.getLogger(LoginPage.class);
	
	
	
	public void logintToApplication(String userName, String password) {
		
		userNameTextBox.sendKeys(userName);
		
		log.info("Username is entered in username text box");
		ExtentReportUtils.addStep("Username is entered");
		
		passwordTextBox.sendKeys(password);
		log.info("Password is entered in password text box");
		ExtentReportUtils.addStep("Password is entered");
		
		loginBtn.click();
		log.info("Clicked on SignIn button");
		ExtentReportUtils.addStep("LogIn button is Clicked");
	}

}
