//In your home page, what are the web elements you have?//Step2
//Super keyword is used to invoke your super class constructor
package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath = "//a[text()='CRAFTSVILLA BRANDS']")
	private WebElement craftsvillaBrands;
	
	@FindBy(linkText = "KURTIS & MORE ")
	private WebElement kurtisAndMore;
	
	@FindBy(xpath = "//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement accessories;

	public HomePage(WebDriver driver)   //Inititialization
	{
		super(driver);         //because my base or super class contains a constructor, then your sub class should handle that super class constructor
		PageFactory.initElements(driver, this);
	}
	
	public void goToAccessories()     //Utilization //it will accept the object you are going to mouse over on
	{
		mouseHover(driver, accessories);		
	}
}