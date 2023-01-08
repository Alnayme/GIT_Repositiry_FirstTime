package com.NextTechMeta11_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility11.Base11_Pa;

public class LoginPageLocator extends Base11_Pa {
	
	// Constructor
	
public LoginPageLocator () { 
		
		
		PageFactory.initElements(driver, this);  
		
	}

	
// Constructor

	@FindBy(id="loginusername")
	public  WebElement UserName;
	
	
	@FindBy(id="loginpassword")
	public  WebElement Password;
	
	@FindBy(xpath="//button[text()='Log in']")
	public  WebElement LoginButton;
	
	

}
