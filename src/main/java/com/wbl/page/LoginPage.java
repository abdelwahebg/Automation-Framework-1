package com.wbl.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wbl.base.BasePage;

public class LoginPage extends BasePage{
	@FindBy(xpath="//*[@id='username']")
	
	WebElement username1;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password1;
	
	@FindBy(xpath="//*[@id='login']")
	WebElement login1;

	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public void login(String username, String password){
		
	//	username1 = driver.findElement(By.xpath("//*[@id='username']"));
	//	username1.sendKeys("abc123");
		
		enterText(username1,"abc123","userfield");
		
		//password1 = driver.findElement(By.xpath("//*[@id='password']"));
		//password1.sendKeys("wer23");
		
		enterText(password1,"wer23","passwordfield");
		
		
		//login1 = driver.findElement(By.xpath("//*[@id='login']"));
		
		login1.click();
		
		
	}
	  
	public String getTitle(){
		
		return driver.getTitle();
		
	}

}
