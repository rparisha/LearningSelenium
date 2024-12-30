package com.sauace.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.report.ExtentReportUtils;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void initDriver() 
	{
		ExtentReportUtils.setUpReport();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");	
		
	}

}
