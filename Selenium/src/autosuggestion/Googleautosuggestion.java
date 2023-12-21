package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleautosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	    Thread.sleep(3000);
	    List<WebElement> allSuggestions =driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		System.out.println("total elements are"+allSuggestions.size());
		for(int i=0;i<allSuggestions.size();i++)
		{
			if(allSuggestions.get(i).getText().equals("selenium webdriver"))
			{
				allSuggestions.get(i).click();
				break;
			}
		}
	}
}
	


			
			
			
		
				
			
				
			
		
				
		

	


