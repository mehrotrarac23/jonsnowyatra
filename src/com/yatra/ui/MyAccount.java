package com.yatra.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccount 
{
      	  WebDriver driver;
			public MyAccount(WebDriver driver) 
			{
				this.driver=driver;
			}
			public WebElement getLoginButton()
			{
				return driver.findElement(By.id("signInBtn"));
			}
			public WebElement getSignInButton()
			{
				return driver.findElement(By.id("SignUpBtn"));
			}
			public WebElement getMyBookings()
			{
				return driver.findElement(By.xpath("//span[a[contains(text(),'My Bookings')]]"));
			}
			public WebElement getEcash()
			{
				return driver.findElement(By.xpath("//span[a[contains(text(),'My eCash')]]"));
			}
			public WebElement YatraForBusiness()
			{
				return driver.findElement(By.xpath("(//li[@class='simple-dropdown eCashholder clearfix corporateLoginSec hide-imp']/a)[1]"));
			}
			public WebElement YatraForTravelAgents()
			{
				return driver.findElement(By.xpath("(//li[@class='simple-dropdown eCashholder clearfix corporateLoginSec hide-imp']/a)[2]"));
			}
			
	}


