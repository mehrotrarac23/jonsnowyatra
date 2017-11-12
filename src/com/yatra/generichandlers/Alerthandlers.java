package com.yatra.generichandlers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alerthandlers 
{
 public static void acceptalert(WebDriver driver)
 {
	Alert alert= driver.switchTo().alert();
	alert.accept();
 }
 public static void dismissalert(WebDriver driver)
 {
	Alert alert= driver.switchTo().alert();
	alert.dismiss();
 }
 public static void getmsg(WebDriver driver)
 {
	Alert alert= driver.switchTo().alert();
	alert.getText();
 }
}
