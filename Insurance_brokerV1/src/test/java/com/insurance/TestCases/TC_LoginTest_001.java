package com.insurance.TestCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.insurance.pageObject.LoginPage;


public class TC_LoginTest_001 extends BassClass {	
	@Test
	public void loginTest() {		
		driver.get(baseURL);
		System.out.println("Printing"+ baseURL);
		driver.manage().window().maximize();
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setEmai(username); 
		logger.info("mail is entered");
		lp.setPassword(password);
		logger.info("password is entered");
		lp.clickSubmit();

		if (driver.getTitle().equals("Insurance Broker System")) {
			
           Assert.assertTrue(true);
           logger.info("log in passed");

		} else
		
	     Assert.assertFalse(false);
		logger.info("login is failed");
	}

}
