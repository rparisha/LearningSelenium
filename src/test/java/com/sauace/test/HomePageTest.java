package com.sauace.test;

import org.testng.annotations.Test;

import com.sauace.pages.HomePage;

public class HomePageTest extends BaseTest {
	
	
	@Test
	public void logout() {
	HomePage homepage = new HomePage();	
	
	homepage.checkProductName();
	
	homepage.buttonToClickOnLogOut();
	
	homepage.logoutLink();
	
	BaseTest.driver.close();
	
	

}
}
