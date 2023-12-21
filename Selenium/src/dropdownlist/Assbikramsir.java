package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assbikramsir {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-group='men']")).click();
		

	}

}
