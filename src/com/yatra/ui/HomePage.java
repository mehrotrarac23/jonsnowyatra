package com.yatra.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
  WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void waitforHomePageToLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("todayspic_banners")));
					
	}
	public WebElement getMyAccountLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),' My Account ')]"));
	}
	
	public WebElement getflights()
	{
		return driver.findElement(By.id("booking_engine_flights"));
	}
	public WebElement getHotel()
	{
		return driver.findElement(By.id("booking_engine_hotels"));
	}
	public WebElement getHomestays()
	{
		return driver.findElement(By.id("booking_engine_homestays"));
	}
	public WebElement getHolidays()
	{
		return driver.findElement(By.id("booking_engine_holidays"));
	}
	public WebElement getActivities()
	{
		return driver.findElement(By.id("booking_engine_activities"));
	}
	public WebElement getBuses()
	{
		return driver.findElement(By.id("booking_engine_buses"));
	}
	public WebElement getTrains()
	{
		return driver.findElement(By.id("booking_engine_trains"));
	}
	
	

}
