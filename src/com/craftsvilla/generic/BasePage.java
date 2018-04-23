/*Create a generic class which is going to hold all generic methods that we will be  using inorder to work with our test scripts
Create a class calledd basepage that  will contain all the methods we are going to use. For ex: Verifying title, getting text of a web element
Verifying if the element is present or not, Mouse hover, handling alerts*/  //step 2
//Parent page

package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver = null;  
	
	protected BasePage(WebDriver driver)  //Constructor  //protected method is used so it is  available to your sub class
	{
		this.driver = driver;     //"This" is used to refer to the current class instance
	}

	public void verifyTitle(String exp_title)  //method 1..verify exp_title as an argument
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);   //explicit wait ..(explicit synchronization method)
		try
		{
			wait.until(ExpectedConditions.titleContains(exp_title));  //
			String act_title = driver.getTitle();  //get title to return the string
			Assert.assertEquals(act_title, exp_title);  //if it is not matching..it will fail your test case. That is why use assert equals
		}
		catch (Exception e)            //whatevery exception that is going to occur, try to handle it here itself
		{			
			e.printStackTrace();
			Reporter.log("Fail", true);    //inorder to print something on your reports

		}
	}
	
	public void verifyElementPresent(WebElement ele)   //method2
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));   //why?
			Reporter.log("Element present", true);
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			Reporter.log("Fail", true);

		}
	}
	
	public void mouseHover(WebDriver driver , WebElement ele)   //method3
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();   //mousehover..perform
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			Reporter.log("Fail", true);

		}
	}
	
	public void handleDropDown(WebElement ele)    //method4
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();   //mousehover..perform
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			Reporter.log("Fail", true);

		}
	}
	
	
	public void handleAlerts()           //method 5
	{
		
	}
}