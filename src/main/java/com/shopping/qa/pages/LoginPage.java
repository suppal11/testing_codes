package com.shopping.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.shopping.qa.base.TestBase;

public class LoginPage extends TestBase 
{
//page Factory Object Repository
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement SigninBtn;
	
	@FindBy(id="email_create")
	WebElement createBtn;
	
	@FindBy(xpath="//h1[text()='Authentication']")
	WebElement authenticationtitle;
	
	@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
	WebElement logo;
	
	@FindBy(id="email_create")
	WebElement newuseremail;
	
	@FindBy(id="SubmitCreate")
	WebElement newuserclickbtn;
	
	//initializing the page object
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//creating Actions
	public String validateLoginpageTitle()
	{
	return driver.getTitle();	
	}
	
	public boolean validateLogo()
	{
	return logo.isDisplayed();	
	}
	
	public HomePage login(String em,String pass)
	{
		email.sendKeys(em);	
		password.sendKeys(pass);
		SigninBtn.click();
		return new HomePage();
	}
	
	public AddNewUser newuseremail(String email)
	{
		newuseremail.sendKeys(email);
		newuserclickbtn.click();
		return new AddNewUser();
     
	}
}
