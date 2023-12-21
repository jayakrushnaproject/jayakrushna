package Assertclassmethods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertCollectionValidation
{
	@Test
	public void collectionValidation_SoftAssert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Set<Cookie> alloldCookies=driver.manage().getCookies(); //4
		Cookie cookie=new Cookie("Sunanda", "Sunanda123");
		driver.manage().addCookie(cookie);
		Set<Cookie> allnewCookies = driver.manage().getCookies(); //5
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(allnewCookies, alloldCookies);
		System.out.println("cookie is added");
		System.out.println("-----------------------");
		driver.manage().deleteCookieNamed("Sunanda");
		Set<Cookie> allnewCookies1 = driver.manage().getCookies(); //4
		softAssert.assertEquals(allnewCookies1, allnewCookies);
		System.out.println("cookie is deleted");
		softAssert.assertAll();
	}

}
