package com.yatra.test.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.yatra.utils.GetData;

public class TestConfiguration 
{
  public static WebDriver CreateDriverInstance()
  {
	  WebDriver driver=null;
	 String Browser= GetData.getDataFromProperty("configuration","Browser");
	 String URL = GetData.getDataFromProperty("Configuration","URL");
	 if(Browser.equalsIgnoreCase("Chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","./Browser server/chromedriver.exe");
		 driver=new ChromeDriver();
		 
	 }
	 else if (Browser.equalsIgnoreCase("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver","./Browser server/geckodriver.exe");
		 driver=new FirefoxDriver();
	 }
	 else
	 {
		 System.out.println("Invalid Browser");
	 }
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
		
		
  }
}
