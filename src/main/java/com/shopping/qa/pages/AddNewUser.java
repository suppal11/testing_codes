package com.shopping.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.shopping.qa.base.TestBase;

public class AddNewUser extends TestBase
{
	@FindBy(id="uniform-id_gender1")
	WebElement gender;

	@FindBy(id="customer_firstname")
	WebElement custfname;

	@FindBy(id="customer_lastname")
	WebElement custlname;

	@FindBy(id="passwd")
	WebElement password;

	@FindBy(name="newsletter")
	WebElement newsletter;

	@FindBy(name="optin")
	WebElement optin;

	@FindBy(id="company")
	WebElement company;

	@FindBy(id="address1")
	WebElement address;

	@FindBy(id="address2")
	WebElement address2;

	@FindBy(id="city")
	WebElement city;

	@FindBy(id="postcode")
	WebElement postcode;

	@FindBy(id="other")
	WebElement other;

	@FindBy(id="phone")
	WebElement phone;

	@FindBy(id="phone_mobile")
	WebElement phone_mob;

	@FindBy(id="submitAccount")
	WebElement subAccount;


	public AddNewUser()
	{
		PageFactory.initElements(driver, this);
	}

	public void enterdetails(String cufstname,String lastname,String pass,String cmp,String add,String add2,String cityy,String pstcde,String
			others,String phn,String mob)
	{
		//return driver.getTitle();	

		//	driver.findElement(By.id("uniform-id_gender1")).click();
		//	driver.findElement(By.id("customer_firstname")).sendKeys("Ram");
		//	driver.findElement(By.id("customer_lastname")).sendKeys("Lal");
		//	if (driver.findElement(By.id("email")).equals("abc3@gmail.com"))
		//	{
		//		System.out.print("dynamic value is taken");
		//	}
		//	
		//	driver.findElement(By.id("passwd")).sendKeys("Shivi@21");
		//	
		//	js1.executeScript("window.scrollBy(0, 500)");
		gender.click();
		custfname.sendKeys(cufstname);
		custlname.sendKeys(lastname);
		password.sendKeys(pass);
		newsletter.click();
		optin.click();
		Select sel12=new Select(driver.findElement(By.name("days")));
		sel12.selectByValue("21");
		Select sel13=new Select(driver.findElement(By.name("months")));
		sel13.selectByValue("10");
		Select sel14=new Select(driver.findElement(By.name("years")));
		sel14.selectByValue("2012");
		company.sendKeys(cmp);
		address.sendKeys(add);
		address2.sendKeys(add2);
		city.sendKeys(cityy);
		postcode.sendKeys(pstcde);
		other.sendKeys(others);
		phone.sendKeys(phn);
		phone_mob.sendKeys(mob);
		subAccount.click();
		//	
		//	
		//	driver.findElement(By.name("newsletter")).click();
		//	driver.findElement(By.name("optin")).click();
		//	
		//	driver.findElement(By.id("company")).sendKeys("Capgeminin");
		//	driver.findElement(By.id("address1")).sendKeys("23 ,12345,capgemini");
		//	
		//	js1.executeScript("window.scrollBy(500, 1000)");
		//	
		//	driver.findElement(By.id("address2")).sendKeys("sanvidhan towe");
		//	driver.findElement(By.id("city")).sendKeys("delhi");
		Select sel5=new Select(driver.findElement(By.id("id_state")));
		sel5.selectByValue("5");
		//
		//	
		//	driver.findElement(By.id("postcode")).sendKeys("90004");
		//	driver.findElement(By.id("other")).sendKeys("abc");
		//	driver.findElement(By.id("phone")).sendKeys("5946946094609");
		//	
		//	
		//	driver.findElement(By.id("phone_mobile")).sendKeys("5946946094609");
		//	driver.findElement(By.id("submitAccount")).click();

	}


}


