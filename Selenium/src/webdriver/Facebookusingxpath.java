package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookusingxpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("jayakrushna");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("pani");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8917394261");
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("ttttttt");
		
		
	}
	
}

