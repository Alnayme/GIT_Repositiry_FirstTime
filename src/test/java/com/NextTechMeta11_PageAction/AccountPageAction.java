package com.NextTechMeta11_PageAction;

import org.testng.Assert;

import com.NextTechMeta11_PageLocator.AccountPageLocator;

import Utility11.Base11_Pa;



public class AccountPageAction extends Base11_Pa{
	
	
	
	AccountPageLocator accountPageLocator = new AccountPageLocator ();
	
	
	
	public void Verifyusercanloginwithvalidcard () throws Exception {
		
		
		Thread.sleep(5000);
		
		boolean verifyAccountProfile =  accountPageLocator.AccountProfile11.isDisplayed();
		
		Assert.assertTrue(verifyAccountProfile);
		
		
		
		
		
	}
	
	
	

}
