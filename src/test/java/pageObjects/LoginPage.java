package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//img[@title='OpenCart']")
	private WebElement logo;
	
	@FindBy(xpath="//div[@class='card-header']")
	private WebElement loginPageHeading;
	
	@FindBy(id="input-username")
	private WebElement username;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//button[.=' Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//h1[.='Dashboard']")
	private WebElement dashboardtext;
	
	public boolean isLogoDisplayedonLoginPage()
	{
		return logo.isDisplayed();
	}
	public boolean enterYourUsernamePassisPresent()
	{
		return loginPageHeading.isDisplayed();
	}
	public boolean isLoginButtonEnabled()
	{
		return loginButton.isEnabled();
	}
	
	public void login(String uname,String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginButton.click();
		
	}
	public boolean loginSuccesfullyVarified()
	{
		return dashboardtext.isDisplayed();
	}
}
