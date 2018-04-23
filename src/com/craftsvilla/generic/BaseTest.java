/*Create another class called base test which is going to be your important class which contains your open application
which contains your @Before method and @After method annotation.*/  //step 3
package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(CHROME_KEY	, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		driver.get("https://www.craftsvilla.com");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
