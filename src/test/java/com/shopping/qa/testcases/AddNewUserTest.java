package com.shopping.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shopping.qa.base.TestBase;
import com.shopping.qa.pages.AddNewUser;
import com.shopping.qa.pages.HomePage;
import com.shopping.qa.pages.LoginPage;
import com.shopping.qa.utilities.TestUtil;

public class AddNewUserTest extends TestBase
{
	LoginPage loginpage;
	AddNewUser addnewuser;
	//TestUtil testUtil;
	String sheetname="User_Details";
	
	public AddNewUserTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		addnewuser=loginpage.newuseremail("abddisj1d@gmail.com");
		addnewuser=new AddNewUser();
	}
	
//	@Test(priority=1)
//	public void verifyinputdetails()
//	{
//		addnewuser.enterdetails("ABC", "def", "Shivi@21", "ABC", "ABC", "ABC", "ABC", "90004", "ABC", "ABC", "ABC");
//		System.out.print("data entered");
//	}
//	
	
	@DataProvider
	public Object[][] automatedata()
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
		
	}	
	
	@Test(priority=1,dataProvider="automatedata")
	public void inputdatatable(String cufstname,String lastname,String pass,String cmp,String add,String add2,String cityy,String pstcde,String
			others,String phn,String mob)
	{
		addnewuser.enterdetails(cufstname,lastname,pass,cmp,add,add2,cityy,pstcde,others,phn,mob);
		System.out.print("data entered");
	}
	
	@AfterMethod
	public void tearDown()
    {
    	driver.quit();
    }
	
	






}
