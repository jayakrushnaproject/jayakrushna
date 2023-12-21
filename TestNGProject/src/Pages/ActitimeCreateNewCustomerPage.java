package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCreateNewCustomerPage
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextarea;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustomerButton;
	
	public ActitimeCreateNewCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void createcustomerMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		entercustomernameTextfield.sendKeys("Jaysan");
		entercustomerdescriptionTextarea.sendKeys("new project qspiders");
		//createcustomerButton.click();
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(createcustomerButton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",createcustomerButton);
		Thread.sleep(3000);
	}
	
}