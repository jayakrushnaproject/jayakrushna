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

public class ActitimeLoginPage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox ;
	
	@FindBy(id="loginButton")
	private WebElement loginButton  ;
	

	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotyourpasswordlink;
	
	@FindBy(xpath="//a[text()='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginValidation()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.titleContains("actiTIME-Login"));
		String expectedTitle="actiTIME-login";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle,"both titles are not matching");
		System.out.println("actual title matching with expected title");
	}
		
	
	public void loginMethod()
	{
		 usernameTextfield.sendKeys("jayakrushnapani0000@gmail.com");
		 passwordTextfield.sendKeys("tarini96"); 
		 
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",keepLoggedInCheckBox);
		 js.executeScript("arguments[0].click()",loginButton);
	}
	public void forgotpasswordMethod()
	{
		forgotyourpasswordlink.click();
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",forgotyourpasswordlink);
	}
	public void actitimeincMethod()
	{
		actitimeincLink.click();
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",actitimeincLink);
	}
}
	
