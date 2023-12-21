package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOB
{

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		//WebElement datename =driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select=new Select(monthname);
		//For Date
//		List<WebElement> allOptions =select.getOptions();	
//	    for(int i=0;i<allOptions.size(); i++)	
//	    {
//	    	if(allOptions.get(i).getText().equals("20"))
//	    	{	
//	    		allOptions.get(i).click();
//	    		break;
//	    	}
//	    }
//	}

		//For month
		
		WebElement monthname =driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select select=new Select(monthname);
		List<WebElement>allOptions=select.getOptions();
	    for(int i=0;i<allOptions.size(); i++)	
	    {
	    	if(allOptions.get(i).getText().equals("Jan"))
	    	{	
		    		allOptions.get(i).click();
		    		break;
		    	}
	    
	    
	}
	    
	    }
}
	
		
	