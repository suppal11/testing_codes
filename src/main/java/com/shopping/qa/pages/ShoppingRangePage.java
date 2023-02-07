package com.shopping.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopping.qa.base.TestBase;

public class ShoppingRangePage extends TestBase
{

	@FindBy(xpath="//span[@class='cat-name']")
	WebElement label_Summerdress;
	
	@FindBy(xpath="//a[@data-id-product='7' and @title='Add to cart']")
	WebElement add_to_cart;
	
	public ShoppingRangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifylabelshoppingrange()
	{
		return label_Summerdress.isDisplayed();
	}
	
	public void clickon3rddress()
	{
		add_to_cart.click();
		
	}
	
	
}
