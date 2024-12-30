package com.sauace.test;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.sauace.pages.LoginPage;
import com.utility.PropertyUtility;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {
		
		LoginPage loginpage = new LoginPage();
		loginpage.logintToApplication(PropertyUtility.getData("username") , PropertyUtility.getData("password"));
		
	}

}
