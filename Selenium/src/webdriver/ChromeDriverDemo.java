package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		URL url=new URL("https://www.flipkart.com");
		driver.navigate().to(url);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
}
		

