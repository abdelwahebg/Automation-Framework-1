package com.wbl.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.wbl.base.BasePage;
import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;

public class HomePageTest extends BaseTest {
	
	BasePage bp;
	
	HomePage hp;
	
	public HomePageTest(){
		super();
		bp = new BasePage(driver);
		hp = bp.HomeClick();//ctrl+shift+o will import all
	}

	@Test
	
	public void assertSlides(){
		int num = hp.numberOfSlides();
		
		assertTrue(num > 6);
		
		
	}
	@Test
	
	public void assertRecText(){
		
		String actual = hp.getRecordingstext();
		
		assertEquals(actual,"Recordings");
	}
	
	@Test
	
	public void assertClickRecording(){
		
		String actual = hp.clickRecording().getTitle();
		
		assertEquals(actual,"QA/QE/SDET Training.");
	}
}