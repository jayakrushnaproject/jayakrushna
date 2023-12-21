package upload;


import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDownloadPopUp {

	public static void main(String[] args) 
	{
		String downloadPath=System.getProperty("user.dir");
		HashMap<String,Object>chromeprefs=new HashMap<>();
		chromeprefs.put("download.default_directory",downloadPath);
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
				
				
		

	}

}
