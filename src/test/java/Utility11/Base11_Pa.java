package Utility11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base11_Pa {
	
	
	
//Global Properties and Global WebDriver
	
    public static Properties meta11_properties;
    
    public static WebDriver driver;
	
	
	public Base11_Pa() {
		
		try {
			FileInputStream filesss = new FileInputStream (System.getProperty("user.dir") + "\\src\\test\\java\\com\\NextTechMeta11\\Configer\\Meta11Configer.Properties");
			
			
			meta11_properties = new Properties ();    // when its global remove properties word
			
			meta11_properties.load(filesss);
			 
		} catch (FileNotFoundException e) {
			System.out.println("Please check ur constructor");
			
			
			e.printStackTrace();
		} catch (IOException e) {
			
			
		}
		
		
	}
	
	
	
	// Browser Method    // (Key,Value)
	
			public void meta11_Browserinitilize () {
				
				 String meta11_Browser =  meta11_properties.getProperty("Browser1");
				 
				 if(meta11_Browser.equalsIgnoreCase("Chrome")) {
				 
			// will bring our setup from another class that we already create it.	
				 
				 
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe");
					
					 driver = new ChromeDriver ();   // Driver is Global
				
					 driver.get("https://www.demoblaze.com/");
					 driver.manage().window().maximize();
					 driver.manage().deleteAllCookies();
			         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData11.implicitlyWait));
			         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData11.pageLoadTimeout));
					 
					
					
		 } 
				 
			 else if(meta11_Browser.equalsIgnoreCase("FireFox")) {
				 
				 
				 
				 
			 }
				 
				 		
			 		
	}
	
	
			
    //step 3:  we are create method to lunching URL
			 
			 
		   public static  void meta11_lunchingURL (String URL) {
			   
			driver.get(meta11_properties.getProperty("URL1"));
			
						
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
