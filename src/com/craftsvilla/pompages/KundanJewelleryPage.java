//Step 3
package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class KundanJewelleryPage extends BasePage     //declaration
{
	@FindBy(xpath = "//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-MSUKK91259477650-Jewellery-Sukkhi_Fashion-Craftsvilla_1.jpg']")
	private WebElement product1;
	
	@FindBy(xpath ="//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-MSATY85530512280--Satyam_Jewellery_Nx-Craftsvilla_1.jpg']")
	private WebElement product_maangtikka;
	
	
	public KundanJewelleryPage(WebDriver driver)     //initiate
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void chooseProduct1()                      //utilization ...choose and click on the product..once this is done , it will take you to the product details page.
	{
		verifyElementPresent(product_maangtikka);
		product_maangtikka.click();
	}
	
	
}