package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActitimeHomePage
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
//	@FindBy(xpath=("(//div[@class='popup_menu_icon'])[2]"))
//	private WebElement menuiconlink;
//	
//
//	@FindBy(xpath="//a[text()='Types of Work']")
//	private WebElement typesofworkLink;
//	
//	@FindBy(xpath="//div[text()='New Type']/..")
//	private WebElement newtypeButton;
//	
//	@FindBy(xpath="//span[text()='Jayakrushna']/../../../../../..//span[contains(@class,'components-Checkbox-checkbox')]")
//	private WebElement clickcheckboxButton;
//	
//	@FindBy(xpath="//div[text()='Delete']/../..")
//	private WebElement clickdelete;
//	
//	@FindBy(xpath="//button[text()='OK, Delete']")
//	private WebElement clickok;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void homeValidation()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs("actiTIME-Enter-Time-Track"));
		String expectedTitle="actiTIME-EnterTime-Track";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle,"both titles are not matching");
		System.out.println("actual title matching with expected title");
	}
		
	public void tasksMethod() throws InterruptedException
	{
//		Thread.sleep(3000);
//		tasksLink.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(tasksLink));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",tasksLink);
		
	}
	
//	public void menuiconMethod()
//	{
//
//		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf( menuiconlink));
//		js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", menuiconlink);
//		
//	}
//	
//	public void typesofworkMethod() throws InterruptedException
//	{
//
//		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(typesofworkLink));
//		js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", typesofworkLink);
//		
//	}
//	
//	public void newtypekMethod()
//	{
//
//		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(newtypeButton));
//		js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", newtypeButton);
//		
//	}
//	
//	public void checkboxkMethod() 
//	{
//
//		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(clickcheckboxButton));
//		js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", clickcheckboxButton);
//		
//	}
//	
//	public void deleteMethod() 
//	{
//
//		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(clickdelete));
//		js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()",clickdelete);
//		
//	}
//	
//	public void okMethod()
//	{
//
//		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(clickok));
//		js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()",clickok);
//		
//	}
	
	
	
	public void logoutMethod() throws InterruptedException
	{
//		Thread.sleep(3000);
//		logoutLink.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logoutLink));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",logoutLink);
	}

}
