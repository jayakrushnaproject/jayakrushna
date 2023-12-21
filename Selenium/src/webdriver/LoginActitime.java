package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActitime {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://online.actitime.com/jk");
		Thread.sleep(3000);
		//driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.name("username")).sendKeys("jayakrushnapani0000@gmail.com");
    	driver.findElement(By.name("pwd")).sendKeys("tarini96");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		driver.get("https://www.actitime.com/");
		System.out.println("Title of the home page:"+driver.getTitle());
		System.out.println("-----------");
		
		if(driver.getTitle().equals("actiTIME - Time Tracking Software"))
				{
			System.out.println("Title is validated");
				}
		else
		{
			System.out.println("Title is not validated");
		}
		System.out.println("*******");
		driver.get("https://online.actitime.com/jk");
		System.out.println("Title of the Login page:"+driver.getTitle());
		
		if(driver.getTitle().equals("actiTIME - Login"))
		{
			System.out.println("Title of login pageis validated");	
		}
		else
		{
			System.out.println("Title is not validated");
			
		}
			
		
//		Thread.sleep(3000);
//		driver.findElement(By.id("logoutLink")).click();
//		driver.findElement(By.partialLinkText("actiTIME")).click();
//		Thread.sleep(3000);
//		driver.close();
//		Thread.sleep(3000);
//		driver.quit();
			
	}
}