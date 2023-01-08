package com.NextTechMeta11_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility11.Base11_Pa;

public class AccountPageLocator extends Base11_Pa {
	
	// Constructor
	
	
	public AccountPageLocator () { 
		
		
		PageFactory.initElements(driver, this);  
		
	}

	
// Constructor

	@FindBy(id="nameofuser")
	public  WebElement AccountProfile11;
	
	
	
	
	
	
	
	
	
	

}
