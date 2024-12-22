package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.CustomerListPage;
import pageObjects.CustomersPage;
import pageObjects.EditingTheCustomerDetailsPage;
import pageObjects.LoginPage;
import pageObjects.NavigationBarPage;
import testBase.Baseclass;

public class TC_003_CustomerList extends Baseclass
{
	CustomerListPage clp;
	LoginPage lp;
	NavigationBarPage np;
	CustomersPage cp;
	EditingTheCustomerDetailsPage ec;
	@Test
	public void readCustomerList() throws InterruptedException
	{
		lp=new LoginPage(driver);
		np=new NavigationBarPage(driver);
		cp=new CustomersPage(driver);
		clp=new CustomerListPage(driver);
		lp.login("admin", "admin");
		np.clickOnCutomerMenu();
		cp.clickOnCustomerSubMenu();
		//clp.readCustomerList();	
		clickonEdit("IqJ@gmail.com");
		Thread.sleep(6000);
		
	}
	
	public void clickonEdit(String email) {
		
		
		ec=new EditingTheCustomerDetailsPage(driver);
		List<WebElement> rowCount = ec.rowCount;
		List<WebElement> emailColumn = ec.emailColumn;
		List<WebElement> editButtons = ec.editButtons;
		
		 for (int i = 1; i < rowCount.size(); i++) 
	    {
	    	String emailValue = emailColumn.get(i).getText();
	    	if(emailValue.equalsIgnoreCase(email))
	    	{
	    		
	    		editButtons.get(i).click();
	        
	        
	        }
	    }

	    
	}
}
