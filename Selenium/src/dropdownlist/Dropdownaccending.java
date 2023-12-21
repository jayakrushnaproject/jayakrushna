package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownaccending {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Jayakrushna%20Pani/OneDrive/Desktop/Automation1/Selenium/jk.html");
		WebElement student=driver.findElement(By.xpath("//select[@name='students']"));
		Select select=new Select(studentListbox);
		List<WebElement>allOptions=select.getOptions();
		Set<String>setallOptions
		
		

	}

}
