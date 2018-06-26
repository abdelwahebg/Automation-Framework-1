package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.wbl.utilities.WebdriverUtil;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	
	public void beforeClass() {
		
		//System.setProperty("Webdriver.Chrome.driver", "/Users/admin/Documents/workspace/AutomationFramework1/resources/drivers/chromedriver");
		
		driver = WebdriverUtil.getDriver("chrome");
		driver.get("http://whiteboxqa.com");
	}

	@AfterClass
	
	public void afterClass() {
		
		driver.close();
	}
}
