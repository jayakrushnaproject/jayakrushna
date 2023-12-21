package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Singaporeairways {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Accept']")).click();
		WebElement selectallmonth=driver.findElement(By.xpath("//span[text()='Book trip']/../../../..//input[@name='departureMonth']"));
		JavascriptExecutor js=(	JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",selectallmonth);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='right']")).click();
		
	}

}
