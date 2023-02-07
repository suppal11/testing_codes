package com.shopping.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopping.qa.base.TestBase;

public class HomePage extends TestBase 
{

	@FindBy(xpath="//span[text()='Ram Lal']")
	WebElement customername;
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement womenlink;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a")
	WebElement summerdress;
	
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dresslink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);

	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	public boolean correctuserisdisplayed()
	{
		return customername.isDisplayed();
	}
	
	
	public ShoppingRangePage clickonSummerDress()
	{
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(womenlink).moveToElement(summerdress).click().build();
		mouseOverHome.perform();
		return new ShoppingRangePage();
	}

	
	
}
