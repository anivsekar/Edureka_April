package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.AccessoriesPage;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.KundanJewelleryPage;
import com.craftsvilla.pompages.ProductDetailsPage;

public class AccessoriesModuleScripts extends BaseTest
{
	AccessoriesPage ap = null;
	HomePage hp = null;
	KundanJewelleryPage kp =null;
	ProductDetailsPage pd = null;
	
	@Test
	public void buyKundanJewellery()
	{
		ap = new AccessoriesPage(driver);
		hp = new HomePage(driver);
		kp = new KundanJewelleryPage(driver);
		pd = new ProductDetailsPage(driver);
		
		
		hp.goToAccessories();
		ap.gotoKundanJewellery();
		kp.chooseProduct1();
		pd.clickOnBuyNow();
		Assert.fail();
	}

}