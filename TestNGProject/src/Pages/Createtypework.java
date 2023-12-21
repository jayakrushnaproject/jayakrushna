package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createtypework
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	
	@FindBy(id="title")
	private WebElement enternameTextfield;
    
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement savebuttonLink;
	
	public Createtypework(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enternameMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(enternameTextfield));
		enternameTextfield.sendKeys("Jayakrushna");
	}
	
   public void savebuttonMethod() 
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(savebuttonLink));
	
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", savebuttonLink);
}
   }


