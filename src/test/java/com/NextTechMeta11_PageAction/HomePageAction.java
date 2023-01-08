package com.NextTechMeta11_PageAction;

import com.NextTechMeta11_PageLocator.HomePageLocator;

import Utility11.Base11_Pa;

public class HomePageAction extends Base11_Pa{
	
	
	
	HomePageLocator homePageLocator = new HomePageLocator ();          // Scenario 1
	
	
	public void ClickLoginLink11 () throws Exception {
		
		
		homePageLocator.LoginLink11.click();
		
		Thread.sleep(5000);
		
		
	}
	
	
	
	

}
