package Assertclassmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertstringvalidation 
{
	@Test
	public void stringValidation()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Assert.assertEquals(driver.getTitle(), "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra", "title is not matching");
		System.out.println("titles are matching");
		driver.quit();
	}

}
