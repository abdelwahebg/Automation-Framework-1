package com.wbl.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.base.BasePage;

public class HomePage extends BasePage {
	
	WebElement recElement;
	
	public HomePage(WebDriver driver)
	
	{
      super(driver);
      
	}
	
	public int numberOfSlides(){
		
		List<WebElement> slides = driver.findElements(By.cssSelector("#promo-slider > ul > li"));
		
		return slides.size();
	}
	
	public String getRecordingstext(){
		
	 recElement = driver.findElement(By.cssSelector("body > div.wrapper > div > div > div.row.cols-wrapper > div:nth-child(1) > section > div > a"));
		
		return recElement.getText();
		
	}
	
	public LoginPage  clickRecording(){
		
		recElement.click();
		
		return new LoginPage(driver);
		
	}
	
}
