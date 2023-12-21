package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generics.Basepage;


public class ActitimeHomePage extends Basepage
{
		public WebDriver driver;
		public WebDriverWait wait;
		 
		@FindBy(id = "logoutLink")
		private WebElement logountLink;
		
		public ActitimeHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void logoutMethod() throws InterruptedException
		{
			wait=new WebDriverWait(driver,Duration.ofSeconds(80));
			wait.until(ExpectedConditions.visibilityOf(logountLink));
			
			javascriptHighlightElement(driver, logountLink);
			javascriptClick(driver, logountLink);
		}
}