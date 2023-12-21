package EndtoEndMyntra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyingProduct 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		System.out.println("title of myntra home page is:"+driver.getTitle());
		WebElement menlink=driver.findElement(By.xpath("//a[text()='Men'][1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(menlink).perform();
		WebElement sweaterslink=driver.findElement(By.xpath("//a[text()='Sweaters']"));
		actions.moveToElement(sweaterslink).click().perform();
		if(driver.getTitle().contains("Sweaters"))
		System.out.println("navigated to sweaters page");
		WebElement moreBrandsLink=driver.findElement(By.xpath("//span[text()='Brand']/..//div[text()=' more']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",moreBrandsLink );
		
		
		
		
	}
}


