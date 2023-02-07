package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage
{
	private WebDriver driver;

	//1.By Locators:
	private By emailId=By.id("email");
	private By password=By.id("passwd");
	private By SigninBtn=By.id("SubmitLogin");
	private By forgotPwdlink=By.linkText("Forgot your password?111");

	//2.Constructor of page class
	public LoginPage(WebDriver driver)
	{
		System.out.println(Thread.currentThread().getId());
		this.driver=driver;

	}

	//3.Page Actions-features of the page in the form of methods

	public String getLoginPageTitle()
	{
		return driver.getTitle();

	}

	public boolean isForgotLinkExist()
	{
		return driver.findElement(forgotPwdlink).isDisplayed();	
	}

	public void enterusername(String username)
	{
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterpassword(String password1)
	{
		driver.findElement(password).sendKeys(password1);
	}

	public void click_on_login()
	{
		driver.findElement(SigninBtn).click();
	}
	
	public AccountsPage DoLogin(String us,String pw)
	{
		System.out.println("performing the login with username"+us+"password"+pw);
		driver.findElement(emailId).sendKeys(us);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(SigninBtn).click();
		return new AccountsPage(driver);
		
	}
}