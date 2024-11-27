package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base {
  
  public void verifyUserIsAbleToLoginWithValidCredentials() 
  {
	  LoginPage login=new LoginPage(driver);   //src/main/java
	  login.enterUserNameField("carol");
	  login.enterPasswordField("1q2w3e4r");
	  login.loginButton();
	  
	  boolean homepageisloaded=login.isHomePageIsLoaded();
	  Assert.assertTrue(homepageisloaded,"Invalid credentials");
	  
	  
  }
  @Test
  public void verifyUserIsAbleToLoginWithValidUsernameInvaliPassword() 
  {
	  LoginPage login=new LoginPage(driver);  
	  login.enterUserNameField("carol");
	  login.enterPasswordField("123456");
	  login.loginButton();
	 
	  boolean loginpageisloaded=login.isloginpageisLoaded();
	  Assert.assertTrue(loginpageisloaded,"Login button is not loaded");
  
}
}