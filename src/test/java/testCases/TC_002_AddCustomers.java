package testCases;


import static org.testng.Assert.*;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.CustomersPage;
import pageObjects.LoginPage;
import pageObjects.NavigationBarPage;
import testBase.Baseclass;

public class TC_002_AddCustomers extends Baseclass
{
	LoginPage lp;
	NavigationBarPage np;
	CustomersPage cp;
	@Test
	public void addCustomer() throws InterruptedException
	{
		lp=new LoginPage(driver);
		np=new NavigationBarPage(driver);
		cp=new CustomersPage(driver);
		lp.login("admin", "admin");
		//Thread.sleep(3000);
		np.clickOnCutomerMenu();
		//Thread.sleep(3000);
		cp.clickOnCustomerSubMenu();
		assertEquals(cp.verifyCustomerPage(), "Customers", " Customer Page Verification Failed :  ");
		cp.clickOnAddNew();
		assertTrue(cp.verifyCustomerDetailsPage(),"Customer details Page not displayed");
		
		cp.enterFirstName("SanTest");
		cp.enterLastName("PanTest");
		cp.enteruserEamail(generateRandomEmail()+"@gmail.com");
		cp.enterPassword("1234");
		cp.enterConfirmPassword("1234");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",cp.saveButton);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(cp.saveButton));

		cp.clickOnSaveButton();
		assertEquals(cp.confirmCostomerCreationMessage(),"Success: You have modified customers!","User Not created");
	}
	
	public String generateRandomEmail()
	{
		String ramdomEmail = RandomStringUtils.randomAlphabetic(5);
		return ramdomEmail;
	}

}
