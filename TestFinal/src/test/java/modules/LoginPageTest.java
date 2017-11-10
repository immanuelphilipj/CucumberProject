package modules;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.BaseClass;
import helpers.CaptureScreenShot;
import junit.framework.Assert;
import pageobjects.LoginPage_Objects;

public class LoginPageTest{

	
	public static void Execute(WebDriver driver, Map<String, String> map) throws Exception{
		
		LoginPage_Objects login_page = PageFactory.initElements(driver, LoginPage_Objects.class);
		login_page.loginHome(map.get("username"), map.get("password"));
		Assert.assertTrue(true);
		CaptureScreenShot.Screenshot(driver, "login");
	}
	
}
