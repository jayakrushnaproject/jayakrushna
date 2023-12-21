package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomScroll 
{

	public static void main(String[] args) throws InterruptedException 
	{
		int i;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(i=0;i<=4;i++)
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,100)");
		}
		for(i=0;i<=4;i++)
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,-100)");
		}
		
	}
}
