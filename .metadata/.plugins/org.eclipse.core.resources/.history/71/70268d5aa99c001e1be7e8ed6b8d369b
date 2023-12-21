package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import Pages.ActitimeCreateNewCustomerPage;
import Pages.ActitimeHomePage;
import Pages.ActitimeLoginPage;
//import Pages.ActitimeTasksPage;

public class ActitimeTest 
{
	public WebDriver driver;
	@Test
	public void loginLogout() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get("https://online.actitime.com/montecarlo");
	
		ActitimeLoginPage  loginpage=new ActitimeLoginPage(driver);
		loginpage.loginValidation();
		loginpage.loginMethod();
		

		 ActitimeHomePage homepage=new  ActitimeHomePage(driver);
		 homepage.homeValidation();
	}
//		 homepage.tasksMethod();
//		
//		 ActitimeTasksPage tasksPage=new  ActitimeTasksPage(driver);
//		 tasksPage.addnewMethod();
//		 tasksPage.newcustomerMethod();
//		 
//		 
//		 ActitimeCreateNewCustomerPage customerpage=new  ActitimeCreateNewCustomerPage(driver);
//		 customerpage.createcustomerMethod();
//		 
//		 homepage.logoutMethod();
	@Test(dependsOnMethods="login")
	public void logout() throws InterruptedException
	{
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.logoutMethod();
		ActitimeLoginPage loginpage=new ActitimeLoginPage (driver);
		loginpage.loginValidation();
	}
}