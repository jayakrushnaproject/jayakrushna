package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTasksPage
{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[@class='//div[@class='item createNewProject']']")
	private WebElement newprojectLink;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void addnewMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		 addnewButton.click();
	}
	public void newcustomerMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		newcustomerLink.click();
	}
	public void newprojectMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		newprojectLink.click();
	}
}
	
