package upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/seeker/registration");
		driver.findElement(By.className("uploadResume")).click();
		
	
		StringSelection file=new StringSelection("\"C:\\Users\\Jayakrushna Pani\\OneDrive\\Desktop\\word Resume.docx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
		Robot robot=new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='primaryBtn commonBtn']")).click();
        }
}