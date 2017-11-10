package step_definitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import helpers.BaseClass;
import modules.LoginPageTest;


public class LoginPage {

	public WebDriver driver;

	
	public LoginPage(){
		
	   driver = BaseClass.getBrowser(driver);
		
	}
	
	@Given("^User opens the application$")
	public void user_opens_the_application() throws Throwable {
	/*	Reporter.assignAuthor("Immanuel");
        Reporter.addStepLog("My test addStepLog message");
        Reporter.addScenarioLog("This is scenario log");
*/		
		driver.get("https://ism-qa.rrd.com/retailism/");
	    
	}

	
/*	@When("^The user enter the correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_the_correct_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user "+arg1 +" pass  "+arg2);
	}*/
	
	@When("^The user enter the correct username and password$")
	public void the_user_enter_the_correct_username_and_password(DataTable loginCredentials) throws Throwable {
		
		Map<String, String> map = 	loginCredentials.asMap(String.class, String.class);
		LoginPageTest.Execute(driver,map);
		System.out.println("Am successfully back ready for assertion");
				
	}
	@Then("^User could login application successfully$")
	public void user_could_login_application_successfully() throws Throwable {
	
		driver.close();
	}
	
}
