package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerListPage extends BasePage
{
	
	public CustomerListPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover']//tbody//tr")
	private List<WebElement> rowCount;
	
	public void readCustomerList()
	{
		
		for(int i=1;i<=rowCount.size();i++)
		{
			//Read each columns based on rows
			List<WebElement> colums = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[" + i + "]/td"));
			
		
			System.out.println("Row " + i + " Data:");
			
			
			for(int j=1;j<colums.size();j++)
			{
				WebElement data = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tr["+i+"]//td["+j+"]"));
				
				System.out.print( data.getText()+" | ");
				
			}
			 System.out.println();
			 
		}
	
	}
	
	
	
	
	
	 
}
