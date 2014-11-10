package com.cisco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class BingTest 
	{
		private WebDriver driver;
		@Test
		public void verifySearch() 
		{
			driver = new FirefoxDriver();
			driver.get("http://www.google.com/");
			driver.quit();
		}
	}