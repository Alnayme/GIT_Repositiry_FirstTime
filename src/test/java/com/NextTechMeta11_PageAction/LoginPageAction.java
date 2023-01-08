package com.NextTechMeta11_PageAction;

import com.NextTechMeta11_PageLocator.LoginPageLocator;

import Utility11.Base11_Pa;

public class LoginPageAction extends Base11_Pa{
	
	
	// THis Method For UserName and Password Is Working For Ever****************************************************

	// create an object to call the Locators  (method) from LoginPageLocator
	
	
	LoginPageLocator loginPageLocator = new LoginPageLocator ();
	
	
	
	public void metaLoginCardInfo(String UserName,String Password ) {
		
		
		
		
		loginPageLocator.UserName.sendKeys(UserName);
		loginPageLocator.Password.sendKeys(Password);
		loginPageLocator.LoginButton.click();
		
		
	}
	
	

}
