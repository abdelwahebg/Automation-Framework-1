package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;
import com.wbl.page.SchedulePage;
import com.wbl.utilities.ReusableMethods;

public class BasePage extends ReusableMethods {
	
	protected static WebDriver driver;
	
	static {
		PageFactory.initElements(driver, BasePage.class);
	}
	
	@FindBy(how = How.XPATH, using = "//img[@id='logo']")
	WebElement logo;
	
	@FindBy(how = How.XPATH, using = "//div[@id='navbar-collapse']/ul[@class='nav navbar-nav']//a[@href='index.php']")
	
	WebElement home;
	
	@FindBy(how = How.XPATH, using ="//div[@id='navbar-collapse']/ul[@class='nav navbar-nav']//a[@href='schedule.php']")
	WebElement schedule;
	
	@FindBy(how = How.XPATH, using ="/html//a[@id='loginButton']")
	WebElement login;
	
	
	public BasePage(WebDriver udriver) {
		
		driver = udriver ;
		PageFactory.initElements(driver, this);
		
	}

	public HomePage logoClick(){
		
	//	logo = driver.findElement(By.xpath("//img[@id='logo']"));
		logo.click();
		return new HomePage(driver);
		
		
	}

	public HomePage HomeClick() {
		
		//	logo = driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul[@class='nav navbar-nav']//a[@href='index.php']"));
			logo.click();
			return new HomePage(driver);
			
	}
	
public SchedulePage ScheduleClick(){
		
	//	logo = driver.findElement(By.xpath("/html//a[@id='loginButton']"));
		schedule.click();
		return new SchedulePage(driver);
		
		
}
public LoginPage LoginClick(){
	
//	logo = driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul[@class='nav navbar-nav']//a[@href='schedule.php']"));
	
	login.click();
	return new LoginPage(driver);
	

}

}
