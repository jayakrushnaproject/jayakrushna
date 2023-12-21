package com.testcases.ActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActiTIME.BaseTest;
import com.pages.ActiTIME.ActitimeHomePage;
import com.pages.ActiTIME.ActitimeLoginPage;




//@Listeners(generics.Screenshot.class)
public class TC1_ActitimeLoginLogout extends BaseTest
{
		@Test
		public void login() throws InterruptedException, IOException
		{
			ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
			loginPage.loginMethod();
		}
		
		@Test(dependsOnMethods="login")
		public void logout() throws InterruptedException
		{
			ActitimeHomePage homePage=new ActitimeHomePage(driver);
			homePage.logoutMethod();
		}
}