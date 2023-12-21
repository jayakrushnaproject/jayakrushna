package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentxpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");	
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Directory']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='HR Manager']"));
		WebElement x=driver.findElement(By.xpath("//p[text()='HR Manager']"));
		System.out.println(x.getText());
	}
}