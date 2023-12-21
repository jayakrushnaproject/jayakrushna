package upload;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FreshersWorldupload
{

	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.xpath("//input[@onchange='return fileValidation()']")).click();
		}

}
