package com.yatra.generichandlers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandlers 
{
 public static void selectOptionByindex(WebElement element,int index)
 {
	 Select sct = new Select(element);
	 sct.selectByIndex(index);
 }
 public static void selectOptionByvalue(WebElement element,String value)
 {
	 Select sct = new Select(element);
	 sct.selectByValue(value);
 }
 public static void selectOptionByvisibletext(WebElement element,String text)
 {
	 Select sct = new Select(element);
	 sct.selectByVisibleText(text);
 
}
}
