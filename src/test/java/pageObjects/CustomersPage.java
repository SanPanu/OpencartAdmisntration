package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends BasePage
{
	public CustomersPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//li[@id='menu-customer']//a[.='Customers']")
	private WebElement customersSubMenu;
	
	@FindBy(xpath="//div[@id='content']//a[.='Customers']")
	private WebElement CustomerContent;
	
	@FindBy(xpath="//div[@class='float-end']//a")
	private WebElement addNewCustomer;
	
	@FindBy(xpath="//div[@id='tab-general']//legend[.='Customer Details']")
	private WebElement customerDetailHeading;
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	
	@FindBy(id="input-email")
	private WebElement useremail;
	
	@FindBy(id="input-password")
	private WebElement passwrd;
	
	@FindBy(id="input-confirm")
	private WebElement confPass;
	
	@FindBy(xpath="//div[@class='float-end']//button")
	public WebElement saveButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement message;
	
	public void clickOnCustomerSubMenu()
	{
		customersSubMenu.click();
	}
	public String verifyCustomerPage()
	{
		return CustomerContent.getText();
	}
	public void clickOnAddNew()
	{
		addNewCustomer.click();
	}
	public boolean verifyCustomerDetailsPage()
	{
		return customerDetailHeading.isDisplayed();
	}
	public void enterFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	public void enterLastName(String laname)
	{
		lastName.sendKeys(laname);
	}
	public void enteruserEamail(String email)
	{
		useremail.sendKeys(email);
	}
	public void enterPassword(String pass)
	{
		passwrd.sendKeys(pass);
	}
	public void enterConfirmPassword(String cinfPass)
	{
		confPass.sendKeys(cinfPass);
	}
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	public String confirmCostomerCreationMessage()
	{
		return message.getText();
	}
}
