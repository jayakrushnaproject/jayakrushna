package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ActitimeCreateNewCustomerPage;
import Pages.ActitimeHomePage;
import Pages.ActitimeLoginPage;
import Pages.ActitimeTasksPage;

public class ActitimeTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get("https://online.actitime.com/jk");
		
		
		
		ActitimeLoginPage  loginpage=new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		

		 ActitimeHomePage homepage=new  ActitimeHomePage(driver);
		 homepage.tasksMethod();
		
		 ActitimeTasksPage tasksPage=new  ActitimeTasksPage(driver);
		 tasksPage.addnewMethod();
		 tasksPage.newcustomerMethod();
		 
		 
		 ActitimeCreateNewCustomerPage customerpage=new  ActitimeCreateNewCustomerPage(driver);
		 customerpage.createcustomerMethod();
		 
		 homepage.logoutMethod();
		
	}
}
