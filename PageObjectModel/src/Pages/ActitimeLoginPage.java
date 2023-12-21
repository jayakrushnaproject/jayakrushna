package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage 
{
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
		PageFactory.initElements(driver,this);
	}
	public void loginMethod()
	{
		 usernameTextfield.sendKeys("jayakrushnapani0000@gmail.com");
		 passwordTextfield.sendKeys("tarini96");
		 keepLoggedInCheckBox.click();
		 loginButton.click();
	}
	public void forgotpasswordMethod()
	{
		forgotyourpasswordlink.click();
	}
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}
}
	
