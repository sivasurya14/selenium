package com.insurance.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {

		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="email")
	WebElement usermail ;
	
	@FindBy(name="password")
	WebElement password ;
	
	@FindBy(name="submit")
	WebElement btn ;

		public void setEmai (String umail) {
			
          usermail.sendKeys(umail);			
			
		}
	    public void setPassword ( String upassword) {
	    	password.sendKeys(upassword);
	    	
	    }
        public void clickSubmit() {
        	
        	btn.click();
        }
	
}
