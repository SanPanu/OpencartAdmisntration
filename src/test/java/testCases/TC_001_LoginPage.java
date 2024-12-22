package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.Baseclass;

public class TC_001_LoginPage extends Baseclass
{
	LoginPage lp;
	@Test
	public void verifyLoginByValidData() throws InterruptedException
	{
		lp=new LoginPage(driver);
	//	Thread.sleep(25000);
		assertTrue(lp.isLogoDisplayedonLoginPage(),"logo is not displayed");
		assertTrue(lp.enterYourUsernamePassisPresent(), "page header is not displayed");
		assertTrue(lp.isLoginButtonEnabled(),"Login Button is Not-enabled");
		lp.login("admin", "admin");
		assertTrue(lp.loginSuccesfullyVarified(),"Verification Failed");	
	}

}
