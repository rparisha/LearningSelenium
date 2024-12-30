package com.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {	

	public class TestNGPriority {
		
		WebDriver driver = new ChromeDriver();		
		
		@Test (priority = 1)
		public void login() {		
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			}
		
		@Test(priority=2)
		public void loginSuccess() {
			
			String actualURL = driver.getCurrentUrl();
			
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			
			Assert.assertEquals(actualURL, expectedURL);
			System.out.println("Login successgul");
			
		}
			
		@Test(priority=3)
		public void logout() {
			
					driver.findElement(By.xpath("//*[contains(@class, 'bm-burger-button')]")).click();
					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//*[@class='bm-item-list']//child::a[3]")).click();
			
			
		}
		
		@Test(priority=4)
		public void close() {
			driver.close();
			
		}
		
		
		
	}


}
