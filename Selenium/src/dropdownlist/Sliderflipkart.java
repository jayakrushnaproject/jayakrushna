package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderflipkart 

{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobiles");
		Thread.sleep(3000);
		
		List<WebElement> allOptions=driver.findElements(By.xpath("//span[contains(text(),'mobiles')]/.."));
		for(int i=0;i<allOptions.size();i++)
		{
	
			if(allOptions.get(i).getText().contains("5g"))
			{
				allOptions.get(i).click();
				break;
			}
		}
			Thread.sleep(3000);
			WebElement minpriceSlider=driver.findElement(By.xpath("//div[@style='transform: translateX(0px);']"));
			String value=minpriceSlider.getAttribute("style");
			System.out.println(value);
			Actions actions=new Actions(driver);
			actions.dragAndDropBy(minpriceSlider, 47, 0).perform();	}
}

		
		
		
		

	

