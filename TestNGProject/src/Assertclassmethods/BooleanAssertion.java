package Assertclassmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooleanAssertion 
{
	@Test
	public void booleanAssertion()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/qspiders/login.do");
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		Assert.assertEquals((checkbox.isDisplayed() && checkbox.isEnabled()), true, "checkbox is not displayed and enabled");
		System.out.println("checkbox is displayed and enabled");
		Assert.assertEquals(checkbox.isSelected(), true,"checkbox is not selected");
		System.out.println("checkbox is selected");
	}

}
