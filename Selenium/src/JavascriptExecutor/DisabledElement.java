package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		WebElement disabledTextbox=driver.findElement(By.id("tb2"));
		int x=disabledTextbox.getLocation().getX();
		int y=disabledTextbox.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='JK'",disabledTextbox);
	}
}
