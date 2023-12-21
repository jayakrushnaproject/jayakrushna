package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage
{
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath=("(//div[@class='popup_menu_icon'])[2]"))
	private WebElement menuiconlink;
	

	@FindBy(xpath="//a[text()='Types of Work']")
	private WebElement typesofworkLink;
	
	@FindBy(xpath="//div[text()='New Type']/..")
	private WebElement newtypeButton;
	
	@FindBy(xpath="//span[text()='hsjshshs']/../../../../../..//span[contains(@class,'components-Checkbox')]")
	private WebElement clickcheckboxButton;
	
	@FindBy(xpath="//div[@class='components-ItemListPage-BulkEditActions-trigger--2-LrrJwE']")
	private WebElement clickdelete;
	
	@FindBy(xpath="//button[@class='components-Buttons-button--2ZtATn8v components-Buttons-warning--1ayAdub6 components-ItemListPage-BulkEditActions-footerButton--2GJiLykj']")
	private WebElement clickok;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void tasksMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		tasksLink.click();
	}
	
	public void menuiconMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		menuiconlink.click();
	}
	
	public void typesofWorkMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		typesofworkLink.click();
	}
	
	public void newtypekMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		 newtypeButton.click();
	}
	
	public void checkboxMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		clickcheckboxButton.click();
	}
	
	public void deleteMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		 clickdelete.click();
	}
	
	public void okMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		 clickok.click();
	}
	
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		logoutLink.click();
	}
	
}
