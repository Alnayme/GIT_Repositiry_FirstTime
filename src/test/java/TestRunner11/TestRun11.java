package TestRunner11;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility11.Base11_Pa;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature_File"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefenition1", tags= {"@Demo"})

// always remember to change the feature path from feature file and change the stepdef package name




public class TestRun11 extends AbstractTestNGCucumberTests  {
	
	@BeforeTest
	
	public void Meta11_SetUp () {
		
		Base11_Pa test11 = new Base11_Pa ();
		
		test11.meta11_Browserinitilize();
		
		
	}
	
	
	@AfterTest 
	
	public void meta11_closeURL () {
		
		Base11_Pa test11 = new Base11_Pa ();
		
		test11.driver.quit();
		
		
		
	}
	
	
	

}
