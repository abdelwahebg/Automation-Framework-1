package com.wbl.utilities;

import org.openqa.selenium.WebElement;

public class ReusableMethods {
	
public static void enterText(WebElement obj, String textval, String objName)
{
if (obj.isDisplayed()){
	
	obj.sendKeys(textval);

	
	System.out.println("Pass:"+ textval + " is entered in "+  objName);
}

else{
	System.out.println("Fail:"+ textval + " is not displayed "+  objName);
	}
}
public static void buttonClick(WebElement obj, String objName)
{
if (obj.isDisplayed()){

System.out.println("Pass:"+ objName + " is displayed ");
}

else{
	
System.out.println("Fail:"+ objName + " is not displayed ");
}
}
}
