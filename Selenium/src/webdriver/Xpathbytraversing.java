package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytraversing {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//body/div[1]//div[1]//div[2]//div[2]//div[1]//input[1]")).sendKeys("12345");
		driver.findElement(By.xpath("/html//div[1]//div[2]//div[1]//div[1]/input[1]")).sendKeys("abc@1123");
		driver.findElement(By.xpath("/html//div[1]//div[2]//div[1]//div[1]/input[1]/../../../../../../../../../../../../../.."));
		WebElement htmlElement=driver.findElement(By.xpath("/html//div[1]//div[2]//div[1]//div[1]/input[1]/../../../../../../../../../../../../../.."));
		if(htmlElement.getTagName().equals("html"))
		{
			System.out.println("navigated to html element");
		}
				
			
		
			
			

	}

}
