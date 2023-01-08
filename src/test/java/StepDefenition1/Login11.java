package StepDefenition1;

import com.NextTechMeta11_PageAction.AccountPageAction;
import com.NextTechMeta11_PageAction.HomePageAction;
import com.NextTechMeta11_PageAction.LoginPageAction;

import Utility11.Base11_Pa;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login11 extends Base11_Pa{
	
	
	HomePageAction  homePageAction  = new HomePageAction ();
	
	LoginPageAction loginPageAction = new LoginPageAction ();
	
	AccountPageAction accountPageAction = new AccountPageAction ();
	
	
	
	
	
	@Given("^Meta Launch \"([^\"]*)\"$")
	
	public void meta_Launch(String URL) throws Throwable {
	   
		meta11_lunchingURL (URL);
		
		
	}

	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
		
		homePageAction.ClickLoginLink11();
	   
	}
	
	
	

	@Then("^Enter Username and Enter Pasword and Click Login button$")
	public void enter_Username_and_Enter_Pasword_and_Click_Login_button() throws Throwable {
		
		
		loginPageAction.metaLoginCardInfo(meta11_properties.getProperty("UserName1"), meta11_properties.getProperty("Password1"));
		
		
		// meta11_properties is own the UserName and Password and it bring it from Configer File**************************************8
	  
	}
	
	
	
	

	@Then("^Verify user can login with valid card$")
	public void verify_user_can_login_with_valid_card() throws Throwable {
		
		accountPageAction.Verifyusercanloginwithvalidcard();
		
		
	   
	}


	
	

}
