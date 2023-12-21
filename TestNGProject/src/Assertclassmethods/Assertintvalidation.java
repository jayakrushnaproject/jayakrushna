package Assertclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertintvalidation 
{
	@Test
	public void intValidation() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement monthDropdown=driver.findElement(By.id("month"));
		Select select=new Select(monthDropdown);
		Assert.assertEquals(select.getOptions().size(), 12,"size is not matching");
		System.out.println("size is matching");
		driver.quit();
	}

}
