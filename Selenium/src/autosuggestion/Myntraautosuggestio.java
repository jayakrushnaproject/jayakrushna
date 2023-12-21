package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntraautosuggestio {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(1000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Tommy");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//li[.='Tommy Hilfiger Wallets']")).click();
	}
}