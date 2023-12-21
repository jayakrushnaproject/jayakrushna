package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SameclassDiffrentBrowser
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	}
	public static void text(WebDriver driver)
	{
		driver.get("https://www.google.com");
	}
	public static void main(String[]args) 
	{
		WebDriver driver1=new ChromeDriver();
		SameclassDiffrentBrowser.text(driver1);
		WebDriver driver2=new EdgeDriver();
		SameclassDiffrentBrowser.text(driver2);
	}
}