package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.title"));
	}
}

