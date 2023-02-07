package com.shopping.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopping.qa.base.TestBase;
import com.shopping.qa.pages.HomePage;
import com.shopping.qa.pages.LoginPage;
import com.shopping.qa.pages.ShoppingRangePage;

public class ShoppingRangePageTest extends TestBase 
{
	LoginPage loginpage;
	HomePage homepage;
	ShoppingRangePage shoppingrangepage;
	//test cases should be independent
	//before each test case launch the browser and login
	//test--execute test cases
	//after each test case close the browser
	public ShoppingRangePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage=new HomePage();
		shoppingrangepage=homepage.clickonSummerDress();
	}
	
	@Test(priority=1)
	public void verify_label()
	{
	Assert.assertTrue(shoppingrangepage.verifylabelshoppingrange(), "verify the label for summer dress");	
	}
	
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();	
	}
	
}
