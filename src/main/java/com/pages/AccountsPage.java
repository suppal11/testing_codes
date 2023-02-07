package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage
{
	private WebDriver driver;
	private By accountsections =By.cssSelector("div#center_column span");

	
	public AccountsPage(WebDriver driver) 
	{
		this.driver=driver;
        System.out.println(Thread.currentThread().getId());

	}

	public String getPagetitle()
	{
		return driver.getTitle();
	}
	
	public int getSectioncount()
	{
		return driver.findElements(accountsections).size();
	}
	
	public List<String> getSectionList()
	{
		List<String> accountlist=new ArrayList<>();
		List<WebElement> accountheaders= driver.findElements(accountsections);
		
		for(WebElement e:accountheaders)
		{
			System.out.println(e.getText());
			accountlist.add(e.getText());
		}
		return accountlist;
	}
}
