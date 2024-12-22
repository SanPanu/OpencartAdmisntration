package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditingTheCustomerDetailsPage extends BasePage
{

	public EditingTheCustomerDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='customer']//table//tr")
	public List<WebElement> rowCount;
	
	@FindBy(xpath="//div[@id='customer']//table//tr//td[3]")
	public List<WebElement> emailColumn;
	
	@FindBy(xpath="//div[@id='customer']//table//tr//td[7]/div/a[1]")
	public List<WebElement> editButtons;
	
	
	

}
