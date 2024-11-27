package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	//to call PageFactory
	public LoginPage(WebDriver driver)      //constructor
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="loginform-username")WebElement username;  //user elementne locate cheythu.
	@FindBy(id="loginform-password")WebElement password;
	@FindBy(xpath="//button[@name='login-button']")WebElement submit;
   @FindBy(xpath="//a[href='/payrollapp/client/index']")WebElement home;   //xpath of clents
	@FindBy(xpath="//h1[text()='Login']")WebElement loginpage;  //xpath of login page
	
	
public void enterUserNameField(String usernamefield)
{
	username.sendKeys(usernamefield);
}
public void enterPasswordField(String passwordfield)
{
	password.sendKeys(passwordfield);
}
public void loginButton()
{
	submit.click();
}
public boolean isHomePageIsLoaded()
{
	return home.isDisplayed();   //to check assertion
	 
}
public boolean isloginpageisLoaded()
{
	return loginpage.isDisplayed();
}
}
