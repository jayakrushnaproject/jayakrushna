package Testcases;
	
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.ActitimeHomePage;
import Pages.ActitimeLoginPage;
import Pages.Createtypework;

public class Testcasesforlogincreatetypeworkdelete 
{
	public WebDriver driver;
		
	@Test(priority=1)
	public void loginMethod() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://online.actitime.com/jk"); 
		
		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		
	}
		
	@Test(priority=2)
	public void createtypeworkMethod() throws InterruptedException 
	{
			
	    ActitimeHomePage homepage =new  ActitimeHomePage(driver);
	    homepage.menuiconMethod();
	 
			 
	    homepage.typesofworkMethod();
	  
	    
	    homepage.newtypekMethod();
	   
	    
	    Createtypework creatwork=new  Createtypework(driver);
	    creatwork.enternameMethod();
	   
	    creatwork.savebuttonMethod();
	  
	}
			
	@Test(priority=3)
	public void deleteMethod() throws InterruptedException 
	{
	 ActitimeHomePage homepage=new  ActitimeHomePage(driver);
		 homepage.checkboxkMethod();
		 Thread.sleep(2000);
		 
		 homepage.deleteMethod();
		 Thread.sleep(2000);
		 
		 
		 homepage.okMethod();
		
		 
	}
}