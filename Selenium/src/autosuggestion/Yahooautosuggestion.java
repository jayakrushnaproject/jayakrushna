package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahooautosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement>allSuggestions= driver.findElements(By.xpath("//b[contains(text(),'selenium')]/.."));
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


