package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage_Objects{
	

	@FindBy(how = How.ID, using ="j_username")
	WebElement username;
	
	@FindBy(how = How.NAME,using="j_password")
	WebElement password;
	
	@FindBy(how = How.ID, using ="login-button")
	WebElement submit;

	

	
	public boolean loginHome(String uid, String loginpass) throws Exception{
		
		try{
		
		if(username.isDisplayed() == false || password.isDisplayed() ==false || submit.isEnabled() == false){
		    System.out.println("Field is disabled");
			return false;
		}else{
			username.sendKeys(uid);
			password.sendKeys(loginpass);
			submit.click();
			return true;
		}
			
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
		
		
	}
}
