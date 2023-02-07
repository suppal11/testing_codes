package com.shopping.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopping.qa.base.TestBase;
import com.shopping.qa.pages.HomePage;
import com.shopping.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{

	//What is log? : capturing info/activities at the time of program execution. 
		// types of logs:
			//1. info
			//2. warn
			//3. debug
			//4. fatal
			
		//how to generate the logs? : use Apache log4j API (log4j jar)
		//How it works? : it reads log 4j configuration from log4j.properties file
		//where to create: create inside resources folder
		
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void verifyloginpagetitleTest()
	{
		String title=loginpage.validateLoginpageTitle();
		Assert.assertEquals(title, "Login - My Store");
	}
	
	@Test(priority=2)
	public void verifylogotest()
	{
		boolean flag=loginpage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifylogintest()
	{
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
    {
    	driver.quit();
    }
	
	
	
}
