package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTasksPage
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[@class='//div[@class='item createNewProject']']")
	private WebElement newprojectLink;
	
	public ActitimeTasksPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void addnewMethod() throws InterruptedException
	{
//		Thread.sleep(3000);
//		 addnewButton.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(addnewButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",addnewButton);
	}
	public void newcustomerMethod() throws InterruptedException
	{
//		Thread.sleep(3000);
//		newcustomerLink.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(newcustomerLink));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",newcustomerLink);
	}
	public void newprojectMethod() throws InterruptedException
	{
//		Thread.sleep(3000);
//		newprojectLink.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(newprojectLink));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",newprojectLink);
	}
}
	
