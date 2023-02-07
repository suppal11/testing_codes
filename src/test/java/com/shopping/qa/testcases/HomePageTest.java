package com.shopping.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopping.qa.base.TestBase;
import com.shopping.qa.pages.HomePage;
import com.shopping.qa.pages.LoginPage;
import com.shopping.qa.pages.ShoppingRangePage;

public class HomePageTest extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	ShoppingRangePage shoppingrangepage;
	
	//test cases should be independent
	//before each test case launch the browser and login
	//test--execute test cases
	//after each test case close the browser
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String homepagetitle=homepage.gettitle();
		Assert.assertEquals(homepagetitle, "My account - My Store","Home Page assertion didint match");
		System.out.print(homepage.gettitle());
	}
	
	@Test(priority=2)
	public void verifyCustomerName()
	{
		boolean flag=homepage.correctuserisdisplayed();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void clickonShoppingrangePage()
	{
		shoppingrangepage=homepage.clickonSummerDress();
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();	
	}
}
