package com.NextTechMeta11_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility11.Base11_Pa;

public class HomePageLocator extends Base11_Pa{
	
	// Constructor
	
	
	public HomePageLocator () {  // land
		
		
		PageFactory.initElements(driver, this);  // Factory
		
	}
	
	
	
// Constructor

	@FindBy(id="login2")                   // From Scenario_1
	public  WebElement LoginLink11;
	
	
	
	
	
	

}
