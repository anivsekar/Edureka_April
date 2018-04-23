//Here you are going to identify all possible elements that is available in this particular page. //Step 4

package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class ProductDetailsPage extends BasePage
{
	@FindBy(id = "buynow")                   //declare
	private WebElement buynow;

	public ProductDetailsPage(WebDriver driver)   //initiate
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBuyNow()                //utilize
	{
		verifyElementPresent(buynow);
		buynow.click();
	}
}
