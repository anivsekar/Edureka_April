/*Will you key of the chrome driver change ? obviously no. All these constant variables whose value does not change, 
we are going to add them in a block called as interface*/ //step 1
//interface that hold constant variables of the project
package com.craftsvilla.generic;

public interface AutoConst 
{
	String CHROME_KEY = "webdriver.chrome.driver";        //All constant should be in in upper case
	String CHROME_VALUE = ".\\Drivers\\chromedriver.exe";
	String GECKO_KEY = "webdriver.firefox.marionette";
	String GECKO_VALUE  = ".\\Drivers\\geckodriver.exe";
	String FILEPATH = "";  

}
