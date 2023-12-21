package popup;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Britishairways
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.britishairways.com/travel/home/public/en-in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@class='body']")).click();
		
	}

}
