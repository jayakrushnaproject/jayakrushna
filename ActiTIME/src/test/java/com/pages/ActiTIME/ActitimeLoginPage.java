package com.pages.ActiTIME;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.ActiTIME.AutoConstant;
import com.generics.ActiTIME.Basepage;
import com.generics.ActiTIME.ExcelLibrary;

public class ActitimeLoginPage extends Basepage implements AutoConstant
{
	
		public static WebDriver driver;
		public WebDriverWait wait;
		
		@FindBy(id = "username")
		private WebElement usernameTextfield;
		
		@FindBy(name = "pwd")
		private WebElement passwordTextfield;
		
		@FindBy(id = "keepLoggedInCheckBox")
		private WebElement keepmeloggedinCheckbox;
		
		@FindBy(id = "loginButton")
		private WebElement loginButton;
		
		public ActitimeLoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void loginMethod() throws InterruptedException, IOException
		{
			wait=new WebDriverWait(driver,Duration.ofSeconds(80));
			wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
			
			javascriptHighlightElement(driver, usernameTextfield);
			usernameTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(sheet_login, 1, 0));
			ExcelLibrary.getCellAddress(sheet_login, 1,0);
			
			
			wait=new WebDriverWait(driver,Duration.ofSeconds(80));
			wait.until(ExpectedConditions.visibilityOf(passwordTextfield));
			
			javascriptHighlightElement(driver, passwordTextfield);
			passwordTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(sheet_login, 1, 1));
			ExcelLibrary.getCellAddress(sheet_login, 1,1);
			
			wait=new WebDriverWait(driver,Duration.ofSeconds(80));
			wait.until(ExpectedConditions.visibilityOf(keepmeloggedinCheckbox));
			
			javascriptHighlightElement(driver, keepmeloggedinCheckbox);
			javascriptClick(driver, keepmeloggedinCheckbox);
			
			wait=new WebDriverWait(driver,Duration.ofSeconds(80));
			wait.until(ExpectedConditions.visibilityOf(loginButton));
			
			javascriptHighlightElement(driver, loginButton);
			javascriptClick(driver, loginButton);
		}
}