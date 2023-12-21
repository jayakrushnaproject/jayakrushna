package dropdownlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Occuranceofallelements 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Jayakrushna%20Pani/OneDrive/Desktop/Automation1/Selenium/jk.html");
		WebElement studentListbox=driver.findElement(By.xpath("//select[@name='students']"));
		Select select=new Select(studentListbox);
		List<WebElement>allOptions=select.getOptions();
		Map<String,Integer>map=new HashMap<>();
		for(int i=0;i<allOptions.size();i++)
		{
			String textOption=allOptions.get(i).getText();
			if(map.containsKey(textOption))
			{
				map.put(textOption, map.get(textOption)+1);
			}
			else
			{
				map.put(textOption, +1);
			}
		}
		System.out.println(map);
		for(Entry<String,Integer> entry:map.entrySet())
		{
			System.out.println("occurence of"+entry.getKey()+"is:"+entry.getValue());
		}
	}
}
       
	
		
		
		
		
		
		

	


