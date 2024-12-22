package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBarPage extends BasePage
{
	public NavigationBarPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//li[@id='menu-dashboard']//a[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	@FindBy(xpath="//a[normalize-space()='Catalog']")
	private WebElement catlog;
	
	@FindBy(xpath="//a[@class='parent collapsed'][normalize-space()='Extensions']")
	private WebElement extension;
	
	@FindBy(xpath="//a[normalize-space()='Design']")
	private WebElement design;
	
	@FindBy(xpath="//a[normalize-space()='Sales']")
	private WebElement sale;
	
	@FindBy(id="menu-customer")
	private WebElement cutomer;
	
	@FindBy(xpath="//a[@class='parent collapsed'][normalize-space()='Marketing']")
	private WebElement marketing;
	
	@FindBy(xpath="//a[normalize-space()='System']")
	private WebElement system;
	
	@FindBy(xpath="//a[@class='parent collapsed'][normalize-space()='Reports']")
	private WebElement reports;
	
	public void clickOnCutomerMenu()
	{
		cutomer.click();
	}
	
	
}
