package com.yatra.generichandlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHandlers 
{
  public void mouseHover(WebDriver driver, WebElement element)
  {
	  Actions act = new Actions(driver);
	  act.moveToElement(element).perform();	  
  }
  public void rightClick(WebDriver driver, WebElement element)
  {
	  Actions act = new Actions(driver);
	  act.contextClick(element).perform();;
  }
  public void leftClick(WebDriver driver, WebElement element)
  {
	  Actions act = new Actions(driver);
	  act.click(element).perform();
  }
  public void dragAndDrop(WebDriver driver, WebElement source,WebElement target)
  {
	  Actions act = new Actions(driver);
	  act.dragAndDrop(source, target).perform();
  }
  
}
