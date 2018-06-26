package com.wbl.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebdriverUtil {

	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
		try {
			//factory design pattern 
			switch (browserName) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/resources/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;

			//case "ie":
			//	System.setProperty("webdriver.ie.driver",
			//			System.getProperty("user.dir") + "/resources/drivers/IEDriverServer.exe");
			//	driver = new InternetExplorerDriver();
			//	break;

			default:
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());//in realtime log 4j is used
		}

		return driver;

	}
}